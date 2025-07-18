package raffa.com.consulta.credito.models;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "credito")
public class Credit {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        private String numeroCredito;
        private String numeroNfse;
        private LocalDate dataConstituicao;
        private BigDecimal valorIssqn;
        private String tipoCredito;
        private boolean simplesNacional;
        private BigDecimal aliquota;
        private BigDecimal valorFaturado;
        private BigDecimal valorDeducao;
        private BigDecimal baseCalculo;

        // Construtor vazio
        public Credit() {}

        // Construtor com todos os campos
        public Credit(Long id, String numeroCredito, String numeroNfse, LocalDate dataConstituicao,
                      BigDecimal valorIssqn, String tipoCredito, boolean simplesNacional,
                      BigDecimal aliquota, BigDecimal valorFaturado, BigDecimal valorDeducao,
                      BigDecimal baseCalculo) {
                this.id = id;
                this.numeroCredito = numeroCredito;
                this.numeroNfse = numeroNfse;
                this.dataConstituicao = dataConstituicao;
                this.valorIssqn = valorIssqn;
                this.tipoCredito = tipoCredito;
                this.simplesNacional = simplesNacional;
                this.aliquota = aliquota;
                this.valorFaturado = valorFaturado;
                this.valorDeducao = valorDeducao;
                this.baseCalculo = baseCalculo;
        }

        // Getters e Setters
        public Long getId() {
                return id;
        }

        public void setId(Long id) {
                this.id = id;
        }

        public String getNumeroCredito() {
                return numeroCredito;
        }

        public void setNumeroCredito(String numeroCredito) {
                this.numeroCredito = numeroCredito;
        }

        public String getNumeroNfse() {
                return numeroNfse;
        }

        public void setNumeroNfse(String numeroNfse) {
                this.numeroNfse = numeroNfse;
        }

        public LocalDate getDataConstituicao() {
                return dataConstituicao;
        }

        public void setDataConstituicao(LocalDate dataConstituicao) {
                this.dataConstituicao = dataConstituicao;
        }

        public BigDecimal getValorIssqn() {
                return valorIssqn;
        }

        public void setValorIssqn(BigDecimal valorIssqn) {
                this.valorIssqn = valorIssqn;
        }

        public String getTipoCredito() {
                return tipoCredito;
        }

        public void setTipoCredito(String tipoCredito) {
                this.tipoCredito = tipoCredito;
        }

        public boolean isSimplesNacional() {
                return simplesNacional;
        }

        public void setSimplesNacional(boolean simplesNacional) {
                this.simplesNacional = simplesNacional;
        }

        public BigDecimal getAliquota() {
                return aliquota;
        }

        public void setAliquota(BigDecimal aliquota) {
                this.aliquota = aliquota;
        }

        public BigDecimal getValorFaturado() {
                return valorFaturado;
        }

        public void setValorFaturado(BigDecimal valorFaturado) {
                this.valorFaturado = valorFaturado;
        }

        public BigDecimal getValorDeducao() {
                return valorDeducao;
        }

        public void setValorDeducao(BigDecimal valorDeducao) {
                this.valorDeducao = valorDeducao;
        }

        public BigDecimal getBaseCalculo() {
                return baseCalculo;
        }

        public void setBaseCalculo(BigDecimal baseCalculo) {
                this.baseCalculo = baseCalculo;
        }
}
