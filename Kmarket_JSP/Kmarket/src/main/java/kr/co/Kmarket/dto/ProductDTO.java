package kr.co.Kmarket.dto;

import kr.co.Kmarket.utils.Utils;

public class ProductDTO {
	
	private Utils utils = new Utils();
	private int prodNo;
	private String seller;
	private int prodCate1;
	private int prodCate2;
	private String prodName;
	private String descript;
	private String company;
	private int price;
	private int discount;
	private int point;
	private int stock;
	private int sold;
	private int delivery;
	private int hit;
	private int score;
	private int review;
	private String thumb1;
	private String newThumb1;
	private String thumb2;
	private String newThumb2;
	private String thumb3;
	private String newThumb3;
	private String detail;
	private String newDetail;
	private String status;
	private String duty;
	private String receipt;
	private String bizType;
	private String origin;
	private String ip;
	private String rdate;
	private String etc1;
	private int etc2;
	private String etc3;
	private String etc4;
	private String etc5;
	private String c1Name;
	private String c2Name;
	

	public String getC2Name() {
		return c2Name;
	}
	public void setC2Name(String c2Name) {
		this.c2Name = c2Name;
	}
	public String getC1Name() {
		return c1Name;
	}
	public void setC1Name(String c1Name) {
		this.c1Name = c1Name;
	}
	//추가필드
	private String priceWithComma;
	
	public void setPriceWithComma(String priceWithComma) {
		this.priceWithComma = Utils.comma(priceWithComma);
	}
	public String getPriceWithComma() {
		return priceWithComma;
	}
	public int getProdNo() {
		return prodNo;
	}
	public void setProdNo(int prodNo) {
		this.prodNo = prodNo;
	}
	public void setProdNo(String prodNo) {
		this.prodNo = Integer.parseInt(prodNo);
	}
	public String getSeller() {
		return seller;
	}
	public void setSeller(String seller) {
		this.seller = seller;
	}
	public int getProdCate1() {
		return prodCate1;
	}
	public void setProdCate1(int prodCate1) {
		this.prodCate1 = prodCate1;
	}
	public void setProdCate1(String prodCate1) {
		this.prodCate1 = Integer.parseInt(prodCate1);
	}
	public int getProdCate2() {
		return prodCate2;
	}
	public void setProdCate2(int prodCate2) {
		this.prodCate2 = prodCate2;
	}
	public void setProdCate2(String prodCate2) {
		this.prodCate2 = Integer.parseInt(prodCate2);
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public String getDescript() {
		return descript;
	}
	public void setDescript(String descript) {
		this.descript = descript;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public int getPrice() {
		return price;
	}
	public String getPriceComma() {
		return utils.comma(price);
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setPrice(String price) {
		this.price = Integer.parseInt(price);
	}
	public int getDiscount() {
		return discount;
	}
	public void setDiscount(int discount) {
		this.discount = discount;
	}
	public void setDiscount(String discount) {
		this.discount = Integer.parseInt(discount);
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	public void setPoint(String point) {
		this.point = Integer.parseInt(point);
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public void setStock(String stock) {
		this.stock = Integer.parseInt(stock);
	}
	public int getSold() {
		return sold;
	}
	public void setSold(int sold) {
		this.sold = sold;
	}
	public int getDelivery() {
		return delivery;
	}
	public void setDelivery(int delivery) {
		this.delivery = delivery;
	}
	public void setDelivery(String delivery) {
		this.delivery = Integer.parseInt(delivery);
	}
	public int getHit() {
		return hit;
	}
	public void setHit(int hit) {
		this.hit = hit;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public int getReview() {
		return review;
	}
	public void setReview(int review) {
		this.review = review;
	}
	public String getThumb1() {
		return thumb1;
	}
	public void setThumb1(String thumb1) {
		this.thumb1 = thumb1;
	}
	public String getThumb2() {
		return thumb2;
	}
	public void setThumb2(String thumb2) {
		this.thumb2 = thumb2;
	}
	public String getThumb3() {
		return thumb3;
	}
	public void setThumb3(String thumb3) {
		this.thumb3 = thumb3;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getDuty() {
		return duty;
	}
	public void setDuty(String duty) {
		this.duty = duty;
	}
	public String getReceipt() {
		return receipt;
	}
	public void setReceipt(String receipt) {
		this.receipt = receipt;
	}
	public String getBizType() {
		return bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public String getRdate() {
		return rdate;
	}
	
	public void setRdate(String rdate) {
		this.rdate = rdate;
	}
	public String getEtc1() {
		return etc1;
	}
	public void setEtc1(String etc1) {
		this.etc1 = etc1;
	}
	public int getEtc2() {
		return etc2;
	}
	public void setEtc2(int etc2) {
		this.etc2 = etc2;
	}
	public String getEtc3() {
		return etc3;
	}
	public void setEtc3(String etc3) {
		this.etc3 = etc3;
	}
	public String getEtc4() {
		return etc4;
	}
	public void setEtc4(String etc4) {
		this.etc4 = etc4;
	}
	public String getEtc5() {
		return etc5;
	}
	public void setEtc5(String etc5) {
		this.etc5 = etc5;
	}
	public String getNewThumb1() {
		return newThumb1;
	}
	public void setNewThumb1(String newThumb1) {
		this.newThumb1 = newThumb1;
	}
	public String getNewThumb2() {
		return newThumb2;
	}
	public void setNewThumb2(String newThumb2) {
		this.newThumb2 = newThumb2;
	}
	public String getNewThumb3() {
		return newThumb3;
	}
	public void setNewThumb3(String newThumb3) {
		this.newThumb3 = newThumb3;
	}
	public String getNewDetail() {
		return newDetail;
	}
	public void setNewDetail(String newDetail) {
		this.newDetail = newDetail;
	}
	@Override
	public String toString() {
		return "ProductDTO [utils=" + utils + ", prodNo=" + prodNo + ", seller=" + seller + ", prodCate1=" + prodCate1
				+ ", prodCate2=" + prodCate2 + ", prodName=" + prodName + ", descript=" + descript + ", company="
				+ company + ", price=" + price + ", discount=" + discount + ", point=" + point + ", stock=" + stock
				+ ", sold=" + sold + ", delivery=" + delivery + ", hit=" + hit + ", score=" + score + ", review="
				+ review + ", thumb1=" + thumb1 + ", newThumb1=" + newThumb1 + ", thumb2=" + thumb2 + ", newThumb2="
				+ newThumb2 + ", thumb3=" + thumb3 + ", newThumb3=" + newThumb3 + ", detail=" + detail + ", newDetail="
				+ newDetail + ", status=" + status + ", duty=" + duty + ", receipt=" + receipt + ", bizType=" + bizType
				+ ", origin=" + origin + ", ip=" + ip + ", rdate=" + rdate + ", etc1=" + etc1 + ", etc2=" + etc2
				+ ", etc3=" + etc3 + ", etc4=" + etc4 + ", etc5=" + etc5 + ", priceWithComma=" + priceWithComma + "]";
	}
	
	
}
