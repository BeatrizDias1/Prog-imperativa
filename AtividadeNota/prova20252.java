public class prova20252 {

    
    public static int uniao(int[] a, int tamA, int[] b, int tamB, int[] u) {
        int cont = 0;

        for (int i = 0; i < tamA; i++) {
            if (!busca(u, cont, a[i])) {
                u[cont] = a[i];
                cont++;
            }
        }

        for (int i = 0; i < tamB; i++) {
            if (!busca(u, cont, b[i])) {
                u[cont] = b[i];
                cont++;
            }
        }

        return cont; 
    }

    public static boolean busca(int[] v, int tam, int x) {
        for (int i = 0; i < tam; i++) {
            if (v[i] == x) {
                return true;
            }
        }
        return false;
    }

    
    public static void ordenar(int[] v, int n) {       
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

  
    public static void rotacionar(int[] v, int tam, int k) {
        for (int i = 1; i <= k; i += 1) {
            inserirOrdenado(v, tam);
        }
    }

    public static void inserirOrdenado(int[] v, int n) {
        int aux = 0;
        for (int i = 1; i < n; i += 1) {
            aux = v[0];
            v[i - 1] = v[i];
            v[v.length - 1] = aux;
        }
    }

   
    public static void main(String[] args) {
        System.out.println("=== Questão 1 ===");
        int[] A = {1, 5, 4, 7};
        int[] B = {7, 3, 1, 9};
        int[] uniao = new int[A.length + B.length];
        int contUniao = uniao(A, A.length, B, B.length, uniao);
        for (int i = 0; i < contUniao; i++) {
            System.out.println(uniao[i]);
        }

        System.out.println("\n=== Questão 2 ===");
        int[] vetorQ2 = {9, 7, 4, 6, 7, 3, 8, 2, 5};
        ordenar(vetorQ2, vetorQ2.length);
        for (int i = 0; i < vetorQ2.length; i += 1) {
            System.out.println(vetorQ2[i]);
        }

        System.out.println("\n=== Questão 3 ===");
        int[] vQ3 = {1, 4, 2, 3, 4, 6, 5, 6};
        int[] nQ3 = new int[vQ3.length];
        int qtdUnicos = gerarVetorSemRepeticao(vQ3, vQ3.length, nQ3);
        for (int i = 0; i < qtdUnicos; i++) {
            System.out.println(nQ3[i]);
        }

        System.out.println("\n=== Questão 4 ===");
        int[] vetorQ4 = {1, 2, 3, 4, 5};
        inserirOrdenado(vetorQ4, 2);
        for (int i = 0; i < vetorQ4.length; i += 1) {
            System.out.println(vetorQ4[i]);
        }
    }
} 
    

