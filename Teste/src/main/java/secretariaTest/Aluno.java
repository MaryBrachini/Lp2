package secretariaTest;

public class Aluno {

	private int n;
    private double n1, n2, nf;
    private String nome, cf;

    public Aluno() {
        super();
    }

    public Aluno(double n1, double n2, double nf, String nome, String cf,int n) {
        this.n1 = n1;
        this.n2 = n2;
        this.nf = nf;
        this.nome = nome;
        this.cf = cf;
        this.n = n;
    }

    public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

	public double getN1() {
        return n1;
    }

    public String getConceito() {
        return cf;
    }

    public void setConceito(String cf) {
        this.cf = cf;
    }

    public void setN1(double n1) {
        this.n1 = n1;
    }

    public double getN2() {
        return n2;
    }

    public void setN2(double n2) {
        this.n2 = n2;
    }

    public double getNf() {
        return nf;
    }

    public void setNf(double nf) {
        this.nf = nf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "aluno{" + "n1=" + n1 + ", n2=" + n2 + ", nf=" + nf + ", nome=" + nome + ", cf=" + cf + ", n=" + n + '}';
    }

}
