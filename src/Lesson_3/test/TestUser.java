package Lesson_3.test;

import Lesson_3.domain.CreateUser;
import Lesson_3.domain.User;

import static Lesson_3.data.UserName.Users_Name;


public class TestUser {
    public static void main(String[] args) {

        // here we generate first random user
        User userWithFriends = CreateUser.getRandomUser(Users_Name[CreateUser.randomIndexUsers()],
                CreateUser.NUMBER_OF_LEVEL);

        //Show users and friends list
        System.out.println(userWithFriends);

        //Show first User
        System.out.println("\n" + userWithFriends.getName() + "'s friends:");

        //Showing friends and friends of friends
        CreateUser.showFriends(userWithFriends, CreateUser.NUMBER_OF_LEVEL);
    }
}
