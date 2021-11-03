#include <stdio.h>
#include <string.h>
#include <stdlib.h>

//冒泡排序
void bubble_sort(int arr[],int len);

int main(int argc, const char * argv[]) {
    int arr[]={34,5,6,6,7,9,5,35,0,898};
    int len=(int)sizeof(arr)/sizeof(*arr);
    bubble_sort(arr,len);

    for (int k = 0; k < len; k++){
        printf("%d ", arr[k]);
    }
    
    
    printf("\n");
    return 0;
}

void bubble_sort(int arr[],int len){
    int i,j,temp;
    for (i=0; i<len; i++) {
        for (j=0; j<len-1-i; j++) {
            if(arr[j]>arr[j+1]){
                temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
        }
    }
};