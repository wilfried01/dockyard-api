package com.koalito.dockyardapi.ui.controller;

import com.koalito.dockyardapi.service.ChantierService;
import com.koalito.dockyardapi.shared.dto.ChantierDto;
import com.koalito.dockyardapi.ui.model.request.ChantierDetailsRequestModel;
import com.koalito.dockyardapi.ui.model.response.ChantierRest;
import org.modelmapper.ModelMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("chantiers")    // localhost:8080/chantiers
public class ChantierController {

    @Autowired
    ChantierService chantierService;

    @GetMapping
    public Collection<ChantierRest> getChantier() {
        return chantierService.getChantiers().stream().map(chantierDto -> new ModelMapper().map(chantierDto, ChantierRest.class)).toList();
    }

    @PostMapping
    public ChantierRest createChantier(@RequestBody ChantierDetailsRequestModel chantierDetails) {
        ChantierRest returnValue = new ChantierRest();
        ChantierDto chantierDto = new ChantierDto();
        BeanUtils.copyProperties(chantierDetails, chantierDto);

        ChantierDto createChantier = chantierService.createChantier(chantierDto);
        BeanUtils.copyProperties(createChantier, returnValue);

        return returnValue;
    }

    @PutMapping
    public String updateChantier() {
        return "Request to update a chantier called";
    }

    @DeleteMapping
    public String deleteChantier() {
        return "Request to delete a chantier called";
    }
}
