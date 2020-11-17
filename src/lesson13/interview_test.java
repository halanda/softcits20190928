package lesson13;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class interview_test {

	public static void main(String[] args) {
        Hashtable map = new Hashtable();
        Date comDate = new Date();
        SimpleDateFormat sft = new SimpleDateFormat("yyyy-MM");
        String strSchemeSwh = "0001-01-01";
        if(!comDate.equals((strSchemeSwh))){
            strSchemeSwh = sft.format(comDate) + "01";

        }
        if(strSchemeSwh == "0001-01-01"){
            System.out.println("Ä¿•øÇÐÌæÈÕ¸¶¤¬³õÆÚ‚Ž00010101¤Ç¤¹");
        }
        String strKijutu = getSettingData("pl.properties","NetSyoukaiHanni");
        if(strKijutu == null && strKijutu.trim().length()<2){
            map.put("KIJUTU",strKijutu);
        }


    }
    public static String getSettingData(String fileName, String key){
        Map SETUP_DATA = new HashMap();
        String strValue =(String) ((Map)SETUP_DATA.get(fileName)).get(key);
        return strValue;
    }
}