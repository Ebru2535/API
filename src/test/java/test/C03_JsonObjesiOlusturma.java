package test;

import netscape.javascript.JSException;
import netscape.javascript.JSObject;
import org.json.JSONObject;
import org.junit.Test;

public class C03_JsonObjesiOlusturma {

     /*
    Asagidaki JSON Objesini olusturup konsolda yazdirin.
    {
        "title":"Ahmet",
        "body":"Merhaba",
        "userId":1
    }
    */

    @Test
    public void jshonObjec01(){

        JSONObject ilkJshonObje=new JSONObject();

        ilkJshonObje.put("title","Ahmet");
        ilkJshonObje.put("body","Merhaba");
        ilkJshonObje.put( "userId",1);

        System.out.println("Ilk Jshon Objemiz :"+ilkJshonObje);

    }
    @Test
    public void jshonObje02(){
        /*
                {
                 "firstname":"Jim",
                 "additionalneeds":"Breakfast",
                 "bookingdates":{
                         "checkin":"2018-01-01",
                         "checkout":"2019-01-01"
                    },
                  "totalprice":111,
                  "depositpaid":true,
                  "lastname":"Brown"
                  }
         */


        JSONObject bookingDates= new JSONObject();
        bookingDates.put("checkin","2018-01-01");
        bookingDates.put(  "checkout","2019-01-01");


        JSONObject outerJshon= new JSONObject();
        outerJshon.put( "firstname","Jim");
        outerJshon.put( "additionalneeds","Breakfast");
        outerJshon.put( "totalprice",111);
        outerJshon.put( "depositpaid",true);
        outerJshon.put( "lastname","Brown");
        outerJshon.put("bookingdates",bookingDates);

        System.out.println("Booking Jshon Objemiz :" + outerJshon);
    }

}
