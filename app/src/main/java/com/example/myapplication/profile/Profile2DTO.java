package com.example.myapplication.profile;

public class Profile2DTO {
    private String name, content, num;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public Profile2DTO(String name, String content, String num) {
        this.name = name;
        this.content = content;
        this.num = num;
    }
}
