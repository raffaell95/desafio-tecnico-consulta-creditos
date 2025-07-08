package raffa.com.consulta.credito.controllers;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import raffa.com.consulta.credito.dtos.CreditDto;
import raffa.com.consulta.credito.services.CreditService;

import java.util.List;

@RestController
@RequestMapping("/api/creditos")
@Tag(name = "Créditos", description = "API para consulta e gerenciamento de créditos constituídos")
public class CreditController {

    @Autowired
    private CreditService service;

    @GetMapping("/{numeroNfse}")
    @Operation(summary = "Buscar créditos por número da NFS-e", description = "Retorna todos os créditos vinculados ao número da NFS-e informado.")
    public List<CreditDto> getByNumberNfse(@PathVariable String numeroNfse){
        return service.findByNumberNfse(numeroNfse);
    }

    @GetMapping("credito/{numeroCredito}")
    @Operation(summary = "Buscar crédito por número do crédito", description = "Retorna os dados de um crédito a partir do número do crédito informado.")
    public CreditDto getByCreditNumber(@PathVariable String numeroCredito){
        return service.findByCreditNumber(numeroCredito);
    }
}
