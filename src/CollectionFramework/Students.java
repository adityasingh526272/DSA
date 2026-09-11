package CollectionFramework;

public class Students implements Comparable<Students> {
    public int age;
    public String name;
    public int weight;

    @Override
    public String toString() {
        return "student1{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Students(int age, String name, int weight) {
        this.age = age;
        this.name = name;
        this.weight = weight;
    }

    @Override
    public int compareTo(Students that) {
        //this method is called for current object
        //we will define our sorting logic here

        //sort basis on age
        if (this.age == that.age){
            return this.name.compareTo(that.name);
        }
        return this.age - that.age;
    }
}
