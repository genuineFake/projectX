package lt.vtvpmc.ems.pw.data.entities;
import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "REQUEST")
public class Request {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;

	@Temporal(TemporalType.TIMESTAMP)
	private Date prasymoData;
	
	private String grupe;
	private String pakopa;
	private boolean issilavinimoDokumentas;
	private boolean sveikatosPazyma;
	private boolean nuotraukos;
	private boolean pasoKopija;
	private boolean sauktinioLiudijimas;
	private boolean mokestis;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getPrasymoData() {
		return prasymoData;
	}
	public void setPrasymoData(Date prasymoData) {
		this.prasymoData = prasymoData;
	}
	public String getGrupe() {
		return grupe;
	}
	public void setGrupe(String grupe) {
		this.grupe = grupe;
	}
	public String getPakopa() {
		return pakopa;
	}
	public void setPakopa(String pakopa) {
		this.pakopa = pakopa;
	}
	public boolean isIssilavinimoDokumentas() {
		return issilavinimoDokumentas;
	}
	public void setIssilavinimoDokumentas(boolean issilavinimoDokumentas) {
		this.issilavinimoDokumentas = issilavinimoDokumentas;
	}
	public boolean isSveikatosPazyma() {
		return sveikatosPazyma;
	}
	public void setSveikatosPazyma(boolean sveikatosPazyma) {
		this.sveikatosPazyma = sveikatosPazyma;
	}
	public boolean isNuotraukos() {
		return nuotraukos;
	}
	public void setNuotraukos(boolean nuotraukos) {
		this.nuotraukos = nuotraukos;
	}
	public boolean isPasoKopija() {
		return pasoKopija;
	}
	public void setPasoKopija(boolean pasoKopija) {
		this.pasoKopija = pasoKopija;
	}
	public boolean isSauktinioLiudijimas() {
		return sauktinioLiudijimas;
	}
	public void setSauktinioLiudijimas(boolean sauktinioLiudijimas) {
		this.sauktinioLiudijimas = sauktinioLiudijimas;
	}
	public boolean isMokestis() {
		return mokestis;
	}
	public void setMokestis(boolean mokestis) {
		this.mokestis = mokestis;
	}
	
	


}
