package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;

@Entity
@Table(name = "x")
@NamedStoredProcedureQueries({@NamedStoredProcedureQuery(
        name = "storedProcedure",
        procedureName = "GetX",
        resultClasses = {X.class},
        parameters = {
                @StoredProcedureParameter(
                        mode = ParameterMode.IN,
                        name = "idxx",
                        type = Integer.class)
        }
        )
})
public class X {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idx" )
    private Integer idx;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "e_mail")
    private String eMail;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "modified_date")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss.SSSZ")
    private java.util.Date modifiedDate;

    public X(String firstName, String lastName, String eMail, String phoneNumber, java.util.Date modifiedDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.eMail = eMail;
        this.phoneNumber = phoneNumber;
        this.modifiedDate = modifiedDate;
    }

    public X(){}

    public Integer getIdx() {
        return idx;
    }

    public void setIdx(Integer idx) {
        this.idx = idx;
    }

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

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public java.util.Date getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(java.util.Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    @Override
    public String toString() {
        return "X{" +
                "idx=" + idx +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", eMail='" + eMail + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", modifiedDate=" + modifiedDate +
                '}';
    }
}
