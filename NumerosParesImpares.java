import java.util.Scanner;
public class NumerosParesImpares {
   
     public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);

        System.out.println("Digite seu dois números para que eu mostre os números pares e ímpares entre eles");
        int n1=entrada.nextInt();
        int n2=entrada.nextInt();

        for(int i=n1; i<n2;i+=1){
            if (i%2==0){
                System.out.println("Números pares: "+i);
            }
        }
        for(int i=n1; i<n2;i+=1){
            if (i%2!=0){
                System.out.println("Números ímpares: "+i);
            }
        }
     
       

        entrada.close();
       
            }

}