package AdvancedJava.hdfc.entities;

import java.util.ArrayList;
import java.util.List;

public class Bank {
private List<Customer> customers = new ArrayList<Customer>();
private String countryOfOrigin;
private List<String> operatingCountries=new ArrayList<String>();
public List<Customer> getCustomers() {
	return customers;
}
public void setCustomers(List<Customer> customers) {
	this.customers = customers;
}
public String getCountryOfOrigin() {
	return countryOfOrigin;
}
public void setCountryOfOrigin(String countryOfOrigin) {
	this.countryOfOrigin = countryOfOrigin;
}
public List<String> getOperatingCountries() {
	return operatingCountries;
}
public void setOperatingCountries(List<String> operatingCountries) {
	this.operatingCountries = operatingCountries;
}
public String getRBI_REGISTRATION_NUMBER() {
	return RBI_REGISTRATION_NUMBER;
}
public final String  RBI_REGISTRATION_NUMBER="RBIHDFC1029383";
}
