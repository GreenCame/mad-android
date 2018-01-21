package com.mad.android.mad_android.madapi.models;

/**
 * Created by Ju on 18/01/2018.
 */

public class Item {
    private int ItemId;
    private int ItemTypeId;
    private String Name;
    private int LevelRequired;
    private int Durability;

    public int getItemId() {
        return ItemId;
    }

    public void setItemId(int itemId) {
        ItemId = itemId;
    }

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

    public int getLevelRequired() {
        return LevelRequired;
    }

    public void setLevelRequired(int levelRequired) {
        LevelRequired = levelRequired;
    }

    public int getDurability() {
        return Durability;
    }

    public void setDurability(int durability) {
        Durability = durability;
    }
}
