package org.example;

import org.name.base.BaseClass;
import org.name.base.UserDataDTO;
import org.name.implementation.ChromeBaseClassImplementation;

public class OOPSPractice {
    public static void main(String[] args) {

        //DatType name = value
        //int a =10;
       BaseClass baseClass= new ChromeBaseClassImplementation();
       baseClass.openBrowser();
       baseClass.navigate("https://www.saucedemo.com/");

       UserDataDTO userDataDTO= new UserDataDTO();
       userDataDTO.setUserName("locked_out_user");
       userDataDTO.setPassWord("secret_sauce");

       System.out.println("UserName : "+userDataDTO.getUserName());
       System.out.println("password : "+userDataDTO.getPassWord());






    }
}
