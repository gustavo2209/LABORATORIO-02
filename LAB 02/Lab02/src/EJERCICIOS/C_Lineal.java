
package EJERCICIOS;

public class C_Lineal {

    public static void main(String[] args) {
        
        System.out.println("COMPLEJIDAD LINEAL:\n");
        
        System.out.println("CONTADOR\n");
        
        int n = 50;
        
        loop(n);
        
        int numeros[] = { 10, 18, 29, 1, 0, 75, 79 };
        
        int n_buscar = 76;
                    
        boolean encontrado = buscar(n_buscar, numeros);
        
        String nr = "";
        
        for (int i = 0; i < numeros.length; i++) {
            
            nr += numeros[i] + ",";
            
        }
        
        System.out.println("\n-------------------------------------------");
        
        System.out.println("\nARREGLO:\n\n" + nr + "\n");

        if(encontrado == true)
        
            System.out.println("El número " + n_buscar + " fue encontrado en el arreglo");
        
        else
            
            System.out.println("No se encontró el número " + n_buscar + " en el arreglo");
        
        System.out.println("\n--------------------------------------------");
        
        System.out.println("\nFACTORIAL:\n");
        
        int fact = 10;
        
        System.out.println("El factorial de " + fact + " es: " + factorial(fact));
        
        System.out.println("\n---------------------------------------------");
        
        System.out.println("\nSERIE DE FIBONACCI:\n");
        
        int nFibonacci = 80;
        
        for (int i = 1; i <= nFibonacci; i++) {
            
            System.out.println(fibonacci(i));
            
        }
        
    }
    
    static void loop(long n){
        
        int contador = 1;
        
        while(contador <= n){
            
            System.out.println(contador);
            
            contador++;
            
        }
    }
    
    static boolean buscar(int n, int arreglo[]){
        
        for (int item : arreglo) {
            
            if(item == n)
                
                return true;
            
        }
        
        return false;
        
    }
    
    static long factorial(int n){
        
        if(n == 1)
            
            return 1;
        
        return n * factorial(n - 1);
        
    }
    
    static long fibonacci(long n){
        
        if(n < 0)
            
            System.out.println("No puede ser menor a cero");
        
        if(n <= 2)
            
            return 1;
        
        long fibonacci = 0;
        long previo = 1;
        long penultimo = 0;
        
        for(int i = 1; i <= n; i++){
            
            penultimo = fibonacci;
            fibonacci = previo + fibonacci;
            previo = penultimo;
            
        }
        
        return fibonacci;
    }
    
}
