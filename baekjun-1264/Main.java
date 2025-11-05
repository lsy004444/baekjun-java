import java.io.*;


public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int count = 0;
        while(true){
            String sentence = br.readLine();

            if(sentence.equals("#")){
                break;
            }
            
            char[] chars = sentence.toCharArray();
            for(int i = 0; i < chars.length; i++){
                char ch = Character.toLowerCase(chars[i]);
                if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                    count++;
                    
                }
            }
            sb.append(count).append('\n');
            
        }
        System.out.print(sb);

    }
}
