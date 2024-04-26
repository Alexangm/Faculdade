<?php
	require_once("sql.php");
	$bd = new DAOanime();

	$idanimefk = $_GET["idanimefk"];
	$diretor = $_GET["diretor"];
	$estudio = $_GET["estudio"];


	$bd->inserirEstudio($idanimefk, $diretor, $estudio);
	echo "<br>Estudio inserido com sucessos [DAO]<br>";

	echo "<br><a href=\"index.html\">Voltar</a>";
?>