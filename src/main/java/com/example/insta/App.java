package com.example.insta;

import com.github.instagram4j.instagram4j.IGClient;
import com.github.instagram4j.instagram4j.actions.IGClientActions;
import com.github.instagram4j.instagram4j.actions.search.SearchAction;
import com.github.instagram4j.instagram4j.actions.users.UserAction;
import com.github.instagram4j.instagram4j.actions.users.UsersAction;
import com.github.instagram4j.instagram4j.exceptions.IGLoginException;
import com.github.instagram4j.instagram4j.models.user.Profile;
import com.github.instagram4j.instagram4j.models.user.User;
import com.github.instagram4j.instagram4j.requests.users.UsersBlockedListRequest;
import com.github.instagram4j.instagram4j.responses.feed.FeedUsersResponse;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;


public class App {
    public static void main(String[] args) {
        String username = "username", password = "password";

        {
            try {
                IGClient client = IGClient.builder().username(username).password(password).login();

            } catch (IGLoginException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
