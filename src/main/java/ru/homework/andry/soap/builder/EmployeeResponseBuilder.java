package ru.homework.andry.soap.builder;

import ru.homework.andry.soap.model.employee.AbstractEmployee;

import java.util.List;

public interface EmployeeResponseBuilder<T> {
    void build(T response, List<AbstractEmployee> employees);
}