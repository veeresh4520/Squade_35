public class Issue51_RaceEntryObjectCreation {
    static class Summary {
        String name = "";
        int activeCount = 0;
        Summary() {}
        Summary(String name, int activeCount) { this.name = name; this.activeCount = activeCount; }
    }
    public static void main(String[] args) {
        Summary summary = new Summary();
        System.out.println("Runner name: " + summary.name);
        System.out.println("Active Runners: " + summary.activeCount);
    }
}