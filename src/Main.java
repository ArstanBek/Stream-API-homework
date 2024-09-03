import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // 1 task
        ArrayList<Integer> randomNumbers = new ArrayList<>();

        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            int randomNumber = random.nextInt(991) + 10;
            randomNumbers.add(randomNumber);
        }

        List<Integer> filteredNumbers = randomNumbers.stream().filter(n -> n > 500).toList();

        for (Integer i:filteredNumbers) {
            System.out.println(i);
        }


        // 2 task
        long countOddNumbers = randomNumbers.stream().filter(n -> n % 2 != 0).count();
        System.out.println("countOddNumbers " + countOddNumbers);


        // 3 task
        List<String> randomStrings = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            int randomNumber = random.nextInt(5) + 3;
            String str = "";
            for (int j = 0; j < randomNumber; j++) {
                int randomIntChar = random.nextInt(26) + 65;
                char randomChar = (char) randomIntChar;
                str = str + randomChar;
            }
            randomStrings.add(str);
        }

        List<String> palindroms = new ArrayList<>();

        for(String s:randomStrings) {
            String[] stringChars = s.split("");
            String newString = s;

            for (int i = stringChars.length - 1; i>=0; i--) {
                newString = newString + stringChars[i];
            }
            palindroms.add(newString);
        }

        System.out.println(palindroms.getFirst());

        // 4

        List<Client> clients = new ArrayList<>();

        clients.add(
                new Client(1, "Alex", 24, List.of(
                        new Telephone[]{new Telephone(1234, "home"), new Telephone(1235, "mobile")})
                )
        );

        clients.add(
                new Client(2, "Jax", 25, List.of(
                        new Telephone[]{new Telephone(1231, "home"), new Telephone(1215, "mobile")})
                )
        );

        clients.add(
                new Client(3, "Sam", 27, List.of(
                        new Telephone[]{new Telephone(1225, "mobile")})
                )
        );

        clients.add(
                new Client(4, "Sarah", 23, List.of(
                        new Telephone[]{new Telephone(1125, "home")})
                )
        );

        List<Client> filteredCliets = clients.stream().filter(client -> {
            long tels =  client.getTelephones().stream().filter(telephone -> Objects.equals(telephone.getType(), "home")).count();
            return tels > 0;
        }).toList();

        Client foundClient = null;
        int maxAge = 0;

        for (Client c:filteredCliets) {
            if (maxAge < c.getAge()) {
                foundClient = c;
            }
            maxAge = c.getAge();
        }

        System.out.println(foundClient.getName()); // Jax

    }
}