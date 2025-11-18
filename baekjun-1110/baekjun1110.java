import java.io.*;
import java.util.*;

public class baekjun1110 {
    public static void main (String args[]) throws IOException{
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = N;
        int count = 0;
        // while(N == K){
        //     int a = N % 10;
        //     int b = a + (N/10);

        //     K = 10*a+b;
            
        //     count++;
        // }
        do{
            int a = N%10; 
            int b =  (a+(N/10)) % 10;
            N= 10*a+b;
            count++;
        } while(N != K);
        System.out.print(count);
    }
}
