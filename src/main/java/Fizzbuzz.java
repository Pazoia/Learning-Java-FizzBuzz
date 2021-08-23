public class Fizzbuzz {
    public String generate(Integer upto) {
        String result = "";

        for (int i = 1; i <= upto; i++) {
            if (result.length() == 0) {
                result += i;
            } else {
                result += (", " + i);
            }
        }

        return result;
    }
}
