package challenged;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthSeparatorUI;
import javax.xml.bind.ParseConversionEvent;

public class Reverse {

	public static void main(String[] args) {
	
		
		System.out.println("Entre com a frase a ser convertida: ");
		//declarando um scanner para receber a entrada do usuario
		Scanner string1 = new Scanner(System.in);
		//salvando a entrada do usuario em uma variavel
		String input = string1.nextLine();
		//declarando variavel que vai receber o retorno do metodo reverse de palavras
		String output = reverseWordbyWord(input);
		System.out.println(output);
		//declarando variavel que vai receber o retorno do metodo de reverse de letras
		String output2 = reverseChars(input);
		System.out.println(output2);

		
		
	}
	
	// criando um metodo do tipo string que vai receber um parametro String "returnreverse"
	//quando eu chamar esse metodo
	static String reverseWordbyWord(String returnReverse)
	{
		//Enviando para um array de string a frase enviada pelo usuario depois de splitar
		String[] array = returnReverse.split(" ");
		//Definindo uma nova variavel (como se fosse um contador que recebera o resultado novo e ele mesmo)
		String reverse="";
		//definindo um for que vai percorrer todas as posições do array
		// nesse caso o for está pegando cada posição da variavel array (frase que veio do usuario) e 
		// jogando a cada interação o valor da posição do array pra dentro da variavel teste
		//lembrando que a variavel teste criada no for só pode ser usada no escopo do for
		//caso eu queira transportar esse valor para outro lugar fora do escopo do for, eu tenho que salvar
		// esse valor em uma outra variavel
		for(String teste: array)
		{
			reverse = teste + " " + reverse;
		}
		
		return reverse;
	}
	
	// o parametro returnChar vai ser setado quando eu chamar o metodo
	//no caso esta vindo de uma entrada do usuario
	static String reverseChars(String returnChar)
	{
		
		char[] arrayChar = returnChar.toCharArray();
		String strFinal = "";
		
		for(char item: arrayChar){
			
			strFinal = item + strFinal;
			
		}
		return strFinal;
	}
	
}
