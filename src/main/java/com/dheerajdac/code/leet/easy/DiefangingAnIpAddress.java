package com.dheerajdac.code.leet.easy;

public class DiefangingAnIpAddress {


    public String defangIPaddr(String address){
        return address.replace(".", "[.]");
    }

    public static void main(String[] args) {
        DiefangingAnIpAddress obj = new DiefangingAnIpAddress();
        System.out.println(obj.defangIPaddr("1.1.1.1"));
    }
}
