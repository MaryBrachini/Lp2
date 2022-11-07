package br.edu.ifsp.vtp.teste;

public class Status {
    private int id;
     private String descricao;

    public Status() {
          this.id = 0;
     this.descricao = new String();
    }
    
    public Status(int id,String descricao) {
        this.id = id;
        this.descricao = descricao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    
}
