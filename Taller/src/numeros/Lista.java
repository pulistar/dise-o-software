package numeros;

public class Lista {
	
    public static void ordenar(int[] arreglo) {
        int n = arreglo.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arreglo[j] < arreglo[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arreglo[minIndex];
            arreglo[minIndex] = arreglo[i];
            arreglo[i] = temp;
        }
    }

   
    public static boolean buscar(int[] arreglo, int numero) {
        for (int num : arreglo) {
            if (num == numero) {
                return true;
            }
        }
        return false;
    }
}

