package pl.sda.decorator.zad5;

import java.util.Random;

public class DecoratedTree {
    private SimpleTree tree;

    public DecoratedTree(SimpleTree tree) {
        this.tree = tree;
    }

    public String printBranch(int i){
        char[] branch = tree.printBranch(i).toCharArray();
        Random r = new Random();


        for (int j = 0; j < branch.length; j++) {
            if(branch[j] == '*'){
                if(r.nextInt(10) >7){
                    branch[j] = 'O';
                }
            }
        }
        return new String(branch);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < tree.getSize(); i++) {
            builder.append(printBranch(i)).append("\n");
        }
        return builder.toString();
    }
}
