function saveStudent() {

	var stdName = $('#std_name').val();
	var stdEmail = $('#std_email').val();
	var userName = $('#username').val();
	var password = $('#password').val();


	console.log(stdName + " " + stdEmail + " " + userName + " " + password);
	

	var settings = {
		
		"url": "/student/saveStudent",
		"method": "POST",
		"timeout": 0,
		"headers": {
			"Content-Type": "application/json"
		},
		"data": JSON.stringify({
			"stdName": stdName,
			"stdEmail": stdEmail,
			"userName": userName,
			"password": password,
			
		}),
	};

	$.ajax(settings).done(function(response) {
		if (response.status == true) {
			alert(response.Message);
			window.location.href = "index.html"
		} else {
			alert(response.Message);
			window.location.href = "AddEmployee.html"

		}

	});
}
function signIn() {
	
	var std_Email = $('#std_email').val();
	var password = $('#password').val();
	
	var settings = {
		"url": "/student/signIn?std_email="+std_Email+"&password="+password,
		"method": "GET",
		"timeout": 0,
	};
        $.ajax(settings).done(function(response) {
		
		if(response.status==true){
			alert(response.Message);
			window.location.href = "dashboard.html"
		}else{
			alert(response.Message);
			window.location.href = "index.html"
		}
	});

}




// request param
function getEmpById(){
	var Id = 8;
	
	var settings = {
		
		"url": "employee/findById?Id="+Id,
		"method": "GET",
		"timeout": 0,
		"headers": {
			"Content-Type": "application/json"
		},
		
	};

	$.ajax(settings).done(function(response) {
		
		alert(response.fName)
	
	});
	
}

// path variable 
function getEmpByName(){
	var fName = 'z';
	
	var settings = {
		
		"url": "employee/findByName/"+fName,
		"method": "GET",
		"timeout": 0,
		"headers": {
			"Content-Type": "application/json"
		},
		
	};

	$.ajax(settings).done(function(response) {
		
		alert(response.fName,response.Id,response.lName,response.pqty,response.price)
	
	});
	
}