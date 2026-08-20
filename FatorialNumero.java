import java.util.Scanner;
public class FatorialNumero{
   
     public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);

        System.out.println("Digite um número para mostrar o fatorial");
        int n1=entrada.nextInt();
        int contador = 1;
        int fatorial = 1;

        while (contador <= n1) {
            fatorial=fatorial*contador;
            contador+=1;

        }

        System.out.println("O fatorial do número " + n1 + " é: " + fatorial);
      

       
     
       

        entrada.close();
       
            }

}