public class TimePr2 {
public static void main(String[] args) {
int s=4500;
int sec=s%60;
int m=(s-sec)/60;
int min=m%60;
System.out.println(m + "minute" + sec + "second");
int h=(m-min)/60;
int hour=h%60;
System.out.println(hour + "hour" + min + "minute" + sec + "second");
int d=(h-hour)/24;
int day=d % 24;
System.out.println(day + "day" + hour +"hour" + min + "minute" + sec + "second");
int w=(d-day)/7;
int week=w % 7;
System.out.println(week + "week" + day + "day" + hour + "hour" + min + "minute" + sec + "second");
}
}