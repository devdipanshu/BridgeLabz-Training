import java.util.*;
import java.util.stream.*;

public class WordFrequencyCounter{
    public static void main(String[] args){
        String paragraph="java stream api java stream collection api";
        Map<String,Integer> freq=
            Arrays.stream(paragraph.split(" "))
            .collect(Collectors.toMap(
                w->w,
                w->1,
                (a,b)->a+b
            ));
        System.out.println(freq);
    }
}
