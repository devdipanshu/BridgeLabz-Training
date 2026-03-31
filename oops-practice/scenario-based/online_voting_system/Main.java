package online_voting_system;

public class Main {
    public static void main(String[] args) {

        ElectionManagement em = new ElectionManagement();

        Candidate c1 = new Candidate(1,"Rahul");
        Candidate c2 = new Candidate(2,"Amit");

        c1.register(em);
        c2.register(em);

        em.showCandidates();

        Voter v1 = new Voter(101,"Ramesh");
        v1.register(em);

        try {
            v1.castVote(1,em);
            v1.castVote(2,em);   // Duplicate vote
        }
        catch(DuplicateVoteException e) {
            System.out.println(e.getMessage());
        }

        em.declareResult();
    }
}
