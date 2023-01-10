$(document).ready(function(){
	
  findAll();
 
});


function deleteById() {
var settings = {
  "url": "/course/deleteById/{CourseId}",
  "method": "DELETE",
  "timeout": 0,
  "headers": {
    "Content-Type": "application/json"
  },
  "data": JSON.stringify({
    "courseName": "course_name",
    "courseFees": "course_fees",
    "courseDuration":"course_duration"
  }),
};

$.ajax(settings).done(function (response) {
 alert(response.Message);
});
		
	
}