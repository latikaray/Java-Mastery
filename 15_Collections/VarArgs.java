//Challenge 89 : Program to demonstrate the use of VarArgs in Java
class VarArgs {

    public static void main(String[] args) {
        System.out.println(concatenate("Latika"));

        System.out.println(concatenate("Latika", "Ray"));

        System.out.println(concatenate("Ongoing", "Java", "Challenge"));
    }
    public static String concatenate(String... strs) {
        StringBuilder sb = new StringBuilder();
        for (String str : strs) {
            sb.append(str).append(" ");
        }
        return sb.toString();
    }
}
