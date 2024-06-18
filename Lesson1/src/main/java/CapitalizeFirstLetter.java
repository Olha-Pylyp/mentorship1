public class CapitalizeFirstLetter {
    public static void main(String[] args) {
        String input = "capitalize the first letter of each word";
        String[] arr = input.split(" ");
        for (String element : arr) {         // (int i =0; i<arr.length; i++)
            char first = element.charAt(0); // char first = arr[i].charAt(0);
            String firstUpper = String.valueOf(first).toUpperCase();
            String rest = element.substring(1); //  String rest = arr[i].substring(1);
            System.out.print(firstUpper + rest + " ");
        }
    }
}
