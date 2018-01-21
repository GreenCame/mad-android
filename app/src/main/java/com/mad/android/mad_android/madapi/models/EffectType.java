package com.mad.android.mad_android.madapi.models;

/**
 * Created by Ju on 18/01/2018.
 */

public class EffectType {
    private int EffectTypeId;
    private String Name;
    private String Desc;

    public int getEffectTypeId() {
        return EffectTypeId;
    }

    public void setEffectTypeId(int effectTypeId) {
        EffectTypeId = effectTypeId;
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
