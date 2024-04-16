<?php
	require_once("sql.php");
	$bd = new DAOanime();

	$nome = $_GET["nome"];
	$genero = $_GET["genero"];
	$ano = $_GET["ano"];
	$sinopse = $_GET["sinopse"];

	$bd->inserirAnime($nome, $genero, $ano, $sinopse);
	echo "<br>Anime inserido com sucessos<br>";

	echo "<br><a href=\"index.html\">Voltar</a>";
?>