var livro1 = [1308, "Em busca do paraíso", "Sergiano Floripa", "Saraiva", 1999]
var livro2 = [1311, "Dois filhos de Franscisco", "Fransisco Júnior", "Riadeste", 1970]
var livro3 = [1215, "O homem que calculava", "Amando Fábio", "Roco", 1947]
var livro4 = [4785, "Interestelar", "Albert Cristian", "RioAS", 1999]
var livro5 = [9999, "Guerra nas et trelas", "Maria Amora", "Blizzard", 2010]
var livros = [livro1, livro2, livro3, livro4, livro5]
i = 1;

function pesquisar(){
	var relatorio = []
	var ano = parseInt(document.getElementById("ano").value);
	for (i=0; i<5; i++){
		if(livros[i][4]==ano){
			relatorio = relatorio + "Código: " + livros[i][0] + ", Título: " + livros[i][1] + ", Autor: " + livros[i][2] + ", Editora: " + livros[i][3] + ", Ano: " + livros[i][4] + "; "; 
			//relatorio = relatorio + livros[i][1] + "; ";		
		}
	}
	document.getElementById("resultado").innerHTML = "Livros do ano: " + ano + ": "+ relatorio + "<br><br>"
}
