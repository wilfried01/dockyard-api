package com.koalito.dockyardapi.ui.controller;

import com.koalito.dockyardapi.service.ChantierService;
import com.koalito.dockyardapi.service.EmployeeService;
import com.koalito.dockyardapi.service.PlanningService;
import com.koalito.dockyardapi.shared.dto.ChantierDto;
import com.koalito.dockyardapi.shared.dto.EmployeeDto;
import com.koalito.dockyardapi.shared.dto.PlanningDto;
import com.koalito.dockyardapi.ui.model.request.PlanningDetailRequestModel;
import com.koalito.dockyardapi.ui.model.response.PlanningRest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("plannings")
public class PlanningController {

    @Autowired
    PlanningService planningService;

    @Autowired
    EmployeeService employeeService;

    @Autowired
    ChantierService chantierService;

    @GetMapping
    public String getPlanning() {
        return "Request to list all planning of all employee on all chantier called";
    }

    @PostMapping
    public PlanningRest addPlanning(@RequestBody PlanningDetailRequestModel planningDetail) {
        EmployeeDto employeeDto = employeeService.getEmployeeWithId(planningDetail.getEmployee());
        ChantierDto chantierDto = chantierService.getChantierWithId(planningDetail.getChantier());
        PlanningDto planningDto = new PlanningDto();
        planningDto.setChantier(chantierDto);
        planningDto.setEmployee(employeeDto);
        planningDto.setHeure(planningDetail.getHeure());
        planningDto.setId(new PlanningDto.PlanningKeyDto(planningDetail.getChantier(), planningDetail.getEmployee()));
        planningDto.setDate(planningDetail.getDate());
        PlanningDto addingPlaning = planningService.addPlanning(planningDto);

        PlanningRest returnValue = new PlanningRest();

        returnValue.setChantier(addingPlaning.getChantier().getAdresse());
        returnValue.setEmployee(addingPlaning.getEmployee().getNom());
        returnValue.setHeure(addingPlaning.getHeure());
        returnValue.setDate(addingPlaning.getDate());
        return returnValue;

    }

    @PutMapping
    public String updatePlanning() {
        return "Request to update employee planning on a chantier called";
    }

    @DeleteMapping
    public String deletePlanning() {
        return "Request to delete employee planning on a chantier called";
    }
}
