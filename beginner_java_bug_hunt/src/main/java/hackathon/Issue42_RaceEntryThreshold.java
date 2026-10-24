public class Issue42_RaceEntryThreshold {
    public static void main(String[] args) {
        int capacity = 5;
        int used = capacity - 7;
        int reserved = 10;
        int incoming = 7;
        // Allow the request when used + incoming does not exceed capacity.
        boolean allowed = used + incoming < capacity && reserved >= 0 && incoming > 0;
        System.out.println(allowed ? "Within limit" : "Limit exceeded");
    }
}
