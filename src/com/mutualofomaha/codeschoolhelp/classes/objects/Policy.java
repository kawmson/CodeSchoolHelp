package com.mutualofomaha.codeschoolhelp.classes.objects;

import java.util.ArrayList;

public class Policy {

    private String policyNumber;
    private String faceAmount;
    private ArrayList<Insured> insureds;



    public String getPolicyNumber() {
        return policyNumber;
    }

    public void setPolicyNumber(String policyNumber) {
        this.policyNumber = policyNumber;
    }

    public String getFaceAmount() {
        return faceAmount;
    }

    public void setFaceAmount(String faceAmount) {
        this.faceAmount = faceAmount;
    }

    public ArrayList<Insured> getInsureds() {
        return insureds;
    }

    public void setInsureds(ArrayList<Insured> insureds) {
        this.insureds = insureds;
    }
}
