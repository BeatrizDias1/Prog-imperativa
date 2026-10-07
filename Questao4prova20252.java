public class Questao4prova20252 {
    public static void rotacionar (int []v,int tam,int k){
        for (int i =1;i<=k;i+=1){
            inserirOrdenado(v, tam);
        }
    }
    public static void inserirOrdenado(int[]v, int n){
        int aux =0;
        for(int i =1;i<n;i+=1){
            aux = v[0];
            v[i-1]=v[i];
            v[v.length-1]=aux;
        }
    }
    public static void main(String[] args) {
        int [] vetor = {1,2,3,4,5};

        inserirOrdenado(vetor, 2);

        for(int i=0;i<vetor.length;i+=1){
            System.out.println(vetor[i]);
        }
    }
    
}
