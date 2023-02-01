class MyException extends Exception {
}
public class User {
    public static void main(String args[])
    {
        try {
            throw new MyException();
        }
        catch (MyException e) {
            System.out.println("Deleated");
            System.out.println(e);
        }
    }
}