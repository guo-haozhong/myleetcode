import java.util.Arrays;

class Xuanze {
    public static void main(String[] args) {
        int[] arr = {1, 0, 3, 8,4, 5, -6, 8, 3, 5, 10};
        System.out.println("原始数据: " + Arrays.toString(arr));

        int i,j,temp;
        int len=arr.length;
        for (i=0; i<len-1; i++) {
            int min=i;
            for (j=i+1; j<len; j++) {
                if (arr[j]<arr[min]) {
                    min=j;
                }
            }
            if (min!=i) {
                temp=arr[min];
                arr[min]=arr[i];
                arr[i]=temp;
            }
        }
        System.out.println("选择排序: " + Arrays.toString(arr));
    }
}