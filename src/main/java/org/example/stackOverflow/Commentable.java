package org.example.stackOverflow;

import java.util.List;

public interface Commentable {
    public void comment(Comment comment);
    public List<Comment> getComments();
}
