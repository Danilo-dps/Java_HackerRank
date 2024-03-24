import java.util.*;

/* Erros que demorei nesse código
 * 1 -> Atribuir o operador comulativo a uma variável recém declarada 
 * EX: int a +=;
 * 2 ->  A função da classe Math.pow retorna um valor double, por isso o casting
 */

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        
        int t=in.nextInt();
    
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
           
            for(int d = 0; d < n; d++) {
                a += ((int)Math.pow(2, d) * b);
            	
            	System.out.printf(a + " ");
            }
            System.out.println();           
        }
        
        in.close();
    }
}


