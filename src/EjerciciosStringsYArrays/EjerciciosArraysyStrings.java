package EjerciciosStringsYArrays;

public class EjerciciosArraysyStrings {

	//EJERCICIO STRINGS 1
	/*public static void main(String[] args) {
		System.out.println(Funciones.cantidadLet("holaaaaa", 'a'));			
	}*/
	
	//EJERCICIO STRINGS 2 
	/*public static void main(String[] args) {
		System.out.println(Funciones.compuestaPor("eaaaaa", 'a'));				
	}*/
	
	//EJERCICIO STRINGS 3
	/*public static void main(String[] args) {
		System.out.println(sonIguales("hola", "hola"));				
	}
	
	public static boolean sonIguales(String a, String b) {
		if (a.equals(b)) {
			return true;
		}
		return false;	
	}*/

	//EJERCICIO STRINGS 4 (R)
	/*public static void main(String[] args) {
		System.out.println(esDuodroma("ssaabb"));					
	}
	public static boolean esDuodroma(String a) {
		int cont = 1;
		for (int i = 0; i < a.length()-1; i++) {
			if(a.charAt(i)==a.charAt(i+1)){
				cont++;
				System.out.println(i);
				}		
			if(i%2==0) {
				i++;	
			}	
			}					
		if (cont==a.length()) {
			return true;		
		}
		return false;	
	}*/

	//EJERCICIO STRINGS 5 	
	/*public static void main(String[] args) {
		System.out.println(esPrefijo("insoportable","in"));					
	}
	public static boolean esPrefijo(String a, String b) {
		if (a.substring(0, b.length()).equals(b)){
			return true;
		}
	    return false;
	}*/
	
	//EJERCICIO STRINGS 6		
	/*public static void main(String[] args) {
		System.out.println(esPrefijo("insoportable","soportable", 2));				
	}
	
	public static boolean esPrefijo(String a, String b, int pos) {
		if (a.substring(pos, a.length()).equals(b)){
			return true;
		}
	    return false;
	}*/	
	
	//EJERCICIO STRINGS 7		
	/*public static void main(String[] args) {
		System.out.println(esSubcadena("soportable","insoportable"));
					
	}
	public static boolean esSubcadena(String a, String b) {
	     return b.contains(a);	
		}*/

	//EJERCICIO ARRAYS 1		
	/*public static void main(String[] args) {
		int[] lista = {1,2,3,4,5};
    }
	
	public static void imprimir(int[] a){
		System.out.print("[");
		for (int i = 0; i < a.length; i++){
			System.out.print(a[i]+", ");			
		}
		System.out.print(a[a.length-1]+"");
		System.out.print("]");
		System.out.println();
	}*/

