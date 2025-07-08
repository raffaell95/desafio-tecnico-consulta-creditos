package raffa.com.consulta.credito.dtos;

import java.time.LocalDate;


public class CreditDto {
    private String numeroCredito;
    private String numeroNfse;
    private LocalDate dataConstituicao;
    private Double valorIssqn;
    private String tipoCredito;
    private boolean simplesNacional;
    private Double aliquota;
    private Double valorFaturado;
    private Double valorDeducao;
    private Double baseCalculo;

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

    public Double getValorIssqn() {
        return valorIssqn;
    }

    public void setValorIssqn(Double valorIssqn) {
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

    public Double getAliquota() {
        return aliquota;
    }

    public void setAliquota(Double aliquota) {
        this.aliquota = aliquota;
    }

    public Double getValorFaturado() {
        return valorFaturado;
    }

    public void setValorFaturado(Double valorFaturado) {
        this.valorFaturado = valorFaturado;
    }

    public Double getValorDeducao() {
        return valorDeducao;
    }

    public void setValorDeducao(Double valorDeducao) {
        this.valorDeducao = valorDeducao;
    }

    public Double getBaseCalculo() {
        return baseCalculo;
    }

    public void setBaseCalculo(Double baseCalculo) {
        this.baseCalculo = baseCalculo;
    }
}
