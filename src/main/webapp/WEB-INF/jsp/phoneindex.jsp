<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">  
<html>
  <head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width,initial-scale=1,user-scalable=0" />
    <title>Title</title>
    <link rel="stylesheet" href="<%=basePath %>css/bootstrap.css" />
    <link rel="stylesheet" href="<%=basePath %>css/weui.css" /> 
    <link rel="stylesheet" href="<%=basePath %>css/example.css" />

    <script type="text/javascript" src="<%=basePath %>js/jquery-1.11.2.js"></script>
    <script type="text/javascript" src="<%=basePath %>js/bootstrap.js"></script>
    <style type="text/css">
    	body{
    		background-color: #ecece9;
    	}
    	.weui_panel{
    		min-height: 200px;
    	}
    	.weui_btn{
    		margin-top: 20px;
    	}
    	#bd{
    		margin-top: 80px;
    	}
    	.weui_tab{
    		height:89%;
    	}
    </style>
</head>
<body>
<div class="container js_container">
<div class="page slideIn navbar">
    <div class="weui_navbar">
    	
        <div class="weui_navbar_item" id="c">
            <p>个人管理</p>
        </div>
        <div class="weui_navbar_item" id="b">
            <p>好友发现</p>
        </div>
        <div class="weui_navbar_item" id="a">
            <p>编辑分享</p>
        </div>
    </div>
      <div id="bd">
          <script type="text/html" id="editor">
		            <div class="weui_tab_bd">
		            	<form action="fuckingsong.java" method="post">
		            	<div class="weui_cells weui_cells form">

		            		<div class="weui_cell">
		            			<div class="weui_cell_hd">
		            				<label class="weui_label">标题</label>
		            			</div>
		            			<div class="weui_cell_bd weui_cell_primary">
		            				<input class="weui_input" type="number" pattern="[0-9]" placeholder="请输入标题">
		            			</div>
		            		</div>
		            	</div>
		            		<div class="weui_cells_title">文本域</div>
		            			<div class="weui_cells weui_cells_form">
		            				<div class="weui_cell">
		            					<div class="weui_cell_bd weui_cell_primary">
		            						<textarea class="weui_textarea" placeholder="请输入内容" rows="3"></textarea>
		            					</div>
		            			</div>

		            		</div>
		            		<div class="weui_cells_title">
		            			署名信息
		            		</div>
		            		<div class="weui_cells weui_cells_radio">
		            			<label class="weui_cell weui_check_label" for="x11">
		            				<div class="weui_cell_bd weui_cell_primary">
		            					<p>匿名发送</p>
		            				</div>
		            				<div class="weui_cell_ft">
		            					<input type="radio" class="weui_check" name="radio1" id="x11">
		            					<span class="weui_icon_checked"></span>
		            				</div>
		            			</label>
		            			<label class="weui_cell weui_check_label" for="x12">
		            				<div class="weui_cell_bd weui_cell_primary">
		            					<p>实名发送</p>
		            				</div>
		            				<div class="weui_cell_ft">
		            					<input type="radio" class="weui_check" name="radio1" id="x12">
		            					<span class="weui_icon_checked"></span>
		            				</div>
		            			</label>
		            			<label class="weui_cell weui_check_label" for="x13">
		            				<div class="weui_cell_bd weui_cell_primary">
		            					<p>网名发送</p>
		            				</div>
		            				<div class="weui_cell_ft">
		            					<input type="radio" class="weui_check" name="radio1" id="x13">
		            					<span class="weui_icon_checked"></span>
		            				</div>
		            			</label>
		            			<input type="submit" class="weui_btn weui_btn_primary" value="确认发送"/>
		            			</form>
		            		</div>
		            		
		       </script>

	<script type="text/javascript">



	</script>

	<script type="text/html" id="manage">
		            		<div class="weui_tab">
		            			<div class="weui_panel_bd">
		            				<div class="weui_media_box weui_media_appmsg">
		            					<div class="weui_media_hd">
		            						<img class="weui_media_appmsg_thumb" src="<%=basePath %>img/weui.png"/>
		            					</div>
		            					<div class="weui_media_hd">
		            						<p>昵称:${user.name}</p>
		            						<p>账号:${user.userID}</p>
		            					</div>
		            				</div>


		            			</div>
		            		</div>
	</script>
	
	<script type="text/html" id="recommand">
			            	<div class="weui_panel weui_panel_access">
			            		<div class="weui_panel_bd">
			            			<a href="javascript:" class="weui_media_box weui_media_appmsg">
			            				<div class="weui_media_hd">
			            					<img src="<%=basePath %>img/label.png" style="width:50px;height:50px">
			            					<p>姓名</p>
			            				</div>
			            				<div class="weui_media_bd">
			            				
			            					<p>分享照片与文字</p>
			            					<p id="test"></p>
			            					<img src="<%=basePath %>img/address.png" style="width:80px;height:80px"> 
			            					<p>地理信息</p>
			            					<input type="button" id="" value="详细信息>" style="border:none;background-color:inherit;margin-top:70px;margin-left:75%">
			            					
			            				</div>
			            			</a>
			            	
					            </div>
					        </div>
						
	</script>
	
	<script type="text/javascript">
		function showArticle()
			{
			var xmlhttp;
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
			    document.getElementById("test").innerHTML=xmlhttp.responseText;
			    }
			  };
			xmlhttp.open("GET","test1.php",true);
			xmlhttp.send();
			}
			
	</script>
					</div>
		        </div>
		   	</div>
<script type="text/javascript">

    var bd = document.getElementById("bd");
    	manage = document.getElementById("manage");
    	recommand = document.getElementById("recommand");
    	editor = document.getElementById("editor");
    window.onload = function(){
    	bd.innerHTML = recommand.childNodes[0].data;
    	$("#b").css("background-color","#f5f5f5");
    	showArticle();
    };
	$("#a").click(function(){
		bd.innerHTML = editor.childNodes[0].data;
		$("#a").css("background-color","#f5f5f5");
		$("#b").css("background-color","#fafafa");
		$("#c").css("background-color","#fafafa");
	});
	$("#b").click(function(){
		bd.innerHTML = recommand.childNodes[0].data;
		$("#b").css("background-color","#f5f5f5");
		$("#a").css("background-color","#fafafa");
		$("#c").css("background-color","#fafafa");
	});
	$("#c").click(function(){
		bd.innerHTML = manage.childNodes[0].data;
		$("#c").css("background-color","#f5f5f5");
		$("#b").css("background-color","#fafafa");
		$("#a").css("background-color","#fafafa");
	});

</script>
 </body>
</html>
