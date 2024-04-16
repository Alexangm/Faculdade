<?php
	class DAOanime extends PDO{
		private $conn;

		public function __construct() {
			$this->conn = new PDO("mysql:dbname=dbppi;host=localhost","root","A33536863");
		}

		public function buscarAnimes(){
			$stmt = $this->conn->prepare("SELECT * FROM anime");
			$stmt->execute();
			return $stmt->fetchALL(PDO::FETCH_ASSOC);
		}


		public function buscarAnime($id){
			$stmt = $this->conn->prepare("SELECT * FROM anime WHERE idanime=:ID");
			$stmt->bindParam(":ID", $id);
			$stmt->execute();
			return $stmt->fetchALL(PDO::FETCH_ASSOC);
		}


		public function inserirAnime($nome, $genero, $ano, $sinopse){
			$stmt = $this->conn->prepare("INSERT INTO anime(nome, genero, ano, sinopse) VALUES(:NOME, :GENERO, :ANO, :SINOPSE)");
			$stmt->bindParam(":NOME", $nome);
			$stmt->bindParam(":GENERO", $genero);
			$stmt->bindParam(":ANO", $ano);
			$stmt->bindParam(":SINOPSE", $sinopse);

			$stmt->execute();
		}

		public function excluirAnime($id){
			$stmt = $this->conn->prepare("DELETE FROM anime WHERE idanime=:ID");
			$stmt->bindParam(":ID", $id);
			$stmt->execute();
		}

		public function editarAnime($id, $nome, $genero, $ano, $sinopse){
			$stmt = $this->conn->prepare("UPDATE anime SET nome=:NOME, genero=:GENERO, ano=:ANO, sinopse=:SINOPSE WHERE idanime=:ID");
			$stmt->bindParam(":NOME", $nome);
			$stmt->bindParam(":GENERO", $genero);
			$stmt->bindParam(":ANO", $ano);
			$stmt->bindParam(":SINOPSE", $sinopse);
			$stmt->bindParam(":ID", $id);
			$stmt->execute();
		}

		public function buscarNome($nome){
			$stmt = $this->conn->prepare("SELECT * FROM anime WHERE nome=:NOME");
			$stmt->bindParam(":NOME", $nome);
			$stmt->execute();
			return $stmt->fetchALL(PDO::FETCH_ASSOC);
		}

		public function buscarDubladores(){
			$stmt = $this->conn->prepare("SELECT * FROM dublador");
			$stmt->execute();
			return $stmt->fetchALL(PDO::FETCH_ASSOC);
		}

		public function buscarDublador($id){
			$stmt = $this->conn->prepare("SELECT * FROM dublador WHERE iddublador=:ID");
			$stmt->bindParam(":ID", $id);
			$stmt->execute();
			return $stmt->fetchALL(PDO::FETCH_ASSOC);
		}


		public function inserirDublador($nome, $data_nasc, $idelencofk, $personagem){
			$stmt = $this->conn->prepare("INSERT INTO dublador(nome, data_nasc, idelencofk, personagem) VALUES(:NOME, :DATA_NASC, :IDELENCOFK, :PERSONAGEM)");
			$stmt->bindParam(":NOME", $nome);
			$stmt->bindParam(":DATA_NASC", $data_nasc);
			$stmt->bindParam(":IDELENCOFK", $idelencofk);
			$stmt->bindParam(":PERSONAGEM", $personagem);

			$stmt->execute();
		}

		public function excluirDublador($id){
			$stmt = $this->conn->prepare("DELETE FROM dublador WHERE iddublador=:ID");
			$stmt->bindParam(":ID", $id);
			$stmt->execute();
		}

		public function editarDublador($id, $nome, $data_nasc, $idelencofk, $personagem){
			$stmt = $this->conn->prepare("UPDATE dublador SET nome=:NOME, data_nasc=:DATA_NASC, idelencofk=:IDELENCOFK, personagem=:PERSONAGEM  WHERE iddublador=:ID");
			$stmt->bindParam(":ID", $id);
			$stmt->bindParam(":NOME", $nome);
			$stmt->bindParam(":DATA_NASC", $data_nasc);
			$stmt->bindParam(":IDELENCOFK", $idelencofk);
			$stmt->bindParam(":PERSONAGEM", $personagem);
			$stmt->execute();
		}

		public function nomeDublador($nome){
			$stmt = $this->conn->prepare("SELECT * FROM dublador WHERE nome=:NOME");
			$stmt->bindParam(":NOME", $nome);
			$stmt->execute();
			return $stmt->fetchALL(PDO::FETCH_ASSOC);
		}

		public function buscarElencos(){
			$stmt = $this->conn->prepare("SELECT * FROM elenco");
			$stmt->execute();
			return $stmt->fetchALL(PDO::FETCH_ASSOC);
		}

		public function buscarElenco($id){
			$stmt = $this->conn->prepare("SELECT * FROM elenco WHERE idelenco=:ID");
			$stmt->bindParam(":ID", $id);
			$stmt->execute();
			return $stmt->fetchALL(PDO::FETCH_ASSOC);
		}


		public function inserirElenco($idanimefk, $diretor, $estudio){
			$stmt = $this->conn->prepare("INSERT INTO elenco(idanimefk, diretor, estudio) VALUES(:IDANIMEFK, :DIRETOR, :ESTUDIO)");
			$stmt->bindParam(":IDANIMEFK", $idanimefk);
			$stmt->bindParam(":DIRETOR", $diretor);
			$stmt->bindParam(":ESTUDIO", $estudio);

			$stmt->execute();
		}

		public function excluirElenco($id){
			$stmt = $this->conn->prepare("DELETE FROM elenco WHERE idelenco=:ID");
			$stmt->bindParam(":ID", $id);
			$stmt->execute();
		}

		public function editarElenco($id, $idanimefk, $diretor, $estudio){
			$stmt = $this->conn->prepare("UPDATE elenco SET idanimefk=:IDANIMEFK, diretor=:DIRETOR, estudio=:ESTUDIO WHERE idelenco=:ID");
			$stmt->bindParam(":IDANIMEFK", $idanimefk);
			$stmt->bindParam(":DIRETOR", $diretor);
			$stmt->bindParam(":ESTUDIO", $estudio);
			$stmt->bindParam(":ID", $id);
			$stmt->execute();
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





