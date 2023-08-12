
public class varsAndDataTypes {

	public static void main(String[] args) {
		//Variables y como se almacenan en memoria
		/*
		 * Cada variable tiene nombre propio, un valor, un tipo y una direccion de memoria
		 * CamelCase
		 * 
		 * Tips para nombrar variables
		 * Solo usar letras, numeros, $ o _
		 * No pueden iniciar con numeros
		 * No se puede nombrar con keywords o palabras reservadas
		 * Utilizar camel case iniciando e minuscula miVariable
		 * El nombre de la variable debe hacer referencia a para que va a ser usada
		 * 
		 * */
		
		//Tipos de datos en Java
		//4 tipos de dato numero entero 
		byte b = 5; //8 bits -128 a 127
		short s =128; //16 bits -32768 a 32767
		int i = 40000; //32 bits -2147483648 a 2147483647
		long l = 2000000; //64 bits -9223372036854775808 nueve trillones
		
		//Tipos de dato de punto flotante
		//Por defecto se almacenan los flotntes como double pero si se quiere usar float se coloca la constante f
		float f=4.0f; //32 bits no recomendable para finanzas
		double d=67.0; // 64 bits no usar en finanzas
		//Para finanzas se utilizaria BigDecimal
		
		//Otras tipos de datos
		char c = 'a'; //16 bits
		boolean isTrue = false; //true or false
		
		//Manejando y concatenando strngs
		//El operador + sirve para concatenar cadenas y se tratan todas como texto
		//Se debe escribir String con la primera mayuscula
		String cadenaTexto = "hola";
		String cadenaTexto2 = "Adios";
		System.out.println(cadenaTexto + cadenaTexto2 + 1 + 2 + 3);
		
		//Operador de asignacion ++ o -- sirve para incrementar o disminuir en 1 el valor de una var numerica
		b++; //6
		System.out.println(b);
		b--; //5
		System.out.println(b);
		//Operador +=, *=, /=   hace la operacion con la misma variable
		i += 2; // i = i + 2
		
		//Trucos con Jshell
		/*
		 * Flecha arriba y abajo navegar entre comando 
		 * ctrl + a / ctrl + i  ir al inicio o final de la linea
		 * ctrl + r buscar y ver el historial 
		 * si en jshell no se completa el codigo despues del igual te permite escribir abajo
		 * puedes separar expresiones con ;
		 * las sesiones son unicas y en cada salida se borra 
		 * 
		 * */
		
		
		
		
		
	}

}
