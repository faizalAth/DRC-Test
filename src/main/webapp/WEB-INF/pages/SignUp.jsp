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
					<h1 class="text-center">Sign-UP</h1>
				</div>
				<div class="card-body">
					<form id="ignUpForm">
						<div class="row">
							<div class="col-12">
								<label>Email I'D</label>
								<input class="form-control" type="email" name="email_id" id="emailId"/>
							</div>
							<div class="col-12">
								<label>Password</label>
								<input class="form-control" type="password" name="password" id="passwordId"/>
							</div>
							<div class="col-12">
								<label>Name</label>
								<input class="form-control" type="text" name="name" id="nameId"/>
							</div>
							<div class="col-12">
								<label>User Name</label>
								<input class="form-control" type="text" name="userName" id="userNameId"/>
							</div><br>
							<div class="col-12">
								<label>Gender</label>
								<input class="form-check-input" type="radio" name="gender" id="maleId" value="M"/><label class="form-check-label" for="maleId">Male</label>
								<input class="form-check-input" type="radio" name="gender" id="femaleId" value="F"/><label class="form-check-label" for="femaleId">FeMale</label>
								<input class="form-check-input" type="radio" name="gender" id="otherId" value="O"/><label class="form-check-label" for="otherId">Other</label>
							</div>
							<div class="col-12">
								<label>Age</label>
								<input class="form-control" type="text" name="age" id="ageId"/>
							</div>
							<div class="col-12 mt-2">
								<button class="btn btn-success" type="button" name="submitBtn" id="submitBtnId">Sign-UP</button>
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
		data:$('#ignUpForm').serialize(),
		contentType : false,
		url:"${pageContext.request.contextPath}/login/signUP",
		success:function(resData){
			console.log(resData);
		},
		error:function(error){
			
		}
	});
});
</script>
</body>
</html>