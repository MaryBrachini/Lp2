package br.edu.ifsp.vtp.teste;

public class Telefone {
    private int id;
    private int ddd;
    private String numero;
    private String tipo;
    
    public Telefone() {
    }
    
    public Telefone(int id, int ddd, String numero, String tipo) {
        this.id = id;
        this.ddd = ddd;
        this.numero = numero;
        this.tipo = tipo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDdd() {
        return ddd;
    }

    public void setDdd(int ddd) {
        this.ddd = ddd;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
   
    
}
