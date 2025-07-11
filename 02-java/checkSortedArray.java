
public class checkSortedArray {
    public static boolean checkArray(int array[],int idx){
if(idx == array.length - 1){
    return true;
}

if (array[idx] > array[idx +1]) {
    return false;
} else {
    
    return checkArray(array, idx + 1);
}
    }
    public static void main(String[] args) {
        int array[] ={1,2,3,4,5};

      System.out.println( checkArray(array, 0));
        
    }
}
