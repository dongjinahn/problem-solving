package LeetCode;

import java.util.HashSet;

public class Problem929 {
    private String processEmail(String email) {
        final String[] tokens = email.split("@");
        final String localname = tokens[0];
        final String domain = tokens[1];

        final String[] localnameTokens = localname.split("\\+");
        final String uniqueLocalname = localnameTokens[0].replaceAll("\\.", "");
        return String.format("%s@%s", uniqueLocalname, domain);
    }

    public int numUniqueEmails(String[] emails) {
        final HashSet<String> emailSet = new HashSet<>();
        for (String email : emails) {
            emailSet.add(processEmail(email));
        }
        return emailSet.size();
    }
}
