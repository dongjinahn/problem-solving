public class test {
    public static void main(String[] args) {
        System.out.println((long) stringToNumber("ABCD", 4));
        System.out.println((long) stringToNumber("ABC", 4));
        System.out.println((long) stringToNumber("ABD", 4));
        System.out.println((long) stringToNumber("BCDE", 4));
        System.out.println((long) stringToNumber("CDE", 4));
        System.out.println((long) stringToNumber("CDF", 4));

    }
    static double stringToNumber(String s, int maxLength) {
        double result = 0;
        for (char ch : s.toCharArray()) {
//            System.out.println("maxLength " + (maxLength - 1));
            result += (int) ch * Math.pow(256, maxLength - 1);
            maxLength -= 1;
        }
        return result;
    }
}
