package lt.vtvpmc.ems.pw.data.entities;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * Created by fnord on 17.3.25.
 */
@Entity
@Table (name = "TEACHING_PLAN_MANDATORY")
public class TeachingPlanMandatory {
    @Id
    @GeneratedValue(generator="increment")
    @GenericGenerator(name="increment", strategy = "increment")
    @Column(name = "MANDATORY_ID")
    private int Id;
    @Column(name = "TIKYBA")
    private int tikyba;
    @Column(name = "ETIKA")
    private int etika;
    @Column(name = "lIETUVIU_IR_LIETRATURA_4")
    private int lietuviuIrLiteratura4;
    @Column(name = "LIETUVIU_IR_LITARATURA_6")
    private int lietuviuIrLiteratura6;
    @Column(name = "GIMTOJI_RUSU")
    private int gimtRusu;
    @Column(name = "GIMTOJI_LENKU")
    private int gimtLenku;
    @Column(name = "UZSIENIO_ANGLU")
    private int uzsienioAnglu;
    @Column(name = "UZSIENIO_VOKIECIU")
    private int uzsienioVokieciu;
    @Column(name = "UZSIENIO_PRANCUZU")
    private int uzsienioPrancuzu;
    @Column(name = "UZSIENIO_RUSU")
    private int uzsienioRusu;
    @Column(name = "ISTORIJA")
    private int istorija;
    @Column(name = "GEOGRAFIJA")
    private int geografija;
    @Column(name = "INTEGRUOTAS_SOC_MOKSLU_KURSAS")
    private int integrSocMokKursas;
    @Column(name = "MATEMATIKA")
    private int matematika;
    @Column(name = "BENDROJI_KUNO_KULTURA")
    private int bendrojiKunoK;
    @Column(name = "FUTBOLAS")
    private int futbolas;
    @Column(name = "KREPSINIS")
    private int krepsinis;
    @Column(name = "BIOLOGIJA")
    private int biologija;
    @Column(name = "FIZIKA")
    private int fizika;
    @Column(name = "CHEMIJA")
    private int chemija;
    @Column(name = "INT_GAMTOS_MOKSLAI")
    private int integrGamtosMoksluKursas;

    public TeachingPlanMandatory() {

    }

    public TeachingPlanMandatory(int tikyba, int etika, int lietuviuIrLiteratura4, int lietuviuIrLiteratura6, int gimtRusu, int gimtLenku, int uzsienioAnglu, int uzsienioVokieciu, int uzsienioPrancuzu, int uzsienioRusu, int istorija, int geografija, int integrSocMokKursas, int matematika, int bendrojiKunoK, int futbolas, int krepsinis, int biologija, int fizika, int chemija, int integrGamtosMoksluKursas) {

        this.tikyba = tikyba;
        this.etika = etika;
        this.lietuviuIrLiteratura4 = lietuviuIrLiteratura4;
        this.lietuviuIrLiteratura6 = lietuviuIrLiteratura6;
        this.gimtRusu = gimtRusu;
        this.gimtLenku = gimtLenku;
        this.uzsienioAnglu = uzsienioAnglu;
        this.uzsienioVokieciu = uzsienioVokieciu;
        this.uzsienioPrancuzu = uzsienioPrancuzu;
        this.uzsienioRusu = uzsienioRusu;
        this.istorija = istorija;
        this.geografija = geografija;
        this.integrSocMokKursas = integrSocMokKursas;
        this.matematika = matematika;
        this.bendrojiKunoK = bendrojiKunoK;
        this.futbolas = futbolas;
        this.krepsinis = krepsinis;
        this.biologija = biologija;
        this.fizika = fizika;
        this.chemija = chemija;
        this.integrGamtosMoksluKursas = integrGamtosMoksluKursas;
    }

    public int getId() {
        return Id;
    }

    public void setId(int studentId) {
        this.Id = studentId;
    }

