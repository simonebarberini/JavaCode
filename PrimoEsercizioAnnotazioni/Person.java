

@Info(author = "Simone", version = "1.0")
public class Person {
    private String name;
    private int age;
    
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    @DeprecatedCustom(message = "Questo metodo non deve essere utilizzato piú")
    public String getAge(){
        return String.valueOf(age);
    }

    public String getInfo(){
        return "Name: "+name +" Age: "+ age;
    }


    
}