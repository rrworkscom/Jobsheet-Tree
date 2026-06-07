package Week14;

public class BinaryTreeArrayMain {

    public static void main(String[] args) {
        BinaryTreeArray20 bta = new BinaryTreeArray20();
        bta.add(new Student20("244107020138", "Devin", "TI-1I", 3.57));
        bta.add(new Student20("244107020023", "Dewi", "TI-1I", 3.85));
        bta.add(new Student20("244107020225", "Wahyu", "TI-1I", 3.21));
        bta.add(new Student20("244107020076", "Angelina", "TI-1I", 3.54));
        bta.add(new Student20("244107020223", "Andhika", "TI-1I", 3.72));
        bta.add(new Student20("244107020226", "Bima", "TI-1I", 3.37));
        bta.add(new Student20("244107020181", "Eiyu", "TI-1I", 3.46));

        System.out.println("Pre-order traversal:");
        bta.traversePreOrder(0);
        System.out.println("In-order traversal:");
        bta.traverseInOrder(0);

    }
}
