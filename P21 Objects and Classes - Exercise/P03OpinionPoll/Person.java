package P07ObjectsAndClassesExercise.P03OpinionPoll;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age){
        this.age=age;
        this.name=name;
    }

    public String getName(){
        return this.name=name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }


}
