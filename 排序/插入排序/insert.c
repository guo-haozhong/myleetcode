//插入排序
void insert_sort(int arr[],int len){
    int i,j,tmp;
    for (i=1; i<len; i++) {
        tmp=arr[i];
        for (j=i; j>=0 && arr[j-1]>tmp ; j--) {
            arr[j]=arr[j-1];
        }
        arr[j]=tmp;
    }
};