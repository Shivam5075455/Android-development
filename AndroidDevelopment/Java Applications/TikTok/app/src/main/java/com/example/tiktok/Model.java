package com.example.tiktok;

public class Model {
    String videoUrl, name;
    int profileImage;

//    creating getter and setter

// Video Url
    public void setVideoUrl(String videoUrl){
        this.videoUrl = videoUrl;
    }

    public String getVideoUrl() {
        return videoUrl;
    }
//    Name
    public void setName(String name){
        this.name = name;
    }
    public String getName(String name){
        return name;
    }
//    profile image
    public void setProfileImage(int profileImage){
        this.profileImage = profileImage;
    }
    public int getProfileImage(int profileImage){
        return profileImage;
    }
}
