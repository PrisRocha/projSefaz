package ATIVIDADESPOO;

public class Aluno {

	private double nota1;
	private double nota2;
	private final int NOTA_MIN_PASSAR_POR_MEDIA = 7;
	private final int NOTA_MIN_IR_FiNAL = 3;
	
	
	private final String STATUS_APROVADO = "Aprovado";
	private final String STATUS_RECUPERACAO = "Recuperação";
	private final String STATUS_REPROVADO = "Reprovado";
	

	public Aluno(double nota1, double nota2) {

		this.nota1 = nota1;
		this.nota2 = nota2;

	}

	public double getNota1() {
		return this.nota1;

	}

	public double setNota1() {
		return this.nota1;

	}

	public double getNota2() {
		return this.nota2;

	}

	public double setNota2() {
		return this.nota2;
	}

	public double getMedia() {
		return ((this.nota1 + this.nota2) / 2);
	}
	
	public String getStatus()
	{
		double media = getMedia();
		if(media >= NOTA_MIN_PASSAR_POR_MEDIA)
		{
			return STATUS_APROVADO;
		}else if(media >= NOTA_MIN_IR_FiNAL && media < NOTA_MIN_PASSAR_POR_MEDIA) {
			return STATUS_RECUPERACAO;
		}else {
			return STATUS_REPROVADO;
		}
	}
	
	public double getNotaMinimaParaPassarNaFinal() {
		if(getStatus().equals(STATUS_RECUPERACAO))
		{
			return 10 - getMedia();
		}
		return -1;
	}

}
