public class App {
    public static void main(String[] args) throws Exception {
        int[] numeros={10,0,-5,5,15,2};
        runBubblesort();
    }

    public static void runBubblesort(){
        System.out.println("Metodo Burbuja");
        //Instancia de la clase
        int[] numeros={-5,10,2,0,7};
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.printArreglo(numeros);
        // bubbleSort.sortAscendente(numeros);
        // bubbleSort.printArreglo(numeros);
        // bubbleSort.sortDescendente(numeros);
        // bubbleSort.printArreglo(numeros);
        bubbleSort.sort(numeros,true);
        bubbleSort.printArreglo(numeros);
        bubbleSort.sort(numeros,false);
        bubbleSort.printArreglo(numeros);
    }
}
