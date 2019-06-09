package com.gfg.MrStark07.SpringBootWebApplication.Model;

public class Book {
    private String title;
    private String isvn;

    public Book(String title, String isvn) {
        this.title = title;
        this.isvn = isvn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIsvn() {
        return isvn;
    }

    public void setIsvn(String isvn) {
        this.isvn = isvn;
    }
}
