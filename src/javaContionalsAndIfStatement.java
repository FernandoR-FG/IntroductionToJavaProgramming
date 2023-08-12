
public class javaContionalsAndIfStatement {

	public static void main(String[] args) {
		
		//Bucles
		/*
		 * for(initial;condition;update)
		 * 		statement
		 * */
		//Contionals
		/* if (condition)
		 * 		statement
		 * */
		//Ejercicio
		//Dadas 4 variables a,b,c,d crear un if statement que imprima si a+b es mayor que c+d
		int a = 5; 
		int b = 9; 
		int c = 12; 
		int d = 3;
		if((a+b)>(c+d)) {
			System.out.printf("a + b = %d y es mayor que c + d = %d",a+b,c+d).println();
		}
		else {
			System.out.printf("c + d = %d no es mayor que a + b = %d",c+d,a+b).println();
		}
		
		//Dados 3 angulos verificar si la suma forma un triangulo 180 o no
		double ang1 = 90;
		double ang2 = 45;
		double ang3 = 45;
		if( (ang1+ ang2 + ang3) == 180) { //== es el operador de comparacion
			System.out.println("Es un triangulo");
		}else {
			System.out.println("No es un triangulo");
		}
		
		//Dada la variable numero determina si es par o impar
		int number = 178;
		if((number%2) == 0) {
			System.out.println(number + " Es numero par");
		}
		else {
			System.out.println(number + " Es impar");
		}
		
		//Resolviendo el problema de la tabla de multiplicar
		System.out.println("\nTabla de multiplicar");
		for(int i = 0; i<=10;i++) {
			System.out.printf("%d * %d = %d",5,i,5*i).println();
		}
		
		//Ejercicios de bucles
		//Imprimir la tabla del 6, 7 y 10
		int multiplicando = 10;
		System.out.println("\nTabla de multiplicar del "+ multiplicando);
		for(int i = 0; i<=10;i++) {
			System.out.printf("%d * %d = %d",multiplicando,i,multiplicando*i).println();		
		}
		
		//Imprimir numeros del 1 al 10 y del 10 al 1
		System.out.println("\nNumeros del 1 al 10 y del 10 al 1");
		short decremento = 10;
		for(int i =1; i<=10;i++) {
			System.out.println(i + " " + decremento--);
		}
		
		//Imprimir los cuadrados de los primeros 10 numeros pares e impares
		System.out.println("\nCuadrado de los primeros 10 pares");
		decremento=0;
		for(int i =0; decremento<=10;i++) {
			if((i%2)==0) {
				System.out.println(i*i);
				decremento++;
			}
		}
		System.out.println("\nCuadrado de los primeros 10 impares");
		decremento = 0;
		for(int i =0; decremento<=10;i++) {
			if((i%2)!=0) {
				System.out.println(i*i);
				decremento++;
			}
		}
		
		//Diferentes formas de utilziar el for
		for(;decremento<10;decremento++);
		for(int i = 0, j = 0; i<10;i++,j--) {
			System.out.println(i);
			System.out.println(j);
		};
		//Loop infinito
		for(;;);
		
	}

}
