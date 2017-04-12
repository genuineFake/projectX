package lt.vtvpmc.ems.pw.controllers;

import java.util.ArrayList;
import java.util.List;

public class AllListsBean {
	private List<String> municipality;
	private List<String> education;
	private List<String> maritalStatus;
	private List<String> institutionType;
	private List<Integer> graduationYear;
	
	public AllListsBean(){
		municipality = new ArrayList<>();
		fillMunicipality();
		education = new ArrayList<>();
		fillEducation();
		maritalStatus = new ArrayList<>();
		fillMaritalStatus();
		institutionType = new ArrayList<>();
		fillInstitutionType();
		graduationYear = new ArrayList<>();
		fillGraduationYear();
	}
	
	
	public void fillMunicipality(){
		municipality.add("Akmenės rajono savivaldybė");
		municipality.add("Alytaus miesto savivaldybė");
		municipality.add("Alytaus rajono savivaldybė");
		municipality.add("Anykščių rajono savivaldybė");
		municipality.add("Birštono savivaldybė");
		municipality.add("Biržų rajono savivaldybė");
		municipality.add("Druskininkų savivaldybė");
		municipality.add("Elektrėnų savivaldybė");
		municipality.add("Ignalinos rajono savivaldybė");
		municipality.add("Jonavos rajono savivaldybė");
		municipality.add("Joniškio rajono savivaldybė");
		municipality.add("Jurbarko rajono savivaldybė");
		municipality.add("Kaišiadorių rajono savivaldybė");
		municipality.add("Kalvarijos savivaldybė");
		municipality.add("Kauno miesto savivaldybė");
		municipality.add("Kauno rajono savivaldybė");
		municipality.add("Kazlų Rūdos savivaldybė");
		municipality.add("Kėdainių rajono savivaldybė");
		municipality.add("Kelmės rajono savivaldybė");
		municipality.add("Klaipėdos miesto savivaldybė");
		municipality.add("Klaipėdos rajono savivaldybė");
		municipality.add("Kretingos rajono savivaldybė");
		municipality.add("Kupiškio rajono savivaldybė");
		municipality.add("Lazdijų rajono savivaldybė");
		municipality.add("Marijampolės savivaldybė");
		municipality.add("Mažeikių rajono savivaldybė");
		municipality.add("Molėtų rajono savivaldybė");
		municipality.add("Neringos savivaldybė");
		municipality.add("Pagėgių savivaldybė");
		municipality.add("Pakruojo rajono savivaldybė");
		municipality.add("Palangos miesto savivaldybė");
		municipality.add("Panevėžio miesto savivaldybė");
		municipality.add("Panevėžio rajono savivaldybė");
		municipality.add("Pasvalio rajono savivaldybė");
		municipality.add("Plungės rajono savivaldybė");
		municipality.add("Prienų rajono savivaldybė");
		municipality.add("Radviliškio rajono savivaldybė");
		municipality.add("Raseinių rajono savivaldybė");
		municipality.add("Rietavo savivaldybė");
		municipality.add("Rokiškio rajono savivaldybė");
		municipality.add("Skuodo rajono savivaldybė");
		municipality.add("Šakių rajono savivaldybė");
		municipality.add("Šalčininkų rajono savivaldybė");
		municipality.add("Šiaulių miesto savivaldybė");
		municipality.add("Šiaulių rajono savivaldybė");
		municipality.add("Šilalės rajono savivaldybė");
		municipality.add("Šilutės rajono savivaldybė");
		municipality.add("Širvintų rajono savivaldybė");
		municipality.add("Švenčionių rajono savivaldybė");
		municipality.add("Tauragės rajono savivaldybė");
		municipality.add("Telšių rajono savivaldybė");
		municipality.add("Trakų rajono savivaldybė");
		municipality.add("Ukmergės rajono savivaldybė");
		municipality.add("Utenos rajono savivaldybė");
		municipality.add("Varėnos rajono savivaldybė");
		municipality.add("Vilkaviškio rajono savivaldybė");
		municipality.add("Vilniaus miesto savivaldybė");
		municipality.add("Vilniaus rajono savivaldybė");
		municipality.add("Visagino savivaldybė");
		municipality.add("Zarasų rajono savivaldybė");
	}
	
