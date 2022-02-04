public class SortedPivotedArrayBinarySearch {
    static int search(int arr[],int l,int h,int key){
        if(l>h){
            return -1;
        }
        int mid = (l + h) / 2;
        if(arr[mid]==key){
            return  mid;
        }
        if(arr[mid]>=arr[l]){//first subarray is sorted
            if(key >= arr[l] && key <= arr[mid]){
                return search(arr,l,mid - 1,key);
            }
            return search(arr,mid + 1,h,key);
        }
        //if first subarray is not sorted then second subarray is sorted
        if(key>=arr[mid] && key <= arr[h]){
            return search(arr,mid + 1,h,key);
        }
        return search(arr,l,mid - 1,key);
    }
    public static void main(String[] args){
        int a[] = {3,4,5,6,7,1,2,3,4};
        int n = a.length;
        int key = 4;
        int i = search(a,0,n-1,key);
        if(i == -1){
            System.out.println("Not found");

        }
        else{
            System.out.println("Found at index: "+i);
        }
    }
}
