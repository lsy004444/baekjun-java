import java.io.*;
import java.util.*;

public class baekjun1100{
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        char[][] chess = new char[8][8];

        for(int i = 0; i < 8; i++){
           String line = sc.nextLine();
           for(int j=0;j <8; j++){
                chess[i][j] = line.charAt(j);
           }
        }
        int count = 0;
        for(int i= 0; i<8; i = i + 2){
            for(int j=0; j<8; j=j+2){
                if(chess[i][j] == 'F')
                    count++;
                }
            }

        for(int i=1; i<8; i=i+2){
            for(int j=1; j<8; j=j+2){
                if(chess[i][j] == 'F'){
                    count++;
                }
            }
        }

        System.out.print(count);
    }
}
