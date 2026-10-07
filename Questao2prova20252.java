public class Questao2prova20252 {
    public static void ordenar(int []v, int n){       
        int chave;
        int j;
        for (int i = 1; i <= n - 1; i += 1) {
            chave = v[i];
            j = i - 1;
            while (j >= 0 && chave < v[j]) {
                v[j + 1] = v[j];
                j -= 1;
            }
            v[j + 1] = chave;
        }
    
    }
    public static void main (String[] args){

        int[] vetor = {9,7,4,6,7,3,8,2,5};

        ordenar(vetor,vetor.length);

        for (int i =0;i<vetor.length;i+=1){
            System.out.println(vetor[i]);
        }



    }
}
