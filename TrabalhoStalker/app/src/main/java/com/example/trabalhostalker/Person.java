package com.example.trabalhostalker;

import android.os.Parcel;
        import android.os.Parcelable;
import android.text.Editable;

public class Person implements Parcelable {

    private String firstName;
    private String lastName;
    private String job;
    private String phone;
    private String description;
    private String birftdhay;
    private int age;

    public Person(String firstName, String lastName, String job, String phone, String description, String birftdhay, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.job = job;
        this.phone = phone;
        this.description = description;
        this.birftdhay = birftdhay;
        this.age = age;
    }

    public String getBirftdhay() {
        return birftdhay;
    }

    public void setBirftdhay(String birftdhay) {
        this.birftdhay = birftdhay;
    }



    protected Person(Parcel in) {
        firstName = in.readString();
        lastName = in.readString();
        job = in.readString();
        phone = in.readString();
        age = in.readInt();
        description = in.readString();
        birftdhay = in.readString();
    }

    public static final Creator<Person> CREATOR = new Creator<Person>() {
        @Override
        public Person createFromParcel(Parcel in) {
            return new Person(in);
        }

        @Override
        public Person[] newArray(int size) {
            return new Person[size];
        }
    };

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public static Creator<Person> getCREATOR() {
        return CREATOR;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(firstName);
        dest.writeString(lastName);
        dest.writeString(job);
        dest.writeString(phone);
        dest.writeInt(age);
        dest.writeString(description);
        dest.writeString(birftdhay);
    }
}