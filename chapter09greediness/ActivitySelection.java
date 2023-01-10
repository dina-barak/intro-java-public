package chapter09greediness;

class ActivitySelection {
    // Prints a maximum set of activities that can be done
    // by a single person, one at a time.
    // The following implementation assumes that the activities
    // are already sorted according to their finish time
    public static void printMaxActivities(int s[], int f[])
    {
        System.out.println("Following activities are selected");

        // The first activity always gets selected
        int i = 0;
        System.out.print(i + " ");

        // Consider rest of the activities
        for (int j = 1; j < s.length; j++) {
            // If this activity has start time greater than
            // or equal to the finish time of previously
            // selected activity, then select it
            if (s[j] >= f[i]) {
                System.out.print(j + " ");
                i = j;
            }
        }
    }

    public static void main(String[] args)
    {
        int s[] = { 1, 3, 0, 5, 8, 5 };
        int f[] = { 2, 4, 6, 7, 9, 9 };
        printMaxActivities(s, f);
    }
}
