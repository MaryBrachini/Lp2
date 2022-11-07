package Interface;

public abstract class TradicionalBook implements Sellable,Transportable{

    public String description(){
        return "Livro - Senhor dos Aneis";
    }

    public int listPrice() {
        return 97;
    }

    public int lowestPrice(){
        return 22;
    }

    public int weight(){
        return 238;
    }
}