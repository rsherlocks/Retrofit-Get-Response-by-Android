package com.example.androidshaper.myapplication;

public class ObjectQuery {
    private ObjectDataClass data;

    public ObjectQuery(ObjectDataClass data) {
        this.data = data;
    }

    public ObjectQuery() {
    }

    public ObjectDataClass getData() {
        return data;
    }

    public void setData(ObjectDataClass data) {
        this.data = data;
    }
}
