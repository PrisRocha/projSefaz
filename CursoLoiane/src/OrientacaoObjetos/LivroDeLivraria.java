package OrientacaoObjetos;

public class LivroDeLivraria {

	public static void main(String[] args) {
		
		Livros livro = new Livros();
		
        livro.nomeLivro = "amor";
        livro.autor = "pri";
        livro.anoLancamento = 2020;
        livro.preco = 39.30;
        
        System.out.println("Nome do livro" + livro.nomeLivro);
        
	}

}
