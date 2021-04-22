package br.com.erickfrere.programadeimpressaodetriangulosmodificado;


/**
 * Programa em Java que imprime triângulos um do lado do outro com asteriscos
 * @author Erick Freire
 * @version 1 - Criado em 22-04-2021 as 14:51
 */

public class ProgramaDeImpressaoDeTriangulosMofificado {
	public static void main(String[] args) {
int tamanho = 10;
		
		for ( int i = 1; i <= tamanho; i++ )
		{          
		for ( int j = 1; j <= i; j++ )
		System.out.print("*");

		for ( int k = i + 1; k <= tamanho; k++)
		System.out.print(" ");

		System.out.print(" ");
		System.out.print(" ");
		System.out.print(" ");
		System.out.print(" ");

		for ( int l = 1; l <= tamanho + 1 - i; l++ )
		System.out.print("*");

		for ( int m = tamanho - 1 -i; m <= tamanho; m++)
		System.out.print(" ");

		System.out.print(" ");
		System.out.print(" ");
		System.out.print(" ");
		System.out.print(" ");

		for ( int n = 1; n < i; n++ )
		System.out.print(" ");
		   
		for ( int p = i; p <= tamanho; p++ )
		System.out.print("*");

		System.out.print(" ");
		System.out.print(" ");
		System.out.print(" ");
		System.out.print(" ");

		for ( int q = 1; q <= tamanho - i; q++ )
		System.out.print(" ");

		for ( int r = tamanho - i; r < tamanho; r++ )
		System.out.print("*");

		System.out.println();
		}           

		System.out.println("\n");
	}

}
