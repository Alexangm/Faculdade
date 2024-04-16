<?php
	require_once("sql.php");
	$bd = new DAOanime();
	
	$nick = $_GET["nick"];
	$bd->excluirCadastro($nick);

	echo "<h2>Cadastro apagado</h2>";
	echo "<br><a href=\"index.html\">Voltar</a>";
?>
