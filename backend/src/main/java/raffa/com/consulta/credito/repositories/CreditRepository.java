package raffa.com.consulta.credito.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import raffa.com.consulta.credito.models.Credit;

import java.util.List;

@Repository
public interface CreditRepository extends JpaRepository<Credit, Long> {
    List<Credit> findByNumeroNfse(String numeroNfse);
    Credit findByNumeroCredito(String numeroCredito);
}