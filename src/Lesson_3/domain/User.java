package Lesson_3.domain;

import Lesson_3.data.RandomOfNameAndAuthor;

import java.util.ArrayList;
import java.util.List;

public class User implements RandomOfNameAndAuthor {
    public Long id;
    private String name;
    private String surname;
    private List<User> friends;

    public User(String name) {
        this.name = name;
    }

    public User(Long id, String name, String surname, List<User> friends) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.friends = friends;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public List<User> getFriends() {
        return friends;
    }

    public void setFriends(List<User> friends) {
        this.friends = friends;
    }

    public static void generator(int number, User user) { //Method who generate Collections with random Names
        if (number <= 0) return;
        ArrayList<User> names = new ArrayList<>();
        names.add(new User(user.getRandomOfAuthor()));
        names.add(new User(user.getRandomOfAuthor()));
        names.add(new User(user.getRandomOfAuthor()));

        user.setFriends(names);
        for (User goga : user.getFriends()) {

            generator(number - 1, goga); //recursion
        }
    }


//    public static String stringConverter(List<User> friends){
//        StringBuilder str = new StringBuilder();
//        for(User friend:friends){
//            str.append(friend.getName() + ", ");
//        }
//
//        str.append("(");
//        for(User friend:friends){
//            if (friend.getFriends() != null){
//                str.append(stringConverter(friend.getFriends()));
//                }
//
//        }
//        str.append(")");
//
//
//        return str.toString();   //Тут я пытался сделать форматный красивый формат, но не получилось...
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (id != null ? !id.equals(user.id) : user.id != null) return false;
        if (name != null ? !name.equals(user.name) : user.name != null) return false;
        if (surname != null ? !surname.equals(user.surname) : user.surname != null) return false;
        return friends != null ? friends.equals(user.friends) : user.friends == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (surname != null ? surname.hashCode() : 0);
        result = 31 * result + (friends != null ? friends.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return name + "->" +
                " " + this.friends;
    }

    @Override
    public String getRandomOfBookName() {
        return null;
    }

    @Override
    public String getRandomOfAuthor() {
        String[] author = {"Danil", "Alexei", "Nikita", "Slava", "Pushkin", "Lebedev", "Andrei"};
        int a = (int) Math.floor(Math.random() * author.length);
        return author[a];
    }
}
