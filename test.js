function validate() {
	// body...

	var x = document.getElementById('password').value;
	var y = document.getElementById('confirm_password').value;
	if (x==""){
		alert("Please Enter required fields");
		return false;
	}
	else if (!(x===y)){
		alert("Password dont match");
		return false;
		x="";
		y="";
	}
	else{
		alert("password matched");
		return true;
	}
}

function validateDate() {

	var date= new Date();

	var year = date.getFullYear();
	var month = date.getMonth()+1;
	var dd = date.getDate();
	var y = year-18;
	if(month<10){
		month='0'+month;
	}

	if(dd<10){
		dd=0+""+dd;
	}

	var y = year-18;

	document.getElementById('dob').max=y+"-"+month+"-"+dd;

}

education=['B.Tech','M.Tech'];
specific=[['CSE','ME','EEE','IT'],['CSE','ME','EEE','IT']]

function gradedu() {
	// body...
	var edu = document.getElementById('education');
	for (i=0;i<education.length;i++){
		var ele = document.createElement('option');
		ele.text = education[i];
		edu.add(ele,i+1);
	}

}

function stream() {
	// body...
	var edu = document.getElementById('education');
	var selectedIdx = edu.selectedIndex;
	var stream = document.getElementById('specific');
	y.length=0;
	for (i=0;i<specific[selectedIdx-1].length;i++){
		var spe = document.createElement('option');
		spe.text = specific[selectedIdx-1][i];
		stream.add(spe,i+1);
	}
}