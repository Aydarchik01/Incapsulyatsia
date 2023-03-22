public class Dog {
    private String habitat;
    private String color;
    private String age;

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog\n" +
                "Habitat= " + habitat + "\n" +
                "Color= " + color + "\n" +
                "Age= " + age  ;
    }
}
