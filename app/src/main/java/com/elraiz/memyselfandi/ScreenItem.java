package com.elraiz.memyselfandi;

import java.lang.reflect.Constructor;

public class ScreenItem {
    String Title,Description;
    int ScreenImg;

    public ScreenItem(String title, String description, int screenimg) {
        Title = title;
        Description = description;
        ScreenImg = screenimg;
    }

    //seter
    public void setTitle(String title) {
        Title = title;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public void setScreenImg(int screenImg) {
        ScreenImg = screenImg;
    }

    //geter
    public String getTitle() {
        return Title;
    }

    public String getDescription() {
        return Description;
    }

    public int getScreenImg() {
        return ScreenImg;
    }
}
