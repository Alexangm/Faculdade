<?php 

	$nomeUser = $_GET["nome"];
	$idadeUser = $_GET["idade"];

	if(empty($nomeUser) || empty($idadeUser)){
		echo "<h1>Usuário e/ou idade estão vazios!</h1>";
	}
	else {
		/*echo "<h1>$nomeUser</h1>";
		echo '<h1>$nomeUser</h1>';

		echo "<h1>O usuário $nomeUser tem $idadeUser anos de idade!</h1>";*/
		if($idadeUser >= 18)
			echo ("<h1>O usuário $nomeUser é adulto!</h1>");
		elseif($idadeUser >= 15)
			echo ("<h1>O usuário $nomeUser é jovem!</h1>");
		elseif($idadeUser >= 12)
			echo ("<h1>O usuário $nomeUser é adolescente!</h1>");
		else
			echo ("<h1>O usuário $nomeUser é criança!</h1>");
	}
	

?>