package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class phoneindex_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width,initial-scale=1,user-scalable=0\" />\n");
      out.write("    <title>Title</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.print(basePath );
      out.write("css/bootstrap.css\" />\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.print(basePath );
      out.write("css/weui.css\" /> \n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.print(basePath );
      out.write("css/example.css\" />\n");
      out.write("\n");
      out.write("    <script type=\"text/javascript\" src=\"");
      out.print(basePath );
      out.write("js/jquery-1.11.2.js\"></script>\n");
      out.write("    <script type=\"text/javascript\" src=\"");
      out.print(basePath );
      out.write("js/bootstrap.js\"></script>\n");
      out.write("    <style type=\"text/css\">\n");
      out.write("    \tbody{\n");
      out.write("    \t\tbackground-color: #ecece9;\n");
      out.write("    \t}\n");
      out.write("    \t.weui_panel{\n");
      out.write("    \t\tmin-height: 200px;\n");
      out.write("    \t}\n");
      out.write("    \t.weui_btn{\n");
      out.write("    \t\tmargin-top: 20px;\n");
      out.write("    \t}\n");
      out.write("    \t#bd{\n");
      out.write("    \t\tmargin-top: 80px;\n");
      out.write("    \t}\n");
      out.write("    \t.weui_tab{\n");
      out.write("    \t\theight:89%;\n");
      out.write("    \t}\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<div class=\"container js_container\">\n");
      out.write("<div class=\"page slideIn navbar\">\n");
      out.write("    <div class=\"weui_navbar\">\n");
      out.write("    \t\n");
      out.write("        <div class=\"weui_navbar_item\" id=\"c\">\n");
      out.write("            <p>个人管理</p>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"weui_navbar_item\" id=\"b\">\n");
      out.write("            <p>好友发现</p>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"weui_navbar_item\" id=\"a\">\n");
      out.write("            <p>编辑分享</p>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("      <div id=\"bd\">\n");
      out.write("          <script type=\"text/html\" id=\"editor\">\n");
      out.write("\t\t            <div class=\"weui_tab_bd\">\n");
      out.write("\t\t            \t<form action=\"fuckingsong.java\" method=\"post\">\n");
      out.write("\t\t            \t<div class=\"weui_cells weui_cells form\">\n");
      out.write("\n");
      out.write("\t\t            \t\t<div class=\"weui_cell\">\n");
      out.write("\t\t            \t\t\t<div class=\"weui_cell_hd\">\n");
      out.write("\t\t            \t\t\t\t<label class=\"weui_label\">标题</label>\n");
      out.write("\t\t            \t\t\t</div>\n");
      out.write("\t\t            \t\t\t<div class=\"weui_cell_bd weui_cell_primary\">\n");
      out.write("\t\t            \t\t\t\t<input class=\"weui_input\" type=\"number\" pattern=\"[0-9]\" placeholder=\"请输入标题\">\n");
      out.write("\t\t            \t\t\t</div>\n");
      out.write("\t\t            \t\t</div>\n");
      out.write("\t\t            \t</div>\n");
      out.write("\t\t            \t\t<div class=\"weui_cells_title\">文本域</div>\n");
      out.write("\t\t            \t\t\t<div class=\"weui_cells weui_cells_form\">\n");
      out.write("\t\t            \t\t\t\t<div class=\"weui_cell\">\n");
      out.write("\t\t            \t\t\t\t\t<div class=\"weui_cell_bd weui_cell_primary\">\n");
      out.write("\t\t            \t\t\t\t\t\t<textarea class=\"weui_textarea\" placeholder=\"请输入内容\" rows=\"3\"></textarea>\n");
      out.write("\t\t            \t\t\t\t\t</div>\n");
      out.write("\t\t            \t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t            \t\t</div>\n");
      out.write("\t\t            \t\t<div class=\"weui_cells_title\">\n");
      out.write("\t\t            \t\t\t署名信息\n");
      out.write("\t\t            \t\t</div>\n");
      out.write("\t\t            \t\t<div class=\"weui_cells weui_cells_radio\">\n");
      out.write("\t\t            \t\t\t<label class=\"weui_cell weui_check_label\" for=\"x11\">\n");
      out.write("\t\t            \t\t\t\t<div class=\"weui_cell_bd weui_cell_primary\">\n");
      out.write("\t\t            \t\t\t\t\t<p>匿名发送</p>\n");
      out.write("\t\t            \t\t\t\t</div>\n");
      out.write("\t\t            \t\t\t\t<div class=\"weui_cell_ft\">\n");
      out.write("\t\t            \t\t\t\t\t<input type=\"radio\" class=\"weui_check\" name=\"radio1\" id=\"x11\">\n");
      out.write("\t\t            \t\t\t\t\t<span class=\"weui_icon_checked\"></span>\n");
      out.write("\t\t            \t\t\t\t</div>\n");
      out.write("\t\t            \t\t\t</label>\n");
      out.write("\t\t            \t\t\t<label class=\"weui_cell weui_check_label\" for=\"x12\">\n");
      out.write("\t\t            \t\t\t\t<div class=\"weui_cell_bd weui_cell_primary\">\n");
      out.write("\t\t            \t\t\t\t\t<p>实名发送</p>\n");
      out.write("\t\t            \t\t\t\t</div>\n");
      out.write("\t\t            \t\t\t\t<div class=\"weui_cell_ft\">\n");
      out.write("\t\t            \t\t\t\t\t<input type=\"radio\" class=\"weui_check\" name=\"radio1\" id=\"x12\">\n");
      out.write("\t\t            \t\t\t\t\t<span class=\"weui_icon_checked\"></span>\n");
      out.write("\t\t            \t\t\t\t</div>\n");
      out.write("\t\t            \t\t\t</label>\n");
      out.write("\t\t            \t\t\t<label class=\"weui_cell weui_check_label\" for=\"x13\">\n");
      out.write("\t\t            \t\t\t\t<div class=\"weui_cell_bd weui_cell_primary\">\n");
      out.write("\t\t            \t\t\t\t\t<p>网名发送</p>\n");
      out.write("\t\t            \t\t\t\t</div>\n");
      out.write("\t\t            \t\t\t\t<div class=\"weui_cell_ft\">\n");
      out.write("\t\t            \t\t\t\t\t<input type=\"radio\" class=\"weui_check\" name=\"radio1\" id=\"x13\">\n");
      out.write("\t\t            \t\t\t\t\t<span class=\"weui_icon_checked\"></span>\n");
      out.write("\t\t            \t\t\t\t</div>\n");
      out.write("\t\t            \t\t\t</label>\n");
      out.write("\t\t            \t\t\t<input type=\"submit\" class=\"weui_btn weui_btn_primary\" value=\"确认发送\"/>\n");
      out.write("\t\t            \t\t\t</form>\n");
      out.write("\t\t            \t\t</div>\n");
      out.write("\t\t            \t\t\n");
      out.write("\t\t       </script>\n");
      out.write("\n");
      out.write("\t<script type=\"text/javascript\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\t</script>\n");
      out.write("\n");
      out.write("\t<script type=\"text/html\" id=\"manage\">\n");
      out.write("\t\t            \t\t<div class=\"weui_tab\">\n");
      out.write("\t\t            \t\t\t<div class=\"weui_panel_bd\">\n");
      out.write("\t\t            \t\t\t\t<div class=\"weui_media_box weui_media_appmsg\">\n");
      out.write("\t\t            \t\t\t\t\t<div class=\"weui_media_hd\">\n");
      out.write("\t\t            \t\t\t\t\t\t<img class=\"weui_media_appmsg_thumb\" src=\"");
      out.print(basePath );
      out.write("img/weui.png\"/>\n");
      out.write("\t\t            \t\t\t\t\t</div>\n");
      out.write("\t\t            \t\t\t\t\t<div class=\"weui_media_hd\">\n");
      out.write("\t\t            \t\t\t\t\t\t<p>昵称:");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</p>\n");
      out.write("\t\t            \t\t\t\t\t\t<p>账号:");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.userID}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</p>\n");
      out.write("\t\t            \t\t\t\t\t</div>\n");
      out.write("\t\t            \t\t\t\t</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t            \t\t\t</div>\n");
      out.write("\t\t            \t\t</div>\n");
      out.write("\t</script>\n");
      out.write("\t\n");
      out.write("\t<script type=\"text/html\" id=\"recommand\">\n");
      out.write("\t\t\t            \t<div class=\"weui_panel weui_panel_access\">\n");
      out.write("\t\t\t            \t\t<div class=\"weui_panel_bd\">\n");
      out.write("\t\t\t            \t\t\t<a href=\"javascript:\" class=\"weui_media_box weui_media_appmsg\">\n");
      out.write("\t\t\t            \t\t\t\t<div class=\"weui_media_hd\">\n");
      out.write("\t\t\t            \t\t\t\t\t<img src=\"");
      out.print(basePath );
      out.write("img/label.png\" style=\"width:50px;height:50px\">\n");
      out.write("\t\t\t            \t\t\t\t\t<p>姓名</p>\n");
      out.write("\t\t\t            \t\t\t\t</div>\n");
      out.write("\t\t\t            \t\t\t\t<div class=\"weui_media_bd\">\n");
      out.write("\t\t\t            \t\t\t\t\n");
      out.write("\t\t\t            \t\t\t\t\t<p>分享照片与文字</p>\n");
      out.write("\t\t\t            \t\t\t\t\t<p id=\"test\"></p>\n");
      out.write("\t\t\t            \t\t\t\t\t<img src=\"");
      out.print(basePath );
      out.write("img/address.png\" style=\"width:80px;height:80px\"> \n");
      out.write("\t\t\t            \t\t\t\t\t<p>地理信息</p>\n");
      out.write("\t\t\t            \t\t\t\t\t<input type=\"button\" id=\"\" value=\"详细信息>\" style=\"border:none;background-color:inherit;margin-top:70px;margin-left:75%\">\n");
      out.write("\t\t\t            \t\t\t\t\t\n");
      out.write("\t\t\t            \t\t\t\t</div>\n");
      out.write("\t\t\t            \t\t\t</a>\n");
      out.write("\t\t\t            \t\n");
      out.write("\t\t\t\t\t            </div>\n");
      out.write("\t\t\t\t\t        </div>\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t</script>\n");
      out.write("\t\n");
      out.write("\t<script type=\"text/javascript\">\n");
      out.write("\t\tfunction showArticle()\n");
      out.write("\t\t\t{\n");
      out.write("\t\t\tvar xmlhttp;\n");
      out.write("\t\t\tif (window.XMLHttpRequest)\n");
      out.write("\t\t\t  {// code for IE7+, Firefox, Chrome, Opera, Safari\n");
      out.write("\t\t\t  xmlhttp=new XMLHttpRequest();\n");
      out.write("\t\t\t  }\n");
      out.write("\t\t\telse\n");
      out.write("\t\t\t  {// code for IE6, IE5\n");
      out.write("\t\t\t  xmlhttp=new ActiveXObject(\"Microsoft.XMLHTTP\");\n");
      out.write("\t\t\t  }\n");
      out.write("\t\t\txmlhttp.onreadystatechange=function()\n");
      out.write("\t\t\t  {\n");
      out.write("\t\t\t  if (xmlhttp.readyState==4 && xmlhttp.status==200)\n");
      out.write("\t\t\t    {\n");
      out.write("\t\t\t    document.getElementById(\"test\").innerHTML=xmlhttp.responseText;\n");
      out.write("\t\t\t    }\n");
      out.write("\t\t\t  };\n");
      out.write("\t\t\txmlhttp.open(\"GET\",\"test1.php\",true);\n");
      out.write("\t\t\txmlhttp.send();\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\t\n");
      out.write("\t</script>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t        </div>\n");
      out.write("\t\t   \t</div>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("\n");
      out.write("    var bd = document.getElementById(\"bd\");\n");
      out.write("    \tmanage = document.getElementById(\"manage\");\n");
      out.write("    \trecommand = document.getElementById(\"recommand\");\n");
      out.write("    \teditor = document.getElementById(\"editor\");\n");
      out.write("    window.onload = function(){\n");
      out.write("    \tbd.innerHTML = recommand.childNodes[0].data;\n");
      out.write("    \t$(\"#b\").css(\"background-color\",\"#f5f5f5\");\n");
      out.write("    \tshowArticle();\n");
      out.write("    };\n");
      out.write("\t$(\"#a\").click(function(){\n");
      out.write("\t\tbd.innerHTML = editor.childNodes[0].data;\n");
      out.write("\t\t$(\"#a\").css(\"background-color\",\"#f5f5f5\");\n");
      out.write("\t\t$(\"#b\").css(\"background-color\",\"#fafafa\");\n");
      out.write("\t\t$(\"#c\").css(\"background-color\",\"#fafafa\");\n");
      out.write("\t});\n");
      out.write("\t$(\"#b\").click(function(){\n");
      out.write("\t\tbd.innerHTML = recommand.childNodes[0].data;\n");
      out.write("\t\t$(\"#b\").css(\"background-color\",\"#f5f5f5\");\n");
      out.write("\t\t$(\"#a\").css(\"background-color\",\"#fafafa\");\n");
      out.write("\t\t$(\"#c\").css(\"background-color\",\"#fafafa\");\n");
      out.write("\t});\n");
      out.write("\t$(\"#c\").click(function(){\n");
      out.write("\t\tbd.innerHTML = manage.childNodes[0].data;\n");
      out.write("\t\t$(\"#c\").css(\"background-color\",\"#f5f5f5\");\n");
      out.write("\t\t$(\"#b\").css(\"background-color\",\"#fafafa\");\n");
      out.write("\t\t$(\"#a\").css(\"background-color\",\"#fafafa\");\n");
      out.write("\t});\n");
      out.write("\n");
      out.write("</script>\n");
      out.write(" </body>\n");
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
