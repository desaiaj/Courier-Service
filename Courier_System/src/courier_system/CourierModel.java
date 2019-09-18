/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package courier_system;

/**
 * This class contains and initialize fields of entire form and 
 * provides getter and setter methods to access and modify data.
 * @author Ajay
 */
public class CourierModel {

    String ShipmentID;
    private String Content;
    private double DecVal;
    private double InsVal;
    private boolean isDange;

    private String RecName;
    private String RecAdd;
    private String RecCity;
    private String RecPro;
    private String RecPC;
    private String RecCountry;
    private String RecPH;
    private String ShipBy;

    private String SenName;
    private String SenAdd;
    private String SenCity;
    private String SenPro;
    private String SenPC;
    private String SenCountry;
    private String SenPH;
    private String Notes;

    public CourierModel(String ShipmentID) {
        this.ShipmentID = ShipmentID;
    }

    public CourierModel(String ShipmentID, String Content, double DecVal, double InsVal, boolean isDange, String RecName, String RecAdd, String RecCity, String RecPro, String RecPC, String RecCountry, String RecPH, String ShipBy, String SenName, String SenAdd, String SenCity, String SenPro, String SenPC, String SenCountry, String SenPH, String Notes) {
        this.ShipmentID = ShipmentID;
        this.Content = Content;
        this.DecVal = DecVal;
        this.InsVal = InsVal;
        this.isDange = isDange;
        this.RecName = RecName;
        this.RecAdd = RecAdd;
        this.RecCity = RecCity;
        this.RecPro = RecPro;
        this.RecPC = RecPC;
        this.RecCountry = RecCountry;
        this.RecPH = RecPH;
        this.ShipBy = ShipBy;
        this.SenName = SenName;
        this.SenAdd = SenAdd;
        this.SenCity = SenCity;
        this.SenPro = SenPro;
        this.SenPC = SenPC;
        this.SenCountry = SenCountry;
        this.SenPH = SenPH;
        this.Notes = Notes;
    }

    public String getShipmentID() {
        return ShipmentID;
    }

    public void setShipmentID(String ShipmentID) {
        this.ShipmentID = ShipmentID;
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String Content) {
        this.Content = Content;
    }

    public double getDecVal() {
        return DecVal;
    }

    public void setDecVal(double DecVal) {
        this.DecVal = DecVal;
    }

    public double getInsVal() {
        return InsVal;
    }

    public void setInsVal(double InsVal) {
        this.InsVal = InsVal;
    }

    public boolean isDange() {
        return isDange;
    }

    public void setisDange(boolean isDange) {
        this.isDange = isDange;
    }

    public String getRecName() {
        return RecName;
    }

    public void setRecName(String RecName) {
        this.RecName = RecName;
    }

    public String getRecAdd() {
        return RecAdd;
    }

    public void setRecAdd(String RecAdd) {
        this.RecAdd = RecAdd;
    }

    public String getRecCity() {
        return RecCity;
    }

    public void setRecCity(String RecCity) {
        this.RecCity = RecCity;
    }

    public String getRecPro() {
        return RecPro;
    }

    public void setRecPro(String RecPro) {
        this.RecPro = RecPro;
    }

    public String getRecPC() {
        return RecPC;
    }

    public void setRecPC(String RecPC) {
        this.RecPC = RecPC;
    }

    public String getRecCountry() {
        return RecCountry;
    }

    public void setRecCountry(String RecCountry) {
        this.RecCountry = RecCountry;
    }

    public String getRecPH() {
        return RecPH;
    }

    public void setRecPH(String RecPH) {
        this.RecPH = RecPH;
    }

    public String getShipBy() {
        return ShipBy;
    }

    public void setShipBy(String ShipBy) {
        this.ShipBy = ShipBy;
    }

    public String getSenName() {
        return SenName;
    }

    public void setSenName(String SenName) {
        this.SenName = SenName;
    }

    public String getSenAdd() {
        return SenAdd;
    }

    public void setSenAdd(String SenAdd) {
        this.SenAdd = SenAdd;
    }

    public String getSenCity() {
        return SenCity;
    }

    public void setSenCity(String SenCity) {
        this.SenCity = SenCity;
    }

    public String getSenPro() {
        return SenPro;
    }

    public void setSenPro(String SenPro) {
        this.SenPro = SenPro;
    }

    public String getSenPC() {
        return SenPC;
    }

    public void setSenPC(String SenPC) {
        this.SenPC = SenPC;
    }

    public String getSenCountry() {
        return SenCountry;
    }

    public void setSenCountry(String SenCountry) {
        this.SenCountry = SenCountry;
    }

    public String getSenPH() {
        return SenPH;
    }

    public void setSenPH(String SenPH) {
        this.SenPH = SenPH;
    }

    public String getNotes() {
        return Notes;
    }

    public void setNotes(String Notes) {
        this.Notes = Notes;
    }

    @Override
    public String toString() {
        return ShipmentID + "~" + Content + "~" + DecVal + "~" + InsVal + "~" + isDange + "~"
                + RecName + "~" + RecAdd + "~" + RecCity + "~" + RecPro + "~" + RecPC + "~" + RecCountry
                + "~" + RecPH + "~" + ShipBy + "~" + SenName + "~" + SenAdd + "~" + SenCity + "~" + SenPro
                + "~" + SenPC + "~" + SenCountry + "~" + SenPH + "~" + Notes;
    }
}
