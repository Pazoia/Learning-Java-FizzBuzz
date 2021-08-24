public class Fizzbuzz {
    public String convert(Integer num) {
        if (num % 3 == 0) {
            return "Fizz";
        } else if (num % 5 == 0) {
            return "Buzz";
        }
        return num.toString();
    }

    public String generate(Integer upto) {
        String result = "";

        for (int i = 1; i <= upto; i++) {
            if (result.length() == 0) {
                result += convert(i);
            } else {
                result += (", " + convert(i));
            }
        }
        return result;
    }
}
