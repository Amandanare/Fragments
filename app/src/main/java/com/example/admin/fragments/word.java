package com.example.admin.fragments;

/**
 * Created by Admin on 7/6/2017.
 */

public class word {
    private String mDefaultTranslation;

    private String mMiwokTranslation;

    private int mImageResourceId = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;

    private int mAudioResourceId;


    public word(String vEnglish, String vMiwok, int imageResourceId, int audioResourceId){


        mDefaultTranslation = vEnglish;
        mMiwokTranslation = vMiwok;
        mImageResourceId = imageResourceId;
        mAudioResourceId=audioResourceId;

    }

    public String getmDefaultTranslation(){
        return mDefaultTranslation;
    }

    public String getmMiwokTranslation(){
        return mMiwokTranslation;
    }

    public int getmImageResourceId() { return mImageResourceId;}

    public boolean hasImage (){
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    public int getAudioResourceId() {return mAudioResourceId;}

}

