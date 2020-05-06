package Program;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class program {

	public static void main(String[] args) {
		Disciplina[] v;
		List<Disciplina> list = new ArrayList<>(); 
		try(Scanner sc = new Scanner(System.in);){
			
			System.out.println("Informe o tipo da disciplina \n(A) Anual  \n(S) Semestral \n(T) Trimestral ");
			String y = sc.nextLine();
			
			System.out.println("Nº de disciplinas: ");
			int x = sc.nextInt();
			v = new DisciplinaTrimestral[x];
			
			if(y.equalsIgnoreCase("T")) {
				
				for(int i=0; i<v.length;i++) {
					System.out.println("Nome: ");
					String nome = sc.nextLine();
					sc.hasNextLine();
					System.out.println("Periodo: ");
					int p = sc.nextInt();
					System.out.println("Nota 1: ");
					double n1 = sc.nextDouble();
					System.out.println("Nota 2: ");
					double n2 = sc.nextDouble();
					v[i] = new DisciplinaTrimestral(nome,p,n1,n2);
				}

			}
			else if(y.equalsIgnoreCase("S")){
				
				for(int i=0; i<v.length;i++) {
					System.out.println("Nome: ");
					String nome = sc.nextLine();
					sc.hasNextLine();
					System.out.println("Periodo: ");
					int p = sc.nextInt();
					System.out.println("Nota 1: ");
					double n1 = sc.nextDouble();
					System.out.println("Nota 2: ");
					double n2 = sc.nextDouble();
					System.out.println("Nota 3: ");
					double n3 = sc.nextDouble();
					v[i] = new DisciplinaSemestral(nome,p,n1,n2,n3);
				}
			}
			else {
				for(int i=0; i<v.length;i++) {
					System.out.println("Nome: ");
					String nome = sc.nextLine();
					sc.nextLine();
					System.out.println("Periodo: ");
					int p = sc.nextInt();
					System.out.println("Nota 1: ");
					double n1 = sc.nextDouble();
					System.out.println("Nota 2: ");
					double n2 = sc.nextDouble();
					System.out.println("Nota 3: ");
					double n3 = sc.nextDouble();
					System.out.println("Nota 3: ");
					double n4 = sc.nextDouble();
					System.out.println("Nota 5: ");
					double n5 = sc.nextDouble();
					System.out.println("Nota 6: ");
					double n6 = sc.nextDouble();
					v[i] = new DisciplinaAnual(nome,p,n1,n2,n3,n4,n5,n6);
				}
			}
		}	
		
		catch(Exception e){
			System.out.println("Entrada de dados Inválida");
			System.exit(0);
		}
		
		String n;
		int i;
		while (v[i].getNome() != null){
			list.add(n);
			n = v[i].getNome();
		}
		
		for(int j=0; j<v.length; j++) {
			System.out.println(v[j].getNome());
		}
		
		Collections.sort(list);
		for(Disciplina s : list) {
			System.out.println(s);
		}
	}
}

