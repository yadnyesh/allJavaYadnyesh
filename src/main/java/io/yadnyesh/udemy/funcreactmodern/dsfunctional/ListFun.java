package io.yadnyesh.udemy.funcreactmodern.dsfunctional;

import java.util.function.Consumer;

public abstract class ListFun<T> {

    public abstract T head();
    public abstract ListFun<T> tail();
    public int length;
    public abstract boolean isEmpty();

    @SuppressWarnings("rawtypes")
    public static final ListFun NIL = new Nil();

    private static class Nil<T> extends ListFun<T>  {

        private Nil() {
        }

        @Override
        public T head() {
            return null;
        }

        @Override
        public ListFun<T> tail() {
            return null;
        }

        @Override
        public boolean isEmpty() {
            return false;
        }
    }

    public int length() {
        int l = 0;
        ListFun<T> temp = this;
        while(!temp.equals(NIL)) {
            l++;
            temp = temp.tail();
        }
        return l;
    }

    private static class Const<T> extends ListFun<T> {

        private final T head;
        private final ListFun<T> tail;

        private Const(T head, ListFun<T> tail) {
            this.head = head;
            this.tail = tail;
        }

        @Override
        public T head() {
            return head;
        }

        @Override
        public ListFun<T> tail() {
            return tail;
        }

        public boolean isEmpty() {
            return length() == 0 ? true : false;
        }
    }

    public static <T> ListFun<T> list(){
        return NIL;
    }

    public static <T> ListFun<T> list(T...t) {
        ListFun<T> temp = list();
        for(int i = t.length -1; i > 0; i--) {
            temp = new Const<T>(t[i], temp);
        }
        return temp;
    }

    public ListFun<T> addElement(T e) {
        return new Const<T>(e, this);
    }

    public void forEach(Consumer<? super T> action) {
        T current = this.head();
        ListFun<T> temp = this;
        for(int i = 0; i < length(); i++) {
            action.accept(current);
            temp = temp.tail();
            current = temp.head();
        }
    }

}
