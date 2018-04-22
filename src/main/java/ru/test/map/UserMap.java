package ru.test.map;

public class UserMap {
    private int id;
    private String mame;
    private int age;

    public UserMap(int id, String mame, int age) {
        this.id = id;
        this.mame = mame;
        this.age = age;
    }

    @Override
    public String toString() {
        return "UserMap{" +
                "id=" + id +
                ", mame='" + mame + '\'' +
                ", age=" + age +
                '}';
    }
}
