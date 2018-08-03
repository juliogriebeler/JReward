package br.com.juliogriebeler.jreward.model;

import org.springframework.data.annotation.Id;

import com.itextpdf.text.pdf.BarcodeQRCode;

public class Reward {

	@Id
	private String id;
	private String title;
	private String description;
	private String requirements;
	private int quantity;
	private Company company;
	private BarcodeQRCode qrCode;
	private RewardStatus status;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getRequirements() {
		return requirements;
	}
	public void setRequirements(String requirements) {
		this.requirements = requirements;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public Company getCompany() {
		return company;
	}
	public void setCompany(Company company) {
		this.company = company;
	}
	public BarcodeQRCode getQrCode() {
		return qrCode;
	}
	public void setQrCode(BarcodeQRCode qrCode) {
		this.qrCode = qrCode;
	}
	public RewardStatus getStatus() {
		return status;
	}
	public void setStatus(RewardStatus status) {
		this.status = status;
	}
		
}
