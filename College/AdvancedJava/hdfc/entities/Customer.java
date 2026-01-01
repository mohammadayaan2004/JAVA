package AdvancedJava.hdfc.entities;//hdfc.entities

import java.util.ArrayList;
import java.util.List;
import java.util.Date;

public class Customer {
    public List<Account> accoounts=new ArrayList<Account>();
    private String email;           
    private final String customerId="HDFC23980";
    private String name;
    private String fatherName;
    private String dob;
    private String gender;
    private String address;
    private String phoneNo;
    private String aadharNo;
    private String panNo;
    private int branchId;
    private Date accountCreationDate; // new
    private Date lastLoginDate;  

}
