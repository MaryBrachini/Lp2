package Interface;

public interface Sellable {
    
    //Retorna a descrição do objeto
    public String description();

    //Retorna o preço de centavos
    public int listPrice();

    //Renorna o menor preço em centavos
    public int lowestPrice();
}
