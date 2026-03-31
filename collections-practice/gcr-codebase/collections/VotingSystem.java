import java.util.*;

public class VotingSystem
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        LinkedHashMap<String,Integer> voteOrder = new LinkedHashMap<String,Integer>();
        HashMap<String,Integer> voteCount = new HashMap<String,Integer>();

        voteOrder.put("Alice",1);
        voteOrder.put("Bob",1);
        voteOrder.put("Alice",1);
        voteOrder.put("Carol",1);
        voteOrder.put("Bob",1);

        for(String key : voteOrder.keySet())
        {
            if(voteCount.containsKey(key))
            {
                voteCount.put(key,voteCount.get(key) + 1);
            }
            else
            {
                voteCount.put(key,1);
            }
        }

        TreeMap<String,Integer> sortedResult = new TreeMap<String,Integer>(voteCount);

        for(Map.Entry<String,Integer> entry : sortedResult.entrySet())
        {
            System.out.println(entry.getKey()+" = "+entry.getValue());
        }
    }
}