    public int getTikyba() {
        return tikyba;
    }

    public void setTikyba(int tikyba) {
        this.tikyba = tikyba;
    }

    public int getEtika() {
        return etika;
    }

    public void setEtika(int etika) {
        this.etika = etika;
    }

    public int getLietuviuIrLiteratura4() {
        return lietuviuIrLiteratura4;
    }

    public void setLietuviuIrLiteratura4(int lietuviuIrLiteratura4) {
        this.lietuviuIrLiteratura4 = lietuviuIrLiteratura4;
    }

    public int getLietuviuIrLiteratura6() {
        return lietuviuIrLiteratura6;
    }

    public void setLietuviuIrLiteratura6(int lietuviuIrLiteratura6) {
        this.lietuviuIrLiteratura6 = lietuviuIrLiteratura6;
    }

    public int getGimtRusu() {
        return gimtRusu;
    }

    public void setGimtRusu(int gimtRusu) {
        this.gimtRusu = gimtRusu;
    }

    public int getGimtLenku() {
        return gimtLenku;
    }

    public void setGimtLenku(int gimtLenku) {
        this.gimtLenku = gimtLenku;
    }

    public int getUzsienioAnglu() {
        return uzsienioAnglu;
    }

    public void setUzsienioAnglu(int uzsienioAnglu) {
        this.uzsienioAnglu = uzsienioAnglu;
    }

    public int getUzsienioVokieciu() {
        return uzsienioVokieciu;
    }

    public void setUzsienioVokieciu(int uzsienioVokieciu) {
        this.uzsienioVokieciu = uzsienioVokieciu;
    }

    public int getUzsienioPrancuzu() {
        return uzsienioPrancuzu;
    }

    public void setUzsienioPrancuzu(int uzsienioPrancuzu) {
        this.uzsienioPrancuzu = uzsienioPrancuzu;
    }

    public int getUzsienioRusu() {
        return uzsienioRusu;
    }

    public void setUzsienioRusu(int uzsienioRusu) {
        this.uzsienioRusu = uzsienioRusu;
    }

    public int getIstorija() {
        return istorija;
    }

    public void setIstorija(int istorija) {
        this.istorija = istorija;
    }

    public int getGeografija() {
        return geografija;
    }

    public void setGeografija(int geografija) {
        this.geografija = geografija;
    }

    public int getIntegrSocMokKursas() {
        return integrSocMokKursas;
    }

    public void setIntegrSocMokKursas(int integrSocMokKursas) {
        this.integrSocMokKursas = integrSocMokKursas;
    }

    public int getMatematika() {
        return matematika;
    }

    public void setMatematika(int matematika) {
        this.matematika = matematika;
    }

    public int getBendrojiKunoK() {
        return bendrojiKunoK;
    }

    public void setBendrojiKunoK(int bendrojiKunoK) {
        this.bendrojiKunoK = bendrojiKunoK;
    }

    public int getFutbolas() {
        return futbolas;
    }

    public void setFutbolas(int futbolas) {
        this.futbolas = futbolas;
    }

    public int getKrepsinis() {
        return krepsinis;
    }

    public void setKrepsinis(int krepsinis) {
        this.krepsinis = krepsinis;
    }

    public int getBiologija() {
        return biologija;
    }

    public void setBiologija(int biologija) {
        this.biologija = biologija;
    }

    public int getFizika() {
        return fizika;
    }

    public void setFizika(int fizika) {
        this.fizika = fizika;
    }

    public int getChemija() {
        return chemija;
    }

    public void setChemija(int chemija) {
        this.chemija = chemija;
    }

    public int getIntegrGamtosMoksluKursas() {
        return integrGamtosMoksluKursas;
    }

    public void setIntegrGamtosMoksluKursas(int integrGamtosMoksluKursas) {
        this.integrGamtosMoksluKursas = integrGamtosMoksluKursas;
    }
}
