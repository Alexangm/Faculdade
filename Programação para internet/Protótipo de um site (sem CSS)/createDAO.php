<?php
	require_once("sql.php");
	$bd = new DAOanime();

	$nome = $_GET["nome"];
	$data_nasc = $_GET["data_nasc"];
	$idelencofk = $_GET["idelencofk"];
	$personagem = $_GET["personagem"];

	$bd->inserirDublador($nome, $data_nasc, $idelencofk, $personagem);
	echo "<br>Dublador inserido com sucesso [DAO]<br>";

	echo "<br><a href=\"index.html\">Voltar</a>";
?>