package com.mad.android.mad_android.madapi.models;

/**
 * Created by Ju on 18/01/2018.
 */

public class StatusEffect {
    private int StatusEffectId;
    private String Name;
    private String EffectTypeId;
    private int duration;
    private int desc;

    public int getStatusEffectId() {
        return StatusEffectId;
    }

    public void setStatusEffectId(int statusEffectId) {
        StatusEffectId = statusEffectId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getEffectTypeId() {
        return EffectTypeId;
    }

    public void setEffectTypeId(String effectTypeId) {
        EffectTypeId = effectTypeId;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getDesc() {
        return desc;
    }

    public void setDesc(int desc) {
        this.desc = desc;
    }
}
