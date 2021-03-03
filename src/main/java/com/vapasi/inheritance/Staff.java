package com.vapasi.inheritance;

public class Staff {
    public int teachers;
    public int helpers;
    public String dept;
    public Staff(int teachers,int helpers,String dept)
    {
        this.teachers=teachers;
        this.dept=dept;
        this.helpers=helpers;
    }
    public int getTeachers() {
        return teachers;
    }

    public void setTeachers(int teachers) {
        this.teachers = teachers;
    }

    public int getHelpers() {
        return helpers;
    }

    public void setHelpers(int helpers) {
        this.helpers = helpers;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }


}
