public class Issue55_RaceEntryStringSearch {
    public static void main(String[] args) {
        String storedId = new String("ID-7");
        String requestedId = new String("ID-7");
        if (storedId == requestedId) System.out.println("Runner ID found");
        else System.out.println("Runner ID not found");
    }
}