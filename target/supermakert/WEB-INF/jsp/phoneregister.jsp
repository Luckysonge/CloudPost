<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">  
<html>
	<head>	
		<title>手机注册</title>
		<meta charset="utf-8"/>
		<meta name="viewport" content="width=device-width,initial-scale=1,user-scalable=0"/>
		<link rel="stylesheet" href="<%=basePath %>css/bootstrap.css"/>
	    <link rel="stylesheet" href="<%=basePath %>css/weui.css"/> 
	    <link rel="stylesheet" href="<%=basePath %>css/example.css"/>

	    <script type="text/javascript" src="<%=basePath %>js/jquery-1.11.2.js"></script>
	    <script type="text/javascript" src="<%=basePath %>js/bootstrap.js"></script>

	</head>


	<body>
		<div class="sign">
		<div class="register" id="register" style="display:none">
			<form action="<%=basePath %>/user/register" method="get">
			<div  class="weui_cells weui_cells_form">
				<div class="weui_cell">
					<div class="weui_cell_hd">
						<label class="weui_label">账号名称</label>
					</div>
					<div class="weui_cell_bd weui_cell_primary">
						<input class="weui_input" type="text" placeholder="请输入账号，不可以使用除大小写字母数字下划线以外的非法字符"/>
					</div>	
				</div>
				<div class="weui_cell">
					<div class="weui_cell_bd">
						<label class="weui_label">密码</label>
					</div>	
					<div class="weui_cell_bd weui_cell_primary">
						<input class="weui_input" type="password" placeholder="请输入密码" />
					</div>
				</div>
				<div class="weui_cell">
					<div class="weui_cell_bd weui_cell_primary">
						<input type="submit" class="weui_btn weui_btn_primary" value="注册" />
						<div class="weui_btn weui_btn_warn" id="l1">使用已有账号登录</div>
					</div>
				</div>
			
			</div>
		</form>
		</div>
		
		<div class="login" id="login" style="display:none">
		<form action="<%=basePath %>/user/register" method="post">
			<div  class="weui_cells weui_cells_form">
				<div class="weui_cell">
					<div class="weui_cell_hd">
						<label class="weui_label">账号名称</label>
					</div>
					<div class="weui_cell_bd weui_cell_primary">
						<input class="weui_input" type="text" placeholder="请输入账号，不可以使用除大小写字母数字下划线以外的非法字符"/>
					</div>	
				</div>
				<div class="weui_cell">
					<div class="weui_cell_bd">
						<label class="weui_label">密码</label>
					</div>	
					<div class="weui_cell_bd weui_cell_primary">
						<input class="weui_input" type="password" placeholder="请输入密码"/>
					</div>
				</div>
				<div class="weui_cell">
					<div class="weui_cell_bd weui_cell_primary">
						<input type="submit" class="weui_btn weui_btn_primary" value="登录"/>
						<div class="weui_btn weui_btn_warn" id="back">返回注册</div>
					</div>
				</div> 	
			</div>	
		</form>
		</div>
	</div>	

<script type="text/javascript">
	$(document).ready(function(){
	  $("#resure").click(function(){
	  	
	  });
	  });
</script>


<script type="text/javascript">
	var i = 0;
	window.onload = function(){
		$(".register").fadeIn(2000);
	};
	$("#l1").click(function(){
		$("#register").hide("slow");
		$("#login").show("slow");
	});
	$("#back").click(function(){
		$("#login").hide("slow");
		$("#register").show("slow");
	});
</script>

	</body>
</html>
