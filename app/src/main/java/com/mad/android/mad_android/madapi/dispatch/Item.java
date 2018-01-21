package com.mad.android.mad_android.madapi.dispatch;

import com.mad.android.mad_android.madapi.models.Attribute;
import com.mad.android.mad_android.madapi.models.ItemType;
import com.mad.android.mad_android.madapi.models.Loot;

import java.util.List;

/**
 * Created by Ju on 18/01/2018.
 */

public class Item {
    private List<Loot> Loots;
    private ItemType type;
    private List<Attribute> Attributes;

    public List<Loot> getLoots() {
        return Loots;
    }

    public void setLoots(List<Loot> loots) {
        Loots = loots;
    }

    public ItemType getType() {
        return type;
    }

    public void setType(ItemType type) {
        this.type = type;
    }

    public List<Attribute> getAttributes() {
        return Attributes;
    }

    public void setAttributes(List<Attribute> attributes) {
        Attributes = attributes;
    }
}
