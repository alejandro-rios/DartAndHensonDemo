package com.f22labs.darthensondemo;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by f22labs on 03/05/17.
 */

public class User implements Parcelable {


    private String mobile;

    private String email;

    private String name;

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.mobile);
        dest.writeString(this.email);
        dest.writeString(this.name);
    }

    public User() {
    }

    protected User(Parcel in) {
        this.mobile = in.readString();
        this.email = in.readString();
        this.name = in.readString();
    }

    public static final Creator<User> CREATOR = new Creator<User>() {
        @Override
        public User createFromParcel(Parcel source) {
            return new User(source);
        }

        @Override
        public User[] newArray(int size) {
            return new User[size];
        }
    };
}
