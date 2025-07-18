
class bubbleSort {
    public static void main(String[] args) {
        // int[] array = new int[5];
        // int array[] = new int[5] ;
        int array[] = { 56, 34, 10, 6, 38 };

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                for (int k = j + 1; k < j + 2; k++) {
                    if (array[j] > array[k]) {
                        // using 3rd variable
                        int c = array[j];
                        array[j] = array[k];
                        array[k] = c;
                    }
                }
            }
        }
        System.out.println(" ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
