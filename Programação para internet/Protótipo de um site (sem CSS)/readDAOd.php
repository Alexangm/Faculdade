<?php
	require_once("sql.php");
	$bd = new DAOanime();

	$iddublador;

	$result = $bd->buscarDubladores();
	
	foreach ($result as $row) {
		foreach($row as $key => $value){
			if($key == "iddublador"){
				$iddublador = $value;
			}
			echo "<h1>$key: $value</h1>";
		}
		echo "<a href=\"detalharDAOd.php?iddublador=$iddublador\">Detalhar dublador</a>";
		echo "<br><hr><br>";
	}
	echo "<br><a href=\"index.html\">Voltar</a>";

?>