	public void fillEducation(){
		education.add("Aukštasis išsilavinimas");
        education.add("Aukštesnysis išsilavinimas");
        education.add("Specialusis vidurinis išsilavinimas");
        education.add("Vidurinis išsilavinimas ");
        education.add("Pagrindinis išsilavinimas");
        education.add("Pradinis išsilavinimas");
        education.add("Nereglamentuojamas");
        education.add("Aukštasis universitetinis išsilavinimas");
        education.add("Aukštasis koleginis išsilavinimas");
	}
	
	public void fillMaritalStatus(){
		maritalStatus.add("Nevedęs/Netekėjusi, neturiu vaikų");
		maritalStatus.add("Nevedęs/Netekėjusi, turiu vaikų");
		maritalStatus.add("Vedęs/Ištekėjusi, neturiu vaikų");
		maritalStatus.add("Vedęs/Ištekėjusi, turiu vaikų");
		maritalStatus.add("Esu išsiskyręs/išsiskyrusi, neturiu vaikų");
		maritalStatus.add("Esu išsiskyręs/išsiskyrusi, turiu vaikų");
	}
	
	public void fillInstitutionType(){
		institutionType.add("Ikimokyklinio ugdymo mokykla");
		institutionType.add("Pradinė mokykla");
		institutionType.add("Pagrindinė mokykla");
		institutionType.add("Vidurinė mokykla");
		institutionType.add("Gimnazija");
		institutionType.add("Progimnazija");
		institutionType.add("Profesinio mokymo įstaigaa");
		institutionType.add("Pedagoginė psichologinė tarnyba");
		institutionType.add("Mokytojų švietimo centra");
		institutionType.add("Švietimo pagalbos tarnyba");
		institutionType.add("Profesinio orientavimo centras");
		institutionType.add("Neformaliojo vaikų švietimo mokykla ir formalųjį švietimą papildančio ugdymo mokykla");
		institutionType.add("Kitas švietimo teikėjas");
		institutionType.add("Neformaliojo suaugusiųjų švietimo mokykla");
		institutionType.add("Laisvasis mokytojas");
		institutionType.add("Kompetencijų vertinimo institucija");
		institutionType.add("Kolegija");
		institutionType.add("Universitetas");
		institutionType.add("Mokslinių tyrimų institutas");
	}
	
	public void fillGraduationYear(){
		graduationYear.add(2017);
		graduationYear.add(2016);
		graduationYear.add(2015);
		graduationYear.add(2014);
        graduationYear.add(2013);
        graduationYear.add(2012);
        graduationYear.add(2011);
        graduationYear.add(2010);
        graduationYear.add(2009);
        graduationYear.add(2008);
        graduationYear.add(2007);
        graduationYear.add(2006);
        graduationYear.add(2005);
        graduationYear.add(2004);
        graduationYear.add(2003);
        graduationYear.add(2002);
        graduationYear.add(2001);
        graduationYear.add(2000);
        graduationYear.add(1999);
        graduationYear.add(1998);
        graduationYear.add(1997);
        graduationYear.add(1996);
        graduationYear.add(1995);
        graduationYear.add(1994);
        graduationYear.add(1993);
        graduationYear.add(1992);
        graduationYear.add(1991);
        graduationYear.add(1990);
        graduationYear.add(1989);
        graduationYear.add(1988);
        graduationYear.add(1987);
        graduationYear.add(1986);
        graduationYear.add(1985);
        graduationYear.add(1984);
        graduationYear.add(1983);
        graduationYear.add(1982);
        graduationYear.add(1981);
        graduationYear.add(1980);
        graduationYear.add(1979);
        graduationYear.add(1978);
        graduationYear.add(1977);
        graduationYear.add(1976);
        graduationYear.add(1975);
        graduationYear.add(1974);
        graduationYear.add(1973);
        graduationYear.add(1972);
        graduationYear.add(1971);
        graduationYear.add(1970);
        graduationYear.add(1969);
        graduationYear.add(1968);
        graduationYear.add(1967);
        graduationYear.add(1966);
        graduationYear.add(1965);
	}


	public List<String> getMunicipality() {
		return municipality;
	}

	public List<String> getEducation() {
		return education;
	}

	public List<String> getMaritalStatus() {
		return maritalStatus;
	}

	public List<String> getInstitutionType() {
		return institutionType;
	}

	public List<Integer> getGraduationYear() {
		return graduationYear;
	}
}

