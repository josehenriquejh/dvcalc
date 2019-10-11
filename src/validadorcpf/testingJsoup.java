/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validadorcpf;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;




public class testingJsoup {
   
    public static void jsouptest(){
    try {
        
       String url = "https://www.situacaocadastral.com.br/";

       Document doc = Jsoup.connect(url).get();
       String title = doc.title();
       System.out.println(title); 
      
       
       Element divTag = doc.getElementById("consultar"); 
       System.out.println(divTag.text()); 
       
       Element link = doc.select("a").first();
       String linkOuterH = link.outerHtml();
       String linkInnerH = link.html();
       System.out.println(linkOuterH);
       System.out.println(linkInnerH);
       
       
       } catch (IOException ex) {
           Logger.getLogger(testingJsoup.class.getName()).log(Level.SEVERE, null, ex);
       }
    }
    
   public static void jsoupfromfiletest() throws IOException{
            String fileName = "C:\\jsouphtml\\consulta.html";

            Document doc = Jsoup.parse(new File(fileName), "utf-8"); 
            Element divTag = doc.getElementById("doc"); 

            System.out.println(divTag.text());
   }
    

    
}

