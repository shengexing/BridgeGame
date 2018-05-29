<%@ page language="java" import="java.util.*" import="impl.*"
	pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>桥牌发牌页面</title>

<link href="./css/Licensing.css" type="text/css" rel="stylesheet"></link>

<script type="text/javascript">
    	
    	var current_player = 0;
    	var count_ending = 0;
    	var current_contract = "";
    	
    	/* 取得指定id的对象*/
	    function getObj(id){
	        return document.getElementById(id);
	    }
	    
	    /* 添加行函数*/
	    function addRow(tabName){
	        var tab = getObj(tabName);	//获得table的对象
	        var row = tab.insertRow(tab.rows.length);	//添加行
	        row.id = "DataTr" + Math.floor(current_player / 4);
	        
	        /** 
	        	添加四列*/
	        var CellN = row.insertCell(row.cells.length);
	        CellN.id = row.id + "Td0";
	        var CellE = row.insertCell(row.cells.length);
	        CellE.id = row.id + "Td1";
	        var CellS = row.insertCell(row.cells.length);
	        CellS.id = row.id + "Td2";
	        var CellW = row.insertCell(row.cells.length);
	        CellW.id = row.id + "Td3";
	    }
    
    	/* 玩家准备开始*/
    	function start() {
    		document.getElementById("center_butStart").style.display="none";
    		document.getElementById("but_licensing").style.display="block";
    		document.getElementById("nameN").innerHTML="玩家1";
    		document.getElementById("nameE").innerHTML="玩家1";
    		document.getElementById("nameS").innerHTML="玩家1";
    		document.getElementById("nameW").innerHTML="玩家1";
    		document.getElementById("nameI").innerHTML="玩家1";
    	}
    	
    	/* 运行倒计时方法*/
    	function runTime(){
			var s = document.getElementById("countdown");
			if(s.innerHTML == 0) {
				var row = Math.floor(current_player / 4);
				var col = current_player % 4;
				var id = "DataTr" + row + "Td" + col;
			
				var current = document.getElementById(id);
				if(!current.innerHTML) { current.innerHTML = "--"; count_ending++; }
				
				// 判断定约结果是否确认
				if(count_ending == 3) {
					alert("定约结果已产生: " + current_contract); 
					window.setInterval(); 
					return;
				}
			
				s.innerHTML = 30;
				current_player++;
				if(current_player % 4 == 0) { displayCardsN(); addRow('data');}
				if(current_player % 4 == 1) displayCardsE();
				if(current_player % 4 == 2) displayCardsS();
				if(current_player % 4 == 3) displayCardsW();
				
			}
			else s.innerHTML -= 1;
		}
		
		function isEnding(row, col) {
		
		}
		
		/* 玩家点击叫牌卡*/
		function callCard(e) {
			if(!e) e = window.event;
			var but = e.target.id;
			var butID = parseInt(but.substr(6, but.length - 1));
			var value = e.target.value;
			
			if(butID == 35) { value = "--"; count_ending++; }
			if(butID == 36) { value = "x2"; }
			
			
			var row = Math.floor(current_player / 4);
			var col = current_player % 4;
			var id = "DataTr" + row + "Td" + col;
			document.getElementById(id).innerHTML = value;
			
			if(butID < 35) current_contract = value;
			
			document.getElementById("countdown").innerHTML = 0;
			setButtonDisable(butID);
		}
		
		/* 设置按钮不能被按*/
		function setButtonDisable(val) {
			if(val < 35)
				for(var i = val; i >= 0; i--) {
					var b = document.getElementById("button" + i);	// 获取不能被按的按钮
					b.disabled = true;	// 设置该按钮不能被按
				}
		}
		
    
    	/* 实现发牌的方法*/
    	function licensing(){
    		<%Poker.licensing(0); // 先给北发牌
			/*整理四位玩家的手牌*/
			for (int i = 0; i < 4; i++) {
				Poker.sortPlayerCards(i);
			}%>
    		displayCardsN(); current_player = 0;
    		document.getElementById("but_licensing").style.display="none";
    		window.setInterval("runTime();", 1000);
    	}
    	
    	/* 显示北家的牌*/
    	function displayCardsN() {
    		// 先隐藏其他玩家的手牌
    		hideCardsE();
    		hideCardsS();
    		hideCardsW();
    		
    		// 设置北家牌手的牌面显示的图片
    		<%for (int i = 0; i < 13; i++) {
				int codeN = Poker.getPokerN()[i].getCode(), numberN = codeN % 13, colorN = codeN % 4;%>
				document.getElementById("img_cardsN<%=i%>").src="./picture/cards/north/<%=colorN%><%=numberN%>.JPG";
				document.getElementById("img_cardsI<%=i%>").src="./picture/cards/south/<%=colorN%><%=numberN%>.JPG";
			<%}%>
			document.getElementById("positionI").innerHTML="北";
		}
		
		/* 隐藏北家的牌*/
    	function hideCardsN() {
    		<%for (int i = 0; i < 13; i++) {%>
				document.getElementById("img_cardsN<%=i%>").src="./picture/cards/north/back.JPG";
			<%}%>
		}
		
		/* 显示东家的牌*/
    	function displayCardsE() {
    		// 先隐藏其他玩家的手牌
    		hideCardsN();
    		hideCardsS();
    		hideCardsW();
    		
    		// 设置东家牌手的牌面显示的图片
    		<%for (int i = 0; i < 13; i++) {
				int codeE = Poker.getPokerE()[i].getCode(), numberE = codeE % 13, colorE = codeE % 4;%>
				document.getElementById("img_cardsE<%=i%>").src="./picture/cards/east/<%=colorE%><%=numberE%>.JPG";
				document.getElementById("img_cardsI<%=i%>").src="./picture/cards/south/<%=colorE%><%=numberE%>.JPG";
			<%}%>
			document.getElementById("positionI").innerHTML="东";
		}
		
		/* 隐藏东家的牌*/
    	function hideCardsE() {
    		<%for (int i = 0; i < 13; i++) {%>
				document.getElementById("img_cardsE<%=i%>").src="./picture/cards/east/back.JPG";
			<%}%>
		}
		
		/* 显示南家的牌*/
    	function displayCardsS() {
    		// 先隐藏其他玩家的手牌
    		hideCardsN();
    		hideCardsE();
    		hideCardsW();
    		
    		// 设置南家牌手的牌面显示的图片
    		<%for (int i = 0; i < 13; i++) {
				int codeS = Poker.getPokerS()[i].getCode(), numberS = codeS % 13, colorS = codeS % 4;%>
				document.getElementById("img_cardsS<%=i%>").src="./picture/cards/south/<%=colorS%><%=numberS%>.JPG";
				document.getElementById("img_cardsI<%=i%>").src="./picture/cards/south/<%=colorS%><%=numberS%>.JPG";
			<%}%>
			document.getElementById("positionI").innerHTML="南";
		}
		
		/* 隐藏南家的牌*/
    	function hideCardsS() {
    		<%for (int i = 0; i < 13; i++) {%>
				document.getElementById("img_cardsS<%=i%>").src="./picture/cards/south/back.JPG";
			<%}%>
		}
		
		/* 显示西家的牌*/
    	function displayCardsW() {
    		// 先隐藏其他玩家的手牌
    		hideCardsN();
    		hideCardsE();
    		hideCardsS();
    		
    		// 设置西家牌手的牌面显示的图片
    		<%for (int i = 0; i < 13; i++) {
				int codeW = Poker.getPokerW()[i].getCode(), numberW = codeW % 13, colorW = codeW % 4;%>
				document.getElementById("img_cardsW<%=i%>").src="./picture/cards/west/<%=colorW%><%=numberW%>.JPG";
				document.getElementById("img_cardsI<%=i%>").src="./picture/cards/south/<%=colorW%><%=numberW%>.JPG";
			<%}%>
			document.getElementById("positionI").innerHTML="西";
		}
		
		/* 隐藏西家的牌*/
    	function hideCardsW() {
    		<%for (int i = 0; i < 13; i++) {%>
				document.getElementById("img_cardsW<%=i%>").src="./picture/cards/west/back.JPG";
			<%}%>
		}
		
    </script>

