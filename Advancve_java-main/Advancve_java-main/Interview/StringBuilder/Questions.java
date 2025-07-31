✅ 1. Coding Question Examples:
🔸 Q1. Remove all vowels from a string java
 
String input = "Hello World";
StringBuilder result = new StringBuilder();
for (char ch : input.toCharArray()) {
    if ("aeiouAEIOU".indexOf(ch) == -1) {
        result.append(ch);
    }
}
System.out.println(result.toString()); // Output: Hll Wrld


🔸 Q2. Reverse a string using StringBuilder java
String input = "Keerthan";
StringBuilder sb = new StringBuilder(input);
System.out.println(sb.reverse()); // Output: nahtreeK


🔸 Q3. Check if a string is a palindrome using StringBuilder java

String str = "madam";
StringBuilder sb = new StringBuilder(str);
if (str.equals(sb.reverse().toString())) {
    System.out.println("Palindrome");
} else {
    System.out.println("Not a Palindrome");
}

