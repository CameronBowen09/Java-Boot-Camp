/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BookFive.ChapterTwo;

/**
 *
 * @author User
 */
import java.util.regex.*;
import java.util.Scanner;

public final class Reg {

    static String r, s;
    static Pattern pattern;
    static Matcher matcher;
    static boolean match, validRegex, doneMatching;
    private static Scanner sc
            = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to the "
                + "Regex Tester\n");
        do {
            do {
                System.out.print("\nEnter regex: ");
                r = sc.nextLine();
                validRegex = true;
                try {
                    pattern = Pattern.compile(r);
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                    validRegex = false;
                }
            } while (!validRegex);
            doneMatching = false;
            while (!doneMatching) {
                System.out.print("Enter string: ");
                s = sc.nextLine();
                if (s.length() == 0) {
                    doneMatching = true;
                } else {
                    matcher = pattern.matcher(s);
                    if (matcher.matches()) {
                        System.out.println("Match.");
                    } else {
                        System.out.println(
                                "Does not match.");
                    }
                }
            }
        } while (askAgain());
    }

    private static boolean askAgain() {
        System.out.print("Another? (Y or N) ");
        String reply = sc.nextLine();
        if (reply.equalsIgnoreCase("Y")) {
            return true;
        }
        return false;
    }
}

/*Here’s a sample run of this program. For now, don’t worry about the details of
the regular expression string. Just note that it should match any three-letter word
that begins with f; ends with r; and has a, i, or o in the middle.*/

/*Enter regex: abc
Enter string: abc
Match.
Enter string: abcd
Does not match.
*/

/*
. Any character
\d Any digit (0–9)
\D Any nondigit (anything other than 0–9)
\s Any white-space character (space, tab, new line, return, or backspace)
\S Any character other than a white-space character
\w Any word character (a–z, A–Z, 0–9, or an underscore)
\W Any character other than a word character
*/

/*
Enter regex: c.t
Enter string: cat
Match.
Enter string: cot
Match.
Enter string: cart
Does not match.
*/
/*
Enter regex: \d\d\d-\d\d-\d\d\d\d
Enter string: 779-54-3994
Match.
Enter string: 550-403-004
Does not match.
*/
/*
Enter regex: \D\d-\D\d
Enter string: R2-D2
Match.
Enter string: C2-D0
Match.
Enter string: C-3PO
Does not match.
*/
/*
Enter regex: ...\s...
Enter string: abc def
Match.
Enter string: abc def
Match.
*/
/*
Enter regex: ... ...
Enter string: abc def
Match.
Enter string: abc def
Does not match.
*/
/*
Enter regex: \w\w\w\W\w\w\w
Enter string: abc def
Match.
Enter string: 123 456
Match.
Enter string: 123_456
Does not match.
*/
/*
Using custom character classes
Enter regex: b[aeiou]t
Enter string: bat
Match.
Enter string: bet
Match.
Enter string: bit
Match.
Enter string: bot
Match.
Enter string: but
Match.
Enter string: bmt
Does not match.
Enter regex: b[aAeEiIoOuU]t
Enter string: bat
Match.
Enter string: BAT
Does not match.
Enter string: bAt
Match.
Enter regex: [bB][aAeEiIoOuU][tT]
Enter string: bat
Match.
Enter string: BAT
Match.
*/

/*
Using ranges
Enter regex: [a-z][0-5]
Enter string: r2
Match.
Enter string: b9
Does not match.
Enter regex: [a-zA-Z][0-5]
Enter string: r2
Match.
Enter string: R2
Match.
Enter regex: [a-zA-Z0-9]
Enter string: a
Match.
Enter string: N
Match.
Enter string: 9
Match.
*/

/*
Using negation
Regular expressions can include classes that match any character but the ones
listed for the class. To do that, you start the class with a caret, like this:
Enter regex: [^cf]at
Enter string: bat
Match.
Enter string: cat
Does not match.
Enter string: fat
Does not match.
*/

/*
Matching multiple characters
Enter regex: \d{3}-\d{2}-\d{4}
Enter string: 779-48-9955
Match.
Enter string: 483-488-9944
Does not match.
Enter regex: \d{3}-?\d{2}-?\d{4}
Enter string: 779-48-9955
Match.
Enter string: 779489955
Match.
Enter string: 779-489955
Match.
Enter string: 77948995
Does not match.
*/

/*
Using escapes
Here \( represents a left parenthesis, and \) represents a right parenthesis.
Enter regex: \(\d{3}\) \d{3}-\d{4}
Enter string: (559) 555-1234
Match.
Enter string: 559 555-1234
Does not match.
*/

/*
Using parentheses to group characters
Enter regex: (bla)+
Enter string: bla
Match.
Enter string: blabla
Match.
Enter string: blablabla
Match.
Enter string: bla bla bla
Does not match.
Enter regex: (\(\d{3}\)\s?)?\d{3}-\d{4}
Enter string: 555-1234
Match.
Enter string: (559) 555-1234
Match.
Enter string: (559)555-1239
Match.
Enter regex: \w(\d)-\w\1
Enter string: r2-d2
Match.
Enter string: d3-r4
Does not match.
Enter string: b9-k9
Match.
*/

/*
Using the pipe symbol (or operator)
Enter regex: (\w\d-\w\d)|(\w-\d\w\w)
Enter string: r2-d2
Match.
Enter string: c-3po
Match.
Enter regex: ((\d{3} )|(\(\d{3}\) ))?\d{3}-\d{4}
Enter string: (559) 555-1234
Match.
Enter string: 559 555-1234
Match.
Enter string: 555-1234
Match.
*/

/*
Understanding the String problem
String regex = "\w\d-\w\d"; // error: won't compile
String regex = "\\w\\d-\\w\\d"; // now it will compile
private static boolean validDroidName(String droid)
{
String regex = "(\\w\\d-\\w\\d)|(\\w-\\d\\w\\w)";
return droid.matches(regex);
}
String s = "One:Two;Three|Four\tFive";
String regex = "[:;|\\t]";
String strings[] = s.split(regex);
for (String word : strings)
System.out.println(word);
*/
