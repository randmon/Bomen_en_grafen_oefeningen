public class Main {
    public static void main(String[] args) {
        Recursie.findSubstrings("abcd").forEach(x -> {
            System.out.println("- " + x);
        });
    }
}
