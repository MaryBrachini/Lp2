package exercicios;

public class Aluno {

	private String nomeAluno;

	private double nota1, nota2, mf;

	public Aluno() {
		super();
	}

	public Aluno(String nomeAluno, double nota1, double nota2, double mf) {
		super();
		this.nomeAluno = nomeAluno;
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.mf = mf;
	}

	public String getNomeAluno() {
		return nomeAluno;
	}

	public void setNomeAluno(String nomeAluno) {
		this.nomeAluno = nomeAluno;
	}

	public double getNota1() {
		return nota1;
	}

	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}

	public double getNota2() {
		return nota2;
	}

	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}

	public double getMf() {
		return mf;
	}

	public void setMf(double mf) {
		this.mf = mf;
	}

	@Override
	public String toString() {
		return "Aluno [nomeAluno=" + nomeAluno + ", nota1=" + nota1 + ", nota2=" + nota2 + ", Media Final=" + mf + "]";
	}

}
