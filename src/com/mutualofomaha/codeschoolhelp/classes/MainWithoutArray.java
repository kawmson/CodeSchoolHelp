package com.mutualofomaha.codeschoolhelp.classes;

import com.mutualofomaha.codeschoolhelp.classes.objects.Insured;
import com.mutualofomaha.codeschoolhelp.classes.objects.PolicyWithoutArray;

public class MainWithoutArray {

    public static void main(String[] args) {

        //declare a holding array (file cabinet- it's empty)
        //ArrayList<Insured> insureds = new ArrayList<>();

        //create one insured
        Insured insured = new Insured();
        insured.setFirstName("Kim");
        insured.setLastName("Williamson");
        insured.setCity("Omaha");
        insured.setState("NE");

        //add that insured to the array (file cabinet)
        //insureds.add(insured);

        //create another insured
        Insured insured2 = new Insured();
        insured2.setFirstName("George");
        insured2.setLastName("Williamson");
        insured2.setCity("Omaha");
        insured2.setState("NE");

        //add insured2 to the array (file cabinet)
        //insureds.add(insured2);

        //create a policy object and set the insureds on that object so now my policy has both my insureds attached to it.
        PolicyWithoutArray policyWithoutArray = new PolicyWithoutArray();
        policyWithoutArray.setPolicyNumber("00034233");
        policyWithoutArray.setFaceAmount("30000");
        //policy.setInsureds(insureds);
        policyWithoutArray.setPrimaryInsured(insured);
        policyWithoutArray.setSecondaryInsured(insured2);

        printInsuredsFromPolicy(policyWithoutArray);
        printInsuredsFromIndividualObjects(insured, insured2);


    }

    //with this way of doing it, I have to update this method every time the policy gets a new insured so you're constantly worried about a new product causing maintenance to this code.
    public static void printInsuredsFromPolicy(PolicyWithoutArray policyWithoutArray) {

        System.out.println(policyWithoutArray.getPrimaryInsured().getFirstName());
        System.out.println(policyWithoutArray.getPrimaryInsured().getLastName());
        System.out.println(policyWithoutArray.getPrimaryInsured().getCity());
        System.out.println(policyWithoutArray.getPrimaryInsured().getState());
        System.out.println();

        System.out.println(policyWithoutArray.getSecondaryInsured().getFirstName());
        System.out.println(policyWithoutArray.getSecondaryInsured().getLastName());
        System.out.println(policyWithoutArray.getSecondaryInsured().getCity());
        System.out.println(policyWithoutArray.getSecondaryInsured().getState());
        System.out.println();

        }

    //with this way of doing it, I have to update this method every time the policy gets a new insured so you're constantly worried about a new product causing maintenance to this code.
    public static void printInsuredsFromIndividualObjects(Insured primaryInsured, Insured secondaryInsured) {

        System.out.println(primaryInsured.getFirstName());
        System.out.println(primaryInsured.getLastName());
        System.out.println(primaryInsured.getCity());
        System.out.println(primaryInsured.getState());
        System.out.println();

        System.out.println(secondaryInsured.getFirstName());
        System.out.println(secondaryInsured.getLastName());
        System.out.println(secondaryInsured.getCity());
        System.out.println(secondaryInsured.getState());
        System.out.println();

    }
}


