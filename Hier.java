class Employee{
float salary = 40000;
}
class Perm extends Employee{
double hike = 0.5;
}
class Temp extends Employee{
double hike=0.25;
}
class Hier{
public static void main(String[]args){
Perm p= new Perm();
Temp t = new Temp();
System.out.println(p.salary);
System.out.println(p.hike);
System.out.println(t.salary);
System.out.println(t.hike);
}
}