package com.company;

import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.time.OffsetDateTime;

public class Main {

    public static void main(String[] args) {
        /*User user = new User("Donald Trump", "14-06-1946", "donaldtrump@aol.com");
        System.out.println(user);*/
        /*User user2 = new User("Marcel Pavel","14-01-2000","keksformony@twitch.tv");
        System.out.println(user2);*/

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("fullName","Donal Trump");
        jsonObject.put("birthDate","14-06-1946");
        jsonObject.put("email","donaldtrump@aol.com");

        try {
            FileWriter myFileWriter = new FileWriter("C:\\Users\\th3r0\\Documents\\Project8Jan2022\\Output\\output-" + OffsetDateTime.now() + ".json");
            myFileWriter.write(jsonObject.toJSONString());
            myFileWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
