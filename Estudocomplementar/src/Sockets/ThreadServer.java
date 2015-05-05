package Sockets;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;

public class ThreadServer implements Runnable {

	private InputStream input;
	private OutputStream output;
	private BufferedReader in;
	private PrintStream out;
	private Socket socket;
	public ThreadServer(Socket socket) throws IOException{
		
		this.socket = socket;
		input = this.socket.getInputStream();
		output = this.socket.getOutputStream();
		
		 in = new BufferedReader(new InputStreamReader(input));
		 out = new PrintStream(output);
				
	}
	
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		while(true){
			
			String mensagem = null;
			try {
				mensagem = in.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(
				 	
					" Mensagem recevida do cliente [" +
					socket.getInetAddress().getHostName()+
					"]" + mensagem);
					
					
					if("FIM".equals(mensagem)){
						break;
						
					}
					
					out.println(mensagem);
			
			
		}
		
		
		try {
			System.out.println(" Conexao encerrada " + 	socket.getInetAddress().getHostName());

			Thread.interrupted();
			in.close();
			out.close();
			socket.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	
	
}
