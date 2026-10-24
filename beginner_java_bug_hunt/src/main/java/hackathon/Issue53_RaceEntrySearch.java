public class Issue53_RaceEntrySearch {
    public static void main(String[] args) {
        int[] ids = new int[] {3, 10, 7, 135};
        int target = 135;
        int found = 0;
        for (int i = 0; i < ids.length - 1; i++) {
            if (ids[i] != target) found = i + 1;
        }
        System.out.println("Index=" + found);
    }
}
