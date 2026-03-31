package online_voting_system;

class Voter {
    int id;
    String name;
    boolean isRegistered;
    boolean hasVoted;

    Voter(int id,String name) {
        this.id = id;
        this.name = name;
        this.isRegistered = false;
        this.hasVoted = false;
    }

    void register(ElectionManagement em) {
        isRegistered = true;
        em.addVoter(this);
    }

    void castVote(int candidateId,ElectionManagement em) throws DuplicateVoteException {
        if(!isRegistered) {
            System.out.println("Voter not registered");
            return;
        }

        if(hasVoted) {
            throw new DuplicateVoteException("Voter has already voted");
        }

        Candidate c = em.getCandidateById(candidateId);
        if(c == null) {
            System.out.println("Candidate not found");
            return;
        }

        Vote v = new Vote(this,c);
        em.addVote(v);
        hasVoted = true;

        System.out.println("Vote casted successfully");
    }
}
