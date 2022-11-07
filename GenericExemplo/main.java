package GenericExemplo;
public class main {
    public static void main(String[] args) {
        ImprimirString impressaoS1 = new ImprimirString("IFSP");
        impressaoS1.imprimir();
     
        ImprimirInteiro impressaoI1 = new ImprimirInteiro(7777);
        impressaoI1.imprimir();
     
        ImprimirDouble impressaoD1 = new ImprimirDouble(777.77);
        impressaoD1.imprimir();
     
        ImprimirGeneric<Integer> impressaoIG1 = new ImprimirGeneric<>(777);
        impressaoI1.imprimir();
     
        ImprimirGeneric<Double> impressaoDG1 = new ImprimirGeneric<>("IFSP");
        impressaoI1.imprimir();
     
        ImprimirGeneric<String> impressaoSG1 = new ImprimirGeneric<>(777.77);
        impressaoI1.imprimir();
      }
}