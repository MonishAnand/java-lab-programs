class Place{
void display(){
System.out.println("place:chennai");
System.out.println("state:tn");}}
class College extends Place{
void display(){
System.out.println("name:sist");
System.out.println("rank:45");}
void print(){
display();
super.display();}}
class Superme{
public static void main(String[]args){
College c = new College();
c.print();}}
