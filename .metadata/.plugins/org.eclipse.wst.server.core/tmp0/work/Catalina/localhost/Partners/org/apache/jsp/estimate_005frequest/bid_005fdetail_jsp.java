/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.64
 * Generated at: 2022-09-28 10:12:17 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.estimate_005frequest;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class bid_005fdetail_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<script>\r\n");
      out.write("$(function() {\r\n");
      out.write("	$('#bid_participate').click(function() {\r\n");
      out.write("		$('#bid_part_detail').toggle(400);\r\n");
      out.write("		$('.bid_complete_button').toggle(400);\r\n");
      out.write("	});\r\n");
      out.write("});\r\n");
      out.write("$(function() {\r\n");
      out.write("	$('#hide_button').click(function() {\r\n");
      out.write("		$('#search_conditon').hide(400);\r\n");
      out.write("	});\r\n");
      out.write("});\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("	<div class=\"request_detail_page\">\r\n");
      out.write("		<div class=\"my_bid_detail_icon\">\r\n");
      out.write("			<a href=\"./my_bid.do\"\r\n");
      out.write("				class=\"to_my_bid\" target=\"_blank\"><img src=\"./images/bid_list.png\" width=\"55px\" height=\"55px\"></a>\r\n");
      out.write("		</div>		\r\n");
      out.write("		<div class=\"request_list_detail_container\">\r\n");
      out.write("			<div class=\"go_bid_detail\">\r\n");
      out.write("				<a href=\"./bid.do\" class=\"list_go\">\r\n");
      out.write("					<span class=\"ico_back\"><img src=\"./images/list-arrow.png\"></span>\r\n");
      out.write("					<span class=\"list_go_text\">목록으로</span>\r\n");
      out.write("				</a>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"request_detail\">\r\n");
      out.write("				<p class=\"request_detail_day\">\r\n");
      out.write("					모집중 D-<span>2</span>\r\n");
      out.write("				</p>\r\n");
      out.write("				<p class=\"label_badge\">\r\n");
      out.write("					<span class=\"label_val1\">사무실</span>\r\n");
      out.write("					<span class=\"label_val2\">도배/바닥/욕실 공사</span>\r\n");
      out.write("				</p>\r\n");
      out.write("				<div class=\"request_detail_title\">\r\n");
      out.write("				<h3>목동 사무실 원상복구 견적 문의</h3>\r\n");
      out.write("				</div>\r\n");
      out.write("				\r\n");
      out.write("				<div class=\"greeb_box_container\">\r\n");
      out.write("					<div class=\"green_box\">\r\n");
      out.write("						<ul class=\"box-cell5\">\r\n");
      out.write("							<li class=\"detail_info\">\r\n");
      out.write("								<div class=\"dt\">\r\n");
      out.write("									<p class=\"ico1\">희망 예산</p>\r\n");
      out.write("								</div>\r\n");
      out.write("								<div class=\"dd\">5000000</div> <!-- 500만원 -->\r\n");
      out.write("							</li>\r\n");
      out.write("							<li class=\"detail_info\">\r\n");
      out.write("								<div class=\"dt\">\r\n");
      out.write("									<p class=\"ico2\">모집마감일</p>\r\n");
      out.write("								</div>\r\n");
      out.write("								<div class=\"dd\">2022.07.20</div>\r\n");
      out.write("							</li>\r\n");
      out.write("							<li class=\"detail_info\">\r\n");
      out.write("								<div class=\"dt\">\r\n");
      out.write("									<p class=\"ico3\">희망 시공시작일</p>\r\n");
      out.write("								</div>\r\n");
      out.write("								<div class=\"dd\">2022.09.01</div>\r\n");
      out.write("							</li>\r\n");
      out.write("							<li class=\"detail_info\">\r\n");
      out.write("								<div class=\"dt\">\r\n");
      out.write("									<p class=\"ico4\">희망 시공종료일</p>\r\n");
      out.write("								</div>\r\n");
      out.write("								<div class=\"dd\">2022.09.12</div>\r\n");
      out.write("							</li>							\r\n");
      out.write("							<li class=\"detail_info_ex\">\r\n");
      out.write("								<div class=\"dt\">\r\n");
      out.write("									<p class=\"ico5\">참여 파트너수</p>\r\n");
      out.write("								</div>\r\n");
      out.write("								<div class=\"dd\">3개 사</div>\r\n");
      out.write("							</li>\r\n");
      out.write("						</ul>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class=\"detail_option\">\r\n");
      out.write("					<div class=\"detail-op-sec\">\r\n");
      out.write("						<div class=\"sec-head-title\">첨부파일</div>\r\n");
      out.write("						</hr>\r\n");
      out.write("						<div class=\"sec-cont-wrap\">\r\n");
      out.write("							<div class=\"file-box\">\r\n");
      out.write("								<ul class=\"file-list\">\r\n");
      out.write("									<li class=\"attach_file_list\">\r\n");
      out.write("										<a href=\"javascript:void(0);\" class=\"btn-file\">\r\n");
      out.write("										<span class=\"download_mark\"><img src=\"./images/downloadmark.png\" width=\"20px\" height=\"20px\"></span>\r\n");
      out.write("										 프로젝트 첨부파일\r\n");
      out.write("										</a>\r\n");
      out.write("									</li>\r\n");
      out.write("								</ul>\r\n");
      out.write("							</div>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("					<div class=\"detail-op-sec\">\r\n");
      out.write("						<div class=\"sec-head\">\r\n");
      out.write("							<div class=\"sec-head-title\">\r\n");
      out.write("								의뢰 세부 정보\r\n");
      out.write("							</div></hr>\r\n");
      out.write("						</div>\r\n");
      out.write("						<div class=\"sec-cont-wrap\">\r\n");
      out.write("							<dl class=\"sec-item\">\r\n");
      out.write("								<dt class=\"sec-title\">공간유형</dt>\r\n");
      out.write("								<dd class=\"sec-cont\">주거</dd>\r\n");
      out.write("							</dl>\r\n");
      out.write("							<dl class=\"sec-item\">\r\n");
      out.write("								<dt class=\"sec-title\">건물유형</dt>\r\n");
      out.write("								<dd class=\"sec-cont\">사무실</dd>\r\n");
      out.write("							</dl>\r\n");
      out.write("							<dl class=\"sec-item\">\r\n");
      out.write("								<dt class=\"sec-title\">인테리어 종류</dt>\r\n");
      out.write("								<dd class=\"sec-cont\">[도배/바닥/욕실]</dd>\r\n");
      out.write("							</dl>\r\n");
      out.write("							<dl class=\"sec-item\">\r\n");
      out.write("								<dt class=\"sec-title\">세부 선택</dt>\r\n");
      out.write("								<dd class=\"sec-cont\"></dd>\r\n");
      out.write("							</dl>\r\n");
      out.write("							<dl class=\"sec-item\">\r\n");
      out.write("								<dt class=\"sec-title\">시공 규모(평 수)</dt>\r\n");
      out.write("								<dd class=\"sec-cont\">21.96m<sup>2</sup>(10평)</dd>\r\n");
      out.write("							</dl>\r\n");
      out.write("							<dl class=\"sec-item\">\r\n");
      out.write("								<dt class=\"sec-title\">시공 주소</dt>\r\n");
      out.write("								<dd class=\"sec-cont\">경기도 성남시 수정구 위례서일로22</dd>\r\n");
      out.write("							</dl>\r\n");
      out.write("							<dl class=\"sec-item\">\r\n");
      out.write("								<dt class=\"sec-title\">희망 예산</dt>\r\n");
      out.write("								<dd class=\"sec-cont\">5000000</dd>\r\n");
      out.write("							</dl>\r\n");
      out.write("							<dl class=\"sec-item\">\r\n");
      out.write("								<dt class=\"sec-title\">희망 시공시작일</dt>\r\n");
      out.write("								<dd class=\"sec-cont\">2022.08.13</dd>\r\n");
      out.write("							</dl>							\r\n");
      out.write("							<dl class=\"sec-item\">\r\n");
      out.write("								<dt class=\"sec-title\">희망 시공완료일</dt>\r\n");
      out.write("								<dd class=\"sec-cont\">2022.08.28</dd>\r\n");
      out.write("							</dl>							\r\n");
      out.write("							<dl class=\"sec-item\">\r\n");
      out.write("								<dt class=\"sec-title\">희망 스타일</dt>\r\n");
      out.write("								<dd class=\"sec-cont\">\r\n");
      out.write("									1. 이사예정이 7/19(화)이라 18일까지는 완료가 되어야 합니다.(기존3층에 임대사무실 사용 후 9층\r\n");
      out.write("									매매완료하여 이사) 이사예정인 사무실은 15일 오전중에 공실이 됩니다.2. 바닥재은 어두운계열로,\r\n");
      out.write("									벽면은 합판이 덧대어져있는것 같은데 페이트 혹은 들뜨지않게 마감처리하여 깔끔하게 될 수 있도록 페인트 혹은 벽지\r\n");
      out.write("									두가지 생각하고 있습니다.<br>3. 전등갓이 불량하여 변경이 이뤄져야합니다.<br>4.\r\n");
      out.write("									외부시트지 디자인작업이 필요합니다.\r\n");
      out.write("								</dd>\r\n");
      out.write("							</dl>\r\n");
      out.write("							<form method=\"post\" action=\"bid_detail_ok.do\">\r\n");
      out.write("								<div>\r\n");
      out.write("									<div class=\"bid_part_div\">\r\n");
      out.write("										<button type=\"button\" id=\"bid_participate\">입찰 신청하기</button>\r\n");
      out.write("									</div>\r\n");
      out.write("									<div id=\"bid_part_detail\">\r\n");
      out.write("											<div class=\"bid_detail01\">입찰가</div>\r\n");
      out.write("											<div class=\"bid_detail_text01\"><input type=\"text\" id=\"bid_price\" name=\"bid_price\" size=\"10\"/><br/></div>\r\n");
      out.write("											<div class=\"bid_detail02\" >예상 공사기간</div>\r\n");
      out.write("											<div class=\"bid_detail_text02\"><input type=\"text\" id=\"bid_period\" name=\"bid_period\"  size=\"10\"/><br/></div>\r\n");
      out.write("											<div class=\"bid_detail03\">업체 공사 스타일 설명</div>\r\n");
      out.write("											<textarea id=\"bid_detail\" name=\"bid_detail\" rows=\"5\" ></textarea>\r\n");
      out.write("									</div>\r\n");
      out.write("									<div class=\"bid_complete_button\">\r\n");
      out.write("										<input type=\"submit\" id=\"bid_complete\" value=\"신청완료\">\r\n");
      out.write("									</div>\r\n");
      out.write("								</div>\r\n");
      out.write("							</form>	\r\n");
      out.write("						</div>\r\n");
      out.write("\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"bottom_color\"></div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../include/footer.jsp", out, false);
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