/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.88
 * Generated at: 2023-05-30 07:19:34 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.member;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class modify_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("jar:file:/D:/_jsp_workspace/jsp_project4/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/jsp_project4/WEB-INF/lib/taglibs-standard-impl-1.2.5.jar!/META-INF/c.tld", Long.valueOf(1425946270000L));
    _jspx_dependants.put("/WEB-INF/lib/taglibs-standard-impl-1.2.5.jar", Long.valueOf(1685082270700L));
  }

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

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
      return;
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

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<link rel=\"stylesheet\"\n");
      out.write("	href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"/resources/css/bootstrap.css\">\n");
      out.write("<link rel=\"stylesheet\"\n");
      out.write("	href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.14.0/css/all.min.css\">\n");
      out.write("<link rel=\"stylesheet\"\n");
      out.write("	href=\"//maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css\">\n");
      out.write("<style>\n");
      out.write("@import\n");
      out.write("	url('https://fonts.googleapis.com/css?family=Montserrat:400,800');\n");
      out.write("\n");
      out.write("* {\n");
      out.write("	box-sizing: border-box;\n");
      out.write("}\n");
      out.write("\n");
      out.write("body {\n");
      out.write("	background: #f6f5f7;\n");
      out.write("	display: flex;\n");
      out.write("	justify-content: center;\n");
      out.write("	align-items: center;\n");
      out.write("	flex-direction: column;\n");
      out.write("	font-family: 'Montserrat', sans-serif;\n");
      out.write("	height: 100vh;\n");
      out.write("	margin: -20px 0 50px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("h1 {\n");
      out.write("	font-weight: bold;\n");
      out.write("	margin: 0;\n");
      out.write("}\n");
      out.write("\n");
      out.write("h2 {\n");
      out.write("	text-align: center;\n");
      out.write("}\n");
      out.write("\n");
      out.write("p {\n");
      out.write("	font-size: 14px;\n");
      out.write("	font-weight: 100;\n");
      out.write("	line-height: 20px;\n");
      out.write("	letter-spacing: 0.5px;\n");
      out.write("	margin: 20px 0 30px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("span {\n");
      out.write("	font-size: 12px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("a {\n");
      out.write("	color: #333;\n");
      out.write("	font-size: 14px;\n");
      out.write("	text-decoration: none;\n");
      out.write("	margin: 15px 0;\n");
      out.write("}\n");
      out.write("\n");
      out.write("button {\n");
      out.write("	border-radius: 20px;\n");
      out.write("	border: 1px solid #FF4B2B;\n");
      out.write("	background-color: #FF4B2B;\n");
      out.write("	color: #FFFFFF;\n");
      out.write("	font-size: 12px;\n");
      out.write("	font-weight: bold;\n");
      out.write("	padding: 12px 45px;\n");
      out.write("	letter-spacing: 1px;\n");
      out.write("	text-transform: uppercase;\n");
      out.write("	transition: transform 80ms ease-in;\n");
      out.write("}\n");
      out.write("\n");
      out.write("button:active {\n");
      out.write("	transform: scale(0.95);\n");
      out.write("}\n");
      out.write("\n");
      out.write("button:focus {\n");
      out.write("	outline: none;\n");
      out.write("}\n");
      out.write("\n");
      out.write("button.ghost {\n");
      out.write("	background-color: transparent;\n");
      out.write("	border-color: #FFFFFF;\n");
      out.write("}\n");
      out.write("\n");
      out.write("form {\n");
      out.write("	background-color: #FFFFFF;\n");
      out.write("	display: flex;\n");
      out.write("	align-items: center;\n");
      out.write("	justify-content: center;\n");
      out.write("	flex-direction: column;\n");
      out.write("	padding: 0 50px;\n");
      out.write("	height: 100%;\n");
      out.write("	text-align: center;\n");
      out.write("}\n");
      out.write("\n");
      out.write("input {\n");
      out.write("	background-color: #eee;\n");
      out.write("	border: none;\n");
      out.write("	padding: 12px 15px;\n");
      out.write("	margin: 8px 0;\n");
      out.write("	width: 100%;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".container {\n");
      out.write("	background-color: #fff;\n");
      out.write("	border-radius: 10px;\n");
      out.write("	box-shadow: 0 14px 28px rgba(0, 0, 0, 0.25), 0 10px 10px\n");
      out.write("		rgba(0, 0, 0, 0.22);\n");
      out.write("	position: relative;\n");
      out.write("	overflow: hidden;\n");
      out.write("	width: 768px;\n");
      out.write("	max-width: 100%;\n");
      out.write("	min-height: 480px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".form-container {\n");
      out.write("	position: absolute;\n");
      out.write("	top: 0;\n");
      out.write("	height: 100%;\n");
      out.write("	transition: all 0.6s ease-in-out;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".sign-in-container {\n");
      out.write("	left: 0;\n");
      out.write("	width: 50%;\n");
      out.write("	z-index: 2;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".container.right-panel-active .sign-in-container {\n");
      out.write("	transform: translateX(100%);\n");
      out.write("}\n");
      out.write("\n");
      out.write(".sign-up-container {\n");
      out.write("	left: 0;\n");
      out.write("	width: 50%;\n");
      out.write("	opacity: 0;\n");
      out.write("	z-index: 1;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".container.right-panel-active .sign-up-container {\n");
      out.write("	transform: translateX(100%);\n");
      out.write("	opacity: 1;\n");
      out.write("	z-index: 5;\n");
      out.write("	animation: show 0.6s;\n");
      out.write("}\n");
      out.write("\n");
      out.write("@\n");
      out.write("keyframes show { 0%, 49.99% {\n");
      out.write("	opacity: 0;\n");
      out.write("	z-index: 1;\n");
      out.write("}\n");
      out.write("\n");
      out.write("50\n");
      out.write("\n");
      out.write("\n");
      out.write("%\n");
      out.write(",\n");
      out.write("100\n");
      out.write("\n");
      out.write("\n");
      out.write("%\n");
      out.write("{\n");
      out.write("opacity\n");
      out.write("\n");
      out.write("\n");
      out.write(":\n");
      out.write("\n");
      out.write("\n");
      out.write("1\n");
      out.write(";\n");
      out.write("\n");
      out.write("\n");
      out.write("z-index\n");
      out.write("\n");
      out.write("\n");
      out.write(":\n");
      out.write("\n");
      out.write("\n");
      out.write("5\n");
      out.write(";\n");
      out.write("\n");
      out.write("\n");
      out.write("}\n");
      out.write("}\n");
      out.write(".overlay-container {\n");
      out.write("	position: absolute;\n");
      out.write("	top: 0;\n");
      out.write("	left: 50%;\n");
      out.write("	width: 50%;\n");
      out.write("	height: 100%;\n");
      out.write("	overflow: hidden;\n");
      out.write("	transition: transform 0.6s ease-in-out;\n");
      out.write("	z-index: 100;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".container.right-panel-active .overlay-container {\n");
      out.write("	transform: translateX(-100%);\n");
      out.write("}\n");
      out.write("\n");
      out.write(".overlay {\n");
      out.write("	background: #FF416C;\n");
      out.write("	background: -webkit-linear-gradient(to right, #FF4B2B, #FF416C);\n");
      out.write("	background: linear-gradient(to right, #FF4B2B, #FF416C);\n");
      out.write("	background-repeat: no-repeat;\n");
      out.write("	background-size: cover;\n");
      out.write("	background-position: 0 0;\n");
      out.write("	color: #FFFFFF;\n");
      out.write("	position: relative;\n");
      out.write("	left: -100%;\n");
      out.write("	height: 100%;\n");
      out.write("	width: 200%;\n");
      out.write("	transform: translateX(0);\n");
      out.write("	transition: transform 0.6s ease-in-out;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".container.right-panel-active .overlay {\n");
      out.write("	transform: translateX(50%);\n");
      out.write("}\n");
      out.write("\n");
      out.write(".overlay-panel {\n");
      out.write("	position: absolute;\n");
      out.write("	display: flex;\n");
      out.write("	align-items: center;\n");
      out.write("	justify-content: center;\n");
      out.write("	flex-direction: column;\n");
      out.write("	padding: 0 40px;\n");
      out.write("	text-align: center;\n");
      out.write("	top: 0;\n");
      out.write("	height: 100%;\n");
      out.write("	width: 50%;\n");
      out.write("	transform: translateX(0);\n");
      out.write("	transition: transform 0.6s ease-in-out;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".overlay-left {\n");
      out.write("	transform: translateX(-20%);\n");
      out.write("}\n");
      out.write("\n");
      out.write(".container.right-panel-active .overlay-left {\n");
      out.write("	transform: translateX(0);\n");
      out.write("}\n");
      out.write("\n");
      out.write(".overlay-right {\n");
      out.write("	right: 0;\n");
      out.write("	transform: translateX(0);\n");
      out.write("}\n");
      out.write("\n");
      out.write(".container.right-panel-active .overlay-right {\n");
      out.write("	transform: translateX(20%);\n");
      out.write("}\n");
      out.write("\n");
      out.write(".social-container {\n");
      out.write("	margin: 20px 0;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".social-container a {\n");
      out.write("	border: 1px solid #DDDDDD;\n");
      out.write("	border-radius: 50%;\n");
      out.write("	display: inline-flex;\n");
      out.write("	justify-content: center;\n");
      out.write("	align-items: center;\n");
      out.write("	margin: 0 5px;\n");
      out.write("	height: 40px;\n");
      out.write("	width: 40px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("footer {\n");
      out.write("	background-color: #222;\n");
      out.write("	color: #fff;\n");
      out.write("	font-size: 14px;\n");
      out.write("	bottom: 0;\n");
      out.write("	position: fixed;\n");
      out.write("	left: 0;\n");
      out.write("	right: 0;\n");
      out.write("	text-align: center;\n");
      out.write("	z-index: 999;\n");
      out.write("}\n");
      out.write("\n");
      out.write("footer p {\n");
      out.write("	margin: 10px 0;\n");
      out.write("}\n");
      out.write("\n");
      out.write("footer i {\n");
      out.write("	color: red;\n");
      out.write("}\n");
      out.write("\n");
      out.write("footer a {\n");
      out.write("	color: #3c97bf;\n");
      out.write("	text-decoration: none;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("<title>회원정보수정 페이지</title>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("<h1>회원정보 수정</h1>\n");
      out.write("<div class=\"container\" id=\"container\">\n");
      out.write("		<div class=\"form-container sign-up-container\">\n");
      out.write("			<form action=\"#\">\n");
      out.write("				<h1>Create Account</h1>\n");
      out.write("				<div class=\"social-container\">\n");
      out.write("					<a href=\"#\" class=\"social\"><i class=\"fab fa-facebook-f\"></i></a> <a\n");
      out.write("						href=\"#\" class=\"social\"><i class=\"fab fa-google-plus-g\"></i></a> <a\n");
      out.write("						href=\"#\" class=\"social\"><i class=\"fab fa-linkedin-in\"></i></a>\n");
      out.write("				</div>\n");
      out.write("				<span>or use your email for registration</span> <input type=\"text\"\n");
      out.write("					name=\"id\" placeholder=\"Name\" /> <input type=\"email\"\n");
      out.write("					name=\"password\" placeholder=\"Email\" /> <input type=\"password\"\n");
      out.write("					placeholder=\"Password\" />\n");
      out.write("				<button>Sign Up</button>\n");
      out.write("			</form>\n");
      out.write("		</div>\n");
      out.write("		<div class=\"form-container sign-in-container\">\n");
      out.write("			<form action=\"/mem/edit\" method=\"post\">\n");
      out.write("				<h1>회원정보 수정</h1>\n");
      out.write("				<div class=\"social-container\">\n");
      out.write("					<a href=\"#\" class=\"social\"><i class=\"fab fa-facebook-f\"></i></a> <a\n");
      out.write("						href=\"#\" class=\"social\"><i class=\"fab fa-google-plus-g\"></i></a> <a\n");
      out.write("						href=\"#\" class=\"social\"><i class=\"fab fa-linkedin-in\"></i></a>\n");
      out.write("				</div>\n");
      out.write("				<input type=\"text\" name=\"id\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ses.id }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" readonly=\"readonly\"> \n");
      out.write("				<input type=\"password\" name =\"password\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ses.password }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("				<input type=\"text\" name=\"email\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ses.email }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("				<input type=\"text\" name=\"age\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ses.age }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("				<button type=\"submit\">수정완료</button>\n");
      out.write("				<a href=\"/\">메인</a>\n");
      out.write("			</form>\n");
      out.write("		</div>\n");
      out.write("		<div class=\"overlay-container\">\n");
      out.write("			<div class=\"overlay\">\n");
      out.write("				<div class=\"overlay-panel overlay-left\">\n");
      out.write("					<h1>Welcome Back!</h1>\n");
      out.write("					<p>To keep connected with us please login with your personal\n");
      out.write("						info</p>\n");
      out.write("\n");
      out.write("					<button class=\"ghost\" id=\"signIn\">Sign In</button>\n");
      out.write("				</div>\n");
      out.write("			</div>\n");
      out.write("		</div>\n");
      out.write("	</div>\n");
      out.write("	</body>\n");
      out.write("</html>");
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
