package com.example.volume;

public class VolumeMain {

    float a, b, result;

    public VolumeMain(float a, float b){
        this.a = a;
        this.b = b;
    }

    public float getResult(){
        result = a * b;
        return result;
    }


}
