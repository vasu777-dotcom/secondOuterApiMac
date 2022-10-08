package com.pnc.MacTesting.model;

import lombok.Data;
import lombok.NonNull;
import org.springframework.stereotype.Component;

@Data
public class Employee {
    @NonNull
    private int empId;
    @NonNull
    private String ename;
    @NonNull
    private double esal;
}
