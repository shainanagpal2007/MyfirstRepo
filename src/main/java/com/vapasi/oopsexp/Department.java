package com.vapasi.oopsexp;

public class Department {
    private int did;
    private String dname;
    private Library library;


    public int getDid() {
        return did;
    }

    public void setDid(int did) {
        this.did = did;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }
    public Department(int did, String dname,Library library)
    {
     this.did=did;
     this.dname=dname;
     this.library=library;
    }

    public Library getLibrary() {
        return library;
    }
}
