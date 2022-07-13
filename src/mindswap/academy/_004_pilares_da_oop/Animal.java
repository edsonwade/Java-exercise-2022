package mindswap.academy._004_pilares_da_oop;

import java.util.Objects;

public abstract class Animal {
    private String name;
    private int age;
    private Color color;


    public Animal() {
    }

    public Animal(String name, int age, Color color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    protected abstract String sing();

    protected abstract String walk();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return age == animal.age &&
                Objects.equals(name, animal.name) &&
                color == animal.color;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, color);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color=" + color +
                '}';
    }

}
