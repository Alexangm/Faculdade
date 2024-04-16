<?php
	require_once("sql.php");
	$bd = new DAOanime();

	$idanime;

	$result = $bd->buscarAnimes();
	
	foreach ($result as $row) {
		foreach($row as $key => $value){
			if($key == "idanime"){
				$idanime = $value;
			}else if($key=="sinopse"){
				echo "<h2>$value</h2>";
			}else{
				echo "<h3>$value</h3>";
			}
		}
		echo "<a href=\"detalharDAOa.php?idanime=$idanime\">Detalhar anime</a>";
		echo "<br><hr><br>";
	}
	echo "<br><a href=\"index.html\">Voltar</a>";

?>
