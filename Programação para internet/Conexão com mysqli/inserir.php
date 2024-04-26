<?php

	$conn = new mysqli('localhost', 'root', 'A33536863', 'dbppi');

	if($conn->connect_error){
		echo "<h1>Não foi possível conectar ao DB!</h1>";
		echo "<h2>Erro: ".$conn->connect_error."</h2>";
	}else{
		$stmt = $conn->prepare("INSERT INTO produtos(marca, nome, valor) VALUES (?, ?, ?)");
		
		$stmt->bind_param("sss", $marca, $nome, $valor);

		$marca = "Microsoft";
		$nome = "Xbox 360";
		$valor = "500";

		$stmt->execute();
		echo "<h1>Produto cadastrado com sucesso!</h1>";
	}

?>