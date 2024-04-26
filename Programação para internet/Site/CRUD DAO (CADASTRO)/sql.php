<?php
	class DAOanime extends PDO{
		private $conn;

		public function __construct() {
			$this->conn = new PDO("mysql:dbname=dbppi;host=localhost","root","A33536863");
		}

		public function buscarCadastros(){
			$stmt = $this->conn->prepare("SELECT * FROM cadastro");
			$stmt->execute();
			return $stmt->fetchALL(PDO::FETCH_ASSOC);
		}

		public function buscarCadastro($id){
			$stmt = $this->conn->prepare("SELECT * FROM cadastro WHERE nick=:ID");
			$stmt->bindParam(":ID", $id);
			$stmt->execute();
			return $stmt->fetchALL(PDO::FETCH_ASSOC);
		}


		public function inserirCadastro($nick, $email, $senha, $idade){
			$stmt = $this->conn->prepare("INSERT INTO cadastro(nick, email, senha, idade) VALUES(:NICK, :EMAIL, :SENHA, :IDADE)");
			$stmt->bindParam(":NICK", $nick);
			$stmt->bindParam(":EMAIL", $email);
			$stmt->bindParam(":SENHA", $senha);
			$stmt->bindParam(":IDADE", $idade);

			$stmt->execute();
		}

		public function excluirCadastro($id){
			$stmt = $this->conn->prepare("DELETE FROM cadastro WHERE nick=:ID");
			$stmt->bindParam(":ID", $id);
			$stmt->execute();
		}

		public function editarCadastro($nick, $email, $senha, $idade){
			$stmt = $this->conn->prepare("UPDATE cadastro SET email=:EMAIL, senha=:SENHA, idade=:IDADE  WHERE nick=:NICK");
			$stmt->bindParam(":NICK", $nick);
			$stmt->bindParam(":EMAIL", $email);
			$stmt->bindParam(":SENHA", $senha);
			$stmt->bindParam(":IDADE", $idade);
			$stmt->execute();
		}
	}

?>





