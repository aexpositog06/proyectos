public class Prueba{

  public static void main(String[] args) {
		

		System.out.println("Hola esto es la version 1.0 del programa de Pruebas, mi nombre no es Abraham, sino Daniel y vengo a por ti");


	}
}
package Triangulo;

class Triangulo {



	    public static void main(String[] args) {

	        System.out.println();

	        for(int altura = 1; altura<=6; altura++){

	            //Espacios en blanco

	            for(int blancos = 1; blancos<=6-altura; blancos++){

	                System.out.print(" ");

	            }

	 	            //Asteriscos

	            for(int asteriscos=1; asteriscos<=(altura*2)-1; asteriscos++){

	                System.out.print("*");

	            }

	            System.out.println();

	        }
	        System.out.println("Este es el programa de Rubén Marín ");

	    }


	}

