package Interface;

public abstract class Ebook implements Sellable {

    public String description(){
        return "Livro Eletronico - Pequeno Pricipe";
    }

    public int listPrice() {
        return 97;
    }

    public int lowestPrice(){
        return 23;
    }


}