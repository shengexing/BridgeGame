<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'mainBottom.jsp' starting page</title>

  </head>
  
  <body>
  
    <div id="func" style="position: absolute; height: 600px; width: 1260px;">
    
    	<div class="func" id="extFunc" style="position: absolute; left: 0px; top: 0px; width: 1260px; height: 200px;">
    		<label style="position: absolute; top: 20px; left: 510px;">
    			<font size="20" color="red">叫牌练习</font>
    		</label>
    		<a href="jsp/user/historyList.jsp" target="bottom"><img alt="叫牌历史纪录" title="叫牌历史纪录" src="./picture/bg/historyRecord_bg.jpg" style="position: absolute; top: 20px; right: 100px;"></a>
    	</div>
    	
    	<div class="func" id="baseFunc" style="position: absolute; left: 0px; top: 200px; width: 1260px; height: 400px;">
    		<a href="jsp/Licensing.jsp" target="bottom"><img alt="单人叫牌练习" title="单人叫牌练习" src="./picture/bg/licensing_bg.PNG" style="position: absolute; top: 20px; left: 420px;"></a>
    		<a href="jsp/user/historyList.jsp" target="bottom"><img alt="查看他人叫牌记录" title="查看他人叫牌记录" src="./picture/bg/searchRecord_bg.PNG" style="position: absolute; top: 20px; right: 400px;"></a>
    	</div>
    
    </div>
    
  </body>
</html>
