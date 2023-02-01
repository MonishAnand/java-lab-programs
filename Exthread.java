class Exthread extends Thread{
public void run(){
System.out.println("thread is running");
}
public static void main(String[]args){
Exthread s = new Exthread();
s.start();}}