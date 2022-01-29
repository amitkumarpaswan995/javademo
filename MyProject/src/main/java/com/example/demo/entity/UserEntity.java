/**
 * 
 */
package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author amit
 *
 */
@Entity
@Table(name = "user_registration")
public class UserEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Integer id;

	@Column(name = "student_name")
	private String names;

	@Column(name = "gender")
	private char gendr;

	@Column(name = "dob")
	private String dob;
	
	@Column(name = "selCategory")
	private String selCat;

	@Column(name = "school_name")
	private String sclName;
	
	@Column(name = "class_name")
	private String clsName;
	
	@Column(name = "school_board")
	private String sclBoard;
	
	@Column(name = "section_name")
	private String secName;
	
	@Column(name = "phone_number")
	private String phNum;
	
	
	@Column(name = "email_address")
	private String email;
	
	@Column(name = "current_address")
	private String currAdd;
	
	
	@Column(name = "registration_number")
	private String registrNum;

	
	@Column(name = "whats_app")
	private String watsup;
	

	@Column(name = "schoolContact")
	private String sclContact;


	@Column(name = "address")
	private String add;
	
	
	
	@Column(name = "country")
	private String contry;
	
	
	@Column(name = "state")
	private String stat;
	
	@Column(name = "district")
	private String dist;
	
	@Column(name = "city")
	private String cty;
	
	@Column(name = "pincode")
	private String pCode;	
	
	
	@Column(name = "aadharNo")
	private String aadhar;	
	
	
	@Column(name = "pancard")
	private String pancrd;
	
	
	@Column(name = "password")
	private String pass;
	
	
	@Column(name = "citizen")
	private String citzen;
	
	@Column(name = "country2")
	private String contry2;
	
	
	@Column(name = "state2")
	private String stat2;
	
	@Column(name = "district2")
	private String dist2;
	
	
	@Column(name = "city2")
	private String cty2;
	
	@Column(name = "pincode2")
	private String pnCode2;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNames() {
		return names;
	}

	public void setNames(String names) {
		this.names = names;
	}

	public char getGendr() {
		return gendr;
	}

	public void setGendr(char gendr) {
		this.gendr = gendr;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getSelCat() {
		return selCat;
	}

	public void setSelCat(String selCat) {
		this.selCat = selCat;
	}

	public String getSclName() {
		return sclName;
	}

	public void setSclName(String sclName) {
		this.sclName = sclName;
	}

	public String getClsName() {
		return clsName;
	}

	public void setClsName(String clsName) {
		this.clsName = clsName;
	}

	public String getSclBoard() {
		return sclBoard;
	}

	public void setSclBoard(String sclBoard) {
		this.sclBoard = sclBoard;
	}

	public String getSecName() {
		return secName;
	}

	public void setSecName(String secName) {
		this.secName = secName;
	}

	public String getPhNum() {
		return phNum;
	}

	public void setPhNum(String phNum) {
		this.phNum = phNum;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCurrAdd() {
		return currAdd;
	}

	public void setCurrAdd(String currAdd) {
		this.currAdd = currAdd;
	}

	public String getRegistrNum() {
		return registrNum;
	}

	public void setRegistrNum(String registrNum) {
		this.registrNum = registrNum;
	}

	public String getWatsup() {
		return watsup;
	}

	public void setWatsup(String watsup) {
		this.watsup = watsup;
	}

	public String getSclContact() {
		return sclContact;
	}

	public void setSclContact(String sclContact) {
		this.sclContact = sclContact;
	}

	public String getAdd() {
		return add;
	}

	public void setAdd(String add) {
		this.add = add;
	}

	public String getContry() {
		return contry;
	}

	public void setContry(String contry) {
		this.contry = contry;
	}

	public String getStat() {
		return stat;
	}

	public void setStat(String stat) {
		this.stat = stat;
	}

	public String getDist() {
		return dist;
	}

	public void setDist(String dist) {
		this.dist = dist;
	}

	public String getCty() {
		return cty;
	}

	public void setCty(String cty) {
		this.cty = cty;
	}

	public String getpCode() {
		return pCode;
	}

	public void setpCode(String pCode) {
		this.pCode = pCode;
	}

	public String getAadhar() {
		return aadhar;
	}

	public void setAadhar(String aadhar) {
		this.aadhar = aadhar;
	}

	public String getPancrd() {
		return pancrd;
	}

	public void setPancrd(String pancrd) {
		this.pancrd = pancrd;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getCitzen() {
		return citzen;
	}

	public void setCitzen(String citzen) {
		this.citzen = citzen;
	}

	public String getContry2() {
		return contry2;
	}

	public void setContry2(String contry2) {
		this.contry2 = contry2;
	}

	public String getStat2() {
		return stat2;
	}

	public void setStat2(String stat2) {
		this.stat2 = stat2;
	}

	public String getDist2() {
		return dist2;
	}

	public void setDist2(String dist2) {
		this.dist2 = dist2;
	}

	public String getCty2() {
		return cty2;
	}

	public void setCty2(String cty2) {
		this.cty2 = cty2;
	}

	public String getPnCode2() {
		return pnCode2;
	}

	public void setPnCode2(String pnCode2) {
		this.pnCode2 = pnCode2;
	}
	
	
	 
}
