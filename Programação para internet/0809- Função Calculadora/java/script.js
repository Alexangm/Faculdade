function somar() {
	var v1 = parseInt(document.getElementById("n1").value);
	var v2 = parseInt(document.getElementById("n2").value);
	document.getElementById("resultado").innerHTML = "= " + (v1+v2); + "<br><br>"


}

function subtrair(){
	var v1 = parseInt(document.getElementById("n1").value);
	var v2 = parseInt(document.getElementById("n2").value);
	document.getElementById("resultado").innerHTML = "= " + (v1-v2); + "<br><br>"
}

function multiplicar(){
	var v1 = parseInt(document.getElementById("n1").value);
	var v2 = parseInt(document.getElementById("n2").value);
	document.getElementById("resultado").innerHTML = "= " + (v1*v2); + "<br><br>"
}

function dividir(){
	var v1 = parseInt(document.getElementById("n1").value);
	var v2 = parseInt(document.getElementById("n2").value);
	document.getElementById("resultado").innerHTML = "= " + (v1/v2).toFixed(2); + "<br><br>"
}