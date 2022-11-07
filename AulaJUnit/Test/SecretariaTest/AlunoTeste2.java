package SecretariaTest;

import static org.junit.Assert.*;

import java.util.*;
import secretaria.Aluno;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AlunoTeste2 {
	
	@BeforeEach
    public void beforeFunction(){
        System.out.println("Ocorre antes");
    }

    @AfterEach
    public void afterFunction(){
        System.out.println("Ocorre depois");
    }
	
	@Test
	void test1() {
		System.out.println("Teste 1:");
		ArrayList<Aluno> alunos = new ArrayList<>();
		Aluno aluno = new Aluno();
		aluno.setNome("Rafael");
		aluno.setN1(1);
		aluno.setN2(2);
		aluno.setNf(3);
		aluno.setConceito("B");
		alunos.add(aluno);
		assertEquals("Rafael", alunos.get(0).getNome());
	}
	
	@Test
	void test2() {
		System.out.println("Teste 2:");
		ArrayList<Aluno> alunos = new ArrayList<>();
		Aluno aluno = new Aluno();
		aluno.setNome("Rafael");
		aluno.setN1(1);
		aluno.setN2(2);
		aluno.setNf(3);
		aluno.setConceito("B");
		alunos.add(aluno);
		assertTrue("Rafael" == alunos.get(0).getNome());
	}
	
	@Test
	void test3() {
		System.out.println("Teste 3:");
		ArrayList<Aluno> alunos = new ArrayList<>();
		Aluno aluno = new Aluno();
		aluno.setNome("Rafael");
		aluno.setN1(1);
		aluno.setN2(2);
		aluno.setNf(3);
		aluno.setConceito("B");
		alunos.add(aluno);
		assertFalse("Rafael" != alunos.get(0).getNome());
	}
	
	@Test
	void test4() {
		System.out.println("Teste 4:");
		ArrayList<Aluno> alunos = new ArrayList<>();
		Aluno aluno = new Aluno();
		aluno.setNome("Rafael");
		aluno.setN1(1);
		aluno.setN2(2);
		aluno.setConceito("B");
		alunos.add(aluno);
		assertNull(aluno);
	}
	
	@Test
	void test5() {
		System.out.println("Teste 5:");
		ArrayList<Aluno> alunos = new ArrayList<>();
		Aluno aluno = new Aluno();
		aluno.setNome("Rafael");
		aluno.setN1(1);
		aluno.setN2(2);
		aluno.setConceito("B");
		alunos.add(aluno);
		assertNotNull(alunos.get(0).getN1());
	}
	
	@Test
	void test6() {
		System.out.println("Teste 6:");
		ArrayList<Aluno> alunos = new ArrayList<>();
		Aluno aluno = new Aluno();
		aluno.setNome("Rafael");
		aluno.setN1(1);
		aluno.setN2(2);
		aluno.setConceito("B");
		alunos.add(aluno);
		assertSame(aluno, alunos.get(0));
	}
	
	@Test
	void test7() {
		System.out.println("Teste 7:");
		ArrayList<Aluno> alunos = new ArrayList<>();
		Aluno aluno = new Aluno();
		aluno.setNome("Rafael");
		aluno.setN1(1);
		aluno.setN2(2);
		aluno.setNf(3);
		aluno.setConceito("B");
		alunos.add(aluno);
		
		Aluno aluno2 = new Aluno();
		aluno2.setNome("Renata");
		aluno2.setN1(2);
		aluno2.setN2(4);
		aluno2.setNf(5);
		aluno2.setConceito("A");
		
		assertNotSame(aluno, aluno2);
	}
	
	@Test
	void test8() {
		assertEquals(0, 1);
	}

}
