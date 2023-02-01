class employee{
int salary=1000;}
class hr extends employee{
int salary= 2000;
void display(){
System.out.println(super.salary);
System.out.println(salary);}}
class Superacc{
public static void main(String[]args){
hr s = new hr();
s.display();}}