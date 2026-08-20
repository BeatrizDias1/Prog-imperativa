import java.util.Scanner;

public class CalculoIRRF {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite seu salário bruto para que eu calcule sua contribuição:");
        double n1 = entrada.nextDouble();

        double contribui = 0;

       
        double salarioINSS = Math.min(n1, 8475.55);

       
        if (salarioINSS > 4354.27) {
            contribui = (0.14 * salarioINSS) - 198.49;
        } else if (salarioINSS >= 2902.85) {
            contribui = (0.12 * salarioINSS) - 111.40;
        } else if (salarioINSS >= 1621.01) {
            contribui = (0.09 * salarioINSS) - 24.32; 
        } else {
            contribui = 0.075 * salarioINSS;
        }

      
        double baseIRRF = n1 - contribui;
        double irrf = 0;

    
        if (n1 > 5000.00) {
            if (baseIRRF <= 2428.80) {
                irrf = 0.0;
            } else if (baseIRRF <= 2826.65) {
                irrf = (baseIRRF * 0.075) - 182.16;
            } else if (baseIRRF <= 3751.05) {
                irrf = (baseIRRF * 0.15) - 394.16;
            } else if (baseIRRF <= 4664.68) {
                irrf = (baseIRRF * 0.225) - 675.49;
            } else {
                irrf = (baseIRRF * 0.275) - 908.73;
            }

            irrf = Math.max(0, irrf);

         
            if (n1 <= 7350.00) {
                double reducao = 978.62 - (0.133145 * n1);
                irrf = Math.max(0, irrf - reducao);
            }
        }

      

      
        System.out.printf("Sua contribuição INSS será de: R$%.2f%n", contribui);
        System.out.printf("Seu desconto de Imposto de Renda será de: R$%.2f%n", irrf);
       
        entrada.close();
    }
}