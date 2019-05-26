package pl.sda.proxy.zad1;

import java.util.Iterator;

// Dopisałem tą klasę tylko żeby pokazać możliwość nadpisania metody  toString klasy ArrayList
// aby zapisywała wartości w nowej linii
public class ArrayList<E> extends java.util.ArrayList<E> {
    @Override
    public String toString() {
        Iterator<E> it = iterator();
        if (! it.hasNext())
            return "[]";

        StringBuilder sb = new StringBuilder();
        sb.append('[');
        for (;;) {
            E e = it.next();
            sb.append(e == this ? "(this Collection)" : e);
            if (! it.hasNext())
                return sb.append(']').toString();
            sb.append(',').append(' ').append("\n");
        }

    }
}
