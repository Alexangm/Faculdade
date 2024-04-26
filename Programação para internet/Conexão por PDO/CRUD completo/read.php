<?php
	$conn = new PDO("mysql:dbname=hvetbd;host=localhost","hospitalvet2020","admin2020hovet");

	$stmt = $conn->prepare("SELECT * FROM tbanimais");
	
	$stmt->execute();
	$idadeint;

	$result = $stmt->fetchALL(PDO::FETCH_ASSOC);

	foreach ($result as $row) {
		foreach($row as $key => $value){
			if($key=="idade"){
				$idadeint = (int)$value;
				if($idadeint>3){
					echo "<h3>$value</h3><br>";
				}else{
					break; //não tenho certeza dcomando pra sair do foreach, mas a ideia aqui é mudar a $row pra próxima $row 
				}
			}
			echo "<h3>$value</h3><br>";
		}
		echo "<br><hr><br>";
	}
?>
