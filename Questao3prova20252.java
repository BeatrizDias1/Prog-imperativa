public class Questao3prova20252 {

    public static int gerarVetorSemRepeticao(int[] v, int tamV, int[] vsr) {
        int j = 0;
        for (int i = 0; i < tamV; i++) {
         
            if (!repetido(vsr, j, v[i])) {
                vsr[j] = v[i];
                j++;
            }
        }
        return j; 
    }

  
    public static boolean repetido(int[] v, int tam, int x) {
        for (int i = 0; i < tam; i++) {
            if (v[i] == x) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] v = {1, 4, 2, 3, 4, 6, 5, 6};
        int[] n = new int[v.length];

        int qtdUnicos = gerarVetorSemRepeticao(v, v.length, n);

      
        for (int i = 0; i < qtdUnicos; i++) {
            System.out.println(n[i]);
        }
    }
}