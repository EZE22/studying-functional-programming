package model;

import java.util.Objects;

public class Employee {
    private long id;
    private String name;
    private long networth;

    public Employee(long id, String name, long networth) {
        this.id = id;
        this.name = name;
        this.networth = networth;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getNetworth() {
        return networth;
    }

    public void setNetworth(long networth) {
        this.networth = networth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id && networth == employee.networth && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, networth);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", networth=" + networth +
                '}';
    }
}
