import java.io.*;

public class Principal {
	public static void main(String a[]) {
		int i;
		String s = "c:\\java\\aplicacoes\\saida.txt";
		try {
			FileOutputStream arqSaida = new FileOutputStream(s);
			FileInputStream arqEntrada = new FileInputStream(s);
			i=0;
		
			while (i!= -1){
			i= arqEntrada.read();
			System.out.println(i); }
			arqEntrada.close();
		} catch (IOException ex) {
			System.out.println("Problemas com abertura ou escrita...");
		}
	

}}