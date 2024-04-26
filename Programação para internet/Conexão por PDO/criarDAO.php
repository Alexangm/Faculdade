<?php 

	require_once("sql.php");
	$bd = new Bd();

	$marca = $_POST["marca"];
	$nome = $_POST["nome"];
	$valor = $_POST["valor"];

	$bd->inserir($marca, $nome, $valor);
	echo "<br> Produto inserido com sucessos <br>";

?>