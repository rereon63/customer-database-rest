package org.bigchungus.Payroll;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;


@Entity
public class Employee {
    private @Id @GeneratedValue Long id;
    private String name;
    private String role;

    Employee() {}

    Employee(String name, String role) {
        this.name = name;
        this.role = role;
    }

    public Long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getRole() {
        return this.role;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "Employee{" + "id=" + this.id + ", name='" + this.name + '\'' + ", role='" + this.role + '\'' + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if(!(o instanceof Employee))
            return false;
        Employee employee = (Employee) o;
        return this.id.equals(employee.id) && this.name.equals(employee.name) && this.role.equals(employee.role);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(this.id, this.name, this.role);
    }
}
