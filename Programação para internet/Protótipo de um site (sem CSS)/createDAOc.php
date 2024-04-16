<?php
	require_once("sql.php");
	$bd = new DAOanime();

	$nick = $_GET["nick"];
	$email = $_GET["email"];
	$senha = $_GET["senha"];
	$idade = $_GET["idade"];

	$bd->inserirCadastro($nick, $email, $senha, $idade);
	echo "<br>Cadastro inserido com sucesso [DAO]<br>";

	echo "<br><a href=\"index.html\">Voltar</a>";
?>