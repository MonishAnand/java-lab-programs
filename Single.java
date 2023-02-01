class Employee{
void display(){
System.out.println("employee works");
}
}
class Manager extends Employee{
void work(){
System.out.println("manager manages");
}
}
class Single{
public static void main(String[]args){
Manager s1 = new Manager();
s1.display();
s1.work();
}
}