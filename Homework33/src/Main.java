public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        User user1 = new User();
        User user2 = (User) user1.clone();

        System.out.println(user1);
        System.out.println(user2);
        System.out.println(user1.equals(user2));
        System.out.println(user1.hashCode());
        System.out.println(user2.hashCode());

        user2.name="Bob";
        System.out.println();

        System.out.println(user1);
        System.out.println(user2);
        System.out.println(user1.equals(user2));
        System.out.println(user1.hashCode());
        System.out.println(user2.hashCode());
    }
}