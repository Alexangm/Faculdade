<?php

	$conn = new PDO("mysql:dbname=dbppi;host=localhost","root","A33536863");

	$stmt = $conn->prepare("UPDATE produtos SET marca = :MARCA, nome = :NOME, valor = :VALOR WHERE idproduto= :ID");

	$marca = "Acer";
	$nome = "Cadernin";
	$valor = "80";
	$id = 9;

	$stmt->bindParam(":MARCA", $marca);
	$stmt->bindParam(":NOME", $nome);
	$stmt->bindParam(":VALOR", $valor);
	$stmt->bindParam(":ID", $id);

	$stmt->execute();

	echo "<h2>Produto cadastrado</h2>";

?>