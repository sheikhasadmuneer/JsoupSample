/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sampleurdu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jsoup.Jsoup;
 
 
/**
 *
 * @author Owner
 */
public class SampleUrdu {

    /**
     * @param args the command line arguments
     */
 public static String html2text(String html) {
    return Jsoup.parse(html).text();
}
  

    
    public static void main(String[] args) throws UnsupportedEncodingException, IOException      {
        // TODO code application logic here
     System.out.println(html2text(GetResponse.GetTokens()));
     
     
        
         
                
    }
    
}
