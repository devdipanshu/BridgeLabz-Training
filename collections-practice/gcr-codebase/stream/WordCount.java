import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;

public class WordCount{
    public static void main(String[] args){

        FileReader fr = null;
        BufferedReader br = null;

        try{
            fr = new FileReader("C:\\Users\\Dipanshu\\OneDrive\\Documents\\MIC_QUEST.txt");
            br = new BufferedReader(fr);

            HashMap<String,Integer> map = new HashMap<String,Integer>();
            String line;

            while((line = br.readLine()) != null){
                String[] words = line.toLowerCase().split("\\s+");

                for(int i = 0;i < words.length;i++){
                    if(words[i].length() > 0){
                        if(map.containsKey(words[i])){
                            map.put(words[i], map.get(words[i]) + 1);
                        }else{
                            map.put(words[i], 1);
                        }
                    }
                }
            }

            ArrayList<Map.Entry<String,Integer>> list =
                new ArrayList<Map.Entry<String,Integer>>(map.entrySet());

            Collections.sort(list, new Comparator<Map.Entry<String,Integer>>(){
                public int compare(Map.Entry<String,Integer> e1, Map.Entry<String,Integer> e2){
                    return e2.getValue() - e1.getValue();
                }
            });

            int count = 0;
            for(int i = 0;i < list.size() && count < 5;i++){
                System.out.println(list.get(i).getKey() + " : " + list.get(i).getValue());
                count++;
            }

        }catch(IOException e){
            System.out.println("IO Error occurred");
        }finally{
            try{
                if(br != null){
                    br.close();
                }
                if(fr != null){
                    fr.close();
                }
            }catch(IOException e){
                System.out.println("Error while closing streams");
            }
        }
    }
}
