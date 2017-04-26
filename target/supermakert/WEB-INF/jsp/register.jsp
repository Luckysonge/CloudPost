<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">  
<html>
  <head>
	<meta charset='utf-8'>
	<title>MyHome</title>
	<script type="text/javascript" src="<%=basePath %>js/jquery-1.11.2.js"></script>
	<style type="text/css">
		body{
			font-family: "微软雅黑"
		}
		.sign{
			width: 100%;
			text-align: center;
			height: 600px;
			background-color: white;
			opacity: 0.7;
			list-style: none;
		}
		#second{
			display: none;
		}
		#third{
			display: none;
		}
		
		.li1{
			width: 100%;
			background-image: url("wedding.jpg");
			position: absolute;
			opacity: 0.7;
			display: block;
			height: 525px;
			background-position: 0px -45px;
			margin-right: -100%;
			z-index: 5;
			background-attachment:fixed;
			background-size: cover;
		}
		.li2{
			width: 100%;
			background-image: url("twofeets.jpg");
			opacity:0.7;
			position: absolute;
			display: block;
			height: 525px;
			background-position: -0px -45px;
			margin-right: -100%;
			z-index: 5;
			background-attachment:fixed;
			background-size: cover;
		}
		.li3{
			width: 100%;
			background-image: url("countrycp.jpg");
			opacity:0.7;
			position: absolute;
			display: block;
			height: 525px;
			background-position: 0 -45px;
			margin-right: -100%;
			z-index: 5;
			background-attachment:fixed;
			background-size: cover;
		}
		.back{
			position: absolute;
			z-index: 0;
			background-color: black;
			height: 575px;
			width: 100%
		}
		.register{
			display: block;
			
			position:absolute;
			z-index: 10;
			height: 250px;
			width: 30%;
			margin-left: 35%;
			margin-right: 35%;
			margin-top:100px;
			color:white;
			border: solid white 6px;
			border-radius: 5px 5px 5px 5px;
		}
		.login{
			display: block;
			
			position:absolute;
			z-index: 10;
			height: 200px;
			width: 30%;
			margin-left: 35%;
			margin-right: 35%;
			margin-top:100px;
			color:white;
			border: solid white 6px;
			border-radius: 5px 5px 5px 5px;
		}
		input{
			margin-top: 30px;
		}
		.re-title{
			width: 100%;
			min-height: 20px;
		}
		h2{
			margin: 0;
		}
		.re-row{
			width: 100%;
			min-height: 30px;
		}
		#change{
			font-size: 10px;
			padding-top: 20px;
		}
	</style>
</head>

<body>
	<div class="sign">
		<div class="register" id="register" style="display:none">
			<div class="re-title">
				<h2>注册</h2>
			</div>
			<form action="<%=basePath %>user/register" method="post">
				<div class="re-row">
					<label>用户名</label>
					<input type="text" id="re-username" name="name"/>
				</div>
				<div class="re-row">
					<label>密码</label>
					<input type="password" id="re-password" name="password"/>
				</div>
				<div class="re-row">
					<input type="submit" id="resure" value="确定注册"/>
				</div>
			</form>
			<div class="re-row" id="change">
				<label id="l1">选用社交/已有账号登录</label>
			</div>
			
		</div>
		<div class="login" id="login" style="display:none">
				<div class="re-title">
					<h2>登录</h2>
				</div>
				<form action="<%=basePath %>user/login" method="post">
					<div class="re-row">
						<label>用户名</label>						
						<input type="text" id="username" name="name"/>
					</div>
					<div class="re-row">
						<label>密码</label>
						<input type="password" id="password" name="password"/>
					</div>
					<div class="re-row">
						<input type="submit" value="登录"/>
						<input type="button" id="back" value="返回注册"/>
					</div>
				</form>
			</div>
			<li class="li1" id="first"></li>
			<li class="li2" id="second"></li>
			<li class="li3" id="third"></li>
			<li class="back"></li>
	</div>	

	<script type="text/javascript">
	function showHint(str)
	{
	var xmlhttp;
	if (str.length==0)
	  { 
	  document.getElementById("txtHint").innerHTML="";
	  return;
	  }
	if (window.XMLHttpRequest)
	  {// code for IE7+, Firefox, Chrome, Opera, Safari
	  xmlhttp=new XMLHttpRequest();
	  }
	else
	  {// code for IE6, IE5
	  xmlhttp=new ActiveXObject("Microsoft.XMLHTTP");
	  }
	xmlhttp.onreadystatechange=function()
	  {
	  if (xmlhttp.readyState==4 && xmlhttp.status==200)
	    {
	    	document.write("success")
	    }
	  }
	var username = 	document.getElementById("re-username");
	var password = document.getElementById("re-password");


	xmlhttp.open("GET","test.php?username="+username+"&password="+password,true);
	xmlhttp.send();
	}

	$(document).ready(function(){
	  $("#resure").click(function(){
	  	
	  });
	  });
</script>


<script type="text/javascript">
	var i = 0;
	function change(){
		if(i == 0){
			$("#first").fadeOut("slow")
			$("#second").fadeIn("slow")
			i++
		}
		else if(i == 1){
			$("#second").fadeOut("slow")
			$("#third").fadeIn("slow")
			i++
		}
		else if(i == 2){

			$("#third").fadeOut("slow")
			$("#first").fadeIn("slow")
			i = 0;
		}
	}
	window.onload = function(){
		$(".register").fadeIn(2000);
	}
	$("#l1").click(function(){
		$("#register").hide("slow")
		$("#login").show("slow")
	})
	$("#back").click(function(){
		$("#login").hide("slow")
		$("#register").show("slow")
	})
	setInterval(function(){
			change();
		}
		,6000);
</script>

</body>
</html>
