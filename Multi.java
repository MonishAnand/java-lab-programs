class Brand{
void brand(){
System.out.println("there are many brands");
}
}
class Audi extends Brand{
void audi(){
System.out.println("audi is a brand"+"\n there are many models in audi");
}
}
class A2 extends Audi{
void a2(){
System.out.println("a2 is a model");
}
}
class Multi{
public static void main(String[]args){
A2 s1 = new A2();
s1.brand();
s1.audi();
s1.a2();
}
}
