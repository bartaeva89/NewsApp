package com.example.bartaevaanna.newapp;

public class  News {
    private String webTitle;
    private String sectionName;
    private String webUrl;
    private String webPublicationDate;
    private String author;

    public News(String webTitle, String sectionName, String webUrl, String webPublicationDate, String author) {
        this.webTitle = webTitle;
        this.sectionName = sectionName;
        this.webUrl = webUrl;
        this.webPublicationDate = webPublicationDate;
        this.author=author;
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

    public String getAuthor() {
        return author;
    }

}

