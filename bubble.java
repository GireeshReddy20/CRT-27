public class bubble {
    public static int bubbleSortAscending(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i-1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return n;
    }

        public static void main (String[]args){
            int[] arr = {20, 50, 40, 30, 60};
            bubbleSortAscending(arr);
            System.out.println("sorted array in order");
            for (int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();

        }

}