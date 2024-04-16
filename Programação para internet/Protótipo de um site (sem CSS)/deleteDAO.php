<?php
	require_once("sql.php");
	$bd = new DAOanime();
	
	$id = $_GET["id"];
	$bd->excluirDublador($id);

	echo "<h2>Dublador apagado</h2>";
	echo "<br><a href=\"index.html\">Voltar</a>";
?>
