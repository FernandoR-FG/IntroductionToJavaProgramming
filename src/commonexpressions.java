
public class commonexpressions {

	public static void main(String[] args) {
		
		//Se revisan las expresiones basicas y tipos de dato comunes en java
			//Se debe tomar en cuenta la sintaxis es muy importante
		
		//Suma (+) Resta (-) Multiplicacion (*) Division (/)
		int x = 5*5;
		System.out.println(x);
				
		//Se toma en cuenta la jerarquia de operaciones al realizar expresiones
		x = 5+5*5;
		System.out.println(x);
		
		//Hay operadores como ** que significa potencia pero en Java no es asi
		//Para elevar a la potencia se utilizaria una funcion propia de Java
		 double base = 2.0;
	     double exponente = 3.0;       
	     double resultado = Math.pow(base, exponente);
	     System.out.println(resultado);
	     
	     //A continuacion se realizan algunos ejercicos en donde se evidencia el uso del metodo: 
	     //System.out.println(parameters), en los siguientes escenarios:
	     System.out.println("\nEjercicios de repaso\n");
	     //Imprimir "Hello World"
	     System.out.println("Hello World");
	     //Imprimir lo anterior pero con comillas
	     System.out.println("Con comillas: \"Hello World\" ");
	     //Imprimir la expresion "5 * 3"
	     System.out.println("5 * 3 ");
	     //Imprimir el resultado de la operacion 5*3
	     System.out.println(5*3);
	     //Imprimir el numero de segundos en un dia
	     x = 60*60*24;
	     System.out.println("60*60*24="+x);
	     //Imprimir la tabla del 5 (Modo no eficiente con recursos actuales)
	     System.out.println(" 5*1=5 \n 5*2=10 \n 5*3=15... ");
	     
	     
	     //Utilizando metodos matematicos comunes
	     	//Math.random no acepta parametros
	     System.out.println("\n Probando Math.random");
	     System.out.println(Math.random());
	     // Esto esta mal Math.random(5,100);
	     //Usando funcion minimo y Maximo
	     System.out.println(Math.min(100, 50));
	     System.out.println(Math.max(resultado, base));
	     
	     
	     //En otros casos cuando se utiliza JSHELL se puede escribir codigo en varias lineas
	     //Ejemplo
	     /*
	      * System.
	      * println(
	      * "Texto"
	      * )
	      * Despues de esto si imprimira Texto
	      * 
	      * Si se separan por ";" funciona igual
	      * i=10;j=5
	      * */
	     
	     //Ahora utilizaremos printf para expresiones
	     //Eso significa que con printf podemos colocar expresiones dentro del texto que se calcularan
	     System.out.printf("5*2=10\n"); //Utilizando esto puede generar comentario de error
	     //Para colocar expresion a calcular se ocupa "%" seguido de un caracter
	     //Para el caso de los enteros es "d" entonces queda "%d" que es para enteros
	     //Despues se coloca una coma y la expresion que este despues de la coma sera calculada
	     System.out.printf("5*2=10 expresion---> %d \n", 5*5).println();
	     //Se pueden colocar varios %d %d %d
	     //Lo importante es que despues de las comillas hayan suficientes valores para cada uno de los %d
	     System.out.printf("valor1---> %d valor2---> %d valor3---> %d valor4---> %d",5+5,9*3,8/4,500);
	     //Ocupar %s Permite pasar strings como parametros
	     //Ocupar %f Permite ocupar valores de punto flotante
	     
	     
	     //Introduccion a las variables
	     //En JSHELL las variables se inicializan con 0
	     int j = 0; //Si en java las variable no se inicializa genera un error
	     System.out.println(j); 
	     System.out.println("\n\nHablando de variables");
	     //Son valores asignados que pueden cambiar y ser ocupados en el programa
	     //Debemos definir el tipo de datos ya sea si es int, float, double
	     int var = 5;
	     System.out.println("Variable var = "+var);
	     //Ahora con las variables se pueden alterar facilmente las expresiones anteriores para calcular
	     System.out.printf("5* %d = %d \n", var, 5*var).println();
	     //Ejercicio de repaso
	     int a,b,c;
	     a = 2; b = 4; c = 8;
	     System.out.printf("Las variables son: a= %d b= %d c=%d y la suma de a+b+c= %d",a,b,c,a+b+c).println();
	     //Otros valores
	     a = 2; b = 14; c = 8;
	     System.out.printf("Las variables son: a= %d b= %d c=%d y la suma de a+b+c= %d",a,b,c,a+b+c).println();
	     //Otros valores
	     a = 2; b = 14; c = 38;
	     System.out.printf("Las variables son: a= %d b= %d c=%d y la suma de a+b+c= %d",a,b,c,a+b+c).println();
	     
	     
	}

}
