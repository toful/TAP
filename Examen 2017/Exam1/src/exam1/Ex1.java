
package exam1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by pedro on 10/2/17.
 */
public class Ex1 {


    public static void main (String args[]){

        List<String> lines = importFile();
        Map<String, Integer> words = countWords(lines);
        System.out.println(words);
        System.out.println(words.values().stream().mapToInt(Integer::intValue).sum());
        System.out.println(words.entrySet().stream().filter(e->e.getValue()>5000).map(e->e.getKey()).sorted().collect(Collectors.toList()));



    }

    public static Map<String,Integer> countWords(List<String> lines){

        Map<String,Integer> words = new HashMap<String, Integer>();

        lines.forEach((String line)->{
            StringTokenizer st = new StringTokenizer(line);
            while (st.hasMoreTokens()){
                String word = st.nextToken().replaceAll("[^a-zA-Z]", "").toLowerCase();
                if (words.containsKey(word)){
                    words.put(word,words.get(word)+1);
                }else
                    words.put(word,1);
            }
        });

        words.remove("");
        return words;

    }

    public static List<String> importFile(){
        FileReader fis = null;
        List<String> lines = new LinkedList<String>();
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
