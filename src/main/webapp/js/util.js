function setAccion(nombreCampo,accion){
	document.getElementById(nombreCampo).value=accion;
}

function setDisplay(nombreCampo,display){
	var campo = document.getElementById(nombreCampo);
	campo.style.display=display;

}

function controlInsert(){
	document.getElementById("iPersona").value="";
	document.getElementById("iEmpresa").value="";
	document.getElementById("iProy").value="";
	document.getElementById("iTel").value="";
	
	setDisplay("divCon","none");
	setDisplay("divInsert","inline");
}

function controlConsulta(){
	document.getElementById("iPersona").value="";
	document.getElementById("iEmpresa").value="";
	document.getElementById("iProy").value="";
	document.getElementById("iTel").value="";
	
	setDisplay("divCon","inline");
	setDisplay("divInsert","none");
}