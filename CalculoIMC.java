import java.util.Scanner;
public class CalculoIMC {

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);

        System.out.println("Digite seu peso (em Kg) e depois sua altura (em metros) para que eu calcule seu IMC");
        double n1=entrada.nextDouble();
        double n2=entrada.nextDouble();
        double imc = n1/(n2*n2);

        
        if(imc > 40)
        System.out.println("Sua classificação é: Obesidade grau III");

        else if (imc>= 35 )
           System.out.println("Sua classificação é: Obesidade grau II");
        else if (imc>= 30 )
           System.out.println("Sua classificação é: Obesidade grau I");
        else if (imc>= 25 )
           System.out.println("Sua classificação é: Sobrepeso");
        else if (imc>= 18.5 )
           System.out.println("Sua classificação é: Normal");
        else 
           System.out.println("Sua classificação é: Magreza");












        entrada.close();
    }
}

