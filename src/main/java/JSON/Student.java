package JSON;

public class Student {
    
    private String name;
    private int age;
    private String strength;
    
    public Student(String n, int a, String s){
        
        name = n;
        age = a;
        strength = s;
        
    }

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", age=" + age + ", strength=" + strength + '}';
    }
    
    
    
}
