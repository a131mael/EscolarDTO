package org.aaf.escolar;


import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class ContratoAlunoDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private AlunoDTO aluno; // Alteração feita aqui
    private Long idContrato;
    private Double valorContrato;
    private Date dataCriacao;
    private List<BoletoDTO> boletos;

    private Short ano;
    private String nomeResponsavel;
    private Boolean acordo;
    private Integer numeroParcelas;
    private String cpfResponsavel;
    private double valorMensal;

    public ContratoAlunoDTO() {
    }

    public AlunoDTO getAluno() {
        return aluno;
    }

    public void setAluno(AlunoDTO aluno) {
        this.aluno = aluno;
    }

    public Long getIdContrato() {
        return idContrato;
    }

    public void setIdContrato(Long idContrato) {
        this.idContrato = idContrato;
    }

    public Double getValorContrato() {
        return valorContrato;
    }

    public void setValorContrato(Double valorContrato) {
        this.valorContrato = valorContrato;
    }

    public Date getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(Date dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public List<BoletoDTO> getBoletos() {
        return boletos;
    }

    public void setBoletos(List<BoletoDTO> boletos) {
        this.boletos = boletos;
    }

    public Short getAno() {
        return ano;
    }

    public void setAno(Short ano) {
        this.ano = ano;
    }

    public String getNomeResponsavel() {
        return nomeResponsavel;
    }

    public void setNomeResponsavel(String nomeResponsavel) {
        this.nomeResponsavel = nomeResponsavel;
    }

    public Boolean getAcordo() {
        return acordo;
    }

    public void setAcordo(Boolean acordo) {
        this.acordo = acordo;
    }

    public Integer getNumeroParcelas() {
        return numeroParcelas;
    }

    public void setNumeroParcelas(Integer numeroParcelas) {
        this.numeroParcelas = numeroParcelas;
    }

    public String getCpfResponsavel() {
        return cpfResponsavel;
    }

    public void setCpfResponsavel(String cpfResponsavel) {
        this.cpfResponsavel = cpfResponsavel;
    }

    public double getValorMensal() {
        return valorMensal;
    }

    public void setValorMensal(double valorMensal) {
        this.valorMensal = valorMensal;
    }
}

