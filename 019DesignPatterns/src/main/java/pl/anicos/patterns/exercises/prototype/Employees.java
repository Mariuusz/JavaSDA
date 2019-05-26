package pl.anicos.patterns.exercises.prototype;

import java.util.ArrayList;
import java.util.List;

public class Employees implements Cloneable {

    private final List<String> empList;

    public Employees() {
        empList = new ArrayList<String>();
    }

    public Employees(List<String> list) {
        this.empList = list;
    }

    public void addNew(String newEmp) {
        empList.add(newEmp);
    }

    public List<String> getEmpList() {
        return empList;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        List<String> temp = new ArrayList<String>();
        for (String s : this.getEmpList()) {
            temp.add(s);
        }
        return new Employees(temp);
    }
}