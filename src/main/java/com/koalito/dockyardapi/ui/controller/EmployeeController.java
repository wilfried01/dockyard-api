package com.koalito.dockyardapi.ui.controller;

import com.koalito.dockyardapi.service.EmployeeService;
import com.koalito.dockyardapi.shared.dto.EmployeeDto;
import com.koalito.dockyardapi.ui.model.request.EmployeeDetailRequestModel;
import com.koalito.dockyardapi.ui.model.response.EmployeeRest;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("employees")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping
    public String getEmployees() {
        return "Request to list all employees called";
    }

    @PostMapping
    public EmployeeRest createEmployee(@RequestBody EmployeeDetailRequestModel employeeDetail) {
        EmployeeRest returnValue = new EmployeeRest();
        EmployeeDto employeeDto = new EmployeeDto();
        BeanUtils.copyProperties(employeeDetail, employeeDto);

        EmployeeDto createEmployee = employeeService.createEmployee(employeeDto);
        BeanUtils.copyProperties(createEmployee, returnValue);

        return returnValue;
    }

    @PutMapping
    public String updateEmployee() {
        return "Request to update a employee called";
    }

    @DeleteMapping
    public String deleteEmployee() {
        return "Request to delete a employee called";
    }
}
