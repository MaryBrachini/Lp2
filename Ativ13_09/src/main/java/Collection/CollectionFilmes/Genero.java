package Collection.CollectionFilmes;

public class Genero {
    String genero;

    public Genero(String genero) {
        this.genero = genero;
    }

    public Genero() {
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Genero{" + "genero=" + genero + '}';
    }
}
