package lt.vtvpmc.ems.pw.data.entities;

import javax.persistence.*;

@Entity
@Table (name = "SUBJECTS_TO_CHOOSE")
public class SubjectsToChoose {
	@Id
	@SequenceGenerator(name="seq",sequenceName="sequence")        
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq") 
	@Column(name = "OPTIONAL_ID")
	private int Id;
	
	@Column (name = "RUSU_II")
	private int rusu2;
	
	@Column (name = "ANGLU_II")
	private int anglu2;
	
	@Column (name = "VOKIECIU_II")
	private int vokieciu2;
	
	@Column (name = "DIZAINAS")
	private int dizainas;
	
	@Column (name = "DAILE")
	private int daile;
	
	@Column (name = "TEATRAS")
	private int teatras;
	
	@Column (name = "MUZIKA")
	private int muzika;
	
	@Column (name = "INFORMACINES_TECHNOLOGIJOS")
	private int informacinesTechnologijos;
	
	@Column (name = "LIETUVIU_GIMT_ISPL")
	private int lietuviuGimtojiIspl;
	
	@Column (name = "LIETUVIU_VALST_ISPL")
	private int lietuviuValstybineIspl;
	
	@Column (name = "UZSIENIO_KALBA_iSPL")
	private int uzsienioKalbaIspl;
	
	@Column (name = "ISTORIJA_ISPL")
	private int istorijaIspl;
	
	@Column (name = "MATEMATIKA_ISPL")
	private int matematikaIspl;
	
	@Column (name = "BIOLOGIJA_ISPL")
	private int biologijaIspl;
	
	@Column (name = "FIZIKA_ISPL")
	private int fizikaIspl;
	
	@Column (name = "CHEMIJA_ISPL")
	private int chemijaIspl;
	
	@Column (name = "BIOLOGIJA_MOD_I")
	private int biologijaMod1;
	
	@Column (name = "BIOLOGIJA_MOD_II")
	private int biologijaMod2;
	
	@Column (name = "CHEMIJA_MOD")
	private int chemijaMod;
	
	@Column (name = "FIZIKA_MOD_I")
	private int fizikaMod1;
	
	@Column (name = "FIZIKA_MOD_II")
	private int fizikaMod2;
	
	@Column (name = "FIZIKA_MOD_III")
	private int fizikaMod3;
	
	@Column (name = "MATEMATIKA_MOD_I")
	private int matematikaMod1;
	
	@Column (name = "MATEMATIKA_MOD_II")
	private int matematikaMod2;
	
	@Column (name = "MATEMATIKA_MOD_III")
	private int matematikaMod3;
	
	public SubjectsToChoose(){
	}
	
	public SubjectsToChoose(int rusu2, int anglu2, int vokieciu2, int dizainas, 
			int daile, int teatras, int muzika, int informacinesTechnologijos, 
			int lietuviuGimtojiIspl, int lietuviuValstybineIspl, int uzsienioKalbaIspl, 
			int istorijaIspl, int matematikaIspl, int biologijaIspl, int fizikaIspl, 
			int chemijaIspl, int biologijaMod1, int biologijaMod2, int chemijaMod, 
			int fizikaMod1, int fizikaMod2, int fizikaMod3, int matematikaMod1, 
			int matematikaMod2,int matematikaMod3){
		this.rusu2 = rusu2;
		this.anglu2 = anglu2;
		this.vokieciu2 = vokieciu2;
		this.dizainas = dizainas;
		this.daile = daile;
		this.teatras = teatras;
		this.muzika = muzika;
		this.informacinesTechnologijos = informacinesTechnologijos;
		this.lietuviuGimtojiIspl = lietuviuGimtojiIspl;
		this.lietuviuValstybineIspl = lietuviuValstybineIspl;
		this.uzsienioKalbaIspl = uzsienioKalbaIspl;
		this.istorijaIspl = istorijaIspl;
		this.matematikaIspl = matematikaIspl;
		this.biologijaIspl = biologijaIspl;
		this.fizikaIspl = fizikaIspl;
		this.chemijaIspl = chemijaIspl;
		this.biologijaMod1 = biologijaMod1;
		this.biologijaMod2 = biologijaMod2;
		this.chemijaMod = chemijaMod;
		this.fizikaMod1 = fizikaMod1;
		this.fizikaMod2 = fizikaMod2;
		this.fizikaMod3 = fizikaMod3;
		this.matematikaMod1 = matematikaMod1;
		this.matematikaMod2 = matematikaMod2;
		this.matematikaMod3 = matematikaMod3;
	}

	public int getId() {
		return Id;
	}

	public void setId(int studentId) {
		this.Id = studentId;
	}

