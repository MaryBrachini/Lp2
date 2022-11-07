package Collection.Comparetor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ContaCorrente {

    String codigo;
    double saldo;
    int tipo;

    public ContaCorrente(String codigo, double saldo, int tipo) {
        this.codigo = codigo;
        this.saldo = saldo;
        this.tipo = tipo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "ContaCorrente{" + "codigo=" + codigo + ", saldo=" + saldo + ", tipo=" + tipo + '}';
    }

    public static void main(String[] args) {

        ContaCorrente cc1 = new ContaCorrente("123", 100, 1);
        ContaCorrente cc2 = new ContaCorrente("456", 101, 2);
        ContaCorrente cc3 = new ContaCorrente("789", 11, 3);
        ContaCorrente cc4 = new ContaCorrente("147", 10, 1);
        ContaCorrente cc5 = new ContaCorrente("258", 990, 2);

        List<ContaCorrente> contas = new ArrayList<>();
        contas.add(cc1);
        contas.add(cc2);
        contas.add(cc3);
        contas.add(cc4);
        contas.add(cc5);

        System.out.println("Lista RAW");
        for (ContaCorrente contaCorrente : contas) {
            System.out.println(contaCorrente);
        }
        
        System.out.println("Lista em ordem crescente");
        Collections.sort(contas, new TipoCcComparetor());
        for (ContaCorrente contaCorrente : contas) {
            System.out.println(contaCorrente);
        }
    }
}
