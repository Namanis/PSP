package com.example.PSP3.model;

//import com.prekes.web.prekesweb.model.Zmogus;
import com.example.PSP3.model.*;


public class Vartotojas implements Comparable<Vartotojas> {
	
	private int userID;
	private String vardas, pavarde, numeris, email, adresas, slaptazodis;
	
	public Vartotojas() {}
	
	public Vartotojas(int userID, String vardas, String pavarde, String numeris, String email, String adresas, String slaptazodis) {
		super();
		this.userID = userID;
		this.vardas = vardas;
		this.pavarde = pavarde;
		this.numeris = numeris; //tel numeris
		this.email = email;
		this.adresas = adresas;
		this.slaptazodis = slaptazodis;
		
	}
	
	@Override
	public String toString() {
		return "Vartotojas [id=" + userID + ", vardas=" + vardas + ", pavarde=" + pavarde + ", numeris=" + numeris + ", email=" + email +
				", adresas=" + adresas + ", slaptazodis=" + slaptazodis +"]";
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + userID;
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vartotojas other = (Vartotojas) obj;
		if (userID != other.userID)
			return false;
		return true;
	}
	
	@Override
	public int compareTo(Vartotojas o) {
		return Integer.compare(this.userID, o.getId());
	}

	public int getId() {
		return userID;
	}

	public void setId(int userID) {
		if(userID < 0) {
            System.out.println("ERROR trying to set wrong value for id=" + userID + ", value must be >=0");
            throw new NullPointerException();
        }
		this.userID = userID;
	}

	public String getVardas() {
		return vardas;
	}
	
	public void setVardas(String vardas) {
		this.vardas = vardas;
	}
	
	public void setPavarde(String pavarde) {
		this.pavarde = pavarde;
	}
	
	public String getPavarde() {
		return pavarde;
	}
	
	public void setNumeris(String numeris) {
		this.numeris = numeris;
	}
	
	public String getNumeris() {
		return numeris;
	}
	
	public void setEmail(String email) {
		if(email == null) {
            System.out.println("ERROR trying to set wrong value for email=" + email + ", value must be not null");
            throw new NullPointerException();
        }
		this.email = email;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setAdresas(String adresas) {
		this.adresas = adresas;
	}
	
	public String getAdresas() {
		return adresas;
	}
	
	public void setSlaptazodis(String slaptazodis) {
		this.slaptazodis = slaptazodis;
	}
	
	public String getSlaptazodis() {
		return slaptazodis;
	}
	
	
	

	
	


}
