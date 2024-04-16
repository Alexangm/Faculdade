<?php
	require_once("sql.php");
	$bd = new DAOanime();
	
	$id = $_GET["id"];
	$bd->excluirAnime($id);

	echo "<h2>Anime apagado</h2>";
	echo "<br><a href=\"index.html\">Voltar</a>";
?>
