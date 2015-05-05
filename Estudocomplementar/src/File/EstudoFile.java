package File;

import java.awt.image.ByteLookupTable;
import java.io.File;
import java.util.ArrayList;

public class EstudoFile {
	public static double byteToGiga(long bytes){
		double kbytes = bytes / 1024.0;
		double mbytes = kbytes / 1024.0;
		return mbytes /1024.0;
	}
	
	
	
	public static void main(String[] args) throws Exception{
		File f = File.createTempFile("estudo_file", ".txt");
		//fazer algo o arquivo 
		
		// listaArquivos(new File("C:\\Users\\GusmaoGusmao\\Pictures"));
		f.deleteOnExit();
		
		System.out.println(f.getCanonicalPath());
	}
	
	private static void listaArquivos(File raiz){
		System.out.println("Lista os arquivos de " + raiz.getName());
		for(File arquivo : raiz.listFiles()){
			if(arquivo.isDirectory()){
				
				listaArquivos(arquivo);
				
			}else{
				if(arquivo.getName().equals("thumb.db")){
					arquivo.delete();
				}
				System.out.println("\t" + arquivo.getName());
			}
		}
		
	}
	
}
