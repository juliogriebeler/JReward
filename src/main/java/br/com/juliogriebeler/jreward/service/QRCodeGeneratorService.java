package br.com.juliogriebeler.jreward.service;

import com.itextpdf.text.BadElementException;
import com.itextpdf.text.Image;
import com.itextpdf.text.pdf.BarcodeQRCode;

public class QRCodeGeneratorService {
	
	private BarcodeQRCode qrCode;
	private String SERVICE_URL = "http://www.teshti.com/";
	
	public QRCodeGeneratorService(String rewardId) {
		qrCode = new BarcodeQRCode(SERVICE_URL+rewardId, 100, 100, null);
		Image qrCodeImage;
		try {
			qrCodeImage = qrCode.getImage();
			qrCodeImage.scaleAbsolute(100, 100);
		} catch (BadElementException e) {
			e.printStackTrace();
		}
	}
	
	public BarcodeQRCode getQRCode() {
		return this.qrCode;
	}

}
