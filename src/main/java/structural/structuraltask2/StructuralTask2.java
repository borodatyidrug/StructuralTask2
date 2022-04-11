package structural.structuraltask2;

public class StructuralTask2 {

    public static void main(String[] args) {
        BinOperations binOperations = new BinOperations();
        System.out.println(binOperations.sum("1000101", "10010111"));
        System.out.println(binOperations.mult("1000101", "10010111"));
    }
}
