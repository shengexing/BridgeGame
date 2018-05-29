/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.30
 * Generated at: 2018-05-24 07:58:10 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import impl.*;

public final class Licensing_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
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
      response.setContentType("text/html;charset=utf-8");
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

	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<base href=\"");
      out.print(basePath);
      out.write("\">\r\n");
      out.write("\r\n");
      out.write("<title>桥牌发牌页面</title>\r\n");
      out.write("\r\n");
      out.write("<link href=\"./css/Licensing.css\" type=\"text/css\" rel=\"stylesheet\"></link>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("    \t\r\n");
      out.write("    \tvar current_player = 0;\r\n");
      out.write("    \tvar count_ending = 0;\r\n");
      out.write("    \tvar current_contract = \"\";\r\n");
      out.write("    \t\r\n");
      out.write("    \t/* 取得指定id的对象*/\r\n");
      out.write("\t    function getObj(id){\r\n");
      out.write("\t        return document.getElementById(id);\r\n");
      out.write("\t    }\r\n");
      out.write("\t    \r\n");
      out.write("\t    /* 添加行函数*/\r\n");
      out.write("\t    function addRow(tabName){\r\n");
      out.write("\t        var tab = getObj(tabName);\t//获得table的对象\r\n");
      out.write("\t        var row = tab.insertRow(tab.rows.length);\t//添加行\r\n");
      out.write("\t        row.id = \"DataTr\" + Math.floor(current_player / 4);\r\n");
      out.write("\t        \r\n");
      out.write("\t        /** \r\n");
      out.write("\t        \t添加四列*/\r\n");
      out.write("\t        var CellN = row.insertCell(row.cells.length);\r\n");
      out.write("\t        CellN.id = row.id + \"Td0\";\r\n");
      out.write("\t        var CellE = row.insertCell(row.cells.length);\r\n");
      out.write("\t        CellE.id = row.id + \"Td1\";\r\n");
      out.write("\t        var CellS = row.insertCell(row.cells.length);\r\n");
      out.write("\t        CellS.id = row.id + \"Td2\";\r\n");
      out.write("\t        var CellW = row.insertCell(row.cells.length);\r\n");
      out.write("\t        CellW.id = row.id + \"Td3\";\r\n");
      out.write("\t    }\r\n");
      out.write("    \r\n");
      out.write("    \t/* 玩家准备开始*/\r\n");
      out.write("    \tfunction start() {\r\n");
      out.write("    \t\tdocument.getElementById(\"center_butStart\").style.display=\"none\";\r\n");
      out.write("    \t\tdocument.getElementById(\"but_licensing\").style.display=\"block\";\r\n");
      out.write("    \t\tdocument.getElementById(\"nameN\").innerHTML=\"玩家1\";\r\n");
      out.write("    \t\tdocument.getElementById(\"nameE\").innerHTML=\"玩家1\";\r\n");
      out.write("    \t\tdocument.getElementById(\"nameS\").innerHTML=\"玩家1\";\r\n");
      out.write("    \t\tdocument.getElementById(\"nameW\").innerHTML=\"玩家1\";\r\n");
      out.write("    \t\tdocument.getElementById(\"nameI\").innerHTML=\"玩家1\";\r\n");
      out.write("    \t}\r\n");
      out.write("    \t\r\n");
      out.write("    \t/* 运行倒计时方法*/\r\n");
      out.write("    \tfunction runTime(){\r\n");
      out.write("\t\t\tvar s = document.getElementById(\"countdown\");\r\n");
      out.write("\t\t\tif(s.innerHTML == 0) {\r\n");
      out.write("\t\t\t\tvar row = Math.floor(current_player / 4);\r\n");
      out.write("\t\t\t\tvar col = current_player % 4;\r\n");
      out.write("\t\t\t\tvar id = \"DataTr\" + row + \"Td\" + col;\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\tvar current = document.getElementById(id);\r\n");
      out.write("\t\t\t\tif(!current.innerHTML) { current.innerHTML = \"--\"; count_ending++; }\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t// 判断定约结果是否确认\r\n");
      out.write("\t\t\t\tif(count_ending == 3) {\r\n");
      out.write("\t\t\t\t\talert(\"定约结果已产生: \" + current_contract); \r\n");
      out.write("\t\t\t\t\twindow.setInterval(); \r\n");
      out.write("\t\t\t\t\treturn;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\ts.innerHTML = 30;\r\n");
      out.write("\t\t\t\tcurrent_player++;\r\n");
      out.write("\t\t\t\tif(current_player % 4 == 0) { displayCardsN(); addRow('data');}\r\n");
      out.write("\t\t\t\tif(current_player % 4 == 1) displayCardsE();\r\n");
      out.write("\t\t\t\tif(current_player % 4 == 2) displayCardsS();\r\n");
      out.write("\t\t\t\tif(current_player % 4 == 3) displayCardsW();\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\telse s.innerHTML -= 1;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tfunction isEnding(row, col) {\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t/* 玩家点击叫牌卡*/\r\n");
      out.write("\t\tfunction callCard(e) {\r\n");
      out.write("\t\t\tif(!e) e = window.event;\r\n");
      out.write("\t\t\tvar but = e.target.id;\r\n");
      out.write("\t\t\tvar butID = parseInt(but.substr(6, but.length - 1));\r\n");
      out.write("\t\t\tvar value = e.target.value;\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tif(butID == 35) { value = \"--\"; count_ending++; }\r\n");
      out.write("\t\t\tif(butID == 36) { value = \"x2\"; }\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tvar row = Math.floor(current_player / 4);\r\n");
      out.write("\t\t\tvar col = current_player % 4;\r\n");
      out.write("\t\t\tvar id = \"DataTr\" + row + \"Td\" + col;\r\n");
      out.write("\t\t\tdocument.getElementById(id).innerHTML = value;\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tif(butID < 35) current_contract = value;\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tdocument.getElementById(\"countdown\").innerHTML = 0;\r\n");
      out.write("\t\t\tsetButtonDisable(butID);\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t/* 设置按钮不能被按*/\r\n");
      out.write("\t\tfunction setButtonDisable(val) {\r\n");
      out.write("\t\t\tif(val < 35)\r\n");
      out.write("\t\t\t\tfor(var i = val; i >= 0; i--) {\r\n");
      out.write("\t\t\t\t\tvar b = document.getElementById(\"button\" + i);\t// 获取不能被按的按钮\r\n");
      out.write("\t\t\t\t\tb.disabled = true;\t// 设置该按钮不能被按\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("    \r\n");
      out.write("    \t/* 实现发牌的方法*/\r\n");
      out.write("    \tfunction licensing(){\r\n");
      out.write("    \t\t");
Poker.licensing(0); // 先给北发牌
			/*整理四位玩家的手牌*/
			for (int i = 0; i < 4; i++) {
				Poker.sortPlayerCards(i);
			}
      out.write("\r\n");
      out.write("    \t\tdisplayCardsN(); current_player = 0;\r\n");
      out.write("    \t\tdocument.getElementById(\"but_licensing\").style.display=\"none\";\r\n");
      out.write("    \t\twindow.setInterval(\"runTime();\", 1000);\r\n");
      out.write("    \t}\r\n");
      out.write("    \t\r\n");
      out.write("    \t/* 显示北家的牌*/\r\n");
      out.write("    \tfunction displayCardsN() {\r\n");
      out.write("    \t\t// 先隐藏其他玩家的手牌\r\n");
      out.write("    \t\thideCardsE();\r\n");
      out.write("    \t\thideCardsS();\r\n");
      out.write("    \t\thideCardsW();\r\n");
      out.write("    \t\t\r\n");
      out.write("    \t\t// 设置北家牌手的牌面显示的图片\r\n");
      out.write("    \t\t");
for (int i = 0; i < 13; i++) {
				int codeN = Poker.getPokerN()[i].getCode(), numberN = codeN % 13, colorN = codeN % 4;
      out.write("\r\n");
      out.write("\t\t\t\tdocument.getElementById(\"img_cardsN");
      out.print(i);
      out.write("\").src=\"./picture/cards/north/");
      out.print(colorN);
      out.print(numberN);
      out.write(".JPG\";\r\n");
      out.write("\t\t\t\tdocument.getElementById(\"img_cardsI");
      out.print(i);
      out.write("\").src=\"./picture/cards/south/");
      out.print(colorN);
      out.print(numberN);
      out.write(".JPG\";\r\n");
      out.write("\t\t\t");
}
      out.write("\r\n");
      out.write("\t\t\tdocument.getElementById(\"positionI\").innerHTML=\"北\";\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t/* 隐藏北家的牌*/\r\n");
      out.write("    \tfunction hideCardsN() {\r\n");
      out.write("    \t\t");
for (int i = 0; i < 13; i++) {
      out.write("\r\n");
      out.write("\t\t\t\tdocument.getElementById(\"img_cardsN");
      out.print(i);
      out.write("\").src=\"./picture/cards/north/back.JPG\";\r\n");
      out.write("\t\t\t");
}
      out.write("\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t/* 显示东家的牌*/\r\n");
      out.write("    \tfunction displayCardsE() {\r\n");
      out.write("    \t\t// 先隐藏其他玩家的手牌\r\n");
      out.write("    \t\thideCardsN();\r\n");
      out.write("    \t\thideCardsS();\r\n");
      out.write("    \t\thideCardsW();\r\n");
      out.write("    \t\t\r\n");
      out.write("    \t\t// 设置东家牌手的牌面显示的图片\r\n");
      out.write("    \t\t");
for (int i = 0; i < 13; i++) {
				int codeE = Poker.getPokerE()[i].getCode(), numberE = codeE % 13, colorE = codeE % 4;
      out.write("\r\n");
      out.write("\t\t\t\tdocument.getElementById(\"img_cardsE");
      out.print(i);
      out.write("\").src=\"./picture/cards/east/");
      out.print(colorE);
      out.print(numberE);
      out.write(".JPG\";\r\n");
      out.write("\t\t\t\tdocument.getElementById(\"img_cardsI");
      out.print(i);
      out.write("\").src=\"./picture/cards/south/");
      out.print(colorE);
      out.print(numberE);
      out.write(".JPG\";\r\n");
      out.write("\t\t\t");
}
      out.write("\r\n");
      out.write("\t\t\tdocument.getElementById(\"positionI\").innerHTML=\"东\";\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t/* 隐藏东家的牌*/\r\n");
      out.write("    \tfunction hideCardsE() {\r\n");
      out.write("    \t\t");
for (int i = 0; i < 13; i++) {
      out.write("\r\n");
      out.write("\t\t\t\tdocument.getElementById(\"img_cardsE");
      out.print(i);
      out.write("\").src=\"./picture/cards/east/back.JPG\";\r\n");
      out.write("\t\t\t");
}
      out.write("\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t/* 显示南家的牌*/\r\n");
      out.write("    \tfunction displayCardsS() {\r\n");
      out.write("    \t\t// 先隐藏其他玩家的手牌\r\n");
      out.write("    \t\thideCardsN();\r\n");
      out.write("    \t\thideCardsE();\r\n");
      out.write("    \t\thideCardsW();\r\n");
      out.write("    \t\t\r\n");
      out.write("    \t\t// 设置南家牌手的牌面显示的图片\r\n");
      out.write("    \t\t");
for (int i = 0; i < 13; i++) {
				int codeS = Poker.getPokerS()[i].getCode(), numberS = codeS % 13, colorS = codeS % 4;
      out.write("\r\n");
      out.write("\t\t\t\tdocument.getElementById(\"img_cardsS");
      out.print(i);
      out.write("\").src=\"./picture/cards/south/");
      out.print(colorS);
      out.print(numberS);
      out.write(".JPG\";\r\n");
      out.write("\t\t\t\tdocument.getElementById(\"img_cardsI");
      out.print(i);
      out.write("\").src=\"./picture/cards/south/");
      out.print(colorS);
      out.print(numberS);
      out.write(".JPG\";\r\n");
      out.write("\t\t\t");
}
      out.write("\r\n");
      out.write("\t\t\tdocument.getElementById(\"positionI\").innerHTML=\"南\";\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t/* 隐藏南家的牌*/\r\n");
      out.write("    \tfunction hideCardsS() {\r\n");
      out.write("    \t\t");
for (int i = 0; i < 13; i++) {
      out.write("\r\n");
      out.write("\t\t\t\tdocument.getElementById(\"img_cardsS");
      out.print(i);
      out.write("\").src=\"./picture/cards/south/back.JPG\";\r\n");
      out.write("\t\t\t");
}
      out.write("\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t/* 显示西家的牌*/\r\n");
      out.write("    \tfunction displayCardsW() {\r\n");
      out.write("    \t\t// 先隐藏其他玩家的手牌\r\n");
      out.write("    \t\thideCardsN();\r\n");
      out.write("    \t\thideCardsE();\r\n");
      out.write("    \t\thideCardsS();\r\n");
      out.write("    \t\t\r\n");
      out.write("    \t\t// 设置西家牌手的牌面显示的图片\r\n");
      out.write("    \t\t");
for (int i = 0; i < 13; i++) {
				int codeW = Poker.getPokerW()[i].getCode(), numberW = codeW % 13, colorW = codeW % 4;
      out.write("\r\n");
      out.write("\t\t\t\tdocument.getElementById(\"img_cardsW");
      out.print(i);
      out.write("\").src=\"./picture/cards/west/");
      out.print(colorW);
      out.print(numberW);
      out.write(".JPG\";\r\n");
      out.write("\t\t\t\tdocument.getElementById(\"img_cardsI");
      out.print(i);
      out.write("\").src=\"./picture/cards/south/");
      out.print(colorW);
      out.print(numberW);
      out.write(".JPG\";\r\n");
      out.write("\t\t\t");
}
      out.write("\r\n");
      out.write("\t\t\tdocument.getElementById(\"positionI\").innerHTML=\"西\";\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t/* 隐藏西家的牌*/\r\n");
      out.write("    \tfunction hideCardsW() {\r\n");
      out.write("    \t\t");
for (int i = 0; i < 13; i++) {
      out.write("\r\n");
      out.write("\t\t\t\tdocument.getElementById(\"img_cardsW");
      out.print(i);
      out.write("\").src=\"./picture/cards/west/back.JPG\";\r\n");
      out.write("\t\t\t");
}
      out.write("\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("    </script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\t<div class=\"sop\" id=\"main\">\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- 北边的牌手 -->\r\n");
      out.write("\t\t<div class=\"pos\" id=\"North\">\r\n");
      out.write("\t\t\t<!-- 北边的牌手的信息 -->\r\n");
      out.write("\t\t\t<div class=\"player\" id=\"playerN\">\r\n");
      out.write("\t\t\t\t<div class=\"div_playerN\" id=\"div_playerN0\">\r\n");
      out.write("\t\t\t\t\t<label id=\"nameN\"></label> <label id=\"positionN\">北</label>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<!-- 北边的牌手的手牌 -->\r\n");
      out.write("\t\t\t<div class=\"cards\" id=\"cardsN\">\r\n");
      out.write("\t\t\t\t<div class=\"div_cardsN\" id=\"div_cardsN0\">\r\n");
      out.write("\t\t\t\t\t<img id=\"img_cardsN0\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"div_cardsN\" id=\"div_cardsN1\">\r\n");
      out.write("\t\t\t\t\t<img id=\"img_cardsN1\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"div_cardsN\" id=\"div_cardsN2\">\r\n");
      out.write("\t\t\t\t\t<img id=\"img_cardsN2\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"div_cardsN\" id=\"div_cardsN3\">\r\n");
      out.write("\t\t\t\t\t<img id=\"img_cardsN3\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"div_cardsN\" id=\"div_cardsN4\">\r\n");
      out.write("\t\t\t\t\t<img id=\"img_cardsN4\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"div_cardsN\" id=\"div_cardsN5\">\r\n");
      out.write("\t\t\t\t\t<img id=\"img_cardsN5\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"div_cardsN\" id=\"div_cardsN6\">\r\n");
      out.write("\t\t\t\t\t<img id=\"img_cardsN6\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"div_cardsN\" id=\"div_cardsN7\">\r\n");
      out.write("\t\t\t\t\t<img id=\"img_cardsN7\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"div_cardsN\" id=\"div_cardsN8\">\r\n");
      out.write("\t\t\t\t\t<img id=\"img_cardsN8\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"div_cardsN\" id=\"div_cardsN9\">\r\n");
      out.write("\t\t\t\t\t<img id=\"img_cardsN9\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"div_cardsN\" id=\"div_cardsN10\">\r\n");
      out.write("\t\t\t\t\t<img id=\"img_cardsN10\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"div_cardsN\" id=\"div_cardsN11\">\r\n");
      out.write("\t\t\t\t\t<img id=\"img_cardsN11\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"div_cardsN\" id=\"div_cardsN12\">\r\n");
      out.write("\t\t\t\t\t<img id=\"img_cardsN12\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- 东边的牌手 -->\r\n");
      out.write("\t\t<div class=\"pos\" id=\"East\">\r\n");
      out.write("\t\t\t<!-- 东边的牌手的信息 -->\r\n");
      out.write("\t\t\t<div class=\"player\" id=\"playerE\">\r\n");
      out.write("\t\t\t\t<div class=\"div_playerE\" id=\"div_playerE0\">\r\n");
      out.write("\t\t\t\t\t<label id=\"nameE\"></label> <label id=\"positionE\">东</label>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<!-- 东边的牌手的手牌 -->\r\n");
      out.write("\t\t\t<div class=\"cards\" id=\"cardsE\">\r\n");
      out.write("\t\t\t\t<div class=\"div_cardsE\" id=\"div_cardsE0\">\r\n");
      out.write("\t\t\t\t\t<img id=\"img_cardsE0\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"div_cardsE\" id=\"div_cardsE1\">\r\n");
      out.write("\t\t\t\t\t<img id=\"img_cardsE1\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"div_cardsE\" id=\"div_cardsE2\">\r\n");
      out.write("\t\t\t\t\t<img id=\"img_cardsE2\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"div_cardsE\" id=\"div_cardsE3\">\r\n");
      out.write("\t\t\t\t\t<img id=\"img_cardsE3\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"div_cardsE\" id=\"div_cardsE4\">\r\n");
      out.write("\t\t\t\t\t<img id=\"img_cardsE4\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"div_cardsE\" id=\"div_cardsE5\">\r\n");
      out.write("\t\t\t\t\t<img id=\"img_cardsE5\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"div_cardsE\" id=\"div_cardsE6\">\r\n");
      out.write("\t\t\t\t\t<img id=\"img_cardsE6\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"div_cardsE\" id=\"div_cardsE7\">\r\n");
      out.write("\t\t\t\t\t<img id=\"img_cardsE7\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"div_cardsE\" id=\"div_cardsE8\">\r\n");
      out.write("\t\t\t\t\t<img id=\"img_cardsE8\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"div_cardsE\" id=\"div_cardsE9\">\r\n");
      out.write("\t\t\t\t\t<img id=\"img_cardsE9\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"div_cardsE\" id=\"div_cardsE10\">\r\n");
      out.write("\t\t\t\t\t<img id=\"img_cardsE10\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"div_cardsE\" id=\"div_cardsE11\">\r\n");
      out.write("\t\t\t\t\t<img id=\"img_cardsE11\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"div_cardsE\" id=\"div_cardsE12\">\r\n");
      out.write("\t\t\t\t\t<img id=\"img_cardsE12\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- 南边的牌手 -->\r\n");
      out.write("\t\t<div class=\"pos\" id=\"South\">\r\n");
      out.write("\t\t\t<!-- 南边的牌手的信息 -->\r\n");
      out.write("\t\t\t<div class=\"player\" id=\"playerS\">\r\n");
      out.write("\t\t\t\t<div class=\"div_playerS\" id=\"div_playerS0\">\r\n");
      out.write("\t\t\t\t\t<label id=\"nameS\"></label> <label id=\"positionS\">南</label>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<!-- 南边的牌手的手牌 -->\r\n");
      out.write("\t\t\t<div class=\"cards\" id=\"cardsS\">\r\n");
      out.write("\t\t\t\t<div class=\"div_cardsS\" id=\"div_cardsS0\">\r\n");
      out.write("\t\t\t\t\t<img id=\"img_cardsS0\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"div_cardsS\" id=\"div_cardsS1\">\r\n");
      out.write("\t\t\t\t\t<img id=\"img_cardsS1\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"div_cardsS\" id=\"div_cardsS2\">\r\n");
      out.write("\t\t\t\t\t<img id=\"img_cardsS2\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"div_cardsS\" id=\"div_cardsS3\">\r\n");
      out.write("\t\t\t\t\t<img id=\"img_cardsS3\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"div_cardsS\" id=\"div_cardsS4\">\r\n");
      out.write("\t\t\t\t\t<img id=\"img_cardsS4\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"div_cardsS\" id=\"div_cardsS5\">\r\n");
      out.write("\t\t\t\t\t<img id=\"img_cardsS5\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"div_cardsS\" id=\"div_cardsS6\">\r\n");
      out.write("\t\t\t\t\t<img id=\"img_cardsS6\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"div_cardsS\" id=\"div_cardsS7\">\r\n");
      out.write("\t\t\t\t\t<img id=\"img_cardsS7\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"div_cardsS\" id=\"div_cardsS8\">\r\n");
      out.write("\t\t\t\t\t<img id=\"img_cardsS8\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"div_cardsS\" id=\"div_cardsS9\">\r\n");
      out.write("\t\t\t\t\t<img id=\"img_cardsS9\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"div_cardsS\" id=\"div_cardsS10\">\r\n");
      out.write("\t\t\t\t\t<img id=\"img_cardsS10\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"div_cardsS\" id=\"div_cardsS11\">\r\n");
      out.write("\t\t\t\t\t<img id=\"img_cardsS11\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"div_cardsS\" id=\"div_cardsS12\">\r\n");
      out.write("\t\t\t\t\t<img id=\"img_cardsS12\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- 西边的牌手 -->\r\n");
      out.write("\t\t<div class=\"pos\" id=\"West\">\r\n");
      out.write("\t\t\t<!-- 西边的牌手的信息 -->\r\n");
      out.write("\t\t\t<div class=\"player\" id=\"playerW\">\r\n");
      out.write("\t\t\t\t<div class=\"div_playerW\" id=\"div_playerW0\">\r\n");
      out.write("\t\t\t\t\t<label id=\"nameW\"></label> <label id=\"positionW\">西</label>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<!-- 西边的牌手的手牌 -->\r\n");
      out.write("\t\t\t<div class=\"cards\" id=\"cardsW\">\r\n");
      out.write("\t\t\t\t<div class=\"div_cardsW\" id=\"div_cardsW0\">\r\n");
      out.write("\t\t\t\t\t<img id=\"img_cardsW0\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"div_cardsW\" id=\"div_cardsW1\">\r\n");
      out.write("\t\t\t\t\t<img id=\"img_cardsW1\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"div_cardsW\" id=\"div_cardsW2\">\r\n");
      out.write("\t\t\t\t\t<img id=\"img_cardsW2\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"div_cardsW\" id=\"div_cardsW3\">\r\n");
      out.write("\t\t\t\t\t<img id=\"img_cardsW3\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"div_cardsW\" id=\"div_cardsW4\">\r\n");
      out.write("\t\t\t\t\t<img id=\"img_cardsW4\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"div_cardsW\" id=\"div_cardsW5\">\r\n");
      out.write("\t\t\t\t\t<img id=\"img_cardsW5\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"div_cardsW\" id=\"div_cardsW6\">\r\n");
      out.write("\t\t\t\t\t<img id=\"img_cardsW6\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"div_cardsW\" id=\"div_cardsW7\">\r\n");
      out.write("\t\t\t\t\t<img id=\"img_cardsW7\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"div_cardsW\" id=\"div_cardsW8\">\r\n");
      out.write("\t\t\t\t\t<img id=\"img_cardsW8\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"div_cardsW\" id=\"div_cardsW9\">\r\n");
      out.write("\t\t\t\t\t<img id=\"img_cardsW9\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"div_cardsW\" id=\"div_cardsW10\">\r\n");
      out.write("\t\t\t\t\t<img id=\"img_cardsW10\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"div_cardsW\" id=\"div_cardsW11\">\r\n");
      out.write("\t\t\t\t\t<img id=\"img_cardsW11\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"div_cardsW\" id=\"div_cardsW12\">\r\n");
      out.write("\t\t\t\t\t<img id=\"img_cardsW12\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t<div class=\"pos\" id=\"Center\" style=\"background-image: url('./picture/board.png');\">\r\n");
      out.write("\t\t\t<input id=\"center_butStart\" type=\"button\" onclick=\"start();\" value=\"准备\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t<!-- 当前的牌手的信息 -->\r\n");
      out.write("\t\t\t<div class=\"player\" id=\"playerI\">\r\n");
      out.write("\t\t\t\t<div class=\"div_playerI\" id=\"div_playerI0\">\r\n");
      out.write("\t\t\t\t\t<label id=\"nameI\"></label> <label id=\"positionI\"></label>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<!-- 当前的牌手的手牌 -->\r\n");
      out.write("\t\t\t<div class=\"cards\" id=\"cardsI\">\r\n");
      out.write("\t\t\t\t<div class=\"div_cardsI\" id=\"div_cardsI0\">\r\n");
      out.write("\t\t\t\t\t<img id=\"img_cardsI0\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"div_cardsI\" id=\"div_cardsI1\">\r\n");
      out.write("\t\t\t\t\t<img id=\"img_cardsI1\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"div_cardsI\" id=\"div_cardsI2\">\r\n");
      out.write("\t\t\t\t\t<img id=\"img_cardsI2\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"div_cardsI\" id=\"div_cardsI3\">\r\n");
      out.write("\t\t\t\t\t<img id=\"img_cardsI3\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"div_cardsI\" id=\"div_cardsI4\">\r\n");
      out.write("\t\t\t\t\t<img id=\"img_cardsI4\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"div_cardsI\" id=\"div_cardsI5\">\r\n");
      out.write("\t\t\t\t\t<img id=\"img_cardsI5\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"div_cardsI\" id=\"div_cardsI6\">\r\n");
      out.write("\t\t\t\t\t<img id=\"img_cardsI6\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"div_cardsI\" id=\"div_cardsI7\">\r\n");
      out.write("\t\t\t\t\t<img id=\"img_cardsI7\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"div_cardsI\" id=\"div_cardsI8\">\r\n");
      out.write("\t\t\t\t\t<img id=\"img_cardsI8\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"div_cardsI\" id=\"div_cardsI9\">\r\n");
      out.write("\t\t\t\t\t<img id=\"img_cardsI9\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"div_cardsI\" id=\"div_cardsI10\">\r\n");
      out.write("\t\t\t\t\t<img id=\"img_cardsI10\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"div_cardsI\" id=\"div_cardsI11\">\r\n");
      out.write("\t\t\t\t\t<img id=\"img_cardsI11\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"div_cardsI\" id=\"div_cardsI12\">\r\n");
      out.write("\t\t\t\t\t<img id=\"img_cardsI12\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<!-- 叫牌过程中需要的按钮 -->\r\n");
      out.write("\t<div class=\"sop\" id=\"but\">\r\n");
      out.write("\t\t<button type=\"button\" id=\"but_licensing\"\r\n");
      out.write("\t\t\tonclick=\"javascript:licensing();\">发牌</button>\r\n");
      out.write("\t\t<div class=\"but_class\" id=\"but_cards\">\r\n");
      out.write("\t\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "contractTable.jsp", out, false);
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<!-- 显示叫牌过程中的关键信息 -->\r\n");
      out.write("\t<div class=\"sop\" id=\"inf\"></div>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>\r\n");
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
}
