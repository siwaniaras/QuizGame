package com.example.aras.quizgame;

/**
 * Created by Aras on 2018-01-15.
 */

public class TrueFalse {
    private int mQuestionId;
    private boolean mAnswer;

    public TrueFalse(int questionResourceID, boolean trueOrFalse){
        mQuestionId = questionResourceID;
        mAnswer = trueOrFalse;


    }


    public int getmQuestionId() {
        return mQuestionId;
    }

    public void setmQuestionId(int mQuestionId) {
        this.mQuestionId = mQuestionId;
    }

    public boolean ismAnswer() {
        return mAnswer;
    }

    public void setmAnswer(boolean mAnswer) {
        this.mAnswer = mAnswer;
    }
}