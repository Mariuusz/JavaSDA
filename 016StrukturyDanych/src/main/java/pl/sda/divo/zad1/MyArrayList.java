package pl.sda.divo.zad1;

class MyArrayList {
    private static final int CAPACITY = 10000;
    private Integer[] numbers = new Integer[CAPACITY];
    private int index = 0;

    public Integer get(Integer i) {
        return numbers[i];
    }

    public void add(Integer number) {
        if (index >= numbers.length) {
            copy(2 * numbers.length);
        }
        numbers[index++] = number;
    }

    public void remove(Integer x) {
        for (int i = 0; i < size() - 1; i++) {
            if (x.equals(get(i))) {
                numbers[i] = null;
            }
        }

        copy(size());
    }

    public void remove(MyArrayList otherList) {
        for (int i = 0; i < otherList.size() - 1; i++) {
            Integer actualElement = otherList.get(i);
            remove(actualElement);
        }

        copy(size());
    }

    public boolean contains(Integer x) {
        for (int i = 0; i < size() - 1; i++) {
            Integer actualElement = get(i);
            if (actualElement.equals(x)) {
                return true;
            }
        }
        return false;
    }

    public boolean contains(MyArrayList otherList) {
        boolean isExist = false;
        for (int i = 0; i < otherList.size(); i++) {
            if (contains(otherList.get(i))) {
                isExist = true;
            }
        }

        return isExist;
    }
    private void removeRecur(Integer x, int i) {
        if (i < 0) {
            return;
        }
        if (x.equals(get(i))) {
            numbers[i] = null;
        }
        removeRecur(x, i - 1);
    }

    public void removeRecurWithCopy(Integer x) {
        removeRecur(x, index);
        copy(size());
    }

    private void copy(int newSize) {
        Integer[] temp = new Integer[newSize];
        int tabSize = size();
        int tempIndex = 0;

        for (int i = 0; i < tabSize - 1; i++) {
            if (get(i) != null) {
                temp[tempIndex++] = get(i);
            }
        }
        index = tempIndex;
        numbers = temp;
    }

    public int size() {
        return index + 1;
    }
}