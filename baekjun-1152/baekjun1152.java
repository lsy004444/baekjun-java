import java.io.*;
import java.util.*;

public class baekjun1152 {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st= new StringTokenizer(br.readLine());

        //String[] sentence = new String[]
        int count = st.countTokens();

        // while(st.hasMoreTokens()){
        //     count++;
        // }
        // System.out.print(count);

        System.out.print(count);
    }
}
