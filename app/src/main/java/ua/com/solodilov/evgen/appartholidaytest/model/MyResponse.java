package ua.com.solodilov.evgen.appartholidaytest.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class MyResponse {
    @Override
    public String toString() {
        return "MyResponse{" +
                "type='" + type + '\'' +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", code='" + code + '\'' +
                ", lat='" + lat + '\'' +
                ", lng='" + lng + '\'' +
                ", zoom='" + zoom + '\'' +
                ", price='" + price + '\'' +
                ", currency='" + currency + '\'' +
                ", uah='" + uah + '\'' +
                ", bold='" + bold + '\'' +
                ", active=" + active +
                ", countryId='" + countryId + '\'' +
                ", countryName='" + countryName + '\'' +
                ", countryNameVn='" + countryNameVn + '\'' +
                ", countryNamePr='" + countryNamePr + '\'' +
                ", nameVn='" + nameVn + '\'' +
                ", namePr='" + namePr + '\'' +
                ", stars='" + stars + '\'' +
                ", cityId='" + cityId + '\'' +
                ", cityName='" + cityName + '\'' +
                ", cityNameVn='" + cityNameVn + '\'' +
                ", cityNamePr='" + cityNamePr + '\'' +
                ", countryNameRd='" + countryNameRd + '\'' +
                '}';
    }

    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("code")
    @Expose
    private String code;
    @SerializedName("lat")
    @Expose
    private String lat;
    @SerializedName("lng")
    @Expose
    private String lng;
    @SerializedName("zoom")
    @Expose
    private String zoom;
    @SerializedName("price")
    @Expose
    private String price;
    @SerializedName("currency")
    @Expose
    private String currency;
    @SerializedName("uah")
    @Expose
    private String uah;
    @SerializedName("bold")
    @Expose
    private String bold;
    @SerializedName("active")
    @Expose
    private Boolean active;
    @SerializedName("countryId")
    @Expose
    private String countryId;
    @SerializedName("countryName")
    @Expose
    private String countryName;
    @SerializedName("countryNameVn")
    @Expose
    private String countryNameVn;
    @SerializedName("countryNamePr")
    @Expose
    private String countryNamePr;
    @SerializedName("nameVn")
    @Expose
    private String nameVn;
    @SerializedName("namePr")
    @Expose
    private String namePr;
    @SerializedName("stars")
    @Expose
    private String stars;
    @SerializedName("cityId")
    @Expose
    private String cityId;
    @SerializedName("cityName")
    @Expose
    private String cityName;
    @SerializedName("cityNameVn")
    @Expose
    private String cityNameVn;
    @SerializedName("cityNamePr")
    @Expose
    private String cityNamePr;
    @SerializedName("countryNameRd")
    @Expose
    private String countryNameRd;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLng() {
        return lng;
    }

    public void setLng(String lng) {
        this.lng = lng;
    }

    public String getZoom() {
        return zoom;
    }

    public void setZoom(String zoom) {
        this.zoom = zoom;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getUah() {
        return uah;
    }

    public void setUah(String uah) {
        this.uah = uah;
    }

    public String getBold() {
        return bold;
    }

    public void setBold(String bold) {
        this.bold = bold;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public String getCountryId() {
        return countryId;
    }

    public void setCountryId(String countryId) {
        this.countryId = countryId;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getCountryNameVn() {
        return countryNameVn;
    }

    public void setCountryNameVn(String countryNameVn) {
        this.countryNameVn = countryNameVn;
    }

    public String getCountryNamePr() {
        return countryNamePr;
    }

    public void setCountryNamePr(String countryNamePr) {
        this.countryNamePr = countryNamePr;
    }

    public String getNameVn() {
        return nameVn;
    }

    public void setNameVn(String nameVn) {
        this.nameVn = nameVn;
    }

    public String getNamePr() {
        return namePr;
    }

    public void setNamePr(String namePr) {
        this.namePr = namePr;
    }

    public String getStars() {
        return stars;
    }

    public void setStars(String stars) {
        this.stars = stars;
    }

    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getCityNameVn() {
        return cityNameVn;
    }

    public void setCityNameVn(String cityNameVn) {
        this.cityNameVn = cityNameVn;
    }

    public String getCityNamePr() {
        return cityNamePr;
    }

    public void setCityNamePr(String cityNamePr) {
        this.cityNamePr = cityNamePr;
    }

    public String getCountryNameRd() {
        return countryNameRd;
    }

    public void setCountryNameRd(String countryNameRd) {
        this.countryNameRd = countryNameRd;
    }
}