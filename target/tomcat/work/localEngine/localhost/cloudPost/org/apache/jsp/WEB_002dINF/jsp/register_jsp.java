package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\n');

String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">  \n");
      out.write("<html>\n");
      out.write("  <head>\n");
      out.write("\t<meta charset='utf-8'>\n");
      out.write("\t<title>MyHome</title>\n");
      out.write("\t<script type=\"text/javascript\" src=\"");
      out.print(basePath );
      out.write("js/jquery-1.11.2.js\"></script>\n");
      out.write("\t<style type=\"text/css\">\n");
      out.write("\t\tbody{\n");
      out.write("\t\t\tfont-family: \"微软雅黑\"\n");
      out.write("\t\t}\n");
      out.write("\t\t.sign{\n");
      out.write("\t\t\twidth: 100%;\n");
      out.write("\t\t\ttext-align: center;\n");
      out.write("\t\t\theight: 600px;\n");
      out.write("\t\t\tbackground-color: white;\n");
      out.write("\t\t\topacity: 0.7;\n");
      out.write("\t\t\tlist-style: none;\n");
      out.write("\t\t}\n");
      out.write("\t\t#second{\n");
      out.write("\t\t\tdisplay: none;\n");
      out.write("\t\t}\n");
      out.write("\t\t#third{\n");
      out.write("\t\t\tdisplay: none;\n");
      out.write("\t\t}\n");
      out.write("\t\t\n");
      out.write("\t\t.li1{\n");
      out.write("\t\t\twidth: 100%;\n");
      out.write("\t\t\tbackground-image: url(\"wedding.jpg\");\n");
      out.write("\t\t\tposition: absolute;\n");
      out.write("\t\t\topacity: 0.7;\n");
      out.write("\t\t\tdisplay: block;\n");
      out.write("\t\t\theight: 525px;\n");
      out.write("\t\t\tbackground-position: 0px -45px;\n");
      out.write("\t\t\tmargin-right: -100%;\n");
      out.write("\t\t\tz-index: 5;\n");
      out.write("\t\t\tbackground-attachment:fixed;\n");
      out.write("\t\t\tbackground-size: cover;\n");
      out.write("\t\t}\n");
      out.write("\t\t.li2{\n");
      out.write("\t\t\twidth: 100%;\n");
      out.write("\t\t\tbackground-image: url(\"twofeets.jpg\");\n");
      out.write("\t\t\topacity:0.7;\n");
      out.write("\t\t\tposition: absolute;\n");
      out.write("\t\t\tdisplay: block;\n");
      out.write("\t\t\theight: 525px;\n");
      out.write("\t\t\tbackground-position: -0px -45px;\n");
      out.write("\t\t\tmargin-right: -100%;\n");
      out.write("\t\t\tz-index: 5;\n");
      out.write("\t\t\tbackground-attachment:fixed;\n");
      out.write("\t\t\tbackground-size: cover;\n");
      out.write("\t\t}\n");
      out.write("\t\t.li3{\n");
      out.write("\t\t\twidth: 100%;\n");
      out.write("\t\t\tbackground-image: url(\"countrycp.jpg\");\n");
      out.write("\t\t\topacity:0.7;\n");
      out.write("\t\t\tposition: absolute;\n");
      out.write("\t\t\tdisplay: block;\n");
      out.write("\t\t\theight: 525px;\n");
      out.write("\t\t\tbackground-position: 0 -45px;\n");
      out.write("\t\t\tmargin-right: -100%;\n");
      out.write("\t\t\tz-index: 5;\n");
      out.write("\t\t\tbackground-attachment:fixed;\n");
      out.write("\t\t\tbackground-size: cover;\n");
      out.write("\t\t}\n");
      out.write("\t\t.back{\n");
      out.write("\t\t\tposition: absolute;\n");
      out.write("\t\t\tz-index: 0;\n");
      out.write("\t\t\tbackground-color: black;\n");
      out.write("\t\t\theight: 575px;\n");
      out.write("\t\t\twidth: 100%\n");
      out.write("\t\t}\n");
      out.write("\t\t.register{\n");
      out.write("\t\t\tdisplay: block;\n");
      out.write("\t\t\t\n");
      out.write("\t\t\tposition:absolute;\n");
      out.write("\t\t\tz-index: 10;\n");
      out.write("\t\t\theight: 250px;\n");
      out.write("\t\t\twidth: 30%;\n");
      out.write("\t\t\tmargin-left: 35%;\n");
      out.write("\t\t\tmargin-right: 35%;\n");
      out.write("\t\t\tmargin-top:100px;\n");
      out.write("\t\t\tcolor:white;\n");
      out.write("\t\t\tborder: solid white 6px;\n");
      out.write("\t\t\tborder-radius: 5px 5px 5px 5px;\n");
      out.write("\t\t}\n");
      out.write("\t\t.login{\n");
      out.write("\t\t\tdisplay: block;\n");
      out.write("\t\t\t\n");
      out.write("\t\t\tposition:absolute;\n");
      out.write("\t\t\tz-index: 10;\n");
      out.write("\t\t\theight: 200px;\n");
      out.write("\t\t\twidth: 30%;\n");
      out.write("\t\t\tmargin-left: 35%;\n");
      out.write("\t\t\tmargin-right: 35%;\n");
      out.write("\t\t\tmargin-top:100px;\n");
      out.write("\t\t\tcolor:white;\n");
      out.write("\t\t\tborder: solid white 6px;\n");
      out.write("\t\t\tborder-radius: 5px 5px 5px 5px;\n");
      out.write("\t\t}\n");
      out.write("\t\tinput{\n");
      out.write("\t\t\tmargin-top: 30px;\n");
      out.write("\t\t}\n");
      out.write("\t\t.re-title{\n");
      out.write("\t\t\twidth: 100%;\n");
      out.write("\t\t\tmin-height: 20px;\n");
      out.write("\t\t}\n");
      out.write("\t\th2{\n");
      out.write("\t\t\tmargin: 0;\n");
      out.write("\t\t}\n");
      out.write("\t\t.re-row{\n");
      out.write("\t\t\twidth: 100%;\n");
      out.write("\t\t\tmin-height: 30px;\n");
      out.write("\t\t}\n");
      out.write("\t\t#change{\n");
      out.write("\t\t\tfont-size: 10px;\n");
      out.write("\t\t\tpadding-top: 20px;\n");
      out.write("\t\t}\n");
      out.write("\t</style>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\t<div class=\"sign\">\n");
      out.write("\t\t<div class=\"register\" id=\"register\" style=\"display:none\">\n");
      out.write("\t\t\t<div class=\"re-title\">\n");
      out.write("\t\t\t\t<h2>注册</h2>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<form action=\"");
      out.print(basePath );
      out.write("user/register\" method=\"post\">\n");
      out.write("\t\t\t\t<div class=\"re-row\">\n");
      out.write("\t\t\t\t\t<label>用户名</label>\n");
      out.write("\t\t\t\t\t<input type=\"text\" id=\"re-username\" name=\"name\"/>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"re-row\">\n");
      out.write("\t\t\t\t\t<label>密码</label>\n");
      out.write("\t\t\t\t\t<input type=\"password\" id=\"re-password\" name=\"password\"/>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"re-row\">\n");
      out.write("\t\t\t\t\t<input type=\"submit\" id=\"resure\" value=\"确定注册\"/>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</form>\n");
      out.write("\t\t\t<div class=\"re-row\" id=\"change\">\n");
      out.write("\t\t\t\t<label id=\"l1\">选用社交/已有账号登录</label>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"login\" id=\"login\" style=\"display:none\">\n");
      out.write("\t\t\t\t<div class=\"re-title\">\n");
      out.write("\t\t\t\t\t<h2>登录</h2>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<form action=\"");
      out.print(basePath );
      out.write("user/login\" method=\"post\">\n");
      out.write("\t\t\t\t\t<div class=\"re-row\">\n");
      out.write("\t\t\t\t\t\t<label>用户名</label>\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" id=\"username\" name=\"name\"/>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"re-row\">\n");
      out.write("\t\t\t\t\t\t<label>密码</label>\n");
      out.write("\t\t\t\t\t\t<input type=\"password\" id=\"password\" name=\"password\"/>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"re-row\">\n");
      out.write("\t\t\t\t\t\t<input type=\"submit\" value=\"登录\"/>\n");
      out.write("\t\t\t\t\t\t<input type=\"button\" id=\"back\" value=\"返回注册\"/>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</form>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<li class=\"li1\" id=\"first\"></li>\n");
      out.write("\t\t\t<li class=\"li2\" id=\"second\"></li>\n");
      out.write("\t\t\t<li class=\"li3\" id=\"third\"></li>\n");
      out.write("\t\t\t<li class=\"back\"></li>\n");
      out.write("\t</div>\t\n");
      out.write("\n");
      out.write("\t<script type=\"text/javascript\">\n");
      out.write("\tfunction showHint(str)\n");
      out.write("\t{\n");
      out.write("\tvar xmlhttp;\n");
      out.write("\tif (str.length==0)\n");
      out.write("\t  { \n");
      out.write("\t  document.getElementById(\"txtHint\").innerHTML=\"\";\n");
      out.write("\t  return;\n");
      out.write("\t  }\n");
      out.write("\tif (window.XMLHttpRequest)\n");
      out.write("\t  {// code for IE7+, Firefox, Chrome, Opera, Safari\n");
      out.write("\t  xmlhttp=new XMLHttpRequest();\n");
      out.write("\t  }\n");
      out.write("\telse\n");
      out.write("\t  {// code for IE6, IE5\n");
      out.write("\t  xmlhttp=new ActiveXObject(\"Microsoft.XMLHTTP\");\n");
      out.write("\t  }\n");
      out.write("\txmlhttp.onreadystatechange=function()\n");
      out.write("\t  {\n");
      out.write("\t  if (xmlhttp.readyState==4 && xmlhttp.status==200)\n");
      out.write("\t    {\n");
      out.write("\t    \tdocument.write(\"success\")\n");
      out.write("\t    }\n");
      out.write("\t  }\n");
      out.write("\tvar username = \tdocument.getElementById(\"re-username\");\n");
      out.write("\tvar password = document.getElementById(\"re-password\");\n");
      out.write("\n");
      out.write("\n");
      out.write("\txmlhttp.open(\"GET\",\"test.php?username=\"+username+\"&password=\"+password,true);\n");
      out.write("\txmlhttp.send();\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("\t$(document).ready(function(){\n");
      out.write("\t  $(\"#resure\").click(function(){\n");
      out.write("\t  \t\n");
      out.write("\t  });\n");
      out.write("\t  });\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("\tvar i = 0;\n");
      out.write("\tfunction change(){\n");
      out.write("\t\tif(i == 0){\n");
      out.write("\t\t\t$(\"#first\").fadeOut(\"slow\")\n");
      out.write("\t\t\t$(\"#second\").fadeIn(\"slow\")\n");
      out.write("\t\t\ti++\n");
      out.write("\t\t}\n");
      out.write("\t\telse if(i == 1){\n");
      out.write("\t\t\t$(\"#second\").fadeOut(\"slow\")\n");
      out.write("\t\t\t$(\"#third\").fadeIn(\"slow\")\n");
      out.write("\t\t\ti++\n");
      out.write("\t\t}\n");
      out.write("\t\telse if(i == 2){\n");
      out.write("\n");
      out.write("\t\t\t$(\"#third\").fadeOut(\"slow\")\n");
      out.write("\t\t\t$(\"#first\").fadeIn(\"slow\")\n");
      out.write("\t\t\ti = 0;\n");
      out.write("\t\t}\n");
      out.write("\t}\n");
      out.write("\twindow.onload = function(){\n");
      out.write("\t\t$(\".register\").fadeIn(2000);\n");
      out.write("\t}\n");
      out.write("\t$(\"#l1\").click(function(){\n");
      out.write("\t\t$(\"#register\").hide(\"slow\")\n");
      out.write("\t\t$(\"#login\").show(\"slow\")\n");
      out.write("\t})\n");
      out.write("\t$(\"#back\").click(function(){\n");
      out.write("\t\t$(\"#login\").hide(\"slow\")\n");
      out.write("\t\t$(\"#register\").show(\"slow\")\n");
      out.write("\t})\n");
      out.write("\tsetInterval(function(){\n");
      out.write("\t\t\tchange();\n");
      out.write("\t\t}\n");
      out.write("\t\t,6000);\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
