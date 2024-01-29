package com.cropdeal.crop.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;



@Document(collection="crops")           
public class Crop {
	
	@Id
	private int cropId;
	private String cropName;
    private String cropQuantity;
	private  String cropPrice;
	private String cropTypes;
	
	public Crop() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Crop(int cropId, String cropName, String cropQuantity, String cropPrice, String cropTypes) {
		super();
		this.cropId = cropId;
		this.cropName = cropName;
		this.cropQuantity = cropQuantity;
		this.cropPrice = cropPrice;
		this.cropTypes = cropTypes;
	}
	public int getCropId() {
		return cropId;
	}
	public void setCropId(int cropId) {
		this.cropId = cropId;
	}
	public String getCropName() {
		return cropName;
	}
	public void setCropName(String cropName) {
		this.cropName = cropName;
	}
	public String getCropQuantity() {
		return cropQuantity;
	}
	public void setCropQuantity(String cropQuantity) {
		this.cropQuantity = cropQuantity;
	}
	public String getCropPrice() {
		return cropPrice;
	}
	public void setCropPrice(String cropPrice) {
		this.cropPrice = cropPrice;
	}
	public String getCropTypes() {
		return cropTypes;
	}
	public void setCropTypes(String cropTypes) {
		this.cropTypes = cropTypes;
	}

}