	public int getRusu2() {
		return rusu2;
	}

	public void setRusu2(int rusu2) {
		this.rusu2 = rusu2;
	}

	public int getAnglu2() {
		return anglu2;
	}

	public void setAnglu2(int anglu2) {
		this.anglu2 = anglu2;
	}

	public int getVokieciu2() {
		return vokieciu2;
	}

	public void setVokieciu2(int vokieciu2) {
		this.vokieciu2 = vokieciu2;
	}

	public int getDizainas() {
		return dizainas;
	}

	public void setDizainas(int dizainas) {
		this.dizainas = dizainas;
	}

	public int getDaile() {
		return daile;
	}

	public void setDaile(int daile) {
		this.daile = daile;
	}

	public int getTeatras() {
		return teatras;
	}

	public void setTeatras(int teatras) {
		this.teatras = teatras;
	}

	public int getMuzika() {
		return muzika;
	}

	public void setMuzika(int muzika) {
		this.muzika = muzika;
	}

	public int getInformacinesTechnologijos() {
		return informacinesTechnologijos;
	}

	public void setInformacinesTechnologijos(int informacinesTechnologijos) {
		this.informacinesTechnologijos = informacinesTechnologijos;
	}

	public int getLietuviuGimtojiIspl() {
		return lietuviuGimtojiIspl;
	}

	public void setLietuviuGimtojiIspl(int lietuviuGimtojiIspl) {
		this.lietuviuGimtojiIspl = lietuviuGimtojiIspl;
	}

	public int getLietuviuValstybineIspl() {
		return lietuviuValstybineIspl;
	}

	public void setLietuviuValstybineIspl(int lietuviuValstybineIspl) {
		this.lietuviuValstybineIspl = lietuviuValstybineIspl;
	}

	public int getUzsienioKalbaIspl() {
		return uzsienioKalbaIspl;
	}

	public void setUzsienioKalbaIspl(int uzsienioKalbaIspl) {
		this.uzsienioKalbaIspl = uzsienioKalbaIspl;
	}

	public int getIstorijaIspl() {
		return istorijaIspl;
	}

	public void setIstorijaIspl(int istorijaIspl) {
		this.istorijaIspl = istorijaIspl;
	}

	public int getMatematikaIspl() {
		return matematikaIspl;
	}

	public void setMatematikaIspl(int matematikaIspl) {
		this.matematikaIspl = matematikaIspl;
	}

	public int getBiologijaIspl() {
		return biologijaIspl;
	}

	public void setBiologijaIspl(int biologijaIspl) {
		this.biologijaIspl = biologijaIspl;
	}

	public int getFizikaIspl() {
		return fizikaIspl;
	}

	public void setFizikaIspl(int fizikaIspl) {
		this.fizikaIspl = fizikaIspl;
	}

	public int getChemijaIspl() {
		return chemijaIspl;
	}

	public void setChemijaIspl(int chemijaIspl) {
		this.chemijaIspl = chemijaIspl;
	}

	public int getBiologijaMod1() {
		return biologijaMod1;
	}

	public void setBiologijaMod1(int biologijaMod1) {
		this.biologijaMod1 = biologijaMod1;
	}

	public int getBiologijaMod2() {
		return biologijaMod2;
	}

	public void setBiologijaMod2(int biologijaMod2) {
		this.biologijaMod2 = biologijaMod2;
	}

	public int getChemijaMod() {
		return chemijaMod;
	}

	public void setChemijaMod(int chemijaMod) {
		this.chemijaMod = chemijaMod;
	}

	public int getFizikaMod1() {
		return fizikaMod1;
	}

	public void setFizikaMod1(int fizikaMod1) {
		this.fizikaMod1 = fizikaMod1;
	}

	public int getFizikaMod2() {
		return fizikaMod2;
	}

	public void setFizikaMod2(int fizikaMod2) {
		this.fizikaMod2 = fizikaMod2;
	}

	public int getFizikaMod3() {
		return fizikaMod3;
	}

	public void setFizikaMod3(int fizikaMod3) {
		this.fizikaMod3 = fizikaMod3;
	}

	public int getMatematikaMod1() {
		return matematikaMod1;
	}

	public void setMatematikaMod1(int matematikaMod1) {
		this.matematikaMod1 = matematikaMod1;
	}

	public int getMatematikaMod2() {
		return matematikaMod2;
	}

	public void setMatematikaMod2(int matematikaMod2) {
		this.matematikaMod2 = matematikaMod2;
	}

	public int getMatematikaMod3() {
		return matematikaMod3;
	}

	public void setMatematikaMod3(int matematikaMod3) {
		this.matematikaMod3 = matematikaMod3;
	}
	
}
