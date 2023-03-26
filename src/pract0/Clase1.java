package pract0;
import java.util.Scanner;
public class Clase1 {

	// EJERCICIO 2
	 /* public static String leerNombre() {
		Scanner nombre = new Scanner(System.in);
		System.out.println("Escriba su nombre");
		return nombre.nextLine();
	}
	public static void main(String[] args) {
		String saludo = "hola " + leerNombre();
		System.out.println(saludo);
	}*/
	
	// EJERCICIO 3	
	/*public static int pedirNumero() {
		Scanner numero = new Scanner(System.in);
		System.out.println("Escriba un número");
		return numero.nextInt();
	}
	
	/*public static void main(String[] args) {
		int a = pedirNumero();
		int b = pedirNumero();
		int c = a + b;
		System.out.print("la suma de "+ a +" y "+ b+" es " + c);
		
	}*/
	
	// EJERCICIO 4
	/*public static void main(String[] args) {
		int a = 1/2; // 0
		double b = 1.0/2.0; //0.5
		double c = 1.0/2; //0.5
		double d = 1/2.0; //0.5
		// "1"/"2" ERROR
		int e = 1+2; //3
		// "1"+"2" ERROR
		int f = 16/2*4; //32
		int g = 16/(2*4); // 2
		
		System.out.println(g);
	}*/
	
	// EJERCICIO 5
	/*public static int pedirNumero() {
		Scanner numero = new Scanner(System.in);
		System.out.println("Escriba un número");
		return numero.nextInt();
	}
	public static void main(String[] args) {
		int a = pedirNumero();
		int b = pedirNumero();
		int c = (a + b) / 2;
		System.out.print("El promedio es: " + c);
	}*/
	
	// EJERCICIO 6
	 /*public static void main(String[] args) {
	      int a = 10;
	      int b = 20;
	        printSum(a, b);
	  }

	 public static void printSum(int num1, int num2) {
	      int sum = num1 + num2;
	       System.out.println("The sum of " + num1 + " and " + num2 + " is " + sum);
	    }*/
			
	// EJERCICIO 7
	/*public static void main(String[] args) {
	  	int a = 10;
	  	int b = 20;
	  	printProm(a, b);
	}
	
	public static void printProm(int num1, int num2) {
	  	int prom = (num1 + num2) / 2;
	  	System.out.println("The prom of " + num1 + " and " + num2 + " is " + prom);
	}*/
	
	//EJERCICIO 8
	
	/*public static void main(String[] args) {
		double a = 3.5;
		double b = 2.2;
		ponerNota(a,b);
	}
	
	public static void ponerNota(double x, double y) {
		double promedioFinal = (x + y)/2;
		if ( promedioFinal > 7) {
			System.out.println("Promocionado");
		} else if (promedioFinal < 7 && promedioFinal >= 4) {
			System.out.println("Aprobado");
		} else {
			System.out.println("Debe recuperar");
		}
	}*/
	
	// EJERCICIO 9
	/*public static void main(String[] args) {
		int dia = 23;
		int mes = 9;
		int anio = 2003;
		imprimirFecha(dia, mes, anio);
	}
	
	public static void imprimirFecha(int dia, int mes, int anio) {
		int guardarMes = mes;
		if (guardarMes == 1) {
			System.out.println(dia + " de Enero de " + anio );
		} else if( guardarMes == 2) {
			System.out.println(dia + " de Febrero de " + anio);
		}  else if( guardarMes == 3) {
			System.out.println(dia + " de Marzo de " + anio);
		}  else if( guardarMes == 4) {
			System.out.println(dia + " de Abril de " + anio);
		}  else if( guardarMes == 5) {
			System.out.println(dia + " de Mayo de " + anio);
		}  else if( guardarMes == 6) {
			System.out.println(dia + " de Junio de " + anio);
		}  else if( guardarMes == 7) {
			System.out.println(dia + " de Julio de " + anio);
		}  else if( guardarMes == 8) {
			System.out.println(dia + " de Agosto de " + anio);
		}  else if( guardarMes == 9) {
			System.out.println(dia + " de Septiembre de " + anio);
		}  else if( guardarMes == 10) {
			System.out.println(dia + " de Octubre de " + anio);
		}  else if( guardarMes == 11) {
			System.out.println(dia + " de Noviembre de " + anio);
		}  else if( guardarMes == 12) {
			System.out.println(dia + " de Diciembre de " + anio);
		} else {
			System.out.println("La fecha indicada no existe");
		}
	}*/
	
