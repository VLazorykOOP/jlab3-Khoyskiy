package Pair;

    public abstract class Pair {
        protected int x;
        protected int y;
        Pair(int xp, int yp) {
            x = xp;
            y = yp;
        }
        Pair(){}
        public abstract Pair add(Pair p);
        public abstract Pair subtract(Pair p);
        public abstract Pair multiply(int n);
        public abstract Pair divide(int n);
    }
