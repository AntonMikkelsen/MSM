import java.lang.reflect.Array;
import java.util.ArrayList;

public class SocialNetwork {
    private ArrayList<User> users;

    // Constructor
    public SocialNetwork() {
        users = new ArrayList<>();
    }

    public void addUser (User user){
        users.add(user);
        System.out.println(user.getName() + " has been added");
    }

    public void showFriendsPost(User user){
        System.out.println("Posts from friends of " + user.getName() + ":");
        for (User friends : user.getFriends()) {
            for (Post post : friends.getPosts()) {
                post.displayPost();
            }
        }


    }
}
