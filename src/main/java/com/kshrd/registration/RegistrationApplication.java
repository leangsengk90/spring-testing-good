package com.kshrd.registration;

import com.kshrd.registration.utillity.DecodeCryptoJS;
import org.jasypt.util.text.AES256TextEncryptor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.time.Instant;
import java.time.ZonedDateTime;
import java.util.Base64;
import java.util.Calendar;
import java.util.Date;

@SpringBootApplication
public class RegistrationApplication {

	public static void main(String[] args) {

		SpringApplication.run(RegistrationApplication.class, args);
		//DecodeCryptoJS.getDecode("wEFgv603kC3aJfpeLNKPqgBGyzN7hsVMcBKgynTafu8=");

		System.out.print("Current Time in milliseconds = ");
		System.out.println(System.currentTimeMillis());

//		//Instantiating the Date class
//		Date date = new Date();
//		long msec = date.getTime();
//		System.out.println("Milli Seconds1: "+msec);
//
//		//Creating the Calendar object
//		Calendar cal = Calendar.getInstance();
//		long msec2 = cal.getTimeInMillis();
//		System.out.println("Milli Seconds2: "+msec2);
//
//		//Creating the ZonedDateTime object
//		ZonedDateTime obj = ZonedDateTime.now();
//		Instant instant = obj.toInstant();
//		long msec3 = instant.toEpochMilli();
//		System.out.println("Milli Seconds3: "+msec3);

	}



}
