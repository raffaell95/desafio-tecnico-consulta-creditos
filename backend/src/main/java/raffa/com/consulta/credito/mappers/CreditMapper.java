package raffa.com.consulta.credito.mappers;

import org.mapstruct.Mapper;
import raffa.com.consulta.credito.dtos.CreditDto;
import raffa.com.consulta.credito.models.Credit;

@Mapper(componentModel = "spring")
public interface CreditMapper {
    CreditDto toDTO(Credit entity);
}
