package org.example.latest_interview_preparation.liskov_substitution_principle;

public class FaceBook extends SocialMedia {
    @Override
    public void chatWithFriends() {
        //supported by facebook
    }

    @Override
    public void postOnSocialMedia() {
     //supported by facebook
    }

    @Override
    public void shareVideosAndPhotos() {
      //supported by facebook
    }

    @Override
    public void groupingVideoCalling() {
      //supported by facebook
    }
}
