package Collection.CollectionFilmes;

import java.util.ArrayList;
import java.util.List;

public class Filme {
    String filme;
    Genero genero;
    List<Ator> atores;

    public Filme() {
        atores = new ArrayList<Ator>();
    }

    public List<Ator> getAtores() {
        return atores;
    }

    public void setAtores(List<Ator> atores) {
        this.atores = atores;
    }

    public String getFilme() {
        return filme;
    }

    public void setFilme(String filme) {
        this.filme = filme;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        String ret = filme + ", " + genero.getGenero();
        for (Ator ator : atores) {
            ret += ", " + ator.getAtor();
        }
        return ret;
    }

    public static void main(String[] args) {

        Filme filme = new Filme();
        filme.setFilme("Lula 13");
        Genero genero = new Genero();
        genero.setGenero("Aventura");
        filme.setGenero(genero);

        Ator at1 = new Ator("Luiz Inácio");
        Ator at2 = new Ator("Dilma");

        filme.getAtores().add(at1);
        filme.getAtores().add(at2);
        System.out.println(filme);

    }
}
