package com.koalito.dockyardapi.service.impl;

import com.koalito.dockyardapi.io.entity.EmployeeEntity;
import com.koalito.dockyardapi.io.repository.EmployeeRepository;
import com.koalito.dockyardapi.service.EmployeeService;
import com.koalito.dockyardapi.shared.dto.EmployeeDto;
import org.modelmapper.ModelMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public EmployeeDto createEmployee(EmployeeDto employeeDto) {
        EmployeeEntity chantierEntity = new EmployeeEntity();
        BeanUtils.copyProperties(employeeDto, chantierEntity);

        EmployeeEntity storedChantierDetails = employeeRepository.save(chantierEntity);
        EmployeeDto returnValue = new EmployeeDto();
        BeanUtils.copyProperties(storedChantierDetails, returnValue);

        return returnValue;
    }

    @Override
    public EmployeeDto getEmployeeWithId(Long employee) {
        return new ModelMapper().map(employeeRepository.findById(employee).get(), EmployeeDto.class);
    }
}
