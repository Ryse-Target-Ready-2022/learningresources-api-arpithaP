package entity;

import java.util.Date;

public class LearningResource {

	private int id;
	private String name;
	private double costPrice;
	private double sellingPrice;
	private LearningResourceStatus productStatus;
	private Date createdDate;
	private Date publishedDate;
	private Date retiredDate;
	
	public LearningResource() {
		
	}
	
	public LearningResource(int id, String name, double costPrice, double sellingPrice, LearningResourceStatus productStatus, Date createdDate, Date publishedDate, Date retiredDate) {
		this.id = id;
		this.name = name;
		this.costPrice = costPrice;
		this.sellingPrice = sellingPrice;
		this.productStatus = productStatus;
		this.createdDate = createdDate;
		this.publishedDate = publishedDate;
		this.retiredDate = retiredDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getCostPrice() {
		return costPrice;
	}

	public void setCostPrice(double costPrice) {
		this.costPrice = costPrice;
	}

	public double getSellingPrice() {
		return sellingPrice;
	}

	public void setSellingPrice(double sellingPrice) {
		this.sellingPrice = sellingPrice;
	}

	public LearningResourceStatus getProductStatus() {
		return productStatus;
	}

	public void setProductStatus(LearningResourceStatus productStatus) {
		this.productStatus = productStatus;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getPublishedDate() {
		return publishedDate;
	}

	public void setPublishedDate(Date publishedDate) {
		this.publishedDate = publishedDate;
	}

	public Date getRetiredDate() {
		return retiredDate;
	}

	public void setRetiredDate(Date retiredDate) {
		this.retiredDate = retiredDate;
	}

	
	
	
}
