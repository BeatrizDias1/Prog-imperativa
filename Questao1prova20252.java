public class Questao1prova20252 {

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

    public static void main(String[] args) {
        int[] A = {1, 5, 4, 7};
        int[] B = {7, 3, 1, 9};

        int[] uniao = new int[A.length + B.length];
        
        int cont = uniao(A, A.length, B, B.length, uniao);

   
        for (int i = 0; i < cont; i++) {
            System.out.println(uniao[i]);
        }

    
    }
}