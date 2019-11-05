public class Arr {
    public static void printArray(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    public static void fillarray(int arr[], int min, int max){
        for (int i = 0; i < arr.length; i++) {
            arr[i]= min+(int)(Math.random()*(max-min+1));
        }
    }
    public static void sortbubble(int arr[]) {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void maxArray(int arr[]) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) max = arr[i];
        }
        System.out.println("max: " + max);
    }
    public static void minArray(int arr[]) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) min = arr[i];
        }
        System.out.println("min: " + min);
    }
    public static void sumArray(int arr[]) {
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total +=arr[i];
        }
        System.out.println("sum is: " +total);
    }
    public static void reverseArray(int arr[]) {
        int []
        for (int i = 0; i < arr.length/2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
            System.out.println(arr[i]);
        }
    }
    public static void averageArray(int arr[]) {
        double average =0;
        if (arr.length > 0) {
            double sum=0;
            for (int i = 0; i < arr.length; i++) {
                sum +=arr[i];
            }
            average = sum /arr.length;
        }
        System.out.println("average is: " +average);
    }
    public static void ssortArray(int arr[]) {
        int min, temp;
        for (int i = 0; i < arr.length-1; i++) {
            min=i;
            for (int j = i + 1 ; j < arr.length; j++) {
                if (arr[j] < arr[min])
                    min = j;
            }
            temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }
}
