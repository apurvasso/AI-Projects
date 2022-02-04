
public class SumMiddleElementTwoSortedArrays {


    static int summiddleelement(int[] a,int[] b,int n){
        int i,j,k;
        i=0;
        j=0;
        k=n-1;
        while(k!=0){
            if(a[i]==b[j]){
                i++;
                j++;
                k--;
            }
            else if(a[i]<b[j]){
                i++;
                k--;
            }
            else{
                j++;
                k--;
            }
        }
        if(a[i]<b[j] && a[i+1]<b[j]){
            System.out.println(a[i] + a[i+1]+" 1"+" i:"+ i+ " j:"+j);
            return a[i] + a[i+1];
        }
        else if(a[i]>b[j] && a[i]>b[j+1]){
            System.out.println(b[j] + b[j+1]+" 2"+" i:"+ i+ " j:"+j);
            return b[j] + b[j+1];
        }
        System.out.println(a[i] + b[j]+" 3"+" i:"+ i+ " j:"+j);
        return a[i] + b[j];

    }
    public static void main(String[] args){
        int[] a = {3,4,5,6,7,1,2,3,4};
        int[] b = {2,3,4,5,3,2,1,7,1};
        int n = a.length;
        int sum = summiddleelement(a,b,n-1);
        System.out.println(sum);
    }
}
