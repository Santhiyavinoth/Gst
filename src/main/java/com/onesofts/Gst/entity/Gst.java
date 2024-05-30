package com.onesofts.Gst.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="gst")
public class Gst {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
private String productName;
private String HsnCode;
private int gst;
public String getProductName() {
	return productName;
}
public void setProductName(String productName) {
	this.productName = productName;
}
public String getHsnCode() {
	return HsnCode;
}
public void setHsnCode(String hsnCode) {
	HsnCode = hsnCode;
}
public int getGst() {
	return gst;
}
public void setGst(int gst) {
	this.gst = gst;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}

}
