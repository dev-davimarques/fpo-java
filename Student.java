public class Student {
    private String name;

    public Student(String name){
        this.name = name;
    }
    // getters e setters
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    // toString
    @Override
    public String toString(){
        return String.format("Student{ name = %s }", name);
    }

}
