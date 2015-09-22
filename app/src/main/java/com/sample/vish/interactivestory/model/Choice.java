package com.sample.vish.interactivestory.model;

/**
 * Created by Vish on 11/08/15.
 */
public class Choice {
    private String mText;
    private int mNextPage;

    public Choice(String text,  int nextPage){
        mText = text;
        mNextPage = nextPage;
    }

    public String getText() {
        return mText;
    }

    public void setText(String text) {
        mText = text;
    }

    public int getNextPage() {
        return mNextPage;
    }

    public void setNextPage(int nextPage) {
        mNextPage = nextPage;
    }
}
