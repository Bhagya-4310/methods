package com.neoteric.swiggy.service;

import com.neoteric.swiggy.model.OTP;
import com.neoteric.swiggy.model.Restaurant;
import com.neoteric.swiggy.model.SwiggyUser;
import com.neoteric.swiggy.model.User;

import java.sql.Time;
import java.util.Date;
import java.util.UUID;

public class SwiggyService {
    public static Restaurant restaurantStaticVariable;
    public OTP registerRestaurant(Restaurant restaurant){
        restaurantStaticVariable=restaurant;
        OTPservice otpService=new OTPservice();
        return otpService.generateOTP(restaurant.user);
    }
    public String validateOTP(OTP inputOtp, User user){
        OTPservice otpService=new OTPservice();
        return otpService.OtpValidation(inputOtp,user);
    }
}
  /*  public void login(String userName, String passWord) {
        SwiggyUser swiggyUser = new SwiggyUser();
        swiggyUser.userName = "bhagi";
        swiggyUser.password = "4310";
    }

       if (swiggyUser.userName.equals(userName) && swiggyUser.password.equals(passWord)) {

            System.out.println("Enter otp  "+swiggyUser.otp);
            Thread.sleep(5000);
            System.out.println("login successful");
        } else {
            System.out.println("username/password you entered is wrong.plez check ");
        } */

