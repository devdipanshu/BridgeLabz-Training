package online_voting_system;

import java.util.ArrayList;

class ElectionManagement implements ElectionService {

    ArrayList<Voter> voters = new ArrayList<>();
    ArrayList<Candidate> candidates = new ArrayList<>();
    ArrayList<Vote> votes = new ArrayList<>();

    void addVoter(Voter v) {
        voters.add(v);
    }

    void addCandidate(Candidate c) {
        candidates.add(c);
    }

    void addVote(Vote v) {
        votes.add(v);
    }

    Candidate getCandidateById(int id) {
        for(int i = 0;i<candidates.size();i++) {
            if(candidates.get(i).id == id) {
                return candidates.get(i);
            }
        }
        return null;
    }

    void showCandidates() {
        System.out.println("Candidate List:");
        for(int i = 0;i<candidates.size();i++) {
            System.out.println(candidates.get(i).id+" "+candidates.get(i).name);
        }
    }

    public void declareResult() {
        for(int i = 0;i<candidates.size();i++) {
            int count = 0;
            for(int j = 0;j<votes.size();j++) {
                if(votes.get(j).candidateId == candidates.get(i).id) {
                    count++;
                }
            }
            System.out.println(candidates.get(i).name+" -> "+count+" votes");
        }
    }
}
