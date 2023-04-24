package com.exproduct;

public class Product {
	private int id;
	private String pname;
	private String batchno;
	private double price;
	private int numofproduct;
	
	public Product() {
		
	}
	/**
	 * @param id
	 * @param pname
	 * @param batchno
	 * @param price
	 * @param numofproduct
	 */
	public Product(int id, String pname, String batchno, double price, int numofproduct) {
		super();
		this.id = id;
		this.pname = pname;
		this.batchno = batchno;
		this.price = price;
		this.numofproduct = numofproduct;
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @return the pname
	 */
	public String getPname() {
		return pname;
	}
	/**
	 * @return the batchno
	 */
	public String getBatchno() {
		return batchno;
	}
	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}
	/**
	 * @return the numofproduct
	 */
	public int getNumofproduct() {
		return numofproduct;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @param pname the pname to set
	 */
	public void setPname(String pname) {
		this.pname = pname;
	}
	/**
	 * @param batchno the batchno to set
	 */
	public void setBatchno(String batchno) {
		this.batchno = batchno;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	/**
	 * @param numofproduct the numofproduct to set
	 */
	public void setNumofproduct(int numofproduct) {
		this.numofproduct = numofproduct;
	}
	
}
