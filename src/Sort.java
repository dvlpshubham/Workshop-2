public class Sort {
    int arr[] = {51, 32, 87, 20, 11, 52, 32};
    int temp;

    public void sortting() {
        int n = arr.length - 1;
        int i;
        int j = 0;
        for (i = 0; i < n; i++)
            for (j = 0; j < n; j++) {
                if (arr[j] > arr[j+1]) {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
    }
    public void displayaArray() {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        Sort sort = new Sort();
        sort.sortting();
        sort.displayaArray();
    }
}
