typedata1 = ["company","devices","location"];	
typedata2 = [["Oneplus","Samsung","Nokia"],["op6","op7","op8"],["Ec1","btm","hsr"]];

function fillDD()
{
	var x = document.getElementById('typedata1');
	for(i=0;i<typedata1.length;i++)
	{
	var element = document.createElement("option")
	element.text = typedata1[i];
	x.add(element,i+1);
	}
}

function fillDDdata()
{
	var x = document.getElementById("typedata1");
	var selectIdx = x.selectedIndex;
	var y = document.getElementById("typedata2");
	y.length=1;
	for(i=0;i<typedata2[selectIdx-1].length;i++)
	{
		var element = document.createElement("option");
		element.text = typedata2[selectIdx-1][i];
		y.add(element,i+1);
	}
}