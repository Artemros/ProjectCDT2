import java.util.Random;

public class Generator {
    String generate(int length) {
        Integer count_ab = length / 2 - 1;
        Random random = new Random();
        String generatedLine = "";
        while (true) {
            String s = "";
            if (length == 1) {
                s += "b";
            } else {
                s += "a";
                if (count_ab > 0) {
                    Integer rand_ab = random.nextInt(count_ab) + 1;
                    if(count_ab - rand_ab > rand_ab){
                        rand_ab=count_ab - rand_ab;
                    }
                    for (int i = 0; i < rand_ab; i++) {
                        s += "ab";
                    }
                    s += "ac";
                    for (int i = 0; i < count_ab - rand_ab; i++) {
                        s += "cb";
                    }
                } else {
                    s += "ac";
                }

            }
            generatedLine = s;
            break;
        }
        return generatedLine;
    }

}