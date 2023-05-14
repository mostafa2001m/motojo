package com.example.myapplication2;

public class post {
    private int img;
    private String name;

    public int getImg() {
        return img;
    }

    public String getName() {
        return name;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public void setName(String name) {
        this.name = name;
    }

    public post(int img, String name) {
        this.img = img;
        this.name = name;
    }
    private String textInput;
    private String imageUri;

    public post(String textInput, String imageUri) {
        this.textInput = textInput;
        this.imageUri = imageUri;
    }

    public String getTextInput() {
        return textInput;
    }

    public void setTextInput(String textInput) {
        this.textInput = textInput;
    }

    public String getImageUri() {
        return imageUri;
    }

    public void setImageUri(String imageUri) {
        this.imageUri = imageUri;
    }
}
