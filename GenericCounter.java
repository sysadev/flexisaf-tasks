import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

public class GenericCounter {

    public static <T> int count(Collection<T> collection, Predicate<T> property) {
        int count = 0;
        for (T element : collection) {
            if (property.test(element)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 11);
        List<String> words = Arrays.asList("level", "hello", "radar");

        int odds = count(numbers, n -> n % 2 != 0);

        int primes = count(numbers, n -> {
            if (n <= 1) return false;
            for (int i = 2; i < n; i++) if (n % i == 0) return false;
            return true;
        });

        int palindromes = count(words, s -> s.equals(new StringBuilder(s).reverse().toString()));

        System.out.println("Odd numbers: " + odds);
        System.out.println("Primes: " + primes);
        System.out.println("Palindromes: " + palindromes);
    }
}
