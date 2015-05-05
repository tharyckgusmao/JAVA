package Lista3;

import java.util.GregorianCalendar;
import java.util.Scanner;

import servicos.*;

public class TesteLtpUtilAluno {
public static void main(String[] args){
	String aluno;
	String cpf;
	String cnpj;
	String data;
	double miliss;
 	GregorianCalendar dt=new GregorianCalendar();
Scanner input = new Scanner(System.in);

	Console.printPrompt("Informe o nome do aluno :");
 	aluno = Console.readLine();
 	do{
	 	Console.printPrompt("Informe o CPF");
	 	cpf= Console.readLine();
	 	
	 	if(!LtpUtilAluno.validarCPF(cpf)){
	 		
		 	Console.printPrompt("CPF errado !");

	 		
	 	}
	 	
 	}while(!LtpUtilAluno.validarCPF(cpf));
	
 	do{
	 	Console.printPrompt("Informe o CNPJ");
	 	cnpj= Console.readLine();
	 	
	 	if(!LtpUtilAluno.validarCNPJ(cnpj)){
	 		
		 	Console.printPrompt("CNPJ errado !");

	 		
	 	}
	 	
 	}while(!LtpUtilAluno.validarCNPJ(cnpj));
	
 	

		do{
	 	Console.printPrompt("Informe a DATA");
	 	data= Console.readLine();
	 	
	 	
	 	
	 	if(!LtpUtilAluno.validaData(data)){
	 		
		 	Console.printPrompt("DATA errado !");

	 		
	 	}
		}while(!LtpUtilAluno.validarData(data, dt));
 
 	
	
	
	
	Console.printPrompt("Informe os millisegundos :");
	miliss=input.nextDouble();
	Console.printPrompt(LtpUtilAluno.formatarMilissegundos(miliss));
	
	
	
}
	
}
