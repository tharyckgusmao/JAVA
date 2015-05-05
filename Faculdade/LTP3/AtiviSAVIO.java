package Lista2;

import java.util.ArrayList;
import java.util.Scanner;

public class AtiviSAVIO {

	public static void main(String[] args) {

		
		String nome,concatenaDADOS;
		int  mesemprestimo,anoempres,mesatual = 0,anoatual;
		float valoEmprest,jurosMens,debito,total=0;
		ArrayList<String> nomes = new ArrayList <String>();
		Scanner leia = new Scanner(System.in);
		
		
		while(true){
			
			
			System.out.println(" Favor informar o nome :");
			nome = leia.nextLine();
			
			System.out.println(" Favor informar o mes do emprestimo :");
			mesemprestimo = leia.nextInt();
			
			System.out.println("Favor informar o ano do Emprestimo");
			anoempres = leia.nextInt();
			
			System.out.println("Favor informar o mes atual :");
			mesatual = leia.nextInt();
			
			System.out.println("Favor informar o ano atual :");
			anoatual = leia.nextInt();
			
			System.out.println("favor informar o valor do emprestimo :");
			valoEmprest = leia.nextFloat();
			
			System.out.println(" favor informar Taxa de juros");
			jurosMens = leia.nextFloat();
			
			leia.nextLine();
			
			debito=calcularDebito(mesemprestimo,anoempres,mesatual,anoatual,valoEmprest,jurosMens);
			
			concatenaDADOS = nome + "   	 	  -   		   " + String.valueOf(debito);
			
			if(((anoatual-anoempres)*12+(mesatual-mesemprestimo))>=12){
				total = total+ debito;
				nomes.add(concatenaDADOS);
				
			}
		
			
		System.out.println("Deseja sair : SS para sair ou NN para continuar");
			nome = leia.nextLine();
		if(nome.equalsIgnoreCase("SS")){
			leia.close();
			break;
			}
		
		
		
		}
	
		
				System.out.println(" RELATORIOS DE DEBITOS COM MAIS DE 1 ANO :");
		System.out.println("NOME DEVEDOR :      -      VALOR");
		System.out.println(nomes);
		
		
		System.out.println(" TOTAL :             "+ total);
		
		
	}
	
	public static float calcularDebito(int mesEMPRE, int anoEMPRE, int mesATUAL, int anoATUAL, float vlEMPRE,float juroMEN){
	 float debito;
		
		debito = ((anoATUAL - anoEMPRE)*12+(mesATUAL-mesEMPRE))*juroMEN*vlEMPRE/100+vlEMPRE;
	 
	 
		return debito;
		
		
	}
	
}
