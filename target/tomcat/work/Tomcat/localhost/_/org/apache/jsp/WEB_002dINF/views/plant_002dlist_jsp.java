/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2019-08-31 14:33:42 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class plant_002dlist_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">\r\n");
      out.write("<link type=\"text/css\" rel=\"stylesheet\" href=\"/css/style.css\">\r\n");
      out.write("<link type=\"text/css\" rel=\"stylesheet\" href=\"/js/font-awesome-4.7.0/css/font-awesome.css\">\r\n");
      out.write("<link href=\"https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("<title>植物信息</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div class=\"container\">\r\n");
      out.write("\t\t<table class=\"table\" id=\"plantTable\">\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td align=\"center\"><button class=\"btn btn-primary\" type=\"button\" id=\"addBtn\">添加</button></td>\r\n");
      out.write("\t\t\t\t<td colspan=\"5\" align=\"center\">查询内容<input type=\"text\" id=\"plantName\">\r\n");
      out.write("\t\t\t\t\t<button class=\"btn btn-primary\" id=\"searchBtn\">搜索</button>\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<th align=\"center\"><input type=\"checkbox\" id=\"select-all\">全选</th>\r\n");
      out.write("\t\t\t\t<th>序号</th>\r\n");
      out.write("\t\t\t\t<th>植物名称</th>\r\n");
      out.write("\t\t\t\t<th>描述</th>\r\n");
      out.write("\t\t\t\t<th>类别</th>\r\n");
      out.write("\t\t\t\t<th>操作</th>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td align=\"center\"><button type=\"button\" id=\"batchRemoveBtn\">批量删除</button></td>\r\n");
      out.write("\t\t\t\t<td colspan=\"6\" align=\"center\"><button type=\"button\" id=\"firstBtn\">首页</button>\r\n");
      out.write("\t\t\t\t\t<button type=\"button\" id=\"previousBtn\">上一页</button>\r\n");
      out.write("\t\t\t\t\t<button type=\"button\" id=\"nextBtn\">下一页</button>\r\n");
      out.write("\t\t\t\t\t<button type=\"button\" id=\"lastBtn\">末页</button> &nbsp;&nbsp;当前是第");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${currentPage}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("页/共计");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pages }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("页</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<script src=\"https://cdn.staticfile.org/jquery/2.1.1/jquery.min.js\"></script>\r\n");
      out.write("\t<script src=\"https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"/js/jquery/jquery.min.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\t$(function(){\r\n");
      out.write("\t\t$('#searchBtn').click(function(){\r\n");
      out.write("\t\t\tvar name= $('#plantName').val();\r\n");
      out.write("\t\t\tlocation=\"/?name=\"+name;\r\n");
      out.write("\t\t})\r\n");
      out.write("\t$('#addBtn').click(function(){\r\n");
      out.write("\t\tlocation=\"/showAdd\";\r\n");
      out.write("\t})\r\n");
      out.write("\t// 全选\r\n");
      out.write("\t$('#select-all').click(function(){\r\n");
      out.write("\t\tif($(this).is(\":checked\")) {\r\n");
      out.write("\t\t\t$('.checkPlantId').prop(\"checked\",true)\r\n");
      out.write("\t\t}else{\r\n");
      out.write("\t\t\t$('.checkPlantId').prop(\"checked\",false)\r\n");
      out.write("\t\t}\r\n");
      out.write("\t})\r\n");
      out.write("\t// 批量删除\r\n");
      out.write("\t$('#batchRemoveBtn').click(function(){\r\n");
      out.write("\t\tvar checkedInfoList = $('.checkPlantId:checked');\r\n");
      out.write("\t\tif (checkedInfoList.length == 0) {\r\n");
      out.write("\t\t\talert(\"请选择要删除的植物信息\")\r\n");
      out.write("\t\t} else {\r\n");
      out.write("\t\t\tvar removeUrl = \"/remove?\"\r\n");
      out.write("\t\t\tcheckedInfoList.each(function(){\r\n");
      out.write("\t\t\t\tvar id = $(this).val();\r\n");
      out.write("\t\t\t\tremoveUrl+=\"id=\"+id+\"&\"\r\n");
      out.write("\t\t\t})\r\n");
      out.write("\t\t\tremoveUrl = removeUrl.substring(0,removeUrl.length-1);\r\n");
      out.write("\t\t\tlocation=removeUrl;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t})\r\n");
      out.write("\t})\r\n");
      out.write("\t//首页\r\n");
      out.write("\t$('#firstBtn').click(function(){\r\n");
      out.write("\t\tlocation=\"/?pageNo=1\";\r\n");
      out.write("\t})\r\n");
      out.write("\t//上一页\r\n");
      out.write("\t$('#previousBtn').click(function(){\r\n");
      out.write("\t\tvar current = ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${currentPage}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(";\r\n");
      out.write("\t\tif(current>1){\r\n");
      out.write("\t\t\tlocation=\"/?pageNo=\"+(current-1);\r\n");
      out.write("\t\t}else{\r\n");
      out.write("\t\t\tlocation=\"/?pageNo=1\";\r\n");
      out.write("\t\t}\r\n");
      out.write("\t})\r\n");
      out.write("\t//下一页\r\n");
      out.write("\t$('#nextBtn').click(function(){\r\n");
      out.write("\t\tvar current = ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${currentPage}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(";\r\n");
      out.write("\t\tvar last = ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pages}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(";\r\n");
      out.write("\t\tif(last==current){\r\n");
      out.write("\t\t\tlocation=\"/?pageNo=\"+last;\r\n");
      out.write("\t\t}else if(last==1){\r\n");
      out.write("\t\t\tlocation=\"/?pageNo=1\";\r\n");
      out.write("\t\t}else if(last>current){\r\n");
      out.write("\t\t\tlocation=\"/?pageNo=\"+(current+1);\r\n");
      out.write("\t\t}\r\n");
      out.write("\t})\r\n");
      out.write("\t//末页\r\n");
      out.write("\t$('#lastBtn').click(function(){\r\n");
      out.write("\t\tlocation=\"/?pageNo=\"+");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pages}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(";\r\n");
      out.write("\t})\r\n");
      out.write("\t</script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent(null);
    // /WEB-INF/views/plant-list.jsp(31,3) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/views/plant-list.jsp(31,3) '${plantPages.records }'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${plantPages.records }",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /WEB-INF/views/plant-list.jsp(31,3) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("plants");
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t<tr>\r\n");
          out.write("\t\t\t\t<td align=\"center\"><input type=\"checkbox\" class=\"checkPlantId\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${plants.id }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("\" /></td>\r\n");
          out.write("\t\t\t\t<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${plants.id }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("\t\t\t\t<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${plants.name }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("\t\t\t\t<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${plants.description }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("\t\t\t\t<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${plants.categoryName }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("\t\t\t\t<td><a href=\"/showPlant?id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${plants.id }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("\">查看</a>&nbsp;<a href=\"/updatePlant?id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${plants.id }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("\">修改</a>&nbsp;<a href=\"/remove?id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${plants.id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("\">删除</a></td>\r\n");
          out.write("\t\t\t</tr>\r\n");
          out.write("\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f0.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
    }
    return false;
  }
}
