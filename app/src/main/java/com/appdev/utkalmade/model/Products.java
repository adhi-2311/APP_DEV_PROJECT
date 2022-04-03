package com.appdev.utkalmade.model;

public class Products {

    Integer productid;
    String productName;
    String productQty;
    String productPrice;
    String productDesc;
    Integer imageUrl;
    Integer bigImageUrl;

    public Products(Integer productid, String productName, String productQty, String productPrice, String productDesc, Integer imageUrl, Integer bigImageUrl) {

        this.productid = productid;
        this.productName = productName;
        this.productQty = productQty;
        this.productPrice = productPrice;
        this.productDesc = productDesc;
        this.imageUrl = imageUrl;
        this.bigImageUrl = bigImageUrl;
    }

    public Integer getBigImageUrl() {
        return bigImageUrl;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductQty() {
        return productQty;
    }

    public void setProductQty(String productQty) {
        this.productQty = productQty;
    }

    public String getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(String productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductDesc() {
        return productDesc;
    }

    public Integer getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(Integer imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Integer getProductid() {
        return productid;
    }

    public void setProductid(Integer productid) {
        this.productid = productid;
    }
}
