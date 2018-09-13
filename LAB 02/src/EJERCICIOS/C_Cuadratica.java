
package EJERCICIOS;

public class C_Cuadratica {

    public static void main(String[] args) {
        
        int n = 10;
        
        System.out.println("COMPLEJIDAD CUADRÁTICA:\n\nPAREJAS\n");
        
        parejas(n);
        
    }
    
    public static void parejas(int n){
        
        int x = 1;
        
        while(x <= n){
            
            int y = 1;
            
            while(y <= n){
                
                System.out.println(x + "," + y);
                
                y++;
                
            }
            
            x++;
            
        }
        
    }
    
}
