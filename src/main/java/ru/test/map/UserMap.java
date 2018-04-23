package ru.test.map;


import java.util.Objects;

public class UserMap {
    private int id;
    private String name;
    private int age;

    public UserMap(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "UserMap{" +
                "id=" + id +
                ", mame='" + name + '\'' +
                ", age=" + age +
                '}';
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//
//        UserMap userMap = (UserMap) o;
//
//        if (id != userMap.id) return false;
//        if (age != userMap.age) return false;
//        return name != null ? name.equals(userMap.name) : userMap.name == null;
//    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + age;
        return result;
    }
}
