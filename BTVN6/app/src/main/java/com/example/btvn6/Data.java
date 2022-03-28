package com.example.btvn6;

import android.os.Parcel;
import android.os.Parcelable;

public class Data implements Parcelable{
    private String name, avt, congthuc, nguyenlieu, tien;

    public Data(String name, String avt, String congthuc, String nguyenlieu, String tien) {
        this.name = name;
        this.avt = avt;
        this.congthuc = congthuc;
        this.nguyenlieu = nguyenlieu;
        this.tien = tien;
    }

    public Data() {
    }

    protected Data(Parcel in) {
        name = in.readString();
        avt = in.readString();
        congthuc = in.readString();
        nguyenlieu = in.readString();
        tien = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeString(avt);
        dest.writeString(congthuc);
        dest.writeString(nguyenlieu);
        dest.writeString(tien);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<Data> CREATOR = new Creator<Data>() {
        @Override
        public Data createFromParcel(Parcel in) {
            return new Data(in);
        }

        @Override
        public Data[] newArray(int size) {
            return new Data[size];
        }
    };

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAvt() {
        return avt;
    }

    public void setAvt(String avt) {
        this.avt = avt;
    }

    public String getCongthuc() {
        return congthuc;
    }

    public void setCongthuc(String congthuc) {
        this.congthuc = congthuc;
    }

    public String getNguyenlieu() {
        return nguyenlieu;
    }

    public void setNguyenlieu(String nguyenlieu) {
        this.nguyenlieu = nguyenlieu;
    }

    public String getTien() {
        return tien;
    }

    public void setTien(String tien) {
        this.tien = tien;
    }
}
