package online_voting_system;

class Candidate {
    int id;
    String name;

    Candidate(int id,String name) {
        this.id = id;
        this.name = name;
    }

    void register(ElectionManagement em) {
        em.addCandidate(this);
    }
}
