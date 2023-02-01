class Add{
int a,b;
Add(){
a=10;
b=10;
}
void display(){
System.out.println("sum = "+(a+b));}
public static void main(String[]args){
Add a = new Add();
a.display();}
}