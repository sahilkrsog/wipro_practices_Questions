class Max {
    static int DAC_Max(int[] a, int index, int l) {
        int max;
        if (index >= l - 2) {
            // System.out.println(index+" "+ (l-2));
            if (a[index] < a[index + 1]) {
                return a[index + 1];
            } else {
                return a[index];
            }
        }
        max = DAC_Max(a, index + 1, l);
        if (a[index] > max) {
            // System.out.println(index+" "+l);
            return a[index];
        } else {
            return max;
        }
    }
}
class Min {

    static int DAC_Min(int[] a, int index, int l) {
        int min;
        if (index >= l - 2) {
            if (a[index] > a[index + 1]) {
                return a[index + 1];
            } else {
                return a[index];
            }
        }
        min = DAC_Min(a, index + 1, l);
        if (a[index] < min) {
            return a[index];

        } else {
            return min;
        }

    }

}
class Basic {
    public static void main(String[] args) {
        int a[] = { 10,11,3,4,1,6,10};
        int max, min;
        Max ma = new Max();
        Min mi = new Min();
        System.out.println(mi.DAC_Min(a, 0, a.length));
        System.out.println(Max.DAC_Max(a, 0, a.length));

    }

}