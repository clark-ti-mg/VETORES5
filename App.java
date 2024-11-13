public class App {

    public static void imprimeVetorOrdemCrescente(Integer[] v) {
        System.out.print("\n[");
        for (int i = 0; i < v.length; i++) {
            int indiceDoMenor = -1;
            Integer menor = null;

            for (int j = 0; j < v.length; j++) {
                if ((v[j] != null) && (menor == null || v[j] < menor)) {
                    indiceDoMenor = j;
                    menor = v[indiceDoMenor];

                }

            }

            if (indiceDoMenor != -1) {
                v[indiceDoMenor] = null;
                if (i == v.length - 1) {
                    System.out.print(menor + "]");
                } else {
                    System.out.print(menor + ", ");
                }

            }

        }
    }

    public static void main(String[] args) throws Exception {
        Integer[] v = { 55, 1, -10, 13, 96, 88, 10 };

        System.out.println("\nVetor de inteiros em ordem crescente:");
        imprimeVetorOrdemCrescente(v);
    }
}
