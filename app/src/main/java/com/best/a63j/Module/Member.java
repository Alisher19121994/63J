package com.best.a63j.Module;

public class Member {
    String screenF;
    String screenS;

    public Member(String screenF, String screenS) {
        this.screenF = screenF;
        this.screenS = screenS;
    }

    public String getScreenF() {
        return screenF;
    }

    public String getScreenS() {
        return screenS;
    }

    @Override
    public String toString() {
        return "Member{" +
                "screenF='" + screenF + '\'' +
                ", screenS='" + screenS + '\'' +
                '}';
    }
}
