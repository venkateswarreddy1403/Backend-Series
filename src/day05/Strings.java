package day05;

public class Strings {
    static String checkUser(String[] array, String user) {
        for(String arr : array){
            if(arr.equals(user)){
                return "User found:" + user;
            }
        }
        return "User not found:" + user;
    }
    public static void main(String[] args) {
//        Exercise 1 — Basic String
        String name = "Venkateswara";
        System.out.println(name.length());
        System.out.println(name.charAt(0));
        System.out.println(name.charAt(name.length()-1));
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());

//        Exercise 2 — Email Validation
        String email = "venky@gmail.com";
        if (email.contains("@") && email.endsWith(".com")){
            System.out.println("Valid Email");
        }

//        Exercise 3 — Count Characters
        for (int i = 0; i < name.length(); i++) {
            System.out.println(name.charAt(i));
        }
//        Exercise 4 — Count Vowels 🔥
        String word = "programming";
        int count = 0;
        word = word.toLowerCase();
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o' || word.charAt(i) == 'u') {
                count++;
            }
        }
        System.out.println(count);

//        Exercise 5 — Reverse a String
        for (int i = word.length()-1; i >= 0; i--) {
            System.out.print(word.charAt(i));;
        }

//        Exercise 6 — Search for a String
        String[] usernames = {
                "Venky",
                "Rahul",
                "Arjun",
                "Venkatesh"
        };
        System.out.println();
        System.out.println(checkUser(usernames, "Venky"));
    }
}
