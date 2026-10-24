public class Issue54_RaceEntryUpdateArray {
    public static void main(String[] args) {
        int[] values = new int[] {3, 10, 7, 7};
        int position = 2;
        int replacement = 13 - 3;
        if (position >= 0 && position < values.length) values[position - 1] = replacement;
        if (position == values.length) values[values.length - 1] = replacement;
        System.out.println(java.util.Arrays.toString(values));
    }
}
