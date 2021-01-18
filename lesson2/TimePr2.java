public class TimePr2 {
public static void main(String[] args) {
int s=4500;
int sec=s%60;
int m=(s-sec)/60;
int min=m%60;
System.out.println(m + "минут" + sec + "секунд");
int h=(m-min)/60;
int hour=h%60;
System.out.println(hour + "часов" + min + "минут" + sec + "секунд");
int d=(h-hour)/24;
int day=d % 24;
System.out.println(day + "дней" + hour + "часов" + min + "минут" + sec + "секунд");
int w=(d-day)/7;
int week=w % 7;
System.out.println(week + "недель" + day + "дней" + hour + "часов" + min + "минут" + sec + "секунд");
}
}