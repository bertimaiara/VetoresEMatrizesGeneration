package VetoresEMatrizes;

import java.util.Scanner;

public class questao01 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int numero[] = new int[5], x, mponto=0;
		
		for (x=0; x<5; x++)	{
			
			System.out.println("Entre com um número: ");
			numero[x] = leia.nextInt();
			
			if(numero[x]>mponto)
			{
				mponto=numero[x];
			}
		}
		
		for (x=0; x<5; x++)
		{
			System.out.println("Valor Posição "+ x+ ":"+ numero[x]);
		}	
		System.out.println("-------------------");
		System.out.println("Maior valor: "+ mponto);
		}
	}