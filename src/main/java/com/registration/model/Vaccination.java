package com.registration.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Vaccination {
	
	@Id
	private String citizenId;
	private String citizenName;
	private String vaccinationCenterId;
	private String vaccinationCenterAddress;
	private String vaccineName;
	
	public Vaccination() {
		super();
	}


	public Vaccination(String citizenId, String citizenName, String vaccinationCenterId,
			String vaccinationCenterAddress, String vaccineName) {
		super();
		this.citizenId = citizenId;
		this.citizenName = citizenName;
		this.vaccinationCenterId = vaccinationCenterId;
		this.vaccinationCenterAddress = vaccinationCenterAddress;
		this.vaccineName = vaccineName;
	}


	public String getCitizenId() {
		return citizenId;
	}


	public void setCitizenId(String citizenId) {
		this.citizenId = citizenId;
	}


	public String getCitizenName() {
		return citizenName;
	}


	public void setCitizenName(String citizenName) {
		this.citizenName = citizenName;
	}


	public String getVaccinationCenterId() {
		return vaccinationCenterId;
	}


	public void setVaccinationCenterId(String vaccinationCenterId) {
		this.vaccinationCenterId = vaccinationCenterId;
	}


	public String getVaccinationCenterAddress() {
		return vaccinationCenterAddress;
	}


	public void setVaccinationCenterAddress(String vaccinationCenterAddress) {
		this.vaccinationCenterAddress = vaccinationCenterAddress;
	}


	public String getVaccineName() {
		return vaccineName;
	}


	public void setVaccineName(String vaccineName) {
		this.vaccineName = vaccineName;
	}


	@Override
	public String toString() {
		return "Vaccination [citizenId=" + citizenId + ", citizenName=" + citizenName + ", vaccinationCenterId="
				+ vaccinationCenterId + ", vaccinationCenterAddress=" + vaccinationCenterAddress + ", vaccineName="
				+ vaccineName + "]";
	}
	
}
