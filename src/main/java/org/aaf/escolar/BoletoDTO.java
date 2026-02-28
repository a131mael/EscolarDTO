package org.aaf.escolar;

import java.io.Serializable;
import java.util.Date;

public class BoletoDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;

	private Date vencimento;
	private Date dataPagamento;
	
	private double valorNominal;
	private Double valorPago;
	private Boolean cancelado;

    private Boolean protestado;
    
    private String statusBoleto;
    
    private String linhaDigitavel;

	public BoletoDTO() {
	}

	@Override
	public int hashCode() {
		int hash = 7;
		hash = 11 * hash + (this.getId() != null ? this.getId().hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}

		final BoletoDTO other = (BoletoDTO) obj;
		if (this.getId() != other.getId() && (this.getId() == null || !this.getId().equals(other.id))) {
			return false;
		}
		return true;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getVencimento() {
		return vencimento;
	}

	public void setVencimento(Date vencimento) {
		this.vencimento = vencimento;
	}

	public Date getDataPagamento() {
		return dataPagamento;
	}

	public void setDataPagamento(Date dataPagamento) {
		this.dataPagamento = dataPagamento;
	}

	public double getValorNominal() {
		return valorNominal;
	}

	public void setValorNominal(double valorNominal) {
		this.valorNominal = valorNominal;
	}

	public Double getValorPago() {
		return valorPago;
	}

	public void setValorPago(Double valorPago) {
		this.valorPago = valorPago;
	}

	public Boolean getCancelado() {
		return cancelado;
	}

	public void setCancelado(Boolean cancelado) {
		this.cancelado = cancelado;
	}

	public Boolean getProtestado() {
		return protestado;
	}

	public void setProtestado(Boolean protestado) {
		this.protestado = protestado;
	}

	public String getStatusBoleto() {
		return statusBoleto;
	}

	public void setStatusBoleto(String statusBoleto) {
		this.statusBoleto = statusBoleto;
	}

	public String getLinhaDigitavel() {
		return linhaDigitavel;
	}

	public void setLinhaDigitavel(String linhaDigitavel) {
		this.linhaDigitavel = linhaDigitavel;
	}

}