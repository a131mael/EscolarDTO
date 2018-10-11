package org.aaf.escolar;

import java.io.Serializable;


public class MembroEventoDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;

	private MemberDTO idMembro;

	private EventoDTO idEvento;
	
	private double valorPago;
	

	public MembroEventoDTO() {
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

		final MembroEventoDTO other = (MembroEventoDTO) obj;
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

	public MemberDTO getIdMembro() {
		return idMembro;
	}

	public void setIdMembro(MemberDTO idMembro) {
		this.idMembro = idMembro;
	}

	
}