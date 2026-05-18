package org.example.latest_interview_preparation.liskov_substitution_principle;

public class Instagram extends SocialMedia{
    @Override
    public void chatWithFriends() {
        //supported by Instagram
    }

    @Override
    public void postOnSocialMedia() {
        //supported by Instagram
    }

    @Override
    public void shareVideosAndPhotos() {
        //supported by Instagram
    }

    @Override
    public void groupingVideoCalling() {
        // not supported by Instagram
    }
}
