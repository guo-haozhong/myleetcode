import java.util.Arrays;

class ChaPai {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 1, 23, 6, 78, 34};
        System.out.println("原始数据: " + Arrays.toString(arr));
        for (int i = 1; i < arr.length; i++) {
            int tmp = arr[i];
            int j = i - 1;
            for (; j >= 0; j--) {
                if (arr[j] > tmp) {
                    arr[j+1] = arr[j];
                } else {
                    break;
                }
            }
            arr[j + 1] = tmp;
        }

        System.out.println("插入排序: " + Arrays.toString(arr));
    }
}

//方法2：c语言的写法