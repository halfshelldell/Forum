package com.theironyard;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<Post> posts = new ArrayList<>();

        // Parse File
        File f = new File("posts.txt");
        Scanner fileScanner = new Scanner(f);
        while (fileScanner.hasNext()) {
            String line = fileScanner.nextLine();
            String[] columns = line.split("\\|");
            // strings can not be changed they are immutable
            Post post = new Post(Integer.valueOf(columns[0]), columns[1], columns[2]);
            posts.add(post);
        }

        // start loop
        Scanner consoleScanner = new Scanner(System.in);
        int currentPost = -1;
        while (true) {
            // print out the replies to currentPost
            int postId = 0;
            for (Post post : posts) {
                if (post.replyId == currentPost) {
                    System.out.printf("[%s] %s by %s\n", postId, post.text, post.author);
                }
                postId++;
            }
            // ask for new id
            System.out.println("Type the id you want to see replies to:");
            currentPost = Integer.valueOf(consoleScanner.nextLine());

        }
    }
}

