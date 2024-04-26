<?php
	
	class Bd extends PDO{

		private $conn;

		public function __construct() {
			$this->conn = new PDO("mysql:dbname=dbppi;host=localhost","root","A33536863");
		}

		public function buscarProdutos(){
			$stmt = $this->conn->prepare("SELECT * FROM produtos");
			$stmt->execute();
			return $stmt->fetchALL(PDO::FETCH_ASSOC);
		}

		public function inserir($marca, $nome, $valor){
			$stmt = $this->conn->prepare("INSERT INTO produtos(marca, nome, valor) VALUES(:MARCA, :NOME, :VALOR)");
			$stmt->bindParam(":MARCA", $marca);
			$stmt->bindParam(":NOME", $nome);
			$stmt->bindParam(":VALOR", $valor);

			$stmt->execute();
		}

	}

?>