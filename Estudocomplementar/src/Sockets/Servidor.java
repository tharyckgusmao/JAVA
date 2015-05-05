package Sockets;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor {

	public static void main(String[] args) throws Exception {
		
		System.out.println(" Iniando servidor.");
		
		
		ServerSocket server = new ServerSocket(2525);
		
		
		
		

				
				while(true){
					System.out.println(" Aguardando conexao.");

					Socket socket = server.accept();
					System.out.println(" Conexao estabelecida.");
					
					Thread conec = new Thread(new ThreadServer(socket));
						conec.start();
						
				}
				
				
				
	}

	
	
	
	
	
}


