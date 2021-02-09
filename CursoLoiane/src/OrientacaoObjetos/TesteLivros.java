package OrientacaoObjetos;

import java.util.Date;

public class TesteLivros {

	public static void main(String[] args) {

		LivroDeBiblioteca livro = new LivroDeBiblioteca ();
		
		livro.nome = "Amor";
		livro.autor ="Pris";
		livro.anoLancamento = 2015;
		
		livro.emprestado = true;
		livro.dataEntrega = new Date();
		livro.emprestadoA = "pris";
		
		System.out.println("Nome do livro:" + livro.nome);
		
	}

}
