package tnt;


public class CompareUserByAge implements CompareUser {

    public int compare(User user1, User user2){
        return  user2.getAge()-user1.getAge();

    }
}
