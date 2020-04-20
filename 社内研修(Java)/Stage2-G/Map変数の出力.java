import java.util.Collections;
import java.util.ArrayList;
import java.util.List;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Iterator;

public class WeekDays {
    public static void main(String []args) {
        List<String> listAlphabet = new ArrayList<>();
        Collections.addAll(listAlphabet, "monday", "tuesday", "wednesday", "thursday", "friday", "saturday", "sunday");
        List<String> listJapanese = new ArrayList<>();
        Collections.addAll(listJapanese, "月曜日", "火曜日", "水曜日", "木曜日", "金曜日", "土曜日", "日曜日");
        Map<String, String> map = new LinkedHashMap<>();
        //listAlphabetとlistJapaneseをmapに追加
        for (int i =0; i < listAlphabet.size(); i++) {
            map.put(listAlphabet.get(i).toUpperCase(), listJapanese.get(i));
        }
        Iterator<Map.Entry<String, String>> mapItr = map.entrySet().iterator();
        // key, valueの取得
        while(mapItr.hasNext()) {
        // nextを使用して値を取得する
        Map.Entry<String, String> days = mapItr.next();
        System.out.println(days.getKey() + "（" + days.getValue() + "）");
        }
    }
}