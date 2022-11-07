import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import secretariaTest.Aluno;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Ignore;

class testes {

    @Test
    void teste01() {
        System.out.println("Teste 1:");
        ArrayList<Aluno> alunos = new ArrayList<>();
        Aluno aluno = new Aluno();
        aluno.setNome("Alguem");
        aluno.setN1(7.7);
        aluno.setN2(7.7);
        aluno.setNf(7.7);
        aluno.setConceito("B");
        alunos.add(aluno);
    }

    @Test
    void teste02() {
        System.out.println("Teste 2:");
        ArrayList<Aluno> alunos = new ArrayList<>();
        Aluno aluno = new Aluno();
        aluno.setNome("Alguem");
        aluno.setN1(7.7);
        aluno.setN2(7.7);
        aluno.setNf(7.7);
        aluno.setConceito("B");
        alunos.add(aluno);
        Aluno s = alunos.get(0);
        System.out.println(s);
    }

    @Test
    void teste03() {
        System.out.println("Teste 3:");
        ArrayList<Aluno> alunos = new ArrayList<>();
        Aluno aluno = new Aluno();
        aluno.setNome("Alguem");
        aluno.setN1(7.7);
        aluno.setN2(7.7);
        aluno.setNf(7.7);
        aluno.setConceito("B");
        alunos.add(aluno);
        alunos.remove(aluno);
    }

    @Test
    void teste04() {
        System.out.println("Teste 4:");
        ArrayList<Aluno> alunos = new ArrayList<>();
        Aluno aluno = new Aluno();
        aluno.setNome("Alguem");
        aluno.setN1(7.7);
        aluno.setN2(7.7);
        aluno.setNf(7.7);
        aluno.setConceito("B");
        alunos.add(aluno);
        int s = alunos.indexOf(aluno);
        System.out.println(s);
    }

    @Test
    void teste05() {
        System.out.println("Teste 5:");
        ArrayList<Aluno> alunos = new ArrayList<>();
        Aluno aluno = new Aluno();
        aluno.setNome("Alguem");
        aluno.setN1(7.7);
        aluno.setN2(7.7);
        aluno.setNf(7.7);
        aluno.setConceito("B");
        alunos.add(aluno);
    }

    boolean s = aluno.getNome().contains("Alguem");
    
    if(s){
        System.out.println("Existe esse aluno cadstrado");
    }else{
        System.out.println("Não existe esse aluno cadstrado");
    }
}

    @Test
void test06(){
fail("Teste ainda não implementado!!");
}

@Ignore
void test07(){
System.out.println("Não Executa, teste 07");
}
}
