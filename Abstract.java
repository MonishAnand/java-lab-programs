abstract class bank{
abstract int getroi();}
class sbi extends bank{
int getroi(){
return 7;}}
class pnb extends bank{
int getroi(){
return 8;}}
class Abstract{
public static void main(String[]args){
bank b;
b=new sbi();
System.out.println(b.getroi());
b=new pnb();
System.out.println(b.getroi());}}