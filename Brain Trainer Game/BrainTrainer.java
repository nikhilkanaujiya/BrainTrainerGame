import java.util.*;

public class BrainTrainer {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        List<String> wordPool = new ArrayList<>(List.of("apple", "river", "light", "dream", "cloud", "tiger", "glass", "ocean", "storm", "moon"));

        // Step 1: Pick 5 random words
        Collections.shuffle(wordPool);
        List<String> chosenWords = wordPool.subList(0, 5);

        // Step 2: Show words
        System.out.println("🧠 MEMORIZE THESE WORDS:");
        for (String word : chosenWords) {
            System.out.print(word + "  ");
        }

        // Wait 8 seconds
        Thread.sleep(8000);

        // Step 3: Clear screen simulation
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("📋 Now enter the words you remember:");

        // Step 4: Ask user to recall words
        Set<String> correctWords = new HashSet<>();
        for (int i = 0; i < 5; i++) {
            System.out.print("Word " + (i + 1) + ": ");
            String input = scanner.nextLine().toLowerCase();

            if (chosenWords.contains(input) && !correctWords.contains(input)) {
                correctWords.add(input);
            }
        }

        // Step 5: Show score and correct answers
        System.out.println("\n✅ You remembered " + correctWords.size() + " out of 5 correctly.");
        System.out.println("Correct words were: " + String.join(", ", chosenWords));
    }
}
