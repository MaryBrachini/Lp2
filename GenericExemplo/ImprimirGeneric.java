package GenericExemplo;
public class ImprimirGeneric{
    T algoParaImprimir;

    public ImprimirGeneric(T algoParaImprimir) {
        this.algoParaImprimir = algoParaImprimir;
    }

    public void imprimir() {
        System.out.println(algoParaImprimir);
    }
}