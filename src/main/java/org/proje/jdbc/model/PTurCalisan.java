package org.proje.jdbc.model;

public class PTurCalisan {

    String personel_id,ad,soyad,pTur,cTur;

    public PTurCalisan() {
    }

    public PTurCalisan(String personel_id, String ad, String soyad, String pTur, String cTur) {
        this.personel_id = personel_id;
        this.ad = ad;
        this.soyad = soyad;
        this.pTur = pTur;
        this.cTur = cTur;
    }

    public String getPersonel_id() {
        return personel_id;
    }

    public void setPersonel_id(String personel_id) {
        this.personel_id = personel_id;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getpTur() {
        return pTur;
    }

    public void setpTur(String pTur) {
        this.pTur = pTur;
    }

    public String getcTur() {
        return cTur;
    }

    public void setcTur(String cTur) {
        this.cTur = cTur;
    }
}