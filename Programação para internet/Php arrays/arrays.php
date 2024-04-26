<?php
	/*
	$funcionario1 = array("José", 40, 2500, "Analista");
	$funcionario2 = ["João", 32, 2000, "Programador"];
	$funcionario3 = array(
		"nome" => "Suzicleyde",
		"idade" => 30,
		"salario" => 4000,
		"cargo" => "Gerente"
	);

	*/

	//var_dump($funcionario1);	
	//echo "<h1>Nome: ".$funcionario3["nome"]."</h1>";
	$funcionarios = array(
		"funcionario01" => array(
			"nome" => "Suzicleyde",
			"idade" => 30,
			"salario" => 4000,
			"cargo" => "Gerente"
		),
		"funcionario02" => array(
			"nome" => "Outronome",
			"idade" => 300,
			"salario" => 40000,
			"cargo" => "Gerentenao"
		),
		"funcionario03" => array(
			"nome" => "Mais um nome",
			"idade" => 3000,
			"salario" => 400000,
			"cargo" => "Gerenasdasdte"
		)
	);
	//var_dump($funcionarios["funcionario01"]["nome"]);
	foreach ($funcionarios as $key => $value) {
		//var_dump($value);
		//echo "<br><hr><br>";
		foreach($value as $chave => $valor){
			echo "<h3>".$chave.": ".$valor."</h3>";
		}
		echo "<br><hr><br>";
	}
?>