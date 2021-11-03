//选择排序
void selection_sort(int arr[],int len){
    int i,j,temp;
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
};