package streambuzz;

import java.util.*;

class CreatorStats {
    String creatorName;
    double[] weeklyLikes;
}

public class Program {
    static List<CreatorStats> EngagementBoard = new ArrayList<>();

    public void registerCreator(CreatorStats record) {
        EngagementBoard.add(record);
    }

    public Map<String,Integer> getTopPostCounts(List<CreatorStats> records,double likeThreshold) {
        Map<String,Integer> result = new HashMap<>();

        for(CreatorStats c : records) {
            int count = 0;
            for(int i=0;i<c.weeklyLikes.length;i++) {
                if(c.weeklyLikes[i] >= likeThreshold) {
                    count++;
                }
            }
            if(count > 0) {
                result.put(c.creatorName,count);
            }
        }
        return result;
    }

    public double calculateAverageLikes() {
        double sum = 0;
        int total = 0;

        for(CreatorStats c : EngagementBoard) {
            for(double l : c.weeklyLikes) {
                sum += l;
                total++;
            }
        }
        if(total == 0) {
            return 0;
        }
        return sum / total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Program p = new Program();
        int choice = 0;

        while(choice != 4) {
            System.out.println("1. Register Creator");
            System.out.println("2. Show Top Posts");
            System.out.println("3. Calculate Average Likes");
            System.out.println("4. Exit");
            System.out.println("Enter your choice:");
            choice = sc.nextInt();
            sc.nextLine();

            if(choice == 1) {
                CreatorStats c = new CreatorStats();
                System.out.println("Enter Creator Name:");
                c.creatorName = sc.nextLine();
                c.weeklyLikes = new double[4];
                System.out.println("Enter weekly likes (Week 1 to 4):");
                for(int i=0;i<4;i++) {
                    c.weeklyLikes[i] = sc.nextDouble();
                }
                p.registerCreator(c);
                System.out.println("Creator registered successfully");
            }
            else if(choice == 2) {
                System.out.println("Enter like threshold:");
                double t = sc.nextDouble();
                Map<String,Integer> map = p.getTopPostCounts(EngagementBoard,t);

                if(map.isEmpty()) {
                    System.out.println("No top-performing posts this week");
                } else {
                    for(String k : map.keySet()) {
                        System.out.println(k+" - "+map.get(k));
                    }
                }
            }
            else if(choice == 3) {
                System.out.println("Overall average weekly likes: "+(int)p.calculateAverageLikes());
            }
            else if(choice == 4) {
                System.out.println("Logging off - Keep Creating with StreamBuzz!");
            }
        }
        sc.close();
    }
}
