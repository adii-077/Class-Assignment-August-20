package models;

public class Conversion {

    public float value;

    public Conversion(float value) {
        this.value = value;
    }

    public float getCM(){
        return value*100;
    }

    public float getKM(){
        return value/1000;
    }

    public float getMm(){
        return value*1000;
    }

    public float getDm(){
        return value*10;
    }

}
