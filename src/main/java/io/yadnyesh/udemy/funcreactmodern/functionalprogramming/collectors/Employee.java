package io.yadnyesh.udemy.funcreactmodern.functionalprogramming.collectors;

import lombok.*;
import lombok.extern.slf4j.Slf4j;

import java.util.Date;

@Slf4j
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Employee implements Comparable<Employee>{
    private int id;
    private String name;
    private char gender;
    private Date dob;
    private String city;
    private String designation;
    private Date joiningDate;
    private Double salary;

    @Override
    public int compareTo(Employee o) {
        return Integer.compare(this.id, o.id);
    }
}
