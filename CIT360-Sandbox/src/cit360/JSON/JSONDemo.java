/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit360.JSON;

import org.quickconnectfamily.json.*;
import cit360.hibernate.Soda;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.HashMap;

/**
 *
 * @author Philip
 */
public class JSONDemo {

    static Soda sprite;
    static Soda fanta;

    public static void main(String[] args) {

        try {
            sprite = new Soda("Sprite", "Lemon-Lime", "Clear");

            String spriteString = JSONUtilities.stringify(sprite);
            System.out.println(spriteString);
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            File sodaFile = new File("soda1.json");
            //sodaFile.createNewFile();
            FileInputStream fIn;
            fIn = new FileInputStream(sodaFile);
            JSONInputStream inJSON = new JSONInputStream(fIn);

            HashMap sodaMap = (HashMap) inJSON.readObject();
            fanta = new Soda((String)sodaMap.get("name"), (String)sodaMap.get("flavor"), (String)sodaMap.get("color"));
            inJSON.close();

            System.out.println(JSONUtilities.stringify(fanta));

        } catch (Exception e) {
            e.printStackTrace();
        }

        try {

            File sodaFile = new File("soda2.json");

            FileOutputStream fStream = new FileOutputStream(sodaFile);
            JSONOutputStream outJSON = new JSONOutputStream(fStream);
            outJSON.writeObject(sprite);
            outJSON.writeObject(fanta);
            outJSON.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
