package com.theironyard;

/**
 * Created by illladell on 5/26/16.
 */
public class Post {
    int replyId;
    String author;
    String text;

    public Post(String author, String text, int replyId) {
        this.author = author;
        this.text = text;
        this.replyId = replyId;
    }
}
