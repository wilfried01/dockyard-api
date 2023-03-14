package com.koalito.dockyardapi.service.impl;

import com.koalito.dockyardapi.io.entity.PlanningEntity;
import com.koalito.dockyardapi.io.repository.PlanningRepository;
import com.koalito.dockyardapi.service.ChantierService;
import com.koalito.dockyardapi.service.EmployeeService;
import com.koalito.dockyardapi.service.PlanningService;
import com.koalito.dockyardapi.shared.dto.PlanningDto;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlanningServiceImpl implements PlanningService {

    @Autowired
    PlanningRepository planningRepository;

    @Autowired
    ChantierService chantierService;

    @Autowired
    EmployeeService employeeService;

    @Override
    public PlanningDto addPlanning(PlanningDto planningDto) {
        // PlanningEntity planningEntity = new PlanningEntity();
//        BeanUtils.copyProperties(planningDto, planningEntity);
        ModelMapper modelMapper = new ModelMapper();
        PlanningEntity planningEntity = modelMapper.map(planningDto, PlanningEntity.class);
        PlanningEntity storedPlanningDetails = planningRepository.save(planningEntity);
        PlanningDto returnValue = modelMapper.map(storedPlanningDetails, PlanningDto.class);
        // BeanUtils.copyProperties(storedPlanningDetails, returnValue);

        return returnValue;
    }
}
