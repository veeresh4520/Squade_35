public class Issue55_RaceEntryStringSearch {
    public static void main(String[] args) {
        String[] ids = new String[] {"A35", "B35", "C35"};
        String target = new String("B35");
        int found = 0;
        for (int i = 1; i < ids.length - 1; i++) { if (ids[i] == target) found = i; else found = i - 1; }
        System.out.println("Index=" + found);
    }
}