	// EJERCICIO 10
	/*public static void main(String[] args) {
		int c = 3;
		sumatoria(c);
	}
	public static int sumatoria(int n) {
		int i = 1;
		int suma = 0;
		while (i <= n)
		{
			suma = suma + i;
			i++;
		}
		System.out.println(suma);
		return suma;
		
	}*/
	
	// EJERCICIO 11 
	/*public static void main(String[] args) {
		int a = 5;
		sumatoriaPares(a);
	}
	public static int sumatoriaPares(int n) {
		int i = 1; 
		int suma = 0;
		while (i <= n)
		{
			if(i%2 == 0) {
				suma = suma + i;
				System.out.println(suma);
			}

			i++;
			
		}
		return suma;
	}*/
	
	//EJERCICIO 12
	/*public static void main(String[] args) {
		double base = 2;
		int exp = 3;
		potencia(base,exp);
	}
	public static double potencia(double x, int a) {
		double pot = Math.pow(x, a);
		System.out.println(pot);
		return pot;
		
	}*/
	
	//EJERCICIO 13
	/*public static void main(String [] args) {
		int num = 5;
		factorial(num);
	}
	public static double factorial(int n) {
		int factorial = 1;
		while (n != 0) {
			factorial = factorial * n ; n--;
			System.out.println(factorial);
		}
		return factorial;
	}*/
	
	// EJERCICIO 14
	/*public static void main(String[] args) {
		int num = 1234;
		cantCifras(num);
	}
	public static int cantCifras(int n) {
		if(n == 0) n++;
		System.out.println(Math.floor(Math.log10(Math.abs(n)) + 1));
		return n;
	}*/
	
	// EJERCICIO 15
	/*public static void main(String[] args) {
		int num1 = 30;
		int num2 = 8;
		esDivisible(num1,num2);
	}
	public static int esDivisible(int n, int m) {
		int div = n%m;
		if (div == 0) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
		return div;
	}*/
	
	
	// EJERCICIO 16
	/*public static void main(String[] args) {
		String cad = "hola";
		reversa(cad);
	}
	public static String reversa(String cadena) {
		String nuevaCadena = "";
		for (int i = cadena.length() - 1; i >= 0; i-- ) {
			nuevaCadena = nuevaCadena + cadena.charAt(i) ;
			
		}
		System.out.println(nuevaCadena);
		return nuevaCadena;
	}*/
	
	// EJERCICIO 17
	/* public static void main(String[] args) {
	        String texto = "banana";
	        char caracter = 'a';
	        cantidadApariciones(texto,caracter);
	 }

	    public static int cantidadApariciones(String cadena, char caracter) {
	        int posicion, contador = 0;

	        posicion = cadena.indexOf(caracter);
	        while (posicion != -1) { 
	            contador++;           
	            posicion = cadena.indexOf(caracter, posicion + 1);
	        }
	        System.out.println(contador);
	        return contador;
	   } */
	
	// EJERCICIO 18
	/*public static void main(String[] args) {
		String texto = "hola mundo";
		cantidadVocales(texto);
	}
	public static int cantidadVocales(String cadena) {
		int contador = 0;
		for(int i = 0 ; i < cadena.length() ; i++) {
			 if ((cadena.charAt(i) == 'a') || (cadena.charAt(i) == 'e') || (cadena.charAt(i) == 'i') || (cadena.charAt(i) == 'o') || (cadena.charAt(i) == 'u')){ 
			    contador++;
			  }
			}
		System.out.println(contador);
		return contador;
	} */
	
