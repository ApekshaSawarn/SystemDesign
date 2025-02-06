package org.example.stackOverflow;

public class Vote {
    private final User user;
    private final int reputation;
    public Vote(User user, int reputation) {
        this.user = user;
        this.reputation = reputation;
    }

    public User getUser() {
        return user;
    }

    public int getReputation() {
        return reputation;
    }
}
