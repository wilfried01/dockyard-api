package com.koalito.dockyardapi.service;

import com.koalito.dockyardapi.shared.dto.ChantierDto;

import java.util.Collection;

public interface ChantierService {
    ChantierDto createChantier(ChantierDto chantierDto);

    ChantierDto getChantierWithId(Long id);

    Collection<ChantierDto> getChantiers();
}
