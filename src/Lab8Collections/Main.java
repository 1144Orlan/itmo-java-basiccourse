package Lab8Collections;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        //2
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 4, 3, 2, 1);
        Set<Integer> uniqueNumbers = removeDuplicates(numbers);
        System.out.println(uniqueNumbers);

        List<String> strings = List.of("Hello", "world", "!", "world", "Hello", "!", "!");
        Set<String> uniqueStrings = removeDuplicates(strings);
        System.out.println(uniqueStrings);

        //3
        //Go to "CollectionListsPerfTest" Class


        //4
        Map<User, Integer> map = new HashMap<>();
        map.put(new User("Theodor"), 518);
        map.put(new User("Ivan"), 614);
        map.put(new User("Jenny"), 595);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name of the gamer: ");
        String userName = scanner.nextLine();
        User user = new User(userName);

        Integer score = getScoreByUserName(map, user);
        if (score != null) {
            System.out.println("Player " + userName + " has " + score + " scores.");
        } else {
            System.out.println("Player " + userName + " not found.");
        }
    }

    //2
    public static <T> Set<T> removeDuplicates(Collection<T> collection) {
        return new LinkedHashSet<>(collection);//saved order
    }

    //3
    //Go to "CollectionListsPerfTest" Class

    //4
    public static Integer getScoreByUserName(Map<User, Integer> map, User user) {
        return map.get(user);
    }
}