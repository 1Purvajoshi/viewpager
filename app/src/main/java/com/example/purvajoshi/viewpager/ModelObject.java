package com.example.purvajoshi.viewpager;


public enum ModelObject {

    RED1(R.string.red1, R.layout.red1),
    RED2(R.string.red2, R.layout.red2),
    RED3(R.string.red3, R.layout.red3),
    RED4(R.string.red4, R.layout.red4),
    RED5(R.string.red5, R.layout.red5),
    RED6(R.string.red6, R.layout.red6),
    BLUE1(R.string.blue1, R.layout.blue1),
    BLUE2(R.string.blue2, R.layout.blue2),
    BLUE3(R.string.blue3, R.layout.blue3),
    BLUE4(R.string.blue4, R.layout.blue4),
    BLUE5(R.string.blue5, R.layout.blue5),
    BLUE6(R.string.blue6, R.layout.blue6),
    TEAL1(R.string.teal1, R.layout.teal1),
    TEAL2(R.string.teal2, R.layout.teal2),
    TEAL3(R.string.teal3, R.layout.teal3),
    TEAL4(R.string.teal4, R.layout.teal4),
    TEAL5(R.string.teal5, R.layout.teal5),
    TEAL6(R.string.teal6, R.layout.teal6),
    BLACK(R.string.black, R.layout.black),
    WHITE(R.string.white, R.layout.white),
    apple(R.string.apple,R.layout.apple),
    mango(R.string.mango, R.layout.mango);




    private int mTitleResId;
    private int mLayoutResId;

    ModelObject(int titleResId, int layoutResId) {
        mTitleResId = titleResId;
        mLayoutResId = layoutResId;
    }

    public int getTitleResId() {
        return mTitleResId;
    }

    public int getLayoutResId() {
        return mLayoutResId;
    }

}
