package com.example.veronica.a3_l1;

/**
 * Created by Veronica on 05.09.2018.
 */

public class Presenter {

    private Model mModel;
    private MainActivity view;

    public Presenter(MainActivity view){
        this.mModel = new Model();
        this.view = view;
    }

    private int calcNewModelValue(int modelElementIndex){
        int currentValue = mModel.getElementValueAtIndex(modelElementIndex);
        return currentValue +1;
    }

    public void buttonClick(int btnIdex){
        int newModelValue;
        switch(btnIdex){
            case 1:
                newModelValue = calcNewModelValue(0);
                mModel.setElementValueAtIndex(0, newModelValue);
                view.setButtonText(1, newModelValue);
                break;
            case 2:
                newModelValue = calcNewModelValue(1);
                mModel.setElementValueAtIndex(1, newModelValue);
                view.setButtonText(2, newModelValue);
                break;
            case 3:
                newModelValue = calcNewModelValue(2);
                mModel.setElementValueAtIndex(2, newModelValue);
                view.setButtonText(3, newModelValue);
                break;
        }
    }
}
