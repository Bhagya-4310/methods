package com.neoteric.swiggy.service;

import com.neoteric.swiggy.model.OTP;
import com.neoteric.swiggy.model.Restaurant;
import com.neoteric.swiggy.model.User;

import java.util.Date;
import java.util.UUID;

public class OTPservice {

    public User userInstance;
    public OTP otpInstance;

    public OTP generateOTP(User inputUser){
        userInstance=inputUser;
        OTP otp=new OTP();
        otp.otpNumber= UUID.randomUUID().toString();
        otp.creationDate=new Date();
        long currentTimeInMillis=otp.creationDate.getTime();
        long endTimeInMillis= currentTimeInMillis+900000;
        otp.expiryDate=new Date(endTimeInMillis);
        otpInstance=otp;
        return otp;
    }
    public String OtpValidation(OTP inputOtp,User inputUser){
        if(inputOtp.otpNumber.equals(otpInstance.otpNumber) && inputUser.mobileNumber.equals(otpInstance.mobileNumber  )){
            return "OTP validation is Successful";
        }else{
            return "Invalid OTP";
        }
    }
}
 /*   OTP otpGenaration(Restaurant restaurant) {
        OTP otp = new OTP();
        otp.phnNumber = "1234";
        otp.otp = UUID.randomUUID().toString();
        otp.startTime = new Date();
        long st = otp.startTime.getTime();
        long et = st + 300000;
        otp.endTime = new Date(et);

        return otp;
    } */
