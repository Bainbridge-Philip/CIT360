/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit360.HTTPURLConnection;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 *
 * @author Philip
 */
public class HTTPURLConnectionDemo {

    public static void main(String[] args) {

        readSite("http://services.groupkt.com/state/search/USA?text=Wis");

    }

    public static void readSite(String website) {
        URL url;

        try {
            url = new URL(website);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            System.out.println(connection.getResponseCode());
            InputStream iStream = connection.getInputStream();
            System.out.println(inputStreamToString(iStream));
            connection.disconnect();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

  public static String inputStreamToString(InputStream iStream) {

    StringBuilder sBuilder = new StringBuilder();
    String outString = "";

    InputStreamReader streamReader = new InputStreamReader(iStream);
    BufferedReader bReader = new BufferedReader(streamReader);

        try {
            while ((outString = bReader.readLine()) != null) {
                sBuilder.append(outString);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    return sBuilder.toString();

  }
}

