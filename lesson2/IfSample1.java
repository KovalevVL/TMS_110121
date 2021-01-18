class IfSample1 {
public static void main(String args []) {
int x, y;
x = 10;
y = 20;
if (x<y) System.out.println("x less y");
x = x * 2;
if(x==y) System.out.println("x now equal y");
x = x *2;
if (x>y) System.out.println("x more y");
if (x==y) System.out.println("you won't see it");
}
}