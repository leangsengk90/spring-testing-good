package com.kshrd.registration.utillity;

import java.util.Date;

public class GenerateId {
    public static String id(){
        Date date = new Date();
        String id = String.valueOf(date.getTime());
        return id;
    }
}
