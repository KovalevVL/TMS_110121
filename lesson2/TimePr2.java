public class TimePr2 {
public static void main(String[] args) {
int s=4500;
int sec=s%60;
int m=(s-sec)/60;
int min=m%60;
System.out.println(m + "�����" + sec + "������");
int h=(m-min)/60;
int hour=h%60;
System.out.println(hour + "�����" + min + "�����" + sec + "������");
int d=(h-hour)/24;
int day=d % 24;
System.out.println(day + "����" + hour + "�����" + min + "�����" + sec + "������");
int w=(d-day)/7;
int week=w % 7;
System.out.println(week + "������" + day + "����" + hour + "�����" + min + "�����" + sec + "������");
}
}