	// EJERCICIO 19
	 /*public static void main(String[] args) {
		 String fecha =ingresarTexto();
		 System.out.println("El texto es "+fecha);
		 System.out.println(esAbecedaria(fecha));
	 	}
	 @SuppressWarnings("resource")
	public static String ingresarTexto() {
	     System.out.println("Ingrese un texto");
	     return new Scanner(System.in).nextLine();
	    }
		 
	public static boolean esAbecedaria(String s) {
		 for (int i=0; i < s.length()-1;i++) {
	     if (!(s.charAt(i) <= s.charAt(i+1))) {
		     return false;       
		    }
		  }
		  return true;
		 }*/
		   
	//EJERCICIO 20
	 /*public static void main(String[] args) {
		 String fecha =ingresarTexto();
		 System.out.println("El texto es "+fecha);
		 System.out.println(esCapicua(fecha));
	    }
	    public static String ingresarTexto() {
	      System.out.println("Ingrese un texto");
	      return new Scanner(System.in).nextLine();
	    }
	    public static boolean esCapicua(String s) {
	      String nueva="";
	      for (int i=s.length()-1; i >= 0; i--) {
	        nueva=nueva+s.charAt(i);
	       }
	      System.out.println(nueva);
	      return s.equals(nueva);
	    }*/
	    
	// EJERCICIO 22
		/*public static String sinRepetidos(String s) {
			String nuevaS = "";
			for (int i = 1; i <= s.length(); i++) {
				if (s.indexOf(s.charAt(i - 1), i) == -1) {
					nuevaS = nuevaS + s.charAt(i - 1);
				}
			}
			return nuevaS;
		 	}
		 public static void main(String[] args) {
			 Scanner sc = new Scanner(System.in);
			 System.out.println("Ingrese una cadena ");
			 String cad = sc.next();
			 sc.close();
			 System.out.println("Cadena inicial " + cad);
			 String nuevaCad = sinRepetidos(cad);
			 System.out.println("Cadena final   " + nuevaCad);
		 	}*/
	
	// EJERCICIO 23
	/*public static void main(String[] args) {
			System.out.println(puedenColocarse("JUGO", "BUENO", "ANANA"));  			
	  }  
	public static boolean puedenColocarse(String a, String b, String c) {
			if(a.length() == 0 || b.length() == 0 || c.length()==0) {
					return false;
				}
			a=a.toUpperCase();
			b=b.toUpperCase();
			c=c.toUpperCase();		
			for (int i = 0; i < b.length(); i++) {
				if(a.indexOf(b.charAt(i)) != -1) {
					i++;
					for (int j=i+1; j < b.length(); j++) {
						if (c.indexOf(b.charAt(j)) != -1){
							   return true;						
						}		
					}
					return false;
					}							
				}
				return false;				
			}*/
		  
	// EJERCICIO 24
	/*public static boolean esCapicua(String s) {
		String aux="";
		for (int i=s.length()-1 ; i >= 0 ;i--) {
			aux=aux+s.charAt(i);
		}
		return aux.equals(s);
	}
	public static boolean dobleteCapicua(String s) {
		for (int i=0; i < s.length(); i++) {
			if (esCapicua(s.substring(0, i)) && esCapicua(s.substring(i))) {
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		System.out.println(dobleteCapicua("neuquenoro")); //true
		System.out.println(dobleteCapicua("banana")); //true
		System.out.println(dobleteCapicua("eter")); //true
		System.out.println(dobleteCapicua("sanas")); //true
		System.out.println(dobleteCapicua("nunca")); //false
	}*/

	//EJERCICIO 25	
	/*public static void main(String[] args) {	
		int[] lista = new int [5];
		lista[0]= 1;
		lista[1]= 3;
		lista[2]= 534;
		lista[3]= 213;
		lista[4]= 2134;
		System.out.println(maximo(lista));	
       }
       
	public static int maximo(int[] a) {
		int elemgran = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > elemgran) {
				elemgran = a[i];
			}				
		}return elemgran;		
	}*/

	//EJERCICIO 26	
	/*public static void main(String[] args) {	
		int[] lista = new int [5];
		lista[0]= 1;
		lista[1]= 3;
		lista[2]= 534;
		lista[3]= 213;
		lista[4]= 21;
		System.out.println(maximoInd(lista));
       }
		
	public static int maximoInd(int[] a) {
		int elemgran = 0;
		int posicion = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > elemgran) {
				elemgran = a[i];
				posicion = i;
			}	
		}return posicion;	
	}*/
	
