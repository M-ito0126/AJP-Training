import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.util.Timer;
import java.util.TimerTask;

public class Measurement {
    public static void main(String []args) {
        Calendar measurement = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        Timer timer = new Timer();
        System.out.println("20秒カウントスタート");
        TimerTask task = new TimerTask() {
            int cnt = 0;
            public void run() {
                measurement.add(Calendar.SECOND, 1);
                System.out.println(sdf.format(measurement.getTime()));
                cnt++;
                //カウント20以上になった場合タイマーを中止、中止の合図を出力
                if(cnt >= 20) {
                    timer.cancel();
                    System.out.println("20秒カウント終わりました");
                }
            }
        };
        timer.schedule(task, 0, 1000);
    }
}