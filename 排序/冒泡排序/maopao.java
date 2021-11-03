import java.util.Arrays;

class MaoPao {
    public static void main(String[] args) {
        int[] arr = {1, 0, 3, 4, 5, -6, 8, 3, 5, 10};
        System.out.println("原始数据: " + Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
        System.out.println("冒泡排序: " + Arrays.toString(arr));
    }
}