public class Issue43_RaceEntryMenuChoice {
    public static void main(String[] args) {
        int choice = 2;
        switch (choice) {
            case 1: System.out.println("Menu action: Record"); break;
            case 2: System.out.println("Menu action: Record"); break;
            default: System.out.println("Invalid option");
        }
    }
}