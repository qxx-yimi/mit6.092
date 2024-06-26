package assn3;

class Marathon {
    public static void main (String[] arguments) {
        String[] names = {
            "Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex",
            "Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda",
            "Aaron", "Kate"
        };

        int[] times = {
            341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299,
            343, 317, 265
        };

        // best
        int index;
        index = fastestRunner(times);
        System.out.println("fastest runner is " + names[index] + " time is " + times[index]);

        // second best
        index = secondFastestRunner(times);
        System.out.println("second fastest runner is " + names[index] + " time is " + times[index]);
    }

    public static int fastestRunner(int[] times) {
        int pos = -1, minValue = 1000;
        for (int i = 0; i < times.length; i++) {
            if (minValue > times[i]) {
                pos = i;
                minValue = times[i];
            }
        }
        return pos;
    }

    public static int secondFastestRunner(int[] times) {
        int pos = fastestRunner(times);
        int minValue = 1000, index = -1;
        for (int i = 0; i < times.length; i++) {
            if (i == pos)
                continue;
            if (minValue > times[i]) {
                index = i;
                minValue = times[i];
            }
        }
        return index;
    }
} 