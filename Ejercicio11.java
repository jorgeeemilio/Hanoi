package es.studium.Tema9;

import java.util.Scanner;

public class Ejercicio11
{
	public static void main(String[] args)
	{
		int discos;
		int contador = 0;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introducir el número de discos a procesar:");
		discos = teclado.nextInt();
		teclado.close();
		// Hanoi(número de discos, columna origen, columna destino, auxiliar)
		contador = Hanoi(discos, 1, 3, 2, contador);
		System.out.println("Se han realizado " + contador + " movimientos.");
	}
	
	public static int Hanoi(int n, int x, int y, int aux, int c)
	{
		if(n==1)
		{
			System.out.println("Mover el disco de la torre "+x+" a la torre	"+y);
			c++;
			return(c);
		}
		else
		{
			c = Hanoi(n-1, x, aux, y, c);
			System.out.println("Mover el disco de la torre "+x+" a la torre	"+y);
			c = Hanoi(n-1, aux, y, x, c);
			c++;
			return(c);
		}
	}
}
