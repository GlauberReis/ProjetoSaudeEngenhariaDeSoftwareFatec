package br.com.cadastro.u.s;

import java.text.DateFormat;

public class Vacina {
	
	private String tipoVacina;
	private DateFormat dataVacina;	
		
	
	public Vacina(String tipoVacina, DateFormat dataVacina) {
		this.tipoVacina = tipoVacina;
		this.dataVacina = dataVacina;
	}
	
	
	public String getTipoVacina() {
		return tipoVacina;
	}
	public void setTipoVacina(String tipoVacina) {
		this.tipoVacina = tipoVacina;
	}
	public DateFormat getDataVacina() {
		return dataVacina;
	}
	public void setDataVacina(DateFormat dataVacina) {
		this.dataVacina = dataVacina;
	}
	
	
	
	
	
	
	
	
	

}
