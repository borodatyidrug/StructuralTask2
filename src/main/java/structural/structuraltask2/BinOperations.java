package structural.structuraltask2;

public class BinOperations {
    public String sum(String a, String b) {
        return Integer.toBinaryString(Integer.parseInt(a, 2) + Integer.parseInt(b, 2));
    }
    public String mult(String a, String b) {
        return Integer.toBinaryString(Integer.parseInt(a, 2) * Integer.parseInt(b, 2));
    }
}
