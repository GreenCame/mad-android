package com.mad.android.mad_android.madapi.models;

/**
 * Created by Ju on 18/01/2018.
 */

public class ItemType {
    private int ItemTypeId;
    private String Name;
    private String Desc;

    public int getItemTypeId() {
        return ItemTypeId;
    }

    public void setItemTypeId(int itemTypeId) {
        ItemTypeId = itemTypeId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDesc() {
        return Desc;
    }

    public void setDesc(String desc) {
        Desc = desc;
    }

}
