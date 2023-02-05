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
            <form action="add-student">
                <div class="col-12 mt-2">
                    <button class="btn btn-success" type="submit" name="submitBtn" id="addStudentBtnId">Add Student</button>
                </div>

                <div class="row">
                    <div class="col-6 mt-2">
                        <input class="form-control" type="text" name="role_no" id="role_no">
                    </div>
                    <div class="col-6 mt-2">
                        <button class="btn btn-success" type="button" name="submitBtn" id="searchBtnId">Search Student</button>
                    </div>
                </div>
                <div>
                    <table id="tableId" class="table table-stripped">
                        <thead>
                        <tr>
                            <th>Role No</th>
                            <th>Name</th>
                            <th>Standard</th>
                            <th>Department</th>
                            <th>Gender</th>
                            <th>Age</th>
                        </tr>
                        </thead>
                        <tbody>

                        </tbody>
                    </table>
                </div>
                
            </form>
            <table></table>
		</div> 
		
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.1/jquery.min.js"></script>
		<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" 
		integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
		
<script type="text/javascript">

    $('#searchBtnId').click(function(){
        $('#tableId > tbody').empty();
        $.ajax({
            type: "get",
            url:"${pageContext.request.contextPath}/login/getStudent/"+$('#role_no').val(),
            success:function(resData){
                $('#StudentData').text(resData.name);
                var row=$('<tr/>');
                row.append($('<td>').append(resData.role_no));
                    row.append($('<td>').append(resData.name));
                        row.append($('<td>').append(resData.standard));
                            row.append($('<td>').append(resData.department));
                                row.append($('<td>').append(resData.gender));
                                    row.append($('<td>').append(resData.age));
                $('#tableId > tbody').append(row);
            },
            error:function(error){
                $('#StudentData').text("No Data Found.");
            }
        });

    });
</script>
</body>
</html>