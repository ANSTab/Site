package com.tabachenko.demo.model;

public class Test {
    private int distance;
    private int tarif;

    @Override
    public String toString() {
        return "Test{" +
                "distance=" + distance +
                ", tarif=" + tarif +
                '}';
    }

    public Test() {

    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public int getTarif() {
        return tarif;
    }

    public void setTarif(int tarif) {
        this.tarif = tarif;
    }


}
