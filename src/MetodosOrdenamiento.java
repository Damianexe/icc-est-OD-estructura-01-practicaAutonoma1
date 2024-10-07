import java.util.Arrays;

public class MetodosOrdenamiento {

    // Método de burbuja tradicional con errores
    // Error encontrado: El metodo retorna un arreglo vacio (return new int [] {} en
    // lugar de devolver el arreglo ordenado)
    // Correcion: Cambiar el return new int []{}, por return arreglo y que de esta
    // manera devuelva el arreglo.

    public int[] burbujaTradicional(int[] arregloOriginal) {
        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);

        int n = arreglo.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arreglo[i] > arreglo[j]) {
                    // Intercambio de elementos
                    int temp = arreglo[i];
                    arreglo[i] = arreglo[j];
                    arreglo[j] = temp;
                }
            }
        }
        return arreglo;
    }

    // Método de burbuja tradicional segundo con errores
    // Error encontrado: El arreglo se imprime de mayor a menor cuando se ejecuta,
    // error en la condicion:
    // if (arreglo [i] < arreglo [j]){
    // Corrección: Se corrigio el error el la linea 35 cambiando la condicion: if
    // (arreglo[i] > arreglo[j]) {
    public int[] burbujaTradicionalSegundo(int[] arregloOriginal) {
        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);

        int n = arreglo.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arreglo[i] > arreglo[j]) {
                    // Intercambio de elementos
                    // Estas 3 lineas NO DEBEN ser modificadas
                    int temp = arreglo[i];
                    arreglo[i] = arreglo[j];
                    arreglo[j] = temp;
                }
            }
        }

        return arreglo;

    }

    // Método de burbuja tradicional con errores
    // Error encontrado: if (arreglo[j] > arreglo[j+1]) {,
    // condicion del if y 2do error arreglo j compara las mismas posiciones[j][j], 2so for==> for (int j=0)
    // en el intercambio ==> int temp = arreglo[i], arreglo [j] = arreglo[j+1], arreglo[j+1]=temp;

    //Correcion: if (arreglo[i] > arreglo[j]) {, for (int j = i + 1; j < n; j++) {, 
    //int temp = arreglo[i];
    //arreglo[i] = arreglo[j];
    //arreglo[j] = temp;

    public int[] burbujaTradicionalTercero(int[] arregloOriginal) {

        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);

        int n = arreglo.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arreglo[i] > arreglo[j]) {
                    // Intercambio de elementos
                    int temp = arreglo[i];
                    arreglo[i] = arreglo[j];
                    arreglo[j] = temp;
                }
            }
        }
        return arreglo;
    }

    // Método de selección con errores
    // Error encontrado: No retorna nada 
    // Correccion: Se añadio return arreglo
    
    
    public int[] seleccionPrimero(int[] arregloOriginal) {

        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);

        for (int i = 0; i < arreglo.length - 1; i++) {
            int indiceMinimo = i;
            for (int j = i + 1; j < arreglo.length; j++) {
                if (arreglo[j] < arreglo[indiceMinimo]) {
                    indiceMinimo = j;
                }
            }
            int smallerNumber = arreglo[indiceMinimo];
            arreglo[indiceMinimo] = arreglo[i];
            arreglo[i] = smallerNumber;
        }
        return arreglo;
    }

    // Método de selección con errores
    // Error encontrado:for (int j = i + 1; j < arreglo.length; j--) {, (j--)
    // Correccion: for (int j = i + 1; j < arreglo.length; j++) {, SE CAMBIO J++ en el ciclo for, ya que asi aumenta las posiciones en [j].

    public int[] seleccionSegundo(int[] arregloOriginal) {

        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);
        for (int i = 0; i < arreglo.length; i++) {
            int indiceMinimo = i;
            for (int j = i + 1; j < arreglo.length; j++) {
                if (arreglo[j] < arreglo[indiceMinimo]) {
                    indiceMinimo = j;
                }
            }
            int smallerNumber = arreglo[indiceMinimo];
            arreglo[indiceMinimo] = arreglo[i];
            arreglo[i] = smallerNumber;
        }
        return arreglo;
    }

    // Método de selección con errores

    // Error encontrado: Posiciones al momento de intercambio de elementos, 
    // int smallerNumber = arreglo[i]
    //arreglo[indiceMinimo] = smallerNumber;
    // Correccion: Se cambio el argumento del arreglo como: arreglo[indiceMinimo]
    //, se cambio en arreglo la posicion [i] = smallerNumber

    public int[] seleccionTercero(int[] arregloOriginal) {

        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);
        for (int i = 0; i < arreglo.length; i++) {
            int indiceMinimo = i;
            for (int j = i + 1; j < arreglo.length; j++) {
                if (arreglo[j] < arreglo[indiceMinimo]) {
                    indiceMinimo = j;
                }
            }
            int smallerNumber = arreglo[indiceMinimo];
            arreglo[indiceMinimo] = arreglo[i];
            arreglo[i] = smallerNumber;
        }
        return arreglo;
    }


    // Método de inserción con errores
    // Error encontrado: while (i > 0 && arreglo[i] > key) {
    // Correccion: while (i >= 0 && arreglo[i] > key) {
    // Cambio de condicion > por >= 


    public int[] insercionPrimero(int[] arregloOriginal) {

        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);
        for (int j = 1; j < arreglo.length; j++) {
            int key = arreglo[j];
            int i = j-1;

            while (i >= 0 && arreglo[i] > key) {
                arreglo[i + 1] = arreglo[i];
                i--;
            }
            arreglo[i + 1] = key;
        }
        return arreglo;
    }

    // Método de inserción con errores
    // Error encontrado:
    // Correccion: 
    public int[] insercionSegundo(int[] arregloOriginal) {

        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);
        for (int j = 1; j < arreglo.length; i++) {
            int actual = arreglo[j];

            int i = j - 1;
            for (; j >= 0 && arreglo[j] > actual; j--) {
                arreglo[j + 1] = arreglo[j];
            }
            arreglo[i + 1] = actual;
        }
        return arreglo;
    }

    // Método de inserción con errores
    // Error encontrado: Variables mal colocadas, return no retorna lo correcto deberia = return arreglo;
    // Correccion: Se cambian variables y el return, int i = j-1, se agrega -1, se cambia >=, se cambia i-- por i ++
    public int[] insercionTercero(int[] arregloOriginal) {

        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);
        for (int j = 1; j < arreglo.length; j++) {
            int key = arreglo[j];
            int i = j-1;

            while (i >= 0 && arreglo[i] > key) {
                arreglo[i + 1] = arreglo[i];
                i--;
            }
            arreglo[i + 1] = key;
        }
        return arreglo;
    }

}