	//EJERCICIO ARRAYS 2	
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
			int max = 0;
			for (int i = 0; i < a.length; i++) {
				if (a[i] > max) {
					max = a[i];
				}				
			}return max;			
		}*/
	
	//EJERCICIO ARRAYS 3
	/*public static void main(String[] args) {
		int[] l = {1,2,3,4,5};
		int x = 6;
		imprimir(l);
    }
	
	public static int[] agregarAtras(int[] a , int x){
		 int [] n = new int[a.length + 1];
         for (int i = 0; i < a.length; i++)
         {
           n[i] = a[i];
		 }
         n[a.length+1]=x;
         return n;
	}
	public static void imprimir(int[] a){
		System.out.print("[");
		for (int i = 0; i < a.length; i++){
			System.out.print(a[i]+", ");			
		}
		System.out.print(a[a.length-1]+"");
		System.out.print("]");
		System.out.println();
	}*/
	
	//EJERCICIO ARRAYS 4	
	/*public static void main(String[] args) {
		int[] l = {1,2,3,4,5};
		int x = 3;
		imprimir(quitar(l, x));
    }
	
	public static int[] quitar(int[] a , int pos){
		 int [] n = new int[a.length-1];
         for (int i = 0; i < pos ; i++)
         {
        	  n[i] = a[i];
          }
         for (int i = pos; i < n.length; i++)
         {
        	 n[i] = a[i+1];
		 }
         return n;
	}

	public static void imprimir(int[] a){
		System.out.print("[");
		for (int i = 0; i < a.length - 1; i++){
			System.out.print(a[i]+", ");			
		}
		System.out.print(a[a.length-1]+"");
		System.out.print("]");
		System.out.println();
	}*/

	//EJERCICIO ARRAYS 5  	
	/*public static void main(String[] args) {
		int[] l = {1,2,3,4};
		imprimir(reverso(l));
    }	
	
	public static int[] reverso(int[] a){
		 int [] n = new int[a.length];
		 int cont=0;
		 for (int i = a.length-1;i >= 0;i--) {
			 n[cont]=a[i];
			 cont++;		 		 
		 }
		return n;
	}
	
	public static void imprimir(int[] a){
		System.out.print("[");
		for (int i = 0; i < a.length - 1; i++){
			System.out.print(a[i]+", ");			
		}
		System.out.print(a[a.length-1]+"");
		System.out.print("]");
		System.out.println();
	}*/

	//EJERCICIO ARRAYS 6 (R)
	/*public static void main(String[] args) {
		int[] l = {1,2,3,4};
		revertir(l);
    }	
	
	public static void revertir(int[] a){
		 int cont=0;
		 for (int i = a.length-1;i >= 0;i--) {
			a[cont]=a[i];
			 cont++;
		 }
		 imprimir(a);
	}
	
	public static void imprimir(int[] a){
		System.out.print("[");
		for (int i = 0; i < a.length - 1; i++){
			System.out.print(a[i]+", ");			
		}
		System.out.print(a[a.length-1]+"");
		System.out.print("]");
		System.out.println();
	}*/

	//EJERCICIO ARRAYS 7 (R)
	/*public static void main(String[] args) {
		int[] l = {-1,2,3,4};
		imprimir(opuestos(l));
    }	
	
	public static int[] opuestos(int[] a){
		 int [] n = new int[a.length];
		 for (int i = 0;i < a.length;i++) {
             if (a[i] > 0){
            	 n[i]=-a[i];
             }
             else{
            	 n[i]=+a[i];
             }
		 }
		 return n;
	}
	
	public static void imprimir(int[] a){
		System.out.print("[");
		for (int i = 0; i < a.length - 1; i++){
			System.out.print(a[i]+", ");			
		}
		System.out.print(a[a.length-1]+"");
		System.out.print("]");
		System.out.println();
	}*/
	
	//EJERCICIO ARRAYS 8 (R)	
	/*public static void main(String[] args) {
		int[] l = {-1,2,3,4};
		oponer(l);
    }	
	
	public static void oponer(int[] a){
		 for (int i = 0;i < a.length;i++) {
             if (a[i] > 0){
            	 a[i]=-a[i];
             }
             else{
            	 a[i]=+a[i];
             }
		 }
		 imprimir(a);
	}
	
	public static void imprimir(int[] a){
		System.out.print("[");
		for (int i = 0; i < a.length - 1; i++){
			System.out.print(a[i]+", ");			
		}
		System.out.print(a[a.length-1]+"");
		System.out.print("]");
		System.out.println();
	}*/

	//EJERCICIO ARRAYS 9
	/*public static void main(String[] args) {
		int[] l = {1,2,3,4};
		int c = 3;
		System.out.println(divisores(l, c));
    }	
	
	public static boolean divisores(int[] a, int n){
		 int cont = 0;
		 for (int i = 0;i < a.length;i++) {
             if (a[i] % n == 0){
            	 cont++;
             }
         if (cont==a.length) {
        	 return true;
         }   
		}
		return false;
	}
	
	public static void imprimir(int[] a){
		System.out.print("[");
		for (int i = 0; i < a.length - 1; i++){
			System.out.print(a[i]+", ");			
		}
		System.out.print(a[a.length-1]+"");
		System.out.print("]");
		System.out.println();
	}*/
	
	//EJERCICIO ARRAYS 10	
	/*public static void main(String[] args) {
			int[] l = {2,2,2,3,4,3,5,1,5,2};
			System.out.println(cantRep(l));
	   }
		
	public static int cantRep(int[] a){
			 int cont= 0;
	         for (int i = 0; i < a.length ; i++)
	         {
	        	  for (int x = i+1; x < a.length; x++){
	        	    if (a[i] == a[x]){	  
	        	    	cont++; 
	        	    	break;
	        	  }
	        	  }
	         }
	        return cont;
	}*/
	
	//EJERCICIO ARRAYS 11 (R)
	/*public static void main(String[] args) {
			int[] l = {2,2,2,3,4,3,5,1,5,2};
			imprimir(sinRep(l));
	    }
		
	public static int[] sinRep(int[] a){
			 int [] n = new int[a.length];
	         for (int i = 0; i < a.length ; i++)
	         {
	        	  for (int x = i+1; x < a.length; x++){
	        	    if (a[i] != a[x]){	 
	        	    	n[i]=a[i];		        	    		
	        	  }
	        	  }
	          }
	         return n;
		}
		
	public static void imprimir(int[] a){
		System.out.print("[");
		for (int i = 0; i < a.length - 1; i++){
			System.out.print(a[i]+", ");			
		}
		System.out.print(a[a.length-1]+"");
		System.out.print("]");
		System.out.println();
	}*/
		
	//EJERCICIO ARRAYS 12
	/*public static void main(String[] args) {
		int[] l = {1,2,3};
		int[] c = {4,5,6,7};
		imprimir(concatenar(l, c));
    }
	
	public static int[] concatenar(int[] a, int[] b){
		 int [] n = new int[a.length + b.length];
         for (int i = 0; i < a.length ; i++)
         {
        	 n[i]=a[i];		
         }     
         for (int i = 0; i < b.length;i++) {
        	 n[a.length+i]=b[i];        	 
        }
		return n;  
	}
	
	public static void imprimir(int[] a){
	System.out.print("[");
	for (int i = 0; i < a.length - 1; i++){
		System.out.print(a[i]+", ");			
	}
	System.out.print(a[a.length-1]+"");
	System.out.print("]");
	System.out.println();
	}*/

	
}
