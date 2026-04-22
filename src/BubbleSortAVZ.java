public class BubbleSortAVZ {
    // Variable global
    int[] array;// tiene valor? No

    public BubbleSortAVZ(int[] arreglo){
        //1ra forma darle valor directo
        // array = new int[]{10,5,0};
        //2da forma darle valor en base a parametro.
        this.array= arreglo;
    }

    public void sortAs(boolean asc){
        int tam = array.length;
        boolean hubocambio;
        int contComparaciones=0;
        for(int i=0;i < tam -1;i++){
            hubocambio=false;
            for(int j=0; j<tam -1 -i;j++){
                if(array[j] > array[j+1]){
                    hubocambio=true;
                    //si cumple -> intercambio
                    int aux = array[j];
                    array[j]= array[j+1];
                    array[j+1]= aux;
                }
                contComparaciones++;
                
            }
            if(! hubocambio){
                    break;
                }
        }

        System.out.println("Comparaciones totales: "+ contComparaciones);
       
    }

     public void sortDes(boolean asc){
        int tam = array.length;
        boolean hubocambio;
        int contComparaciones=0;
        for(int i=0;i < tam -1;i++){
            hubocambio=false;
            for(int j=0; j<tam -1 -i;j++){
                if(array[j] < array[j+1]){
                    hubocambio=true;
            
                    //si cumple -> intercambio
                    int aux = array[j];
                    array[j]= array[j+1];
                    array[j+1]= aux;
                }
                contComparaciones++;
            }
            
            if(! hubocambio){
                    break;
                }
        }

        System.out.println("Comparaciones totales: "+ contComparaciones);
       
    }

    public static void runBubbleSortAVZ(){

    }
    public void sort(int[] array, boolean asc){
           
        if (asc){
            sortAs(asc);
        }else{
            sortDes(asc);
        }
         
    }

    public void printArray() {
        for(int i : array){
            System.out.print(i + ", ");
        }
        System.out.println();
        System.out.println();
    }
}
