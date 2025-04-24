package model;

import java.util.Date;

public class DictStatistic {

    private String word;
    private String meaning;
    private int count;
    private Date date;

    public DictStatistic() {

    }

    public DictStatistic(String word, String meaning, int count, Date date) {
        this.word = word;
        this.meaning = meaning;
        this.count = count;
        this.date = date;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getMeaning() {
        return meaning;
    }

    public void setMeaning(String meaning) {
        this.meaning = meaning;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
