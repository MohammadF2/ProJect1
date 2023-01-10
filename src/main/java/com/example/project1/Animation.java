package com.example.project1;

import javafx.scene.control.TextField;

public class Animation {

    private TextField[] tf;
    private int[] index;


    public Animation(TextField[] tf, int[] index) {
        this.tf = tf;
        this.index = index;
    }

    public TextField[] getTf() {
        return tf;
    }

    public void setTf(TextField[] tf) {
        this.tf = tf;
    }

    public int[] getIndex() {
        return index;
    }

    public void setIndex(int[] index) {
        this.index = index;
    }



}
