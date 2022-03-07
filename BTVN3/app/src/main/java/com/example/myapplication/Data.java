package com.example.myapplication;

import android.os.Parcel;
import android.os.Parcelable;

public class Data implements Parcelable {
    private String Tk, Mk;

    public Data(String tk, String mk) {
        Tk = tk;
        Mk = mk;
    }

    public Data() {
    }

    protected Data(Parcel in) {
        Tk = in.readString();
        Mk = in.readString();
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

    public String getTk() {
        return Tk;
    }

    public void setTk(String tk) {
        Tk = tk;
    }

    public String getMk() {
        return Mk;
    }

    public void setMk(String mk) {
        Mk = mk;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(Tk);
        parcel.writeString(Mk);
    }
}
