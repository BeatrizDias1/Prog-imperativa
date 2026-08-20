import java.util.Scanner;
public class tabuada {
   
        public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);

        System.out.println("Digite um número para mostrar a tabuada");
        int n1=entrada.nextInt();
        for (int i=1; i<=10; i+=1){
            System.out.println(n1 + " x " + i + " = " + (n1*i));
        }
       

      

       
     
       

        entrada.close();
       
            }

}

