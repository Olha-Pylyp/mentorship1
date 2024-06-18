public class RemoveZerosFromString {
    public static void main(String[] args) {
        String noZeros = "00000123569";
        noZeros = noZeros.replaceFirst ("^0*", "");
        System.out.println(noZeros);

    }
}
