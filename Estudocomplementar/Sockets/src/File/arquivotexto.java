package File;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class arquivotexto {

	public static void main(String[] args)throws Exception {
		File origem = new File("C:\\Users\\GusmaoGusmao\\Pictures\\teste.txt");
		FileInputStream streamLeitura = new FileInputStream(origem);

		InputStreamReader readerleitura = new InputStreamReader(streamLeitura);
		BufferedReader leitor = new BufferedReader(readerleitura);
		
		
		String linha;
		
		
		while((linha = leitor.readLine()) != null){
			System.out.println(linha);
			
		}
		
	}

}
