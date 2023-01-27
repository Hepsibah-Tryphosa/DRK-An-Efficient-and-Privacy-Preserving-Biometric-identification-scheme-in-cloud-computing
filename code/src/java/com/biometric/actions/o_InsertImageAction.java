/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.biometric.actions;

import com.bio.db.GetDBConnection;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;
import org.bouncycastle.util.encoders.Base64;
/*import org.bouncycastle.util.encoders.Base64;*/

/**
 *
 * @author welcome
 */
@MultipartConfig
public class o_InsertImageAction extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();

        Connection con = null;
        PreparedStatement ps = null;
        
        HttpSession session = request.getSession();

        String title=null,name=null,desc=null,mac=null,key=null,image=null,bin = "", paramname=null;
            
            title = new String(Base64.encode(request.getParameter("title").getBytes()));
            name = new String(Base64.encode(request.getParameter("name").getBytes()));
            desc = request.getParameter("desc");
            mac = request.getParameter("mac");
            key = request.getParameter("key");
            
            Part filePart = request.getPart("pic");
            
        
        try {
            con = GetDBConnection.getDbConnection();
            SimpleDateFormat sdfDate = new SimpleDateFormat("dd/MM/yyyy");
            SimpleDateFormat sdfTime = new SimpleDateFormat("HH:mm:ss");

            Date now = new Date();

            String strDate = sdfDate.format(now);
            String strTime = sdfTime.format(now);
            String dt = strDate + "   " + strTime;

            int rank = 0;

            String task = "Upload";
            String owner = (String) session.getAttribute("owner");

            String strQuery2 = "insert into transaction(user,name,sk,task,dt) values('" + owner + "','" + name + "','" + key + "','" + task + "','" + dt + "')";
            con.createStatement().executeUpdate(strQuery2);

            String strQuery3 = "insert into matadata(owner,title,name,digitalsign) values('" + owner + "','" + title + "','" + name + "','" + mac + "')";
            con.createStatement().executeUpdate(strQuery3);

            PreparedStatement ps1 = con.prepareStatement("insert into ownerimages(title,name,owner,description,digitalsign,sk,dt,image,rank) values(?,?,?,?,?,?,?,?,?)");

            ps1.setString(1, title);
            ps1.setString(2, name);
            ps1.setString(3, owner);
            ps1.setString(4, desc);
            ps1.setString(5, mac);
            ps1.setString(6, key);
            ps1.setString(7, dt);
            ps1.setBinaryStream(8, filePart.getInputStream());
            ps1.setInt(9, rank);
            ps1.executeUpdate();

             ps = con.prepareStatement("insert into serverimages(title,name,owner,description,digitalsign,sk,dt,rank) values(?,?,?,?,?,?,?,?)");

            ps.setString(1, title);
            ps.setString(2, name);
            ps.setString(3, owner);
            ps.setString(4, desc);
            ps.setString(5, mac);
            ps.setString(6, key);
            ps.setString(7, dt);

            ps.setInt(8, rank);

            ps.executeUpdate();

            out.print("Image Uploaded Successfully");
        } catch (Exception e) {
            out.println("same image cont upload again");
        }
    }

}
