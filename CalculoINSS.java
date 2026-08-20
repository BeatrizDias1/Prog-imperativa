import java.util.Scanner;
public class CalculoINSS {

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);

        System.out.println("Digite seu salário bruto para que eu calcule sua contribuição");
        double n1=entrada.nextDouble();
       
        double contribui=0;
       

        
        if(n1 > 4354.27){
        contribui=(0.14*n1)-198.49;
        System.out.printf("Sua contribuição será de: R$%.2f%n", contribui);
        System.out.printf("Seu salário líquido é: R$%.2f%n", (n1-contribui));
        }
        else if (n1>=2902.85){
             contribui=(0.12*n1)-111.40;
            System.out.printf("Sua contribuição será de: R$%.2f%n", contribui);
            System.out.printf("Seu salário líquido é: R$%.2f%n", (n1-contribui));
        }
        else if (n1>= 1621.01 ){
            
            contribui=(0.9*n1)-24.32;
            System.out.printf("Sua contribuição será de: R$%.2f%n", contribui);
            System.out.printf("Seu salário líquido é: R$%.2f%n", (n1-contribui));
        }
        else {
            contribui=0.075*n1;
            System.out.printf("Sua contribuição será de: R$%.2f%n", contribui);
            System.out.printf("Seu salário líquido é: R$%.2f%n", (n1-contribui));
        
        }









       entrada.close();
    }
}
