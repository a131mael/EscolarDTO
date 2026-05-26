package org.aaf.escolar;


import java.io.Serializable;
import java.util.Date;


import org.aaf.escolar.enums.EscolaEnum;

public class AlunoDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Long id;

	private String nomeAluno;

	private String codigo;
	
	private String serie;
	
	private String periodo;
	
	private String enderecoAluno;

	
	private String idIrmao1;
	private String idIrmao2;
	private String idIrmao3;
	private String idIrmao4;
	private String idIrmao5;
	
	
	
	
	private String contatoEmail1;

	private String contatoEmail2;

	private String contatoTelefone1;

	private String contatoNome1;

	private String contatoTelefone2;

	private String contatoNome2;

	private String contatoTelefone3;

	private String contatoNome3;

	private String contatoTelefone4;

	private String contatoNome4;

	private String contatoTelefone5;

	private String contatoNome5;

	private Boolean contato1WhatsValido;
	
	private Boolean contato2WhatsValido;
	
	private Boolean contato3WhatsValido;
	
	private Boolean contato4WhatsValido;
	
	private Boolean contato5WhatsValido;
	
	private EscolaEnum escola;
	
	private int idaVolta;
	
	public AlunoDTO() {
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

		final AlunoDTO other = (AlunoDTO) obj;
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

	public String getNomeAluno() {
		return nomeAluno;
	}

	public void setNomeAluno(String nomeAluno) {
		this.nomeAluno = nomeAluno;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getSerie() {
		return serie;
	}

	public void setSerie(String serie) {
		this.serie = serie;
	}

	public String getPeriodo() {
		return periodo;
	}

	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}

	public String getEnderecoAluno() {
		return enderecoAluno;
	}

	public void setEnderecoAluno(String enderecoAluno) {
		this.enderecoAluno = enderecoAluno;
	}

	public String getIdIrmao1() {
		return idIrmao1;
	}

	public void setIdIrmao1(String idIrmao1) {
		this.idIrmao1 = idIrmao1;
	}

	public String getIdIrmao2() {
		return idIrmao2;
	}

	public void setIdIrmao2(String idIrmao2) {
		this.idIrmao2 = idIrmao2;
	}

	public String getIdIrmao3() {
		return idIrmao3;
	}

	public void setIdIrmao3(String idIrmao3) {
		this.idIrmao3 = idIrmao3;
	}

	public String getIdIrmao4() {
		return idIrmao4;
	}

	public void setIdIrmao4(String idIrmao4) {
		this.idIrmao4 = idIrmao4;
	}

	public String getIdIrmao5() {
		return idIrmao5;
	}

	public void setIdIrmao5(String idIrmao5) {
		this.idIrmao5 = idIrmao5;
	}

	public String getContatoEmail1() {
		return contatoEmail1;
	}

	public void setContatoEmail1(String contatoEmail1) {
		this.contatoEmail1 = contatoEmail1;
	}

	public String getContatoEmail2() {
		return contatoEmail2;
	}

	public void setContatoEmail2(String contatoEmail2) {
		this.contatoEmail2 = contatoEmail2;
	}

	public String getContatoTelefone1() {
		return contatoTelefone1;
	}

	public void setContatoTelefone1(String contatoTelefone1) {
		this.contatoTelefone1 = contatoTelefone1;
	}

	public String getContatoNome1() {
		return contatoNome1;
	}

	public void setContatoNome1(String contatoNome1) {
		this.contatoNome1 = contatoNome1;
	}

	public String getContatoTelefone2() {
		return contatoTelefone2;
	}

	public void setContatoTelefone2(String contatoTelefone2) {
		this.contatoTelefone2 = contatoTelefone2;
	}

	public String getContatoNome2() {
		return contatoNome2;
	}

	public void setContatoNome2(String contatoNome2) {
		this.contatoNome2 = contatoNome2;
	}

	public String getContatoTelefone3() {
		return contatoTelefone3;
	}

	public void setContatoTelefone3(String contatoTelefone3) {
		this.contatoTelefone3 = contatoTelefone3;
	}

	public String getContatoNome3() {
		return contatoNome3;
	}

	public void setContatoNome3(String contatoNome3) {
		this.contatoNome3 = contatoNome3;
	}

	public String getContatoTelefone4() {
		return contatoTelefone4;
	}

	public void setContatoTelefone4(String contatoTelefone4) {
		this.contatoTelefone4 = contatoTelefone4;
	}

	public String getContatoNome4() {
		return contatoNome4;
	}

	public void setContatoNome4(String contatoNome4) {
		this.contatoNome4 = contatoNome4;
	}

	public String getContatoTelefone5() {
		return contatoTelefone5;
	}

	public void setContatoTelefone5(String contatoTelefone5) {
		this.contatoTelefone5 = contatoTelefone5;
	}

	public String getContatoNome5() {
		return contatoNome5;
	}

	public void setContatoNome5(String contatoNome5) {
		this.contatoNome5 = contatoNome5;
	}

	public Boolean getContato1WhatsValido() {
		return contato1WhatsValido;
	}

	public void setContato1WhatsValido(Boolean contato1WhatsValido) {
		this.contato1WhatsValido = contato1WhatsValido;
	}

	public Boolean getContato2WhatsValido() {
		return contato2WhatsValido;
	}

	public void setContato2WhatsValido(Boolean contato2WhatsValido) {
		this.contato2WhatsValido = contato2WhatsValido;
	}

	public Boolean getContato3WhatsValido() {
		return contato3WhatsValido;
	}

	public void setContato3WhatsValido(Boolean contato3WhatsValido) {
		this.contato3WhatsValido = contato3WhatsValido;
	}

	public Boolean getContato4WhatsValido() {
		return contato4WhatsValido;
	}

	public void setContato4WhatsValido(Boolean contato4WhatsValido) {
		this.contato4WhatsValido = contato4WhatsValido;
	}

	public Boolean getContato5WhatsValido() {
		return contato5WhatsValido;
	}

	public void setContato5WhatsValido(Boolean contato5WhatsValido) {
		this.contato5WhatsValido = contato5WhatsValido;
	}

	public EscolaEnum getEscola() {
		return escola;
	}

	public void setEscola(EscolaEnum escola) {
		this.escola = escola;
	}

	public int getIdaVolta() {
		return idaVolta;
	}

	public void setIdaVolta(int idaVolta) {
		this.idaVolta = idaVolta;
	}

	

}