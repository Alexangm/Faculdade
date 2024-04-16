<?php
	require_once("sql.php");
	$bd = new DAOanime();

	$id = $_GET["id"];
	$nome = $_GET["nome"];
	$data_nasc = $_GET["data_nasc"];
	$idelencofk = $_GET["idelencofk"];
	$personagem = $_GET["personagem"];

	$bd->editarDublador($id, $nome, $data_nasc, $idelencofk, $personagem);

	echo "<h2>Dublador atualizado!</h2>";
	echo "<br><a href=\"index.html\">Menu principal</a>";
?>