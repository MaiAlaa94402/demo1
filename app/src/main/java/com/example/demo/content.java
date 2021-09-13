package com.example.demo;

public class content {
    String name;
    String project;
    int image;
    public content(String names,String projects,int images) {
        name=names;
        project=projects;
        image=images;
    }

    public String getName() {
        return name;
    }

    public String getProject() {
        return project;
    }

    public int getImage() {
        return image;
    }

}
