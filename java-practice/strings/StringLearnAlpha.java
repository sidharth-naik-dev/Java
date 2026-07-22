package strings;

import static java.lang.Long.toHexString;

public class StringLearnAlpha {
    static void main() {
        System.out.println("StringLearnAlpha\n");

        StringLearnAlpha str = new StringLearnAlpha();
        System.out.println(toHexString(str.hashCode()));
    }
}
