import java.io.*;
import java.util.*;

public class baekjun1181 {
    public static void main(String args[]) throws IOException{
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine(); // 엔터키 빈 문자열 인식 금지

        HashSet<String> arrays1 = new HashSet<String>();
        for(int i=0; i<N; i++){
            arrays1.add(sc.nextLine());
        }

        ArrayList<String>List = new ArrayList<>(arrays1);
        Collections.sort(List,(s1,s2) -> {
            if(s1.length() != s2.length()){
                return s1.length()- s2.length();
            }
            return s1.compareTo(s2); //사전식정렬
        });

        // for(int i=0; i<N; i++){
        //     System.out.println(List);
        // }
        for(String s : List) {
            System.out.println(s);
        }

    }
}
