package org.example.stackOverflow;

import java.util.ArrayList;
import java.util.List;

public class User {
    private final int id;
    private final String username;
    private final String email;
    private int reputation;
    private final List<Question> questions;
    private final List<Answer> answers;
    private final List<Comment> comments;

    private final static int QUESTION_REPUTATION = 5;
    private final static int ANSWER_REPUTATION = 10;
    private final static int COMMENT_REPUTATION = 2;

    public User(int id, String username, String email) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.questions = new ArrayList<>();
        this.answers = new ArrayList<>();
        this.comments = new ArrayList<>();
    }

    public Question askQuestion(String title, String content, List<String> tags) {
        Question question = new Question(this, title, content, tags);
        questions.add(question);
        updateReputation(QUESTION_REPUTATION);
        return question;
    }
    public Answer answerQuestion(String content, Question question) {
        Answer answer = new Answer(this,content,question);
        answers.add(answer);
        updateReputation(ANSWER_REPUTATION);
        return answer;
    }
    public Comment addComment(Commentable commentable, String content){
        Comment comment = new Comment(this, content);
        comments.add(comment);
        commentable.comment(comment);
        updateReputation(COMMENT_REPUTATION);
        return comment;
    }
    public synchronized void updateReputation(int value) {
        this.reputation += value;
        if(this.reputation < 0) {
            this.reputation = 0;
        }
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public int getReputation() {
        return reputation;
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public List<Answer> getAnswers() {
        return answers;
    }

    public List<Comment> getComments() {
        return comments;
    }
}
