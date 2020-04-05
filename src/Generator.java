import java.util.Random;
import java.util.stream.IntStream;

public class Generator {

    private static final int PASSWORD_LENGTH = 20;
    private static final int GENERATE_COUNT = 10;
    private static final String CHARACTERS = "AaBbCcdEeFfGHhKkLMmNnPpQRrSsTtUuVvWwXxYyZz123456789";

    private static Random random = new Random(System.currentTimeMillis());

    public static void main(String[] args) {
        IntStream.range(0, GENERATE_COUNT).forEach(i -> {
            String password = generatePassword();
            System.out.println(password);
        });
    }

    private static String generatePassword() {
        StringBuilder sequence = new StringBuilder();
        IntStream.range(0, PASSWORD_LENGTH).forEach(i -> {
            int pos = random.nextInt(CHARACTERS.length());
            sequence.append(CHARACTERS.charAt(pos));
        });
        return sequence.toString();
    }
}
