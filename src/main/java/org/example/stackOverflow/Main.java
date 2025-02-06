package org.example.stackOverflow;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String args[]) {
        StackOverflow stackOverflow = new StackOverflow();
        User user1 = stackOverflow.createUser("Alice","alice@gmail.com");
        User user2 = stackOverflow.createUser("Bob","bob10@gmail.com");
        User user3 = stackOverflow.createUser("Daisy","daisygg@gmail.com");

        List<String> tags = new ArrayList<>();
        tags.add("Maths"); tags.add("Computation problem"); tags.add("Easy");
        Question question1 = stackOverflow.askQuestion(user1,"Help me with this math problem","What is 10*2+8?", tags);
        Answer answer1 = stackOverflow.answerQuestion(user3,question1,"It's 28.");
        Comment comment1 = stackOverflow.addComment(user1,question1,"Thanks!!");
        stackOverflow.voteQuestion(user2,question1,1);
        stackOverflow.voteAnswer(user1,answer1,1);
        stackOverflow.acceptAnswer(answer1);
        stackOverflow.getQuestionByUser(user1);
        stackOverflow.searchQuestion("Help");

        System.out.println("Question "+question1.getTitle());
        System.out.println("Answer "+answer1.getContent());
        System.out.println("Tags: "+question1.getTags().stream().map(Tags::getName).reduce((a, b) -> a + ", " + b).orElse(""));
        System.out.println("Vote for question ("+question1.getTitle()+") is "+question1.getVoteCount());


    }
}
