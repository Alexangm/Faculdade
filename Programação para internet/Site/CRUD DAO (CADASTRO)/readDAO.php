<?php
	require_once("sql.php");
	$bd = new DAOanime();

	$nick;

	$result = $bd->buscarCadastros();
	
	foreach ($result as $row) {
		foreach($row as $key => $value){
			if($key == "nick"){
				$nick = $value;
			}
			echo "<h1>$key: $value</h1>";
		}
		echo "<a href=\"detalharDAO.php?nick=$nick\">Detalhar cadastro</a>";
		echo "<br><hr><br>";
	}
	echo "<br><a href=\"index.html\">Voltar</a>";

?>
