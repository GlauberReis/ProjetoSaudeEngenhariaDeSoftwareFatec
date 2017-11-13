package br.com.cadastro.u.s;

import java.time.LocalDate;

public class Exame {	
	
	private String resultadoExame;
	private LocalDate dataExame;	
	
	public Exame(String resultadoExame, LocalDate dataExame) {		
		this.resultadoExame = resultadoExame;
		this.dataExame = dataExame;
	}
	
	public String getResultadoExame() {
		return resultadoExame;
	}
	public void setResultadoExame(String resultadoExame) {
		this.resultadoExame = resultadoExame;
	}
	public LocalDate getDataExame() {
		return dataExame;
	}
	public void setDataExame(LocalDate dataExame) {
		this.dataExame = dataExame;
	}	

}
