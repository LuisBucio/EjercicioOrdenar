import java.util.Scanner;

public class OrdenarNum {
	/*
	 * Debe dise�ar un programa que reciba 3 n�meros por consola y 
	 * determine cual de los 3 n�meros es el mayor.
		Plus: Imprimir los n�meros ordenados de mayor a menor.
		Plus: Imprimir los n�meros ordenados de menor a mayor.
*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num1;
		int num2;
		int num3;
		
		System.out.println("Escribe tu primer n�mero");
		num1 = sc.nextInt();
		System.out.println("Escribe tu segundo n�mero");
		num2 = sc.nextInt();
		System.out.println("Escribe tu tercer n�mero");
		num3 = sc.nextInt();
		
		ordenar(num1, num2, num3);
	}
	
	public static void ordenar( int num1,int num2,int num3) {
				
		if(num1 > num2 && num1 > num3){
			System.out.println("El " + num1 + " es mayor a " + num2 + " y " + num3);
		}
		else if(num2 > num1 && num2 >num3){
			System.out.println("El " + num2 + " es mayor a " + num1 + " y " + num3);
		}else {
			System.out.println("El " + num3 + " es mayor a " + num2 + " y " + num1);
		}
		
	}

}
