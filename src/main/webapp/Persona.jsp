<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<!DOCTYPE form PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<head>
<title>Informacion Personas</title>

<script type="text/javascript" src="js/util.js"></script>
<link rel="stylesheet" type="text/css" href="css/styles.css">
</head>
<body>
	<h1 align="center">Informacion Personas</h1>
	<div class="cuerpo">
		<p>
		<div id="divCon" name="divCon" class="divCon">
			<form action="/" method="post">
				<h2>Buscar Personas</h2>
				<p>
				<label>Nombre: <input type="text" id="nPersona"
					nombre="nPersona" class="nPersona" /></label> <label> Empresa: <input
					type="text" id="nEmpresa" nombre="nEmpresa" class="nEmpresa" /></label> <label>
					Proyecto: <input type="text" id="nProy" nombre="nProy"
					class="nProy" />
				</label>

				<p>
					<input type="hidden" id="accion" name="accion">
					<button type="submit" onclick="setAccion('accion','S')">Buscar</button>

					<button type="reset" onclick="setAccion('accion','R')">Borrar</button>

					<button type="button" onclick="controlInsert()">Insertar</button>
			</form>
		</div>

		<div id="divInsert" name="divInsert" class="divInsert">
			<form action="/" method="post">
				<h2>Nueva Persona</h2>
				<p>
				<label>Nombre: <input type="text" id="iPersona"
					nombre="iPersona" class="iPersona" /></label> <label> Empresa: <input
					type="text" id="iEmpresa" nombre="iEmpresa" class="iEmpresa" /></label> <label>
					Proyecto: <input type="text" id="iProy" nombre="iProy"
					class="iProy" />
				</label> <label> Proyecto: <input type="text" id="iTel"
					nombre="iTel" class="iTel" />
				</label>

				<p>
					<input type="hidden" id="accion" name="accion">
					<button type="submit" onclick="setAccion('accion','N')">Guardar</button>
					<button type="reset">Borrar</button>
					<button type="reset" onclick="controlConsulta()">Volver</button>
			</form>
		</div>
	</div>
</body>
