package ativ06_09;

public class Prof extends Funcionario {

    private String titulo;

    public Prof() {
    }

    public Prof(String nome, double sal, int numat, String titulo) {
        super(nome,sal,numat);
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    //public String toString(){
    //return "Prof [titulo=" + "]"
    //}
   
}
