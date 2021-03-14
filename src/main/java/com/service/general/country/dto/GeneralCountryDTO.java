package com.service.general.country.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class GeneralCountryDTO {

    private String name;
    private List<String> topLevelDomain;
    private String alpha2Code;
    private String alpha3Code;
    private List<String> callingCodes;
    private String capital;
    private List<String> altSpellings;
    private String region;
    private String subregion;
    private int population;
    private List<Double> latlng;
    private String demonym;
    private double area;
    private double gini;
    private List<String> timezones;
    private List<String> borders;
    private String nativeName;
    private String numericCode;
    private List<CurrencyDTO> currencies;
    private List<LanguageDTO> languages;
    private TranslationsDTO translations;
    private String flag;
    private List<RegionalBlocDTO> regionalBlocs;
    private String cioc;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getTopLevelDomain() {
		return topLevelDomain;
	}
	public void setTopLevelDomain(List<String> topLevelDomain) {
		this.topLevelDomain = topLevelDomain;
	}
	public String getAlpha2Code() {
		return alpha2Code;
	}
	public void setAlpha2Code(String alpha2Code) {
		this.alpha2Code = alpha2Code;
	}
	public String getAlpha3Code() {
		return alpha3Code;
	}
	public void setAlpha3Code(String alpha3Code) {
		this.alpha3Code = alpha3Code;
	}
	public List<String> getCallingCodes() {
		return callingCodes;
	}
	public void setCallingCodes(List<String> callingCodes) {
		this.callingCodes = callingCodes;
	}
	public String getCapital() {
		return capital;
	}
	public void setCapital(String capital) {
		this.capital = capital;
	}
	public List<String> getAltSpellings() {
		return altSpellings;
	}
	public void setAltSpellings(List<String> altSpellings) {
		this.altSpellings = altSpellings;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public String getSubregion() {
		return subregion;
	}
	public void setSubregion(String subregion) {
		this.subregion = subregion;
	}
	public int getPopulation() {
		return population;
	}
	public void setPopulation(int population) {
		this.population = population;
	}
	public List<Double> getLatlng() {
		return latlng;
	}
	public void setLatlng(List<Double> latlng) {
		this.latlng = latlng;
	}
	public String getDemonym() {
		return demonym;
	}
	public void setDemonym(String demonym) {
		this.demonym = demonym;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public double getGini() {
		return gini;
	}
	public void setGini(double gini) {
		this.gini = gini;
	}
	public List<String> getTimezones() {
		return timezones;
	}
	public void setTimezones(List<String> timezones) {
		this.timezones = timezones;
	}
	public List<String> getBorders() {
		return borders;
	}
	public void setBorders(List<String> borders) {
		this.borders = borders;
	}
	public String getNativeName() {
		return nativeName;
	}
	public void setNativeName(String nativeName) {
		this.nativeName = nativeName;
	}
	public String getNumericCode() {
		return numericCode;
	}
	public void setNumericCode(String numericCode) {
		this.numericCode = numericCode;
	}
	public List<CurrencyDTO> getCurrencies() {
		return currencies;
	}
	public void setCurrencies(List<CurrencyDTO> currencies) {
		this.currencies = currencies;
	}
	public List<LanguageDTO> getLanguages() {
		return languages;
	}
	public void setLanguages(List<LanguageDTO> languages) {
		this.languages = languages;
	}
	public TranslationsDTO getTranslations() {
		return translations;
	}
	public void setTranslations(TranslationsDTO translations) {
		this.translations = translations;
	}
	public String getFlag() {
		return flag;
	}
	public void setFlag(String flag) {
		this.flag = flag;
	}
	public List<RegionalBlocDTO> getRegionalBlocs() {
		return regionalBlocs;
	}
	public void setRegionalBlocs(List<RegionalBlocDTO> regionalBlocs) {
		this.regionalBlocs = regionalBlocs;
	}
	public String getCioc() {
		return cioc;
	}
	public void setCioc(String cioc) {
		this.cioc = cioc;
	}
    
}
