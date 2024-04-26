<?php
	require_once("sql.php");
	$bd = new DAOanime();

	$id = $_GET["id"];
	$idanimefk = $_GET["idanimefk"];
	$diretor = $_GET["diretor"];
	$estudio = $_GET["estudio"];

	$bd->editarElenco($id, $idanimefk, $diretor, $estudio);

	echo "<h2>Elenco atualizado!</h2>";
	echo "<br><a href=\"index.html\">Menu principal</a>";
?>