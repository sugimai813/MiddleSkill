import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class test1 {
    public static void main(String[] args) throws ParseException {
        String shinyaBirthday = "1998/03/19";
        String minamiBirthday = "2000/02/14";
        String furuyamaBirthday = "1998/09/12";
        //改行
        System.out.println("問１");
        //問題1:現在の時刻を出力してください
        Date date = new Date();
        System.out.println(date);
        //改行
        System.out.println("問２");
        //問題2:shinyaBirthdayとminamiBirthdayを日付型に変更し条件式で誕生日を比較し早い方の日付を文字列型で出力しなさい。
        SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");
        Date shinyaDate = format.parse(shinyaBirthday);
        Date minamiDate = format.parse(minamiBirthday);
        
        String earlierBirthday = (shinyaDate.before(minamiDate)) ? shinyaBirthday : minamiBirthday;
        System.out.println(earlierBirthday);
        
        //改行
        System.out.println("問３");
        //問題3:furuyamaBirthdayに５年2ヶ月追加した値を文字列型で表示しなさい
        Date furuyamaDate = format.parse(furuyamaBirthday);
        
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(furuyamaDate);
        
        calendar.add(Calendar.YEAR, 5);
        calendar.add(Calendar.MONTH, 2);
        
        Date futureDate = calendar.getTime();
        String futureBirthday = format.format(futureDate);
        System.out.println(futureBirthday);
    }
}
