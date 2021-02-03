package OrientacaoObjetos;
import java.util.Date;
public class Biblioteca {

	public static void main(String[] args) {
		
LivroDeBiblioteca livro = new LivroDeBiblioteca();

livro.nome = "amor";
livro.autor = "pri";
livro.anoLancamento = 2020;

livro.emprestado = true;
livro.dataEntrega = new Date();

livro.emprestadoA = "wil";

System.out.println("Nome do livro:" + livro.nome);

	}

}
