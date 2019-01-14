package com.leayw.patterns.create.prototype;

import java.util.ArrayList;
import java.util.List;

public class Employees {
    private List<String> empList;

    public Employees() {
        empList = new ArrayList<>();
    }

    public Employees(List<String> empList) {
        this.empList = empList;
    }

    public List<String> getEmpList() {
        return empList;
    }

    public void loadData() {
        empList.add("Singleton");
        empList.add("Factory");
        empList.add("Abstract factory");
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        List<String> temp = new ArrayList<>();
        for (String s : this.empList) {
            temp.add(s);
        }
        return new Employees(temp);
    }
}
