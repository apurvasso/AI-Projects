import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.*;
public class splitString {
    static int getPro(int n){
        int pro =1;
        while(n!=0){
            pro = pro * (n%10);
            n = n/10;
        }
        return  pro;

    }
    public static void main(String args[]) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String line;
        line = bf.readLine();
        String[] split = line.split(" ");
        int[] arr = new int[split.length];
        for(int i = 0;i<split.length;i++){
            arr[i] = Integer.valueOf(split[i]);
        }
        int sum =0;
        for(int i = 0;i<split.length;i++){
            sum = sum + getPro(arr[i]);
        }
        System.out.println(sum);
        System.out.println(arr[0]);
    }
}
