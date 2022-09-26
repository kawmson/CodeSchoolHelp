package com.mutualofomaha.codeschoolhelp.classes;

import com.mutualofomaha.codeschoolhelp.classes.objects.Insured;
import com.mutualofomaha.codeschoolhelp.classes.objects.Policy;

import java.util.ArrayList;

public class MainWithArray {

    public static void main(String[] args) {

        //declare a holding array (file cabinet- it's empty)
        ArrayList<Insured> insureds = new ArrayList<>();

        //create one insured
        Insured insured = new Insured();
        insured.setFirstName("Kim");
        insured.setLastName("Williamson");
        insured.setCity("Omaha");
        insured.setState("NE");

        //add that insured to the array (file cabinet)
        insureds.add(insured);

        //create another insured
        Insured insured2 = new Insured();
        insured2.setFirstName("George");
        insured2.setLastName("Williamson");
        insured2.setCity("Omaha");
        insured2.setState("NE");

        //add insured2 to the array (file cabinet)
        insureds.add(insured2);

        //create a policy object and set the insureds on that object so now my policy has both my insureds attached to it.
        Policy policy = new Policy();
        policy.setPolicyNumber("00034233");
        policy.setFaceAmount("30000");
        policy.setInsureds(insureds);

        printInsureds(policy);
        printInsuredsFromObject(insureds);

    }

    public static void printInsureds(Policy policy) {

        for (Insured i : policy.getInsureds()) {

            System.out.println(i.getFirstName());
            System.out.println(i.getLastName());
            System.out.println(i.getCity());
            System.out.println(i.getState());
            System.out.println();

        }
    }

    public static void printInsuredsFromObject(ArrayList<Insured> insureds) {

        for (Insured i : insureds) {

            System.out.println(i.getFirstName());
            System.out.println(i.getLastName());
            System.out.println(i.getCity());
            System.out.println(i.getState());
            System.out.println();

        }
    }
}
