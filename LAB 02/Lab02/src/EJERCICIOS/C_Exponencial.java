
package EJERCICIOS;

public class C_Exponencial {

    public static void main(String[] args) {
        
        int n = 10;
        
        System.out.println("COMPLEJIDAD EXPONENCIAL:\n\nSERIE DE FIBONACCI\n");
        
        for (int i = 1; i <= n; i++) {
            
            System.out.println(Fibonacci(i));
            
        }
        
    }
    
    public static int Fibonacci(long n){
        
        if(n < 0)
            
            System.out.println("NO PUEDE SER MENOR QUE CERO");
        
        if(n <= 2)
            
            return 1;
        
        return Fibonacci(n - 1) + Fibonacci(n - 2);
        
    }
    
}
