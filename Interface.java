interface area{
double pi =3.14;
double cal(double x,double y);}
class rect implements area{
public double cal(double x,double y){
return(x*y);}}
class cir implements area{
public double cal(double x,double y){
return(pi*x*y);}}
class Interface{
public static void main(String[]args){
rect r = new rect();
cir c = new cir();
area a;
a=r;
System.out.println(a.cal(10,20));
a=c;
System.out.println(a.cal(10,20));}}
