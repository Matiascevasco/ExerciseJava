import java.util.*;
public class Practica11 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int a[], b[], c[];
		
		a = new int[5];
		b = new int[5];
		c = new int[a.length+b.length];
	
		for(int i = 0; i < a.length; i++) {
			System.out.println((i+1) + " :Ingrese un numero");
			a[i] = entrada.nextInt();
		}
		int j = 0;
		for(int i = 0; i < a.length; i++) {
			c[j++] = a[i];
		}	
		
		for(int i = 0; i < b.length; i++) {
			System.out.println((i+1) + " :Ingrese un numero");
			b[i] = entrada.nextInt();
		}
		
		int k = 0;
		for(int i = 0; i < b.length; i++) {
			c[j++] = b[i];
			
		}
		System.out.print("c es igual a : ");
		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i] + " ");
		}
		System.out.println();
		

	}

}
