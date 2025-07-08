package raffa.com.consulta.credito.services;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import raffa.com.consulta.credito.dtos.CreditDto;
import raffa.com.consulta.credito.mappers.CreditMapper;
import raffa.com.consulta.credito.models.Credit;
import raffa.com.consulta.credito.repositories.CreditRepository;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class CreditServiceTest {

    @Mock
    private CreditRepository creditRepository;

    @Mock
    private CreditMapper creditMapper;

    @InjectMocks
    private CreditService creditService;

    @Test
    void testFindByNumeroCredito() {
        Credit mockCredit = new Credit();
        mockCredit.setNumeroCredito("123456");

        CreditDto mockDto = new CreditDto();
        mockDto.setNumeroCredito("123456");

        when(creditRepository.findByNumeroCredito("123456")).thenReturn(mockCredit);
        when(creditMapper.toDTO(mockCredit)).thenReturn(mockDto);

        CreditDto result = creditService.findByCreditNumber("123456");

        assertNotNull(result);
        assertEquals("123456", result.getNumeroCredito());
    }

    @Test
    void testFindByNumeroNfse() {
        Credit credit1 = new Credit();
        credit1.setNumeroCredito("123456");

        Credit credit2 = new Credit();
        credit2.setNumeroCredito("123456");

        List<Credit> creditList = List.of(credit1, credit2);

        CreditDto dto1 = new CreditDto();
        dto1.setNumeroCredito("123456");

        CreditDto dto2 = new CreditDto();
        dto2.setNumeroCredito("654321");

        when(creditRepository.findByNumeroNfse("NF123")).thenReturn(creditList);
        when(creditMapper.toDTO(credit1)).thenReturn(dto1);
        when(creditMapper.toDTO(credit2)).thenReturn(dto2);

        List<CreditDto> result = creditService.findByNumberNfse("NF123");

        assertNotNull(result);
        assertEquals(2, result.size());
        assertEquals("123456", result.get(0).getNumeroCredito());
        assertEquals("002", result.get(1).getNumeroCredito());
    }

}
