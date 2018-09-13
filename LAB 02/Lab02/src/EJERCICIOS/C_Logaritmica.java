
package EJERCICIOS;

public class C_Logaritmica {

    public static void main(String[] args) {
        
        int numeros [] = {1, 3, 3, 7, 10, 11, 16, 17, 20, 21, 25, 26, 30, 32, 34 , 35};
        
        System.out.println("COMPLEJIDAD LOGARÍTMICA:\n\nBÚSQUEDA BINARIA\n");
        
        for (int i = 0; i < numeros.length; i++) {
            
            System.out.println("numeros[" + i + "]: " + numeros[i]);
            
        }
        
        int x = 21;
        
        int resultado = buscar(numeros, x);
        
        System.out.println("");
        
        if(resultado != -1)
            
            System.out.println("El número " + x + " fue encontrado en la posición: " + resultado);
        
        else
            
            System.out.println("El número " + x + " no se encuentra en el arreglo o no esta ordenado");
        
    }
    
    static int buscar(int [] arreglo, int dato){
        
        int inicio = 0;
        
        int fin = arreglo.length - 1;
        
        int pos;
        
        while(inicio <= fin){
            
            pos = (inicio + fin) / 2;
            
            if(arreglo[pos] == dato)
                
                return pos;
            
            else if(arreglo[pos] < dato)
                
                inicio = pos + 1;
            
            else
                
                fin = pos - 1;
            
        }
        
        return -1;
        
    }
}
