<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sign-UP</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" 
rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>
		<div class="container">
			<div class="card mt-5 w-50" style="margin: auto;">
				<div class="card-header">
					<h1 class="text-center">Sign-IN</h1>
                    <div>
                        <p class="text-danger" id="loginMessage"></p>
                    </div>
				</div>
				<div class="card-body">
					<form id="loginFormId" name="loginForm">
						<div class="row">
							<div class="col-12">
								<label>Email I'D</label>
								<input class="form-control" type="email" name="email_id" id="emailId"/>
							</div>
							<div class="col-12">
								<label>Password</label>
								<input class="form-control" type="password" name="password" id="passwordId"/>
							</div>
							<div class="col-12 mt-2">
								<button class="btn btn-success" type="button" name="submitBtn" id="submitBtnId">Sign-IN</button>
							</div>
						</div>
					</form>
				</div>
			</div>
		</div> 
		
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.1/jquery.min.js"></script>
		<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" 
		integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
		
<script type="text/javascript">
$('#submitBtnId').click(function(){
	$.ajax({
		type: "POST",
		data:$('#loginFormId').serialize(),
		url:"${pageContext.request.contextPath}/login/signIN",
		success:function(resData){
			console.log(resData);
            if(resData == 'Login Success.'){
                    document.loginForm.action="${pageContext.request.contextPath}/teached-Dashboard";
                    document.loginForm.submit();
            }else{
                $('#loginMessage').text(resData);
            }
           
		},
		error:function(error){
			
		}
	});
});
</script>
</body>
</html>