</head>

<body>
	<div class="sop" id="main">

		<!-- 北边的牌手 -->
		<div class="pos" id="North">
			<!-- 北边的牌手的信息 -->
			<div class="player" id="playerN">
				<div class="div_playerN" id="div_playerN0">
					<label id="nameN"></label> <label id="positionN">北</label>
				</div>
			</div>

			<!-- 北边的牌手的手牌 -->
			<div class="cards" id="cardsN">
				<div class="div_cardsN" id="div_cardsN0">
					<img id="img_cardsN0">
				</div>
				<div class="div_cardsN" id="div_cardsN1">
					<img id="img_cardsN1">
				</div>
				<div class="div_cardsN" id="div_cardsN2">
					<img id="img_cardsN2">
				</div>
				<div class="div_cardsN" id="div_cardsN3">
					<img id="img_cardsN3">
				</div>
				<div class="div_cardsN" id="div_cardsN4">
					<img id="img_cardsN4">
				</div>
				<div class="div_cardsN" id="div_cardsN5">
					<img id="img_cardsN5">
				</div>
				<div class="div_cardsN" id="div_cardsN6">
					<img id="img_cardsN6">
				</div>
				<div class="div_cardsN" id="div_cardsN7">
					<img id="img_cardsN7">
				</div>
				<div class="div_cardsN" id="div_cardsN8">
					<img id="img_cardsN8">
				</div>
				<div class="div_cardsN" id="div_cardsN9">
					<img id="img_cardsN9">
				</div>
				<div class="div_cardsN" id="div_cardsN10">
					<img id="img_cardsN10">
				</div>
				<div class="div_cardsN" id="div_cardsN11">
					<img id="img_cardsN11">
				</div>
				<div class="div_cardsN" id="div_cardsN12">
					<img id="img_cardsN12">
				</div>
			</div>
		</div>

		<!-- 东边的牌手 -->
		<div class="pos" id="East">
			<!-- 东边的牌手的信息 -->
			<div class="player" id="playerE">
				<div class="div_playerE" id="div_playerE0">
					<label id="nameE"></label> <label id="positionE">东</label>
				</div>
			</div>

			<!-- 东边的牌手的手牌 -->
			<div class="cards" id="cardsE">
				<div class="div_cardsE" id="div_cardsE0">
					<img id="img_cardsE0">
				</div>
				<div class="div_cardsE" id="div_cardsE1">
					<img id="img_cardsE1">
				</div>
				<div class="div_cardsE" id="div_cardsE2">
					<img id="img_cardsE2">
				</div>
				<div class="div_cardsE" id="div_cardsE3">
					<img id="img_cardsE3">
				</div>
				<div class="div_cardsE" id="div_cardsE4">
					<img id="img_cardsE4">
				</div>
				<div class="div_cardsE" id="div_cardsE5">
					<img id="img_cardsE5">
				</div>
				<div class="div_cardsE" id="div_cardsE6">
					<img id="img_cardsE6">
				</div>
				<div class="div_cardsE" id="div_cardsE7">
					<img id="img_cardsE7">
				</div>
				<div class="div_cardsE" id="div_cardsE8">
					<img id="img_cardsE8">
				</div>
				<div class="div_cardsE" id="div_cardsE9">
					<img id="img_cardsE9">
				</div>
				<div class="div_cardsE" id="div_cardsE10">
					<img id="img_cardsE10">
				</div>
				<div class="div_cardsE" id="div_cardsE11">
					<img id="img_cardsE11">
				</div>
				<div class="div_cardsE" id="div_cardsE12">
					<img id="img_cardsE12">
				</div>
			</div>
		</div>

		<!-- 南边的牌手 -->
		<div class="pos" id="South">
			<!-- 南边的牌手的信息 -->
			<div class="player" id="playerS">
				<div class="div_playerS" id="div_playerS0">
					<label id="nameS"></label> <label id="positionS">南</label>
				</div>
			</div>

			<!-- 南边的牌手的手牌 -->
			<div class="cards" id="cardsS">
				<div class="div_cardsS" id="div_cardsS0">
					<img id="img_cardsS0">
				</div>
				<div class="div_cardsS" id="div_cardsS1">
					<img id="img_cardsS1">
				</div>
				<div class="div_cardsS" id="div_cardsS2">
					<img id="img_cardsS2">
				</div>
				<div class="div_cardsS" id="div_cardsS3">
					<img id="img_cardsS3">
				</div>
				<div class="div_cardsS" id="div_cardsS4">
					<img id="img_cardsS4">
				</div>
				<div class="div_cardsS" id="div_cardsS5">
					<img id="img_cardsS5">
				</div>
				<div class="div_cardsS" id="div_cardsS6">
					<img id="img_cardsS6">
				</div>
				<div class="div_cardsS" id="div_cardsS7">
					<img id="img_cardsS7">
				</div>
				<div class="div_cardsS" id="div_cardsS8">
					<img id="img_cardsS8">
				</div>
				<div class="div_cardsS" id="div_cardsS9">
					<img id="img_cardsS9">
				</div>
				<div class="div_cardsS" id="div_cardsS10">
					<img id="img_cardsS10">
				</div>
				<div class="div_cardsS" id="div_cardsS11">
					<img id="img_cardsS11">
				</div>
				<div class="div_cardsS" id="div_cardsS12">
					<img id="img_cardsS12">
				</div>
			</div>
		</div>

		<!-- 西边的牌手 -->
		<div class="pos" id="West">
			<!-- 西边的牌手的信息 -->
			<div class="player" id="playerW">
				<div class="div_playerW" id="div_playerW0">
					<label id="nameW"></label> <label id="positionW">西</label>
				</div>
			</div>

			<!-- 西边的牌手的手牌 -->
			<div class="cards" id="cardsW">
				<div class="div_cardsW" id="div_cardsW0">
					<img id="img_cardsW0">
				</div>
				<div class="div_cardsW" id="div_cardsW1">
					<img id="img_cardsW1">
				</div>
				<div class="div_cardsW" id="div_cardsW2">
					<img id="img_cardsW2">
				</div>
				<div class="div_cardsW" id="div_cardsW3">
					<img id="img_cardsW3">
				</div>
				<div class="div_cardsW" id="div_cardsW4">
					<img id="img_cardsW4">
				</div>
				<div class="div_cardsW" id="div_cardsW5">
					<img id="img_cardsW5">
				</div>
				<div class="div_cardsW" id="div_cardsW6">
					<img id="img_cardsW6">
				</div>
				<div class="div_cardsW" id="div_cardsW7">
					<img id="img_cardsW7">
				</div>
				<div class="div_cardsW" id="div_cardsW8">
					<img id="img_cardsW8">
				</div>
				<div class="div_cardsW" id="div_cardsW9">
					<img id="img_cardsW9">
				</div>
				<div class="div_cardsW" id="div_cardsW10">
					<img id="img_cardsW10">
				</div>
				<div class="div_cardsW" id="div_cardsW11">
					<img id="img_cardsW11">
				</div>
				<div class="div_cardsW" id="div_cardsW12">
					<img id="img_cardsW12">
				</div>
			</div>
		</div>


		<div class="pos" id="Center" style="background-image: url('./picture/board.png');">
			<input id="center_butStart" type="button" onclick="start();" value="准备">

			<!-- 当前的牌手的信息 -->
			<div class="player" id="playerI">
				<div class="div_playerI" id="div_playerI0">
					<label id="nameI"></label> <label id="positionI"></label>
				</div>
			</div>

			<!-- 当前的牌手的手牌 -->
			<div class="cards" id="cardsI">
				<div class="div_cardsI" id="div_cardsI0">
					<img id="img_cardsI0">
				</div>
				<div class="div_cardsI" id="div_cardsI1">
					<img id="img_cardsI1">
				</div>
				<div class="div_cardsI" id="div_cardsI2">
					<img id="img_cardsI2">
				</div>
				<div class="div_cardsI" id="div_cardsI3">
					<img id="img_cardsI3">
				</div>
				<div class="div_cardsI" id="div_cardsI4">
					<img id="img_cardsI4">
				</div>
				<div class="div_cardsI" id="div_cardsI5">
					<img id="img_cardsI5">
				</div>
				<div class="div_cardsI" id="div_cardsI6">
					<img id="img_cardsI6">
				</div>
				<div class="div_cardsI" id="div_cardsI7">
					<img id="img_cardsI7">
				</div>
				<div class="div_cardsI" id="div_cardsI8">
					<img id="img_cardsI8">
				</div>
				<div class="div_cardsI" id="div_cardsI9">
					<img id="img_cardsI9">
				</div>
				<div class="div_cardsI" id="div_cardsI10">
					<img id="img_cardsI10">
				</div>
				<div class="div_cardsI" id="div_cardsI11">
					<img id="img_cardsI11">
				</div>
				<div class="div_cardsI" id="div_cardsI12">
					<img id="img_cardsI12">
				</div>
			</div>
		</div>

	</div>

	<!-- 叫牌过程中需要的按钮 -->
	<div class="sop" id="but">
		<button type="button" id="but_licensing"
			onclick="javascript:licensing();">发牌</button>
		<div class="but_class" id="but_cards">
			<jsp:include page="contractTable.jsp"></jsp:include>
		</div>
	</div>

	<!-- 显示叫牌过程中的关键信息 -->
	<div class="sop" id="inf"></div>

</body>

</html>
