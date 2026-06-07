package Week14;

public class BinaryTreeArray20 {

    Student20[] data;
    int idxLast;

    public BinaryTreeArray20() {
        data = new Student20[10];
        idxLast = -1;
    }

    void populateData(Student20[] data, int idxLast) {
        this.data = data;
        this.idxLast = idxLast;
    }

    public void add(Student20 student) {
        if (idxLast + 1 >= data.length) {
            System.out.println("Array is full!");
            return;
        }

        idxLast++;
        data[idxLast] = student;
    }

    void traversePreOrder(int idxStart) {
        if (idxStart <= idxLast) {
            if (data[idxStart] != null) {
                data[idxStart].print();
                traversePreOrder(2 * idxStart + 1);
                traversePreOrder(2 * idxStart + 2);
            }
        }
    }

     void traverseInOrder(int idxStart) {
        if (idxStart <= idxLast) {
            if (data[idxStart] != null) {
                traverseInOrder(2 * idxStart + 1);
                data[idxStart].print();
                traverseInOrder(2 * idxStart + 2);
            }
        }
    }
}