	//EJERCICIO 27		
	/*public static void main(String[] args) {		
		int[] lista = new int [5];
		lista[0]= 1;
		lista[1]= 1;
		lista[2]= 1;
		lista[3]= 1;
		lista[4]= 2;
		System.out.println(suma(lista));		
       }
		
	public static int suma(int[] a) {
		int suma = 0;
		for (int i = 0; i < a.length; i++) {
				suma += a[i];
			}				
		return suma;			
	}*/

	//EJERCICIO 28 
	/*public static void main(String[] args) {
		int[] lista = new int [4];
		lista[0]= 1;
		lista[1]= 2;
		lista[2]= 3;
		lista[3]= 1;
		System.out.println(orden(lista));						
	   }
	
	public static boolean orden(int[] a) {
		int c=1; // aumento el contador porque no recorro una posicion, aun asi la comparo con su anterior
		for (int i = 0; i < a.length-1; i++) {
			if (a[i]<a[i+1]) {
				c++;
			} 			
		}
		if (c == a.length) {
			return true;
		}
		else {	
			return false;
		}
	}*/
	
	//EJERCICIO 29
	/*public static void main(String[] args) {
		
		double[] lista = new double [4];
		lista[0]= 1.10;
		lista[1]= 8.50;
		lista[2]= 10.50;
		lista[3]= 4.12;
		System.out.println(promedio(lista));
					
    }
	
	public static double promedio(double[] a) {
		double prom=0;
        double suma=0;
		for (int i = 0; i < a.length; i++) {
			 suma += a[i]; 					
			} 			
		prom = suma / a.length;	
		return prom;
		}*/
	

	// EJERCICIO 30.1
	/*public static int sumatoriaRec(int n) {
		/*if(n == 0) {
			return 0;
		}
		return n + sumatoriaRec(n-1);
		return n == 0 ? 0 : n + sumatoriaRec(n-1);

	}*/

	//EJERCICIO 30.2
	/*public static int sumatoriaParesRec(int n) {
		if(n == 2) {
			return 2;
		}
		if ( n % 2 == 0) {
			return n + sumatoriaParesRec(n-2);
		}
		return sumatoriaParesRec(n-1);
	}*/

	// EJERCICIO 30.3
	/*public static double potenciaRec(double x, int n) {
		if ( n == 0) {
			return 1;
		}
		return x * potenciaRec(x, n-1);
	}*/

	/*public static boolean esPrimo(int n) {
		int contador = 0;
		for(int i = 1; i <= n; i++){
			if( n % i == 0) {
				contador++;
			}
		}
		return contador == 2;
	}

	public static void main(String[] args) {
		int numero1 = 1;
		int numero2 = 7;
		System.out.println(cantidadPrimosEntre(numero1, numero2));
		}
	
	public static int cantidadPrimosEntre(int n, int m) {
		if (n>m) {
			return 0;
		}
		return esPrimoNo ? 1 + cantidadPrimosEntre(n+1,m): 0 + cantidadPrimosEntre(n+1,m);
		}

	public static void escalera(int n){
	if(n>0){
	System.out.print(" "+ n);
	escalera(n-1);
	}
	}

	public static void main(String[] args) {
	escalera(8);
	} */
		
	// EJERCICIO 33
	/*public static String resto(String s) {
		String nueva = "";
		for(int i = 1; i < s.length(); i++) {
			nueva = nueva + s.charAt(i);
		}
		return nueva;
	}*/

	// EJERCICIO 34
	/*public static String mostrar(String a) {
		if(a.length() == 0){
			return a;
		}
		return a.charAt(0) + "\n" + mostrar(a.substring(1)); // función resto y substring funcionan igual
		}

	// EJERCICIO 35
	public static String sinRepetirContiguos(String a) {
		if(a.length() <= 1) {
			return a;
		}
		if(a.charAt(0) == a.charAt(1)) {
			return sinRepetirContiguos(a.substring(1));
		}
		return a.charAt(0) + sinRepetirContiguos(a.substring(1));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(sinRepetirContiguos("gggeeeeeuddddduu"));
		//System.out.println(mostrar("hola"));

	}*/

	

	
	

}

