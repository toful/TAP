package exam1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

/**
 * Created by pedro on 10/4/17.
 */
public class Ex4 {


    public static void main (String args[]) {

        ListMapDecorator<String> lines = new ListMapDecorator<String>(importFile(),(String line)->{
          Map<String,Integer> words = Singleton.getInstance();
            StringTokenizer st = new StringTokenizer(line);
            while (st.hasMoreTokens()){
                String word = st.nextToken().replaceAll("[^a-zA-Z]", "").toLowerCase();
                if (words.containsKey(word)){
                    words.put(word,words.get(word)+1);
                }else
                    words.put(word,1);
            }
            words.remove("");
            return line;
        });

        System.out.println(lines);
        System.out.println(Singleton.getInstance());



    }


    public static LinkedList<String> importFile(){
        FileReader fis = null;
        LinkedList<String> lines = new LinkedList<String>();
        try {

            fis = new FileReader("big.txt");
            BufferedReader dis = new BufferedReader(fis);
            String line;


            while ((line = dis.readLine()) != null) {
                lines.add(line);
            }
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lines;
    }



}
