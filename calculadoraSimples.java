import java.util.Scanner;

public class calculadoraSimples {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);

        System.out.println("Digite dois números inteiros para somar, subtrair, multiplicar e dividir");
        int n1=entrada.nextInt();
        int n2=entrada.nextInt();

        System.out.println("A soma é " +(n1+n2));
        
        System.out.println("A subtração é " +(n1-n2));
        
        System.out.println("A multiplicação é " +(n1*n2));
        
        if(n2!= 0)
        System.out.println("A divisão é " +(n1/n2));

        else 
            System.out.println("Seu denominador é 0, não podemos dividir");








        entrada.close();
    }
}