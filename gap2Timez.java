import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class gap2Timez {
    public static void main(String args[]) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String line;
        line = bf.readLine();
        String[] split = line.split(" ");
        int[] arr = new int[split.length];
        for(int i = 0;i<split.length;i++){
            arr[i] = Integer.valueOf(split[i]);
        }
        int count = 1;
        int prev = arr[0];
        for(int i = 0;i<split.length - 1;i++){
            if(prev != (arr[i+1]/2)){
                count++;
                prev = arr[i+1];
            }
        }
        System.out.println(count);
    }
}
