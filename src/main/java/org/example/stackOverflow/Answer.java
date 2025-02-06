package org.example.stackOverflow;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Answer implements Commentable, Voteable{
    private final int id;
    private final User author;
    private final String content;
    private final Question question;
    private final Date creationDate;
    private boolean isAccepted;
    private final List<Comment> comments;
    private final List<Vote> votes;

    public Answer(User author, String content, Question question){
        this.id = generateId();
        this.author = author;
        this.content = content;
        this.question = question;
        this.creationDate = new Date();
        this.isAccepted = false;
        this.comments = new ArrayList<>();
        this.votes = new ArrayList<>();
    }
    @Override
    public void comment(Comment comment) {
        comments.add(comment);
    }

    @Override
    public List<Comment> getComments() {
        return new ArrayList<>(comments);
    }

    @Override
    public void vote(User user, int value) {
        if(value != 1 && value!= -1)
            throw new IllegalArgumentException("Vote must be 1 or -1");
        votes.removeIf(v -> v.getUser().equals(user));
        votes.add(new Vote(user, value));
        author.updateReputation(value*10);
    }

    @Override
    public int getVoteCount(){
        int countOfVotes=0;
        for(Vote vote:votes) {
            countOfVotes += vote.getReputation();
        }
        return countOfVotes;
    }

    public void isAccepted() {
        if(isAccepted) {
            throw new IllegalStateException("This answer is already accepted");
        }
        this.isAccepted = true;
        author.updateReputation(15);
    }
    private int generateId(){
        return (int)(System.currentTimeMillis()%Integer.MAX_VALUE);
    }

    public int getId() {
        return id;
    }

    public User getAuthor() {
        return author;
    }

    public Question getQuestion() {
        return question;
    }

    public String getContent() {
        return content;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public boolean accepted(){
        return isAccepted;
    }
}
