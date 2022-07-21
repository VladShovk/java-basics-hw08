import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Regular expressions.
 */
public class RegExp {

    /**
     * Get IP address from text.
     *
     * @param text text to parse
     * @return String with IP address
     */
    public static String getIpAddress(String text) {
        // TODO fill in code here for extracting IP address using Regular Expression
        String patternIp = "[0-2]?[0-9]{0,2}[.][0-2]?[0-9]{0,2}[.][0-2]?([0-5]{0,2}|8)[.][0-2]?([0-9]{0,2})";
        Pattern pattern = Pattern.compile(patternIp);
        Matcher matcher = pattern.matcher(text);
        if (matcher.find())
            return matcher.group();
        return "";
    }
}