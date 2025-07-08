package raffa.com.consulta.credito.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import raffa.com.consulta.credito.dtos.CreditDto;
import raffa.com.consulta.credito.mappers.CreditMapper;
import raffa.com.consulta.credito.repositories.CreditRepository;

import java.util.List;

@Service
public class CreditService {

    @Autowired
    private CreditRepository repository;

    @Autowired
    private CreditMapper mapper;

    public List<CreditDto> findByNumberNfse(String numeroNfse){
        return repository.findByNumeroNfse(numeroNfse)
                .stream()
                .map(mapper::toDTO)
                .toList();
    }

    public CreditDto findByCreditNumber(String numeroCredito){
        return mapper.toDTO(repository.findByNumeroCredito(numeroCredito));
    }
}
