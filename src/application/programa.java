package application;

import java.util.Locale;
import java.util.Scanner;

import entities.students;

public class programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		students aluno = new students();
		
		aluno.name = sc.nextLine();
		aluno.nota1 = sc.nextDouble();
		aluno.nota2 = sc.nextDouble();
		aluno.nota3 = sc.nextDouble();
		
		System.out.printf("A nota final é %.2f%n", aluno.notaFinal());
		System.out.println();
		
		if (aluno.notaFinal() < 60) {
			System.out.println("O aluno repetiu");
			System.out.printf("Falta %.2f%n", aluno.faltando());
		}
		
		sc.close();
		

	}
 
}
