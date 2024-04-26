<?php

	$conn = new PDO("mysql:dbname=dbppi;host=localhost","root","A33536863");

	$stmt = $conn->prepare("SELECT * FROM produtos WHERE idproduto = :ID");
	
	$id = $_GET["idproduto"];

	$stmt->bindParam(":ID",$id);

	$stmt->execute();

	$result = $stmt->fetchALL(PDO::FETCH_ASSOC);

	//var_dump($result);

	
	foreach ($result as $row) {
		foreach($row as $key => $value){
			echo "<h1>$key: $value</h1>";
		}
		echo "<br><hr><br>";
	}
	//echo "<br><a href="index.html">Voltar</a>"; quando eu saber atualizo
	


?>