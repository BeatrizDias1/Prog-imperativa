import java.util.Scanner;

public class exercicioContadorVogal {
    public static int contaVogal (String palavra){
         
       int cont=0;
        
    
      for (int i=0; i < palavra.length(); i+=1) {
        if(palavra.charAt(i)=='a'||palavra.charAt(i)=='e'||palavra.charAt(i)=='i'||palavra.charAt(i)=='o'||palavra.charAt(i)=='u'){
           cont++;
        }
          
        
      }
      
         return cont;


    
    
    }
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        System.out.println("digite a palavra e eu direi quantas vogais tem");
        String palavra=entrada.nextLine();
       

     


     

        System.out.println("a quantidade de vogais é: " + contaVogal(palavra) );

        entrada.close();

    }
}
