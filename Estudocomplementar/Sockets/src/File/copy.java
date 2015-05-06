package File;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import javax.print.DocFlavor.INPUT_STREAM;
import javax.tools.FileObject;

public class copy {
	public static void main(String[] args) throws Exception{
	
		File origem = new File("C:\\Users\\GusmaoGusmao\\Pictures\\teste.txt");
		File destino = new File("C:\\Users\\GusmaoGusmao\\Pictures\\teste_copia.txt");

		
		FileInputStream streamLeitura = new FileInputStream(origem);
		FileOutputStream streamEscrita = new FileOutputStream(destino);
		
		int byteLidos;
		byte[] buffer = new byte[1024];
		
		while((byteLidos = streamLeitura.read(buffer)) != -1)
		{
		streamEscrita.write(buffer, 0,byteLidos );
		}
		}
		
		/*
		int dado;
		
		while((dado= streamLeitura.read()) != -1){
			System.out.println(dado);

			streamEscrita.write(dado);
			
		}

		streamEscrita.close();
		streamLeitura.close();
}*/
	


}
