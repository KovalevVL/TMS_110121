public class ReverseNumber {
    public static void main (String args[]) {
       int num=9876;
       int a=num%1000;
       int b=a%100;
       int c=b%10;
       int n4=(b%10)*1000;
       int n3=(b-c)*10;
       int n2=(a-b)/10;
       int n1=(num-a)/1000;
       int revNub=n4+n3+n2+n1;
       System.out.println(num);
       System.out.println(revNub);
    }

}

/*Определить число, полученное выписыванием в обратном порядке цифр
 *любого 4-х значного натурального числа n.
 * */