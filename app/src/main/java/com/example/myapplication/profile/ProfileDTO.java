package com.example.myapplication.profile;

public class ProfileDTO {
    private int img;

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public ProfileDTO(int img, String name, String num) {
        this.img = img;
        this.name = name;
        this.num = num;
    }

    private String name, num;
}
