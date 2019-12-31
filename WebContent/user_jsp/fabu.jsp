<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
<!DOCTYPE html>
<html lang="en">
<head>
<base href="${pageContext.request.contextPath}/user_jsp/" />
	<meta charset="UTF-8">
	<title>发布信息</title>
	
	<link rel="stylesheet" href="../admin_jsp/css/reset.css" />
	<link rel="stylesheet" href="../admin_jsp/css/public.css" />
	<link rel="stylesheet" href="../admin_jsp/css/content.css" />
</head>
<body>
  <jsp:include page="top.jsp" flush="true"/>
	<div class="container">
		<div class="public-nav">您当前的位置：<a href="">发布信息</a>></div>
		<div class="public-content" style="margin-top: 0">
			<div class="public-content-cont">
			<form action="${pageContext.request.contextPath}/FabuServlet" method="post"  style="margin:0 auto;width:50%" >
				<s:actionmessage style="font-size:18px;color:#000"/>
				
				<div class="form-group">
					<label for="">请选择分类</label>
					<select name="classifyId" class="form-select" style="height: 30px;"id="classify">
						<c:forEach items="${typeList}" var="item">
						<option value="${item.tid}">${item.tName}</option>
						</c:forEach>
					</select>
				</div>
				<div class="form-group">
					<label for="">请选择类型</label>
					<select name="type" class="form-select" style="height: 30px;">
						<option value="0">求购</option>
						<option value="1">求售</option>
					</select>
				</div>
				<div class="form-group">
					<label for="">商品名称</label>
					<input class="form-input-txt" type="text" name="proName" value="" />
				</div>
				<div class="form-group">
					<label for="">商品价格</label>
					<input class="form-input-txt" type="text" name="proPrice" value="" />
				</div>
				<div class="form-group">
					<label for="">商品描述</label>
					<textarea class="form-input-textara" type="text" name="proDesc"></textarea>
				</div>
				
				<div class="form-group">
					<label for="">剩余/需求量</label>
					<input class="form-input-txt" type="text" name="proHassum" value="" />
				</div>
				<div class="form-group">
					<label for="">商品图片</label>
					
					<input class="" type="file" id="myfile" name="proPictureFile" value="" />
					
				</div>
				
				<div id="large"></div>
				<div class="form-group" style="margin-left:150px;">
					<input type="submit" class="sub-btn" id="btn" value="提  交" />
					<input type="reset" class="sub-btn" value="重  置" />
				</div>
				</form>
			</div>
		</div>
	</div>
</body>
<script src="js/jquery.min.js"></script>
<script type="text/javascript">
	$(document).ready(function(){
		loadClassify();
		var uid=${param.uid};
		if(uid!=0){
			$("#uuid").val(uid);
		}
		});
	
	 function checkForm(form){
		 if(form.classifyId.value==""){
			 alert("分类不能为空！");
			 return false;
		}
		if(form.type.value==""){
			alert("类型不能为空！");
			return false;
		}
		if(form.proName.value==""){
			alert("商品名称不能为空！");
			return false;
		}
		if(form.proPrice.value==""){
			alert("商品价格不能为空！");
			return false;
		}
		var re = /^[0-9]+.?[0-9]*$/; 
		if(!re.test(form.proPrice.value)){
			alert("请输入数字");
			return false;
		}
		if(form.proHassum.value==""){
			alert("剩余量或需求量不能为空！");
			return false;
		}
		if(!re.test(form.proHassum.value)){
			alert("请输入数字");
			return false;
		}
		
	}
	
	function loadClassify(){
		$("#classify").html("");
		$.get("product_searchClassifyList.action",function(result){
			var data=result.data;
			var len=result.length;
			var temp='<option value="">请选择分类</option>';
			for(var i=0;i<len;i++){
				temp+='<option value="'+data[i].cid+'">'+data[i].classifyName+'</option>';
			}
				$("#classify").append(temp);
			
			},"json");
	}
	 
</script>
</html>