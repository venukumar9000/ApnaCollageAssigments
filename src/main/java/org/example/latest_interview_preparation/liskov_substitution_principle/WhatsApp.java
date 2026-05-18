package org.example.latest_interview_preparation.liskov_substitution_principle;

public class WhatsApp extends SocialMedia{
    @Override
    public void chatWithFriends() {
        //supported by whats app
    }

    @Override
    public void postOnSocialMedia() {
        //not supported by whats app
    }

    @Override
    public void shareVideosAndPhotos() {
        //supported by whats app
    }

    @Override
    public void groupingVideoCalling() {
        //supported by whats app
    }
}
