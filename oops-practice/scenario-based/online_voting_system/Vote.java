package online_voting_system;

class Vote {
    static int voteCounter = 1;
    int voteId;
    int voterId;
    int candidateId;

    Vote(Voter v,Candidate c) {
        voteId = voteCounter++;
        voterId = v.id;
        candidateId = c.id;
    }
}
