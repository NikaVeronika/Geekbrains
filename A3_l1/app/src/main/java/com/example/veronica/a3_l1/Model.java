package com.example.veronica.a3_l1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Veronica on 05.09.2018.
 */

public class Model {

private List<Integer> mList;

    public Model(){
    mList = new ArrayList<>(3);
    mList.add(0);
    mList.add(0);
    mList.add(0);
    }
    public int getElementValueAtIndex(int _index){
        return mList.get(_index);
    }

    public int setElementValueAtIndex(int _index, int value){
        return mList.set(_index, value);
    }

}
