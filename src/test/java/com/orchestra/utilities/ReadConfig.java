//[Documentation] A test suit for Qmatic Orchestra
//[Author] Anuk Dilshan

package com.orchestra.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class  ReadConfig {

    Properties pro;

     public ReadConfig(){
        File src = new File("./Configurations/config.properties");

        try {
            FileInputStream fis = new FileInputStream(src);
            pro = new Properties();
            pro.load(fis);

        } catch (Exception e) {
            System.out.println("Exception is : " + e.getMessage());

        }

     }

    public String getApplicationURL(){
        String URL = pro.getProperty("baseURL");
        return URL;
    }

    public String getUsername(){
         String UserName = pro.getProperty("userName");
         return UserName;
    }

    public String getPassword(){
         String password = pro.getProperty("password");
         return password;
    }

    public String getChromeDriver(){
         String chromePath = pro.getProperty("chromepath");
         return chromePath;
    }

    public String getFirefox(){
         String firefoxPath = pro.getProperty("firefoxpath");
         return firefoxPath;
    }
}
