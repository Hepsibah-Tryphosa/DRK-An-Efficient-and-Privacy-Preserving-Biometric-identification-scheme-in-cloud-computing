

<style type="text/css">
    <!--
    .style1 {
        color: #FF0000;
        font-weight: bold;
    }
    -->	
</style>
<%@ include file="connect.jsp" %>
<%@ page import="java.io.*" %>
<%@ page import="java.util.*" %>


<%    try {
 Part filepart = request.getPart("pic2");
        String thbname = filepart.getSubmittedFileName();
        String sql1 = "SELECT * FROM consumer where  thumbname='" + thbname + "' ";
        Statement stmt1 = connection.createStatement();
        ResultSet rs1 = stmt1.executeQuery(sql1);
        if (rs1.next() == true) {

            response.sendRedirect("consumerMain.jsp");

        } else {
%>
<br/>
</div>
<p align="center" class="style1">Finger Print Mismatch, Please Provide Correct Finger Print!! </p>
<div align="center"><br/>
    <br/>
    <a href="consumerLogin.jsp"><strong>Back</strong></a>
    <%
            }

        } catch (Exception e) {
            out.print(e);
            e.printStackTrace();
        }
    %>

</div>
