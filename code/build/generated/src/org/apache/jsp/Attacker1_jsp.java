package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Attacker1_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<head>\r\n");
      out.write("<title>Attacker</title>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("<link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/coin-slider.css\" />\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/cufon-yui.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/cufon-marketingscript.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery-1.4.2.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/script.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/coin-slider.min.js\"></script>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("<!--\r\n");
      out.write(".style1 {font-size: 40px}\r\n");
      out.write(".style6 {font-size: 14px; color: #FFFF00; font-weight: bold; }\r\n");
      out.write(".style7 {font-weight: bold}\r\n");
      out.write("-->\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"main\">\r\n");
      out.write("  <div class=\"header\">\r\n");
      out.write("    <div class=\"header_resize\">\r\n");
      out.write("     \r\n");
      out.write("      <div class=\"menu_nav\">\r\n");
      out.write("        <ul>\r\n");
      out.write("          <li><a href=\"index.html\"><span>Home Page</span></a></li>\r\n");
      out.write("          <li><a href=\"ownerLogin.jsp\"><span>Owner</span></a></li>\r\n");
      out.write("          <li><a href=\"consumerLogin.jsp\"><span>Users</span></a></li>\r\n");
      out.write("          <li><a href=\"webServerLogin.jsp\"><span>Cloud Server</span></a></li>\r\n");
      out.write("\t\t  <li></li>\r\n");
      out.write("          <li></li>\r\n");
      out.write("        </ul>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"clr\"></div>\r\n");
      out.write("      <div class=\"logo\">\r\n");
      out.write("        <h1><a href=\"index.html\" class=\"style1\">An Efficient and Privacy-Preserving Biometric Identification Scheme in Cloud Computing</a></h1>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"clr\"></div>\r\n");
      out.write("      <div class=\"slider\">\r\n");
      out.write("        <div id=\"coin-slider\">\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<img src=\"images/slide1.jpg\" width=\"960\" height=\"360\" alt=\"\" />\r\n");
      out.write("\t\t<img src=\"images/slide2.jpg\" width=\"960\" height=\"360\" alt=\"\" />\r\n");
      out.write("\t\t<img src=\"images/slide3.jpg\" width=\"960\" height=\"360\" alt=\"\" /> \r\n");
      out.write("\t\t\r\n");
      out.write("\t\t</div>\r\n");
      out.write("        <div class=\"clr\"></div>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"clr\"></div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("  <div class=\"content\">\r\n");
      out.write("    <div class=\"content_resize\">\r\n");
      out.write("      <div class=\"mainbar\">\r\n");
      out.write("        \r\n");
      out.write("        <div class=\"article\">\r\n");
      out.write("          <h2>Attacker</h2>\r\n");
      out.write("          <p><form action=\"Attacker2.jsp\" method=\"post\" name=\"form1\" id=\"form1\">\r\n");
      out.write("<table border=\"0\" align=\"center\">\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td>&nbsp;</td>\r\n");
      out.write("\t\t<td>&nbsp;</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("       \t<tr>\r\n");
      out.write("\t\t<td width=\"223\" bgcolor=\"#FF0000\"><div align=\"center\" class=\"style6\"><span class=\"style7\">Biometric Image Name </span></div></td>\r\n");
      out.write("\t\t<td width=\"245\"><label> <input required name=\"iname\"type=\"text\"  size=\"25\" /> </label></td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td bgcolor=\"#FF0000\">&nbsp;</td>\r\n");
      out.write("\t\t<td>&nbsp;</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td bgcolor=\"#FF0000\"><div align=\"center\" class=\"style6\">Attacker  Name </div></td>\r\n");
      out.write("\t\t<td><input name=\"aname\" type=\"text\" size=\"25\" /></td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td>&nbsp;</td>\r\n");
      out.write("\t\t<td>&nbsp;</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t\t\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td>&nbsp;</td>\r\n");
      out.write("\t\t<td>&nbsp;</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td><div align=\"right\" class=\"style6\"><input name=\"Submit\" type=\"submit\" class=\"style7\"value=\"Attack\" /></div>\t\t</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("          </table>\r\n");
      out.write("                </form>\t\t  </p>\r\n");
      out.write("          <div class=\"clr\"></div>\r\n");
      out.write("         \r\n");
      out.write("        \r\n");
      out.write("          \r\n");
      out.write("          <div class=\"clr\"></div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"sidebar\">\r\n");
      out.write("        <div class=\"gadget\">\r\n");
      out.write("          <h2 class=\"star\"><span></span> Menu</h2>\r\n");
      out.write("          <div class=\"clr\"></div>\r\n");
      out.write("          <ul class=\"sb_menu\">\r\n");
      out.write("            <li><a href=\"index.html\">Home</a></li>\r\n");
      out.write("           \r\n");
      out.write("          </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"clr\"></div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("  <div class=\"fbg\"></div>\r\n");
      out.write("  <div class=\"footer\">\r\n");
      out.write("    <div class=\"footer_resize\">\r\n");
      out.write("     \r\n");
      out.write("      <div style=\"clear:both;\"></div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
