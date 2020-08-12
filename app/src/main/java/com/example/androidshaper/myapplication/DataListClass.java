package com.example.androidshaper.myapplication;

import java.util.List;

public class DataListClass {

    List<ObjectDataClass> data;

    public DataListClass() {
    }

    public DataListClass(List<ObjectDataClass> data) {
        this.data = data;
    }

    public List<ObjectDataClass> getData() {
        return data;
    }

    public void setData(List<ObjectDataClass> data) {
        this.data = data;
    }
}
