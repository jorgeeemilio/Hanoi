package es.studium.Tema9;

import java.util.Scanner;

public class Ejercicio11
{
	public static void main(String[] args)
	{
		int discos;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introducir el número de discos a procesar:");
		discos = teclado.nextInt();
		// Hanoi(número de discos, columna origen, columna destino, auxiliar)
		Hanoi(discos, 1, 3, 2);
		teclado.close();
	}
	
	public static void Hanoi(int n, int x, int y, int aux)
	{
		if(n==1)
		{
			System.out.println("Mover el disco de la torre "+x+" a la torre	"+y);
		}
		else
		{
			Hanoi(n-1,x,aux,y);
			System.out.println("Mover el disco de la torre "+x+" a la torre	"+y);
			Hanoi(n-1,aux,y,x);
		}
	}
}
