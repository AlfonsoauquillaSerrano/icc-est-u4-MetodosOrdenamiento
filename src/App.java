public class App {
    public static void main(String[] args) throws Exception {
        // int[] numeros={10,0,-5,5,15,2};
        // runBubblesort();
        
        runBubblesortAVZ();
    }

    // public static void runBubblesort(){
        // System.out.println("Metodo Burbuja");
        //Instancia de la clase
        //  int[] numeros={-5,10,2,0,7};
        //  BubbleSort bubbleSort = new BubbleSort();
        // bubbleSort.sortAscendente(numeros);
        // bubbleSort.printArreglo(numeros);
        // bubbleSort.sortDescendente(numeros);
        // bubbleSort.printArreglo(numeros);
    //     bubbleSort.sort(numeros,true);
    //     bubbleSort.printArreglo(numeros);
    //     bubbleSort.sort(numeros,false);
    //     bubbleSort.printArreglo(numeros);
    // }

     public static void runBubblesortAVZ(){
        System.out.println("Metodo Burbuja 2");
        //Instancia de la clase
       int[] array= new int[] {9,2,3,0,8,5,10,57,100};
        BubbleSortAVZ bubbleSortAVZ = new BubbleSortAVZ(array);
    
        bubbleSortAVZ.printArray();
        bubbleSortAVZ.sortAs(true);
        bubbleSortAVZ.printArray();
        bubbleSortAVZ.sortDes(false);
        bubbleSortAVZ.printArray();
    }
}
