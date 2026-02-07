
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class InsuranceClaimAnalysis {

    static class Claim{
        String claimType;
        double amount;

        Claim(String claimType,double amount){
            this.claimType = claimType;
            this.amount = amount;
        }
    }

    public static void main(String[] args) {

        List<Claim> list = new ArrayList<>();

        list.add(new Claim("Health",50000));
        list.add(new Claim("Vehicle",30000));
        list.add(new Claim("Health",70000));
        list.add(new Claim("Property",90000));
        list.add(new Claim("Vehicle",40000));
        list.add(new Claim("Health",60000));

        Map<String,Double> avgClaimAmount =
        list.stream()
        .collect(
            Collectors.groupingBy(
                c -> c.claimType,
                Collectors.averagingDouble(c -> c.amount)
            )
        );

        avgClaimAmount.forEach((type,avg) ->
            System.out.println(type+" -> Average Claim Amount : "+avg)
        );
    }
}
