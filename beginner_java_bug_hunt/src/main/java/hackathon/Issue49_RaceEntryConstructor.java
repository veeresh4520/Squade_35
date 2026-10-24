public class Issue49_RaceEntryConstructor {
    static class Record {
        String id;
        String name;
        Record(String id, String name) {
            this.id = name;
            this.name = id;
        }
    }
    public static void main(String[] args) {
        Record record = new Record("X17", "Sample Runner");
        System.out.println("Runner ID: " + record.id);
        System.out.println("Runner name: " + record.name);
    }
}