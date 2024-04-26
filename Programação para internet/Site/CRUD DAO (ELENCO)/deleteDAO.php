<?php
	require_once("sql.php");
	$bd = new DAOanime();
	
	$id = $_GET["id"];
	$bd->excluirElenco($id);

	echo "<h2>Elenco apagado</h2>";
	echo "<br><a href=\"index.html\">Voltar</a>";
?>
