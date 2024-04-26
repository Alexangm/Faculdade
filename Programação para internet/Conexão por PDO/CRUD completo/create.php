<?php

	$conn = new PDO("mysql:dbname=hvetbd;host=localhost","hospitalvet2020","admin2020hovet");

	$stmt = $conn->prepare("INSERT INTO tbanimais (nome, tipo, idade, raca) VALUES(:NOME, :TIPO, :IDADE, :RACA)");

	$nome = $_GET["nome"];
	$tipo = $_GET["tipo"];
	$idade = $_GET["idade"];
	$raca = $_GET["raca"];

	$stmt->bindParam(":NOME", $nome);
	$stmt->bindParam(":TIPO", $tipo);
	$stmt->bindParam(":IDADE", $idade);
	$stmt->bindParam(":RACA", $raca);
	
	$stmt->execute();
	echo "<h2>Animal cadastrado</h2>";

?>