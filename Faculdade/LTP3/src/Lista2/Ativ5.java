package Lista2;

import java.util.ArrayList;

public class Ativ5 {

	public static void main(String[] args) {

		ArrayList<String> posi = new ArrayList<String>();

		String frase = " teste teste 2";
		String palaProcurada = "teste";

		System.out.println(buscaIndice(posi, palaProcurada, frase));

	}

	public static ArrayList<String> buscaIndice(ArrayList<String> posi,
			String palaProcurada, String frase) {
		int posicao=0;
		int posicaoF=0;
		String aux = frase;
		for (int i = 0; i < frase.length(); i++) {

		//CORRIGIDOOO 

			posicao = posicao + posicaoF + frase.substring(posicao).indexOf(palaProcurada);
			posicaoF = (posicao + palaProcurada.length());

			aux = String.valueOf(posicao) + " - " + String.valueOf(posicaoF);

			if(posicao>frase.length()){
				
				break;
			}
			
			posi.add(aux);
			
			
		
		}
			return posi;

	}

}
