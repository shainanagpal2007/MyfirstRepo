package com.vapasi.oopsexp;

public class Staff {

    public int age;
    public String fName;
    public String lName;
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }


    public Staff(int age,String fName,String lName)
    {
        this.age=age;
        this.fName=fName;
        this.lName=lName;
    }

}
