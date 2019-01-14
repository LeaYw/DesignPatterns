package com.leayw.patterns.create.prototype;

public class PrototypePatternTest {

    public static void main(String[] args) throws CloneNotSupportedException {
        Employees emps = new Employees();
        emps.loadData();

        Employees empsNew = (Employees) emps.clone();
        Employees empsNew2 = (Employees) emps.clone();

        empsNew.getEmpList().add("Builder");

        empsNew2.getEmpList().add("prototype");

        System.out.println("emps list: " + emps.getEmpList());
        System.out.println("empsNew list: " + empsNew.getEmpList());
        System.out.println("empsNew2 list: " + empsNew2.getEmpList());

    }
}
