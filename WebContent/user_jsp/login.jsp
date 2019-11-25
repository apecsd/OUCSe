<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login</title>
<link href="css/bootstrap.css" rel="stylesheet" type="text/css" media="all">
<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="js/jquery1.min.js"></script>
<!-- Custom Theme files -->
<link href="css/style.css" rel="stylesheet" type="text/css" media="all"/>
<link rel="stylesheet" type="text/css" href="css/demo.css" />
<!-- Custom Theme files -->
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); }>
</script>
<meta name="keywords" content="Kick flips Responsive web template, Bootstrap Web Templates, Flat Web Templates, AndriodCompatible web template, Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design" />
<!--Google Fonts-->
<link href='http://fonts.useso.com/css?family=Roboto:400,100,100italic,300,300italic,400italic,500,500italic,700,700italic,900,900italic' rel='stylesheet' type='text/css'>
<link href='http://fonts.useso.com/css?family=Oswald:400,700,300' rel='stylesheet' type='text/css'>
<!-- start-smoth-scrolling -->
<script type="text/javascript" src="js/move-top.js"></script>
<script type="text/javascript" src="js/easing.js"></script>
	<script type="text/javascript">
			jQuery(document).ready(function($) {
				$(".scroll").click(function(event){		
					event.preventDefault();
					$('html,body').animate({scrollTop:$(this.hash).offset().top},1000);
				});
			});
	</script>
<!-- //end-smoth-scrolling -->
</head>
<body>
<!--banner start here-->
<div class="banner-stripes">
		<div class="banner-strip-lft">
			 <div class="container"> 
				<div class="bann-head">
					
				</div>
		   </div>
	    </div>
	    <div class="banner-strip-rit">
	    		<div class="bann-contact">
	    			
	    			<ul>
		    			<li><a href="signup.jsp">注册</a></li>
	    			</ul>
	    		</div>
	    </div>
	   <div class="clearfix"> </div>
	 </div> 
<!--banner end here-->
<!--login start here-->
<div class="login">
	<div class="container">
		<div class="login-main">
			<div class="login-top">
				<h3>登录</h3>
				<img src="images/lock.png" alt=""/>
			</div>
			<form action="./login" method="POST">
			<div class="login-bottom">
				<p>账号</p>
				<input type="text" value="" name="username"/>
				<p>密码</p>
				<input type="password" value="" name="password">
				<a ><input type="submit" value="登录"></a>
			</div>
			</form>
		  <div class="clearfix"> </div>
		</div>
	</div>
</div>
<!--login end here-->
<!--footer start here-->
<div class="footer">
	<div class="container">
		<div class="footer-main">
			<div class="col-md-4 ftr-grid">
				<img src="images/a.jpg">
			</div>
			<div class="col-md-4 ftr-grid">
				<img src="images/a1.jpg">
			</div>
			<div class="col-md-4 ftr-grid">
				<img src="images/a2.jpg">
			</div>
			<div class="clearfix"> </div>
			
		</div>
	</div>
</div><!--footer end here-->
</body>
</html>