package app5;

import java.util.Scanner;

public class App5 {

	public static void main(String[] args) {
          Scanner entrada = new Scanner(System.in);
          
          System.out.println("Informe o número que deseja: ");
          int número = entrada.nextInt();
          
          if (número >= 0) {
        	  System.out.println("Este número é positivo");
          } else { System.out.println("Este número é negativo");
          
          }
	}

}
