/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.64
 * Generated at: 2022-09-27 11:21:36 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.customer;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class review_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write('\r');
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../include/header.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("	<div id=\"qna_title\">\r\n");
      out.write("		<div class=\"title\">고객 후기</div>\r\n");
      out.write("		<div class=\"message\">시공 완료 후 고객께서 후기를 남긴 내역입니다</div>\r\n");
      out.write("	</div>\r\n");
      out.write("	<div id=\"search_bar\">\r\n");
      out.write("		<div>\r\n");
      out.write("			<dt>검색조건</dt>\r\n");
      out.write("			<dd>\r\n");
      out.write("				<span>\r\n");
      out.write("					<div>\r\n");
      out.write("						<span>등록일</span><span class=\"period_cont\"> 지난7일</span>\r\n");
      out.write("						<button type=\"button\">▼</button>\r\n");
      out.write("					</div>\r\n");
      out.write("					<div>\r\n");
      out.write("						별점<span class=\"period_cont\"> 전체</span>\r\n");
      out.write("						<button type=\"button\">▼</button>\r\n");
      out.write("					</div>\r\n");
      out.write("					<div>\r\n");
      out.write("						상세조건\r\n");
      out.write("						<button type=\"button\" id='detailed_search'>▼</button>\r\n");
      out.write("					</div>\r\n");
      out.write("					<div>\r\n");
      out.write("						초기화\r\n");
      out.write("						<button type=\"button\">▼</button>\r\n");
      out.write("					</div>\r\n");
      out.write("				</span>\r\n");
      out.write("			</dd>\r\n");
      out.write("		</div>\r\n");
      out.write("\r\n");
      out.write("	</div>\r\n");
      out.write("\r\n");
      out.write("	<form id=\"search_conditon\">\r\n");
      out.write("		<div id=search_conditon_wrap>\r\n");
      out.write("			<div id=\"search_conditon_sub_1\">\r\n");
      out.write("				<div>\r\n");
      out.write("					<input type=\"button\" value=\"오늘\"> <input type=\"button\"\r\n");
      out.write("						value=\"지난 7일\"> <input type=\"button\" value=\"지난 30일\">\r\n");
      out.write("				</div>\r\n");
      out.write("				<div>\r\n");
      out.write("					<input type=\"date\"> ~ <input type=\"date\">\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("			<hr>\r\n");
      out.write("			<div>\r\n");
      out.write("				<label>별점</label> <select id=\"rate\">\r\n");
      out.write("					<option value=\"whole\" selected>전체</option>\r\n");
      out.write("					<option value=\"5\">5점</option>\r\n");
      out.write("					<option value=\"4\">4점</option>\r\n");
      out.write("					<option value=\"3\">3점</option>\r\n");
      out.write("					<option value=\"2\">2점</option>\r\n");
      out.write("					<option value=\"1\">1점</option>\r\n");
      out.write("				</select>\r\n");
      out.write("			</div>\r\n");
      out.write("			<hr>\r\n");
      out.write("			<div>\r\n");
      out.write("				<label>시공진행상태</label> <select>\r\n");
      out.write("					<option>진행중</option>\r\n");
      out.write("					<option selected>완료</option>\r\n");
      out.write("					<option>기타</option>\r\n");
      out.write("				</select>\r\n");
      out.write("			</div>\r\n");
      out.write("			<hr>\r\n");
      out.write("			<div>\r\n");
      out.write("				<select id=\"search_condition\">\r\n");
      out.write("					<option value=\"customer_name\" selected>고객명</option>\r\n");
      out.write("					<option value=\"construction_style\">시공스타일</option>\r\n");
      out.write("				</select> <input type=\"text\" placeholder=\"입력\">\r\n");
      out.write("			</div>\r\n");
      out.write("\r\n");
      out.write("			<hr>\r\n");
      out.write("			<div id=\"search_conditon_hidemenu\">\r\n");
      out.write("				<div>\r\n");
      out.write("				<input type=\"button\" value=\"검색\">\r\n");
      out.write("				<input type=\"reset\" value=\"초기화\"></div>\r\n");
      out.write("				<input type=\"button\" value=\"검색 접기\" id=hide_button\r\n");
      out.write("					onclick=\"display()\">\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</form>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("	<div>\r\n");
      out.write("		<table border=\"1\">\r\n");
      out.write("			<tr>\r\n");
      out.write("				<th>↓↑</th>\r\n");
      out.write("				<th>등록일</th>\r\n");
      out.write("				<th>시공종류</th>\r\n");
      out.write("				<th>별점</th>\r\n");
      out.write("				<th>후기 코멘트</th>\r\n");
      out.write("				<th>작성자</th>\r\n");
      out.write("			</tr>\r\n");
      out.write("			<tr>\r\n");
      out.write("				<td colspan=\"6\">검색 결과가 없습니다</td>\r\n");
      out.write("			</tr>\r\n");
      out.write("		</table>\r\n");
      out.write("	</div>\r\n");
      out.write("\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../include/footer.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
