package dataTypes;

public class DatosPrimitivos {
	public static void main (String [] args) {
		System.out.println("Jelou");
		/*
		 * Datos primitivos. Datos fundamentales en Java que sirven para gestionar los tipos de información más básicos
		 * Existen 8 tipos de datos primitivos: byte, short, int, long, float, dohble, boolean, char
		*/
		//Vmin y Vmax
		byte maxByte = Byte.MAX_VALUE;
		byte minByte = Byte.MIN_VALUE;
		System.out.println("El valor minimo de Byte es: " + minByte);
		System.out.println("El valor máximo de Byte es: " + maxByte);
		
		//short. Vmin y VMax
		short minShort = Short.MIN_VALUE;
		short maxShort = Short.MAX_VALUE;
		System.out.println("El valor mínimo de Short es: " + minShort);
		System.out.println("El valor máximo de Short es: " + maxShort);
		
		//char. Vmin y Vmax
		char minChar = Character.MIN_VALUE;
		char maxChar = Character.MAX_VALUE;
		System.out.println("El valor mínimo de Character es: " + minChar);
		System.out.println("El valor máximo de Character es: " + maxChar);
		
		//long
		long isbn = 9788499169019L;
		System.out.println(isbn);
		
		//float
		float salary = 15000f;
		System.out.println(salary);
		
		//double
		double ISR = 1239.45d;
		System.out.println(ISR);
		
		char valorChar1 = 64;
		char valorChar2 = 60;
		System.out.println(valorChar1);
		System.out.println(valorChar2);
		
		char aChiquita;
		aChiquita = 166;
		System.out.println(aChiquita);
		
		/*Casting ( Conversión de tipos en Java).
		*--Automático (dato más pequeño a un dato más grande)
		*--Manual (tipo de dato más grande a tipo de dato más pequeño)
		*/
		
		int myNumber = 125;
		System.out.println(myNumber);
		//int < double
		double myCasting = myNumber;
		System.out.println(myCasting);
		
		short edad = 25;
		int valorEdad = (edad);
		System.out.println(edad);
		System.out.println(valorEdad);
		
		//--Manual
		int myNewCasting = (int) myCasting;
		System.out.println(myNewCasting);
		
		//Covertir e float a int
		float myFloat = 1.99f;
		System.out.println(myFloat);
		//Conversión 
		int myNewFloat = (int) myFloat;
		System.out.println(myNewFloat);
		
		//Convertir  de char a int
		char myChar = 'M';
		int myNewChar = myChar;
		System.out.println(myNewChar);
		
	  
		
		

		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		int minInt = Integer.MIN_VALUE;
		int maxInt = Integer.MAX_VALUE;
		System.out.println("El valor minimo de Int es " + minInt);
		System.out.println("El valor maximo de Int es " + maxInt);
		
		
		long minLong = Long.MIN_VALUE;
		long maxLong = Long.MAX_VALUE;
		System.out.println("El valor minimo de Long es " + minLong);
		System.out.println("El valor mmaximo de Long es " + maxLong);
		
		float minFloat = Float.MIN_VALUE;
		float maxFloat = Float.MAX_VALUE;
		System.out.println("El valor minimo de Float es " + minFloat);
		System.out.println("El valor mmaximo de Float es " + maxFloat);
		
		double minDouble = Double.MIN_VALUE;
		double maxDouble = Double.MAX_VALUE;
		System.out.println("El valor minimo de Double es " + minDouble);
		System.out.println("El valor maximo de Double es " + maxDouble);
		
		char minCharacter = Character.MIN_VALUE;
		char maxCharacter = Character.MAX_VALUE;
		System.out.println("El valor minimo de Character es " + minCharacter);
		System.out.println("El valor mmaximo de Character es " + maxCharacter);
				
				
		

				
		
	}

}
