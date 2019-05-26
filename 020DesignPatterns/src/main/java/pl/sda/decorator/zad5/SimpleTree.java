package pl.sda.decorator.zad5;

public class SimpleTree {
    private int size;

    public SimpleTree(int size) {
        this.size = size;
    }

    /**
     * Wydrukowanie linii choinki
     * @param branchSize - rozmiar choinki w linii
     * @return - linia choinki
     */
    public String printBranch(int branchSize){
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < size-branchSize; i++) {
            stringBuilder.append(" ");
        }
        for (int i = 0; i < branchSize*2; i++) {
            stringBuilder.append("*");
        }
        return stringBuilder.toString();
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < size; i++) {
            builder.append(printBranch(i)).append("\n");
        }
        return builder.toString();
    }
}
