package regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static junit.framework.TestCase.assertTrue;

public class RegexTestStrings {
    public static final String EXAMPLE_TEST = "This is my small example "
            + "string which I'm going to " + "use for pattern matching.";

    public static void main(String[] args) {
//        System.out.println(EXAMPLE_TEST.matches("\\w.*"));
//        String[] splitString = (EXAMPLE_TEST.split("\\s+"));
//        System.out.println(splitString.length);// should be 14
//        for (String string : splitString) {
//            System.out.println(string);
//        }
//        // replace all whitespace with tabs
//        System.out.println(EXAMPLE_TEST.replaceAll("\\s+", "\t"));
//
//        Pattern pattern = Pattern.compile("\\w+");
//        // in case you would like to ignore case sensitivity,
//        // you could use this statement:
//        // Pattern pattern = Pattern.compile("\\s+", Pattern.CASE_INSENSITIVE);
//        Matcher matcher = pattern.matcher(EXAMPLE_TEST);
//        // check all occurance
//        while (matcher.find()) {
//            System.out.print("Start index: " + matcher.start());
//            System.out.print(" End index: " + matcher.end() + " ");
//            System.out.println(matcher.group());
//        }
//        // now create a new pattern and matcher to replace whitespace with tabs
//        Pattern replace = Pattern.compile("\\s+");
//        Matcher matcher2 = replace.matcher(EXAMPLE_TEST);
//        System.out.println(matcher2.replaceAll("\t"));

        String string_1 = "trt joe dfg";
        String string_2 = "nfndf jim ";
        String string_3 = "dfgjomfgh";
        String string_4 = "dfg jom fgh";

//        System.out.println(Pattern.matches(".*\\s*[joe|jim]\\s*.*", string_1));
//        System.out.println(Pattern.matches(".*\\s*[joe|jim]\\s*.*", string_2));
//        System.out.println(Pattern.matches(".*\\s*[joe|jim]\\s*.*", string_3));
//        System.out.println(Pattern.matches(".*\\s*[joe|jim]\\s*.*", string_4));

        Pattern pattern = Pattern.compile("[a-z&&[^bc]]");
        Matcher matcher = pattern.matcher("sbc");
        System.out.println(matcher.find());

    }
}