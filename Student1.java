
class Student {
    String name = null;
    int id = 0;
    Student() {}
    Student(String name, int id)
    {
        this.name = name;
        this.id = id;
    }
    
    public static void main(String[] args)
    {
        Student s1 = new Student("Ashish", 121);
        Student s2 = s1.clone();
    }
}