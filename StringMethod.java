public class StringMethod {
    public static void main(String[] args) {
        String a = "Suvigya";
        int value = a.length();
        System.out.println(a);
        System.out.println(value);

        String ustring = a.toUpperCase();
        System.out.println(ustring);
    
        String lstring = a.toLowerCase();
        System.out.println(lstring);

        String nonTrimmedString = "        Suvigya        ";
        System.out.println(nonTrimmedString);
        System.out.println(nonTrimmedString.trim());

        System.out.println(a.substring(4)); 
        System.out.println(a.substring(0,4));

        // System.out.println(a.replace('u', 'a'));
        System.out.println(a.replace("vigya", "man"));

        System.out.println(a.charAt(2));

        System.out.println(a.equals("Suvigya"));

    }
}

