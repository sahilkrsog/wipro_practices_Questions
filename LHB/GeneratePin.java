class Solution {
    String s;
    String s1;

    Solution(String s, String s1) {
        this.s = s;
        this.s1 = s1;

    }

    String addSting() {
        String strMax = s.length() > s1.length() ? s : s1;
        String strMin = s.length() < s1.length() ? s : s1;
        int i = strMax.length() - 1;
        int j = strMin.length() - 1;
        int add = 0;
        String total = "";
        int Q = 0;
        while (i >=0) {
            if (j > 1) {
                add = Integer.parseInt(strMin.substring(j, j - 1));
                j--;

            }
            add = add + Integer.parseInt(strMax.substring(i, i - 1)) + Q;
            i--;
            Q = getTens(add);
            total += Integer.toString(add);

        }
        return total;

    }

    int getRem(int i) {
        return i % 10;

    }

    int getTens(int i) {
        return i / 10;

    }
}

class GeneratePin{
    public static void main(String[] args) {

    Solution sol = new Solution("1010101010","101101010100101");
    sol.addSting();



}
}
