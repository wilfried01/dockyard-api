package com.koalito.dockyardapi.service;

import com.koalito.dockyardapi.shared.dto.EmployeeDto;

public interface EmployeeService {
    EmployeeDto createEmployee(EmployeeDto employeeDto);

    EmployeeDto getEmployeeWithId(Long employee);


}
