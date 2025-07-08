package raffa.com.consulta.credito.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import raffa.com.consulta.credito.dtos.CreditDto;
import raffa.com.consulta.credito.services.CreditService;

import java.util.List;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(CreditController.class)
class CreditControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private CreditService service;  // MOCK do service para injetar no controller

    @Test
    void testGetByNumberNfse() throws Exception {
        CreditDto dto = new CreditDto();
        dto.setNumeroCredito("123456");

        when(service.findByNumberNfse("NF123")).thenReturn(List.of(dto));

        mockMvc.perform(get("/api/creditos/NF123"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$[0].numeroCredito").value("123456"));
    }

    @Test
    void testGetByCreditNumber() throws Exception {
        CreditDto dto = new CreditDto();
        dto.setNumeroCredito("654321");

        when(service.findByCreditNumber("654321")).thenReturn(dto);

        mockMvc.perform(get("/api/creditos/credito/654321"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.numeroCredito").value("654321"));
    }
}
