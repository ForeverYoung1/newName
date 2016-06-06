package tnt;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws InterruptedException, ClassNotFoundException {
        User[] users = {new User(10, "Sasha"),new User(20, "Andrey")};
        System.out.println(Arrays.asList(users));
        CompareUser compareUser = new CompareUserByAge();

sort(users,compareUser);
        }

private static void sort(User[] users, CompareUser comparableUser){
    for (int i = 0; i<users.length; i++){
        for (int j = 0; j < users.length-1; j++){
            User a = users [j];
            User b = users[j+1];
            if(comparableUser.compare(a,b) <0){
                users[j]=b;
                users[j+1]=a;
            }
        }
    }
}
        }