package br.edu.ifsp.vtp.teste;

import java.util.ArrayList;

public class Pessoa {

    int id;
    String nome;
    Status status;
    ArrayList<Telefone> telefones;

    public Pessoa() {
    }

    public Pessoa(int id) {
        this.id = 0;
        this.nome = new String();
        this.status = new Status();
        this.telefones = new ArrayList<>();
    }

    public Pessoa(int id, String nome, Status status, ArrayList<Telefone> telefones) {
        this.id = id;
        this.nome = nome;
        this.status = status;
        this.telefones = telefones;
    }

    public void adicionarTelefone(Telefone telefone) {
        telefones.add(telefone);
    }

    public void removerTelefone(Telefone telefone) {
        telefones.remove(telefone);
    }

    public void removerTelefone(int posicao) {
        telefones.remove(posicao);
    }

   /*   @Override
  public String toString() {
        return "id = " + id;
    }

    public void metodo1() {
        int id = 1;
    }

    public void metodo2() {
        id = 2;
    }

    public void metodo3(int id) {
        id = 3;

        if (id <= 0) {
            boolean teste = false;
        }
    
        //if(teste = true){
        //System.out.println("Deu erro");
        //}
    }*/

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public ArrayList<Telefone> getTelefones() {
        return telefones;
    }

    public void setTelefones(ArrayList<Telefone> telefones) {
        this.telefones = telefones;
    }
}
