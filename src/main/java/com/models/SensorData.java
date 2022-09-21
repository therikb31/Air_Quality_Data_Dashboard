package com.models;

import java.sql.Timestamp;

public class SensorData {
    private int ID;
    private  Timestamp TIMESTAMP;
    private  String MQ2;
    private  String MQ7;
    private  String MQ135;
    private  String NO2;
    private  String C2H5OH;
    private  String VOC;
    private  String CO;
    private  String HMD;
    private  String TMP;
    private  String HI;
    private  String RAWPM;
    private  String DD;
    private  String LAT;
    private  String LON;
    
    public  int getID() {
        return ID;
    }
    public void setID(int i) {
        ID = i;
    }
    public  Timestamp getTIMESTAMP() {
        return TIMESTAMP;
    }
    public  void setTIMESTAMP(Timestamp timestamp2) {
        TIMESTAMP = timestamp2;
    }
    public  String getMQ2() {
        return MQ2;
    }
    public  void setMQ2(String mQ2) {
        MQ2 = mQ2;
    }
    public  String getMQ7() {
        return MQ7;
    }
    public  void setMQ7(String mQ7) {
        MQ7 = mQ7;
    }
    public  String getMQ135() {
        return MQ135;
    }
    public  void setMQ135(String mQ135) {
        MQ135 = mQ135;
    }
    public  String getNO2() {
        return NO2;
    }
    public  void setNO2(String nO2) {
        NO2 = nO2;
    }
    public  String getC2H5OH() {
        return C2H5OH;
    }
    public  void setC2H5OH(String c2h5oh) {
        C2H5OH = c2h5oh;
    }
    public  String getVOC() {
        return VOC;
    }
    public  void setVOC(String vOC) {
        VOC = vOC;
    }
    public  String getCO() {
        return CO;
    }
    public  void setCO(String cO) {
        CO = cO;
    }
    public  String getHMD() {
        return HMD;
    }
    public  void setHMD(String hMD) {
        HMD = hMD;
    }
    public  String getTMP() {
        return TMP;
    }
    public  void setTMP(String tMP) {
        TMP = tMP;
    }
    public  String getHI() {
        return HI;
    }
    public  void setHI(String hI) {
        HI = hI;
    }
    public  String getRAWPM() {
        return RAWPM;
    }
    public  void setRAWPM(String rAWPM) {
        RAWPM = rAWPM;
    }
    public  String getDD() {
        return DD;
    }
    public  void setDD(String dD) {
        DD = dD;
    }
    public  String getLAT() {
        return LAT;
    }
    public  void setLAT(String lAT) {
        LAT = lAT;
    }
    public  String getLON() {
        return LON;
    }
    public  void setLON(String lON) {
        LON = lON;
    }
    @Override
    public String toString() {
	return "SensorData [ID=" + ID + ", TIMESTAMP=" + TIMESTAMP + ", MQ2=" + MQ2 + ", MQ7=" + MQ7 + ", MQ135="
		+ MQ135 + ", NO2=" + NO2 + ", C2H5OH=" + C2H5OH + ", VOC=" + VOC + ", CO=" + CO + ", HMD=" + HMD
		+ ", TMP=" + TMP + ", HI=" + HI + ", RAWPM=" + RAWPM + ", DD=" + DD + ", LAT=" + LAT + ", LON=" + LON
		+ "]";
    }
}
