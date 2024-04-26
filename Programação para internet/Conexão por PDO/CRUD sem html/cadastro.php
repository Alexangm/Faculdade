<?php

	$conn = new PDO("mysql:dbname=dbppi;host=localhost","root","A33536863");

	$stmt = $conn->prepare("INSERT INTO produtos (marca, nome, valor) VALUES(:MARCA, :NOME, :VALOR)");

	$marca = "Asus";
	$nome = "Zenfone";
	$valor = "800";

	$stmt->bindParam(":MARCA", $marca);
	$stmt->bindParam(":NOME", $nome);
	$stmt->bindParam(":VALOR", $valor);

	$stmt->execute();

	$marca = "Acer";
	$nome = "Notebook";
	$valor = "2000";

	$stmt->execute();

	echo "<h2>Produto cadastrado</h2>";

?>