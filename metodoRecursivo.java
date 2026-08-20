import java.util.Scanner;
public class metodoRecursivo {
    

    public static int fatorial (int numero){
        
        if(numero == 0 || numero == 1) {
            return 1;

        } else {
            return numero * fatorial(numero -1);
        }
    }
    public static void main (String [] args){
       
       Scanner entrada = new Scanner (System.in);

       System.out.println("DIGITE o numero para fatorar: ");
       int numero = entrada.nextInt();

       int fatorado = fatorial(numero);

       System.out.println("Seu fatorial é: " + fatorado);

       entrada.close();



    }
}