package lt.vtvpmc.ems.pw.data.entities;

import javax.persistence.*;

@Entity
@Table (name = "PARENT_INFORMATION")
public class ParentInformation {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
	
	private String tevoVardas;
	private String tevoPavarde;
	private String tevoAdresas;
	private String tevoTelefonas;
	private String mamosVardas;
	private String mamosPavarde;
	private String mamosAdresas;
	private String mamosTelefonas;
	private String globejoVardas;
	private String globejoPavarde;
	private String globejoAdresas;
	private String globejoTelefonas;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTevoVardas() {
		return tevoVardas;
	}
	public void setTevoVardas(String tevoVardas) {
		this.tevoVardas = tevoVardas;
	}
	public String getTevoPavarde() {
		return tevoPavarde;
	}
	public void setTevoPavarde(String tevoPavarde) {
		this.tevoPavarde = tevoPavarde;
	}
	public String getTevoAdresas() {
		return tevoAdresas;
	}
	public void setTevoAdresas(String tevoAdresas) {
		this.tevoAdresas = tevoAdresas;
	}
	public String getTevoTelefonas() {
		return tevoTelefonas;
	}
	public void setTevoTelefonas(String tevoTelefonas) {
		this.tevoTelefonas = tevoTelefonas;
	}
	public String getMamosVardas() {
		return mamosVardas;
	}
	public void setMamosVardas(String mamosVardas) {
		this.mamosVardas = mamosVardas;
	}
	public String getMamosPavarde() {
		return mamosPavarde;
	}
	public void setMamosPavarde(String mamosPavarde) {
		this.mamosPavarde = mamosPavarde;
	}
	public String getMamosAdresas() {
		return mamosAdresas;
	}
	public void setMamosAdresas(String mamosAdresas) {
		this.mamosAdresas = mamosAdresas;
	}
	public String getMamosTelefonas() {
		return mamosTelefonas;
	}
	public void setMamosTelefonas(String mamosTelefonas) {
		this.mamosTelefonas = mamosTelefonas;
	}
	public String getGlobejoVardas() {
		return globejoVardas;
	}
	public void setGlobejoVardas(String globejoVardas) {
		this.globejoVardas = globejoVardas;
	}
	public String getGlobejoPavarde() {
		return globejoPavarde;
	}
	public void setGlobejoPavarde(String globejoPavarde) {
		this.globejoPavarde = globejoPavarde;
	}
	public String getGlobejoAdresas() {
		return globejoAdresas;
	}
	public void setGlobejoAdresas(String globejoAdresas) {
		this.globejoAdresas = globejoAdresas;
	}
	public String getGlobejoTelefonas() {
		return globejoTelefonas;
	}
	public void setGlobejoTelefonas(String globejoTelefonas) {
		this.globejoTelefonas = globejoTelefonas;
	}
	
	

}
