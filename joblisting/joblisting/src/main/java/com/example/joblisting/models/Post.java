package com.example.joblisting.models;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="JobPost")
public class Post {
    private String profile;
    private String description;
    private int experience;
    private String techs[];

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public String[] getTechs() {
        return techs;
    }

    public void setTechs(String techs[]) {
        this.techs = techs;
    }
}
