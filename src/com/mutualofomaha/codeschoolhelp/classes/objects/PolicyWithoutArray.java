package com.mutualofomaha.codeschoolhelp.classes.objects;

public class PolicyWithoutArray {

    private String policyNumber;
    private String faceAmount;
    private Insured primaryInsured;
    private Insured secondaryInsured;



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

    public Insured getPrimaryInsured() {
        return primaryInsured;
    }

    public void setPrimaryInsured(Insured primaryInsured) {
        this.primaryInsured = primaryInsured;
    }

    public Insured getSecondaryInsured() {
        return secondaryInsured;
    }

    public void setSecondaryInsured(Insured secondaryInsured) {
        this.secondaryInsured = secondaryInsured;
    }
}
