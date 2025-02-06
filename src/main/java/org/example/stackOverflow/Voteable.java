package org.example.stackOverflow;

public interface Voteable {
    public void vote(User user, int reputation);
    public int getVoteCount();
}
