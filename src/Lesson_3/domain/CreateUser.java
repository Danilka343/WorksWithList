package Lesson_3.domain;

import Lesson_3.data.UserName;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CreateUser implements UserName {

    public static final int NUMBER_OF_LEVEL = 5;  // nesting
    public static final int NUMBER_OF_FRIEND_EACH = 3; // Number of friends for each user

    //which Method randomly assigns indices from random list of friends
    public static int randomIndexUsers() {
        return (int) (Math.random() * (Users_Name.length));
    }

    public static User getRandomUser(String name, int count) {
        int index = searchIndexByNameOfUser(name);
        return new User(index + 1, name, getUserFriends(name, count));
    }

    public static List<User> getUserFriends(String name, int count) {
        ArrayList<User> friends = new ArrayList<>();

        if (count >= 0) {
            while (friends.size() < NUMBER_OF_FRIEND_EACH) {
                User friend = getRandomUser(Users_Name[randomIndexUsers()], count - 1);
                if (!friend.getName().equals(name)) {
                    friends.add(friend);
                }
            }
        }
        return friends;
    }

    public static int searchIndexByNameOfUser(String personsFirstName) {
        List<String> namesOfUsers = Arrays.asList(Users_Name);
        return namesOfUsers.indexOf(personsFirstName);
    }

    //This method shows information about the friends of the user with the given name
    public static void showUser(User userName, int count) {

        List<User> namesFriendsForShow = new ArrayList<>(userName.getFriends());

        for (User user1 : namesFriendsForShow) {
            String name = user1.getName();
            System.out.println(name);
        }
        System.out.println("/--------------/");

        if (count-- > 0) {
            for (User user : namesFriendsForShow) {
                System.out.println(user.getName() + "'s friends:");
                showUser(user, count - 1);
            }
        }
    }

    //This method shows information about user and his/her friends and their friends in the given form
    public static void showFriends(User firstUser, int countLevel) {
        showUser(firstUser, countLevel);
    }
}
