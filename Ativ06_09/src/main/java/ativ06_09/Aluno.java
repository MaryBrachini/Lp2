package ativ06_09;

public class Aluno extends Pessoa{
   
    private int numdisc;
    private String ra;

    public Aluno() {
        
    }

    public Aluno(String nome,String ra, int numdisc) {
        super(nome);
        this.ra = ra;
        this.numdisc = numdisc;
    } 

    public int getNumdisc() {
        return numdisc;
    }

    public void setNumdisc(int numdisc) {
        this.numdisc = numdisc;
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }
}
