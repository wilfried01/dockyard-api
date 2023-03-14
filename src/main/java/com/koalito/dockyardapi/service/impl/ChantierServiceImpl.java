package com.koalito.dockyardapi.service.impl;

import com.koalito.dockyardapi.io.entity.ChantierEntity;
import com.koalito.dockyardapi.io.repository.ChantierRepository;
import com.koalito.dockyardapi.service.ChantierService;
import com.koalito.dockyardapi.shared.dto.ChantierDto;
import org.modelmapper.ModelMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Service
public class ChantierServiceImpl implements ChantierService {

    @Autowired
    ChantierRepository chantierRepository;
    @Override
    public ChantierDto createChantier(ChantierDto chantierDto) {
        ChantierEntity chantierEntity = new ChantierEntity();
        BeanUtils.copyProperties(chantierDto, chantierEntity);

        ChantierEntity storedChantierDetails = chantierRepository.save(chantierEntity);
        ChantierDto returnValue = new ChantierDto();
        BeanUtils.copyProperties(storedChantierDetails, returnValue);

        return returnValue;
    }

    @Override
    public ChantierDto getChantierWithId(Long id) {
        return new ModelMapper().map(chantierRepository.findById(id).get(), ChantierDto.class);
    }

    @Override
    public Collection<ChantierDto> getChantiers() {
        List<ChantierDto> listChantiers = new ArrayList<>();
        chantierRepository.findAll().forEach((item) -> {listChantiers.add(new ModelMapper().map(item, ChantierDto.class));});
        return listChantiers;
    }
}
