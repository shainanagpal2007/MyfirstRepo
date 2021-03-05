package com.vapasi.oopsexp;

public class Facility {
int noOfChair;
int noOfRacks;
int noOfTables;

    public Facility(int noOfChair, int noOfRacks, int noOfTables) {
        this.noOfChair = noOfChair;
        this.noOfRacks = noOfRacks;
        this.noOfTables = noOfTables;
    }

    public int getNoOfChair() {
        return noOfChair;
    }

    public void setNoOfChair(int noOfChair) {
        this.noOfChair = noOfChair;
    }

    public int getNoOfRacks() {
        return noOfRacks;
    }

    public void setNoOfRacks(int noOfRacks) {
        this.noOfRacks = noOfRacks;
    }

    public int getNoOfTables() {
        return noOfTables;
    }

    public void setNoOfTables(int noOfTables) {
        this.noOfTables = noOfTables;
    }
}
