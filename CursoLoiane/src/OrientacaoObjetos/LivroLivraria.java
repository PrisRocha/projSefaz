package OrientacaoObjetos;

public class LivroLivraria {

	public static void main(String[] args) {

		Livro livro = new Livro();

		livro.nome = "amor";
		livro.autor = "pri";
		livro.anoLancamento = 2020;
		livro.preco = 39.30;

		System.out.println("Nome do Livro" + livro.nome);
	}

}
