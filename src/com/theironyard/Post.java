package com.theironyard;

/**
 * Created by illladell on 5/26/16.
 */
public class Post {
    int replyId;
    String author;
    String text;

    public Post(Integer replyId, String author, String text) {
        this.replyId = replyId;
        this.author = author;
        this.text = text;

    }
}
