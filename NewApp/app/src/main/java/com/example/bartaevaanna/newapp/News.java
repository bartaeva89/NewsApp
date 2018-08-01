package com.example.bartaevaanna.newapp;

public class News {
    private String webTitle;
    private String sectionName;
    private String webUrl;
    private String webPublicationDate;

    public News(String webTitle, String sectionName, String webUrl, String webPublicationDate) {
        this.webTitle = webTitle;
        this.sectionName = sectionName;
        this.webUrl = webUrl;
        this.webPublicationDate = webPublicationDate;
    }

    public String getWebTitle() {
        return webTitle;
    }

    public String getSectionName() {
        return sectionName;
    }

    public String getWebUrl() {
        return webUrl;
    }

    public String getWebPublicationDate() {
        return webPublicationDate;
    }
}

