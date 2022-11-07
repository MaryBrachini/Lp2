package ativ06_09;

public class Funcionario extends Pessoa {

    private int numat;
    private double sal;

    public Funcionario() {
    }

    public Funcionario(String nome, double sal, int numat) {
        super(nome);
        this.sal = sal;
        this.numat = numat;
    }

    public int getNumat() {
        return numat;
    }

    public void setNumat(int numat) {
        this.numat = numat;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }
}
