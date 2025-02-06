package org.example.stackOverflow;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Question implements Voteable, Commentable{
    private final int id;
    private final User author;
    private final String title;
    private final String content;
    private final Date creationDate;
    private final List<Answer> answers;
    private final List<Comment> comments;
    private final List<Tags> tags;
    private final List<Vote> votes;

    Question(User author, String title, String content, List<String> tagNames) {
        this.id = generateId();
        this.author = author;
        this.title = title;
        this.content = content;
        this.creationDate = new Date();
        this.answers = new ArrayList<>();
        this.comments = new ArrayList<>();
        this.tags = new ArrayList<>();
        for(String tagName: tagNames)
            this.tags.add(new Tags(tagName));
        this.votes = new ArrayList<>();
    }
    private int generateId(){
        return (int)(System.currentTimeMillis()%Integer.MAX_VALUE);
    }

    public void addAnswer(Answer answer) {
        answers.add(answer);
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
        author.updateReputation(value*5);
    }

    @Override
    public int getVoteCount(){
        int countOfVotes=0;
        for(Vote vote:votes) {
            countOfVotes += vote.getReputation();
        }
        return countOfVotes;
    }
    public int getId() {
        return id;
    }

    public User getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public List<Answer> getAnswers() {
        return answers;
    }

    public List<Tags> getTags() {
        return tags;
    }
}
