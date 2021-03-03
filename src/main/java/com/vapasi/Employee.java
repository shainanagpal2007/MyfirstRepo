package com.vapasi;

public class Employee {
    private int employeeId;
    private String employeeName;
    private String department;

    public int getEmployeeId() {
        return employeeId;
    }
    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }
    public String getEmployeeName() {
        return employeeName;
    }
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public static void main(String args[])
    {
        Employee e1=new Employee();
        e1.setEmployeeId(1);
        e1.setEmployeeName("John");
        e1.setDepartment("Sales");

        System.out.println("=============");
        System.out.println("Employee Id: "+e1.getEmployeeId());
        System.out.println("Employee Name: "+e1.getEmployeeName());
        System.out.println("Employee Department: "+e1.getDepartment());
    }
}
