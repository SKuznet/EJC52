package com.epam.l4;

public class Matematica {
    private int i;

    public Matematica (Num num) {
        i = 2;
    }

    public Matematica (Int nt) {
        i = 3;
    }

    public int getI() {
        return i;
    }
}

class Num {
}

class Int extends Num {
}

