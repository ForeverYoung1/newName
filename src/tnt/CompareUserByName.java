package tnt;


public class CompareUserByName implements CompareUser {
    public int compare(User user1, User user2){
        return  user2.getName().compareTo(user1.getName());
    }
}
