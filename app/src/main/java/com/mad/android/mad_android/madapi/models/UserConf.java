package com.mad.android.mad_android.madapi.models;

/**
 * Created by Ju on 18/01/2018.
 */

public class UserConf {
    private int ConfId;
    private String Name;
    private String Value;
    private int UserId;

    public int getConfId() {
        return ConfId;
    }

    public void setConfId(int confId) {
        ConfId = confId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getValue() {
        return Value;
    }

    public void setValue(String value) {
        Value = value;
    }

    public int getUserId() {
        return UserId;
    }

    public void setUserId(int userId) {
        UserId = userId;
    }
}
