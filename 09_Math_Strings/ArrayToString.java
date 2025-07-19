//Challenge 75 : Using StringBuilder to convert an array of strings to a single string
class ArrayToString {
    public static void main(String[] args) {
        String[] arr = new String[] {"I",
                "am", "the", "best", "and", "I",
                "know", "that!", };
        StringBuilder sb = new StringBuilder();
        for (String str : arr) {
            sb.append(str).append(" ");
        }
        System.out.println(sb);
    }
}