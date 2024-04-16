<?php
	require_once("sql.php");
	$bd = new DAOanime();

	$nome = $_GET["nome"];
	$genero = $_GET["genero"];
	$ano = $_GET["ano"];
	$sinopse = $_GET["sinopse"];
	$id = $_GET["id"];

	$bd->editarAnime($id, $nome, $genero, $ano, $sinopse);

	echo "<h2>Anime atualizado!</h2>";
	echo "<br><a href=\"index.html\">Menu principal</a>";
?>