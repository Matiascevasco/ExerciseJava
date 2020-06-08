import java.util.Scanner;

public class Practica {

 public static void main(String[] args) {
 
  Scanner matias = new Scanner(System.in);

  int a, b, c, lados;
  
  System.out.println("Introduzca el primer lado del triangulo");
  a = matias.nextInt();
  System.out.println("Introduzca el segundo lado del triangulo");
  b = matias.nextInt();
  System.out.println("Introduzca el tercer lado del triangulo");
  c = matias.nextInt();

  if ((a + b) > c && (a + c) > b && (b + c) > a) {

   System.out.println("Los lados son de un triangulo");
  } else {

   System.out.println("Los lados no son de un triangulo");
  }

 }

}