<?php

	$conn = new PDO("mysql:dbname=dbppi;host=localhost","root","A33536863");

	$stmt = $conn->prepare("UPDATE produtos SET marca = :MARCA, nome = :NOME, valor = :VALOR WHERE idproduto= :ID");

	$marca = $_GET["marca"];
	$nome = $_GET["nome"];
	$valor = $_GET["valor"];
	$id = $_GET["id"];

	$stmt->bindParam(":MARCA", $marca);
	$stmt->bindParam(":NOME", $nome);
	$stmt->bindParam(":VALOR", $valor);
	$stmt->bindParam(":ID", $id);

	$stmt->execute();

	echo "<h2>Produto atualizado</h2>";

?>