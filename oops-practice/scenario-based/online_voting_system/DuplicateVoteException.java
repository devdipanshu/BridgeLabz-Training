package online_voting_system;

class DuplicateVoteException extends Exception {
    DuplicateVoteException(String msg) {
        super(msg);
    }
}
