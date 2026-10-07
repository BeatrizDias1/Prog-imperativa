public class prova20252 {

    public static int uniao(int[] a, int tamA, int[] b, int tamB, int[] u) {
        int cont = 0;

        for (int i = 0; i < tamA; i += 1) {
            if (!busca(u, cont, a[i])) {
                u[cont] = a[i];
                cont++;
            }
        }

        for (int i = 0; i < tamB; i += 1) {
            if (!busca(u, cont, b[i])) {
                u[cont] = b[i];
                cont++;
            }
        }

        return cont;
    }

    public static boolean busca(int[] v, int tam, int x) {
        for (int i = 0; i < tam; i += 1) {
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
        for (int i = 0; i < tamV; i += 1) {
            if (!busca(vsr, j, v[i])) {
                vsr[j] = v[i];
                j++;
            }
        }
        return j;
    }

    public static void rotacionarUma(int[] v, int tam) {
        int aux = v[0];
        for (int i = 1; i < tam; i += 1) {
            v[i - 1] = v[i];
        }
        v[tam - 1] = aux;
    }

    public static void rotacionar(int[] v, int tam, int k) {
        if (k > 0) {
            for (int i = 0; i < k; i += 1) {
                rotacionarUma(v, tam);
            }
        } else {
            for (int i = 0; i < -k * (tam - 1); i += 1) {
                rotacionarUma(v, tam);
            }
        }
    }

    public static void imprimir(int[] v, int tam) {
        System.out.print("{");
        for (int i = 0; i < tam; i += 1) {
            System.out.print(v[i]);
            if (i < tam - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("}");
    }

    public static void main(String[] args) {
        System.out.println("Questao 1");
        int[] A = {1, 5, 4, 7};
        int[] B = {7, 3, 1, 9};
        int[] u = new int[A.length + B.length];
        int cont = uniao(A, A.length, B, B.length, u);
        for (int i = 0; i < cont; i += 1) {
            System.out.println(u[i]);
        }

        System.out.println();
        System.out.println("Questao 2");
        int[] vetor = {9, 7, 4, 6, 7, 3, 8, 2, 5};
        ordenar(vetor, vetor.length);
        for (int i = 0; i < vetor.length; i += 1) {
            System.out.println(vetor[i]);
        }

        System.out.println();
        System.out.println("Questao 3");
        int[] v = {1, 4, 2, 3, 4, 6, 5, 6};
        int[] n = new int[v.length];
        int qtdUnicos = gerarVetorSemRepeticao(v, v.length, n);
        for (int i = 0; i < qtdUnicos; i += 1) {
            System.out.println(n[i]);
        }

        System.out.println();
        System.out.println("Questao 4");
        int[] v1 = {1, 2, 3, 4, 5};
        System.out.print("Antes:  ");
        imprimir(v1, v1.length);
        rotacionar(v1, v1.length, 2);
        System.out.print("Depois: ");
        imprimir(v1, v1.length);

        System.out.println();

        int[] v2 = {1, 2, 3, 4, 5};
        System.out.print("Antes:  ");
        imprimir(v2, v2.length);
        rotacionar(v2, v2.length, -1);
        System.out.print("Depois: ");
        imprimir(v2, v2.length);
    }
}