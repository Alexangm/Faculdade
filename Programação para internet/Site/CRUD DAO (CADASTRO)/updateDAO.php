<?php
	require_once("sql.php");
	$bd = new DAOanime();

	$nick = $_GET["nick"];
	$email = $_GET["email"];
	$senha = $_GET["senha"];
	$idade = $_GET["idade"];
	
	$bd->editarCadastro($nick, $email, $senha, $idade);

	echo "<h2>Cadastro atualizado!</h2>";
	echo "<br><a href=\"index.html\">Menu principal</a>";
?>