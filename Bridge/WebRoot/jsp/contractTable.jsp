<%@ page language="java" import="java.util.*" import="impl.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>桥牌发牌页面</title>
    <style type="text/css">
		.main {
			position: absolute;
			text-align: center; /*让div内部文字居中*/
			background-color: #fff;
			border-radius: 20px;
			bottom: 0px;
			margin: auto;
		}
	</style>

</head>

<body style="position: absolute;">

	<!-- 叫牌主界面的设计 -->
	<div class="main">

		<!-- 叫牌表格的设计 -->
		<div class="callTable"
			style="width: 300px; height: 100px; overflow-y: scroll; scrollbar-base-color: #ff6600; border: 1px solid;">
			<table id="data" style="width: 100%; height: 100%; text-align: center;">
				<tr>
					<th>N</th>
					<th>E</th>
					<th>S</th>
					<th>W</th>
				</tr>
				<tr id="DataTr0">
					<td id="DataTr0Td0"></td>
					<td id="DataTr0Td1"></td>
					<td id="DataTr0Td2"></td>
					<td id="DataTr0Td3"></td>
				</tr>
			</table>
		</div>

		<!-- 叫牌定约卡的设计 -->
		<div class="contractCard" style="width: 300px; height: 250px; border: 1px solid;">
			<table style="width: 100%; height: 85%">
				<tr>
					<td><input id="button0" type="button" value="1C" onclick="callCard()"/></td>
					<td><input id="button1" type="button" value="1D" onclick="callCard()"/></td>
					<td><input id="button2" type="button" value="1H" onclick="callCard()"/></td>
					<td><input id="button3" type="button" value="1S" onclick="callCard()"/></td>
					<td><input id="button4" type="button" value="1NT" onclick="callCard()"/></td>
				</tr>
				<tr>
					<td><input id="button5" type="button" value="2C" onclick="callCard()"/></td>
					<td><input id="button6" type="button" value="2D" onclick="callCard()"/></td>
					<td><input id="button7" type="button" value="2H" onclick="callCard()"/></td>
					<td><input id="button8" type="button" value="2S" onclick="callCard()"/></td>
					<td><input id="button9" type="button" value="2NT" onclick="callCard()"/></td>
				</tr>
				<tr>
					<td><input id="button10" type="button" value="3C" onclick="callCard()"/></td>
					<td><input id="button11" type="button" value="3D" onclick="callCard()"/></td>
					<td><input id="button12" type="button" value="3H" onclick="callCard()"/></td>
					<td><input id="button13" type="button" value="3S" onclick="callCard()"/></td>
					<td><input id="button14" type="button" value="3NT" onclick="callCard()"/></td>
				</tr>
				<tr>
					<td><input id="button15" type="button" value="4C" onclick="callCard()"/></td>
					<td><input id="button16" type="button" value="4D" onclick="callCard()"/></td>
					<td><input id="button17" type="button" value="4H" onclick="callCard()"/></td>
					<td><input id="button18" type="button" value="4S" onclick="callCard()"/></td>
					<td><input id="button19" type="button" value="4NT" onclick="callCard()"/></td>
				</tr>
				<tr>
					<td><input id="button20" type="button" value="5C" onclick="callCard()"/></td>
					<td><input id="button21" type="button" value="5D" onclick="callCard()"/></td>
					<td><input id="button22" type="button" value="5H" onclick="callCard()"/></td>
					<td><input id="button23" type="button" value="5S" onclick="callCard()"/></td>
					<td><input id="button24" type="button" value="5NT" onclick="callCard()"/></td>
				</tr>
				<tr>
					<td><input id="button25" type="button" value="6C" onclick="callCard()"/></td>
					<td><input id="button26" type="button" value="6D" onclick="callCard()"/></td>
					<td><input id="button27" type="button" value="6H" onclick="callCard()"/></td>
					<td><input id="button28" type="button" value="6S" onclick="callCard()"/></td>
					<td><input id="button29" type="button" value="6NT" onclick="callCard()"/></td>
				</tr>
				<tr>
					<td><input id="button30" type="button" value="7C" onclick="callCard()"/></td>
					<td><input id="button31" type="button" value="7D" onclick="callCard()"/></td>
					<td><input id="button32" type="button" value="7H" onclick="callCard()"/></td>
					<td><input id="button33" type="button" value="7S" onclick="callCard()"/></td>
					<td><input id="button34" type="button" value="7NT" onclick="callCard()"/></td>
				</tr>
			</table>
			
			<table style="width: 100%; height: 10%">
				<tr>
					<td><input id="button35" type="button" value="Pass" onclick="callCard()"/></td>
					<td><input id="button36" type="button" style="display: none" value="Dbl" onclick="callCard()"/></td>
					<td style="text-align: center; color: red"><span id="countdown">30</span><span>s</span></td>
				</tr>
			</table>
		</div>
	</div>
	
</body>
  
</html>