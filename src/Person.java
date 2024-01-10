public class Person {
    String firstName;
    String lastName;
    int age;
    int identityNumber;
    int height;
    double weight;


    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public Person(String firstName, String lastName, int age, int identityNumber, int height, double weight) {
        this(firstName, lastName, age);
        this.identityNumber = identityNumber;
        this.height = height;
        this.weight = weight;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public boolean isTeen() {
        if (13 <= getAge() && getAge() <= 19)
            return true;
        return false;
    }
}
