package com.neoteric.swiggy.service;

import com.neoteric.swiggy.model.*;

public class SwiggyTest {
    public static void main(String[] args) {
            User user=new User();
            user.name="ABC";
            user.mobileNumber="1234567890";
            Restaurant restaurant = new Restaurant();
            Menu menu = new Menu();

            restaurant.restaurantName = "ABC";
            restaurant.flatNo = "111";
            restaurant.street = "KPHB 5 Phase";
            restaurant.area = "KPHB";
            restaurant.landMark = "Near Hitech City";
            restaurant.pincode = "12345";
            restaurant.user=user;

            menu.name = "Biryani";
            menu.price = 200;
            menu.status = true;
            restaurant.menu = menu;

            SwiggyService service=new SwiggyService();
            OTP testOTP= service.registerRestaurant(restaurant);

            String response=service.validateOTP(testOTP,restaurant.user);
            System.out.println(response);

        }
    }
       /* Address add=new Address();
        add.flatno="1234";
        add.area="kkp";
        add.landMark="hostel";
        add.pinCode="4310";
        add.street="kphb";
        Menu m=new Menu();
        m.name="chicken";
        m.price=260;
        m.status=true;
       Restaurant r=new Restaurant();
        r.name="mhefil";
        r.resturantAddress=add;
        r.menu=m;
        SwiggyService service=new SwiggyService();
        service.login("bhagi","4310");
        OTP newotp= service.otpGenaration(r);
        System.out.println(newotp.otp);
        System.out.println(newotp.phnNumber);
        System.out.println(newotp.startTime);
        System.out.println(newotp.endTime);

    } */