package com.example.demo.model;

import jakarta.persistence.*;

@Entity
public class Product {
  @Id
  long pid;
  String pname;
  String price;
  int qty;
public long getPid() {
	return pid;
}
public void setPid(long pid) {
	this.pid = pid;
}
public String getPname() {
	return pname;
}
public void setPname(String pname) {
	this.pname = pname;
}
public String getPrice() {
	return price;
}
public void setPrice(String price) {
	this.price = price;
}
public int getQty() {
	return qty;
}
public void setQty(int qty) {
	this.qty = qty;
}
}
