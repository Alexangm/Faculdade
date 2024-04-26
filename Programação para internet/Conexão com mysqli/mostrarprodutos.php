<?php

	$conn = new mysqli('localhost', 'root', 'A33536863', 'dbppi');

	if($conn->connect_error){
		echo "<h1>Não foi possível conectar ao DB!</h1>";
		echo "<h2>Erro: ".$conn->connect_error."</h2>";
	}else{
		$result = $conn->query("SELECT * FROM produtos");
		var_dump($result);

		$data = array();
		while ($row = $result->fetch_assoc()){
			array_push($data, $row);
		}

		var_dump($data);
		echo "<br><hr><br>";

		$json = json_encode($data);
		var_dump($json);

		$produtos = json_decode($json);
		echo "<br><hr><br>";
		var_dump($produtos);


		echo "<br><br>Vez do foreach <br><br>";
		foreach ($data as $key => $value){
			//echo "<h1>".$key.": ".$value."</h1>";
			foreach($value as $chave => $valor){
				echo "<h1>".$chave.": ".$valor."</h1>";
			}
			echo "<br><hr><br>";
		}
		}

?>