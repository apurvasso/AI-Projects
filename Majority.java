public class Majority {
    static void findMajorityElement(int arr[],int n){
        int maxcount = 0;
        int index = -1;
        for(int i = 0;i<n;i++){
            int count = 0;
            for(int j = 0;j<n;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
                if(count>maxcount){
                    maxcount = count;
                    index = i;
                }
            }

        }
        if(maxcount>n/2){
            System.out.println(arr[index]);
        }
        else{
            System.out.println("NO MAJORITY ELEMENT");
        }
    }

    public static void main(String[] args){
        int a[] = {1,1,1,1,1,1,5,3,5,3};
        int n= a.length;
        findMajorityElement(a,n);
    }

}
