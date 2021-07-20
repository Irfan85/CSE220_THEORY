package Assignment02;

public class CircularArray {

    private int start;
    private int size;
    private Object[] cir;

    /*
     * if Object [] lin = {10, 20, 30, 40, null} then, CircularArray(lin, 2, 4) will
     * generate Object [] cir = {40, null, 10, 20, 30}
     */
    public CircularArray(Object[] lin, int st, int sz) {
        this.start = st;
        this.size = sz;
        this.cir = new Object[lin.length];

        for (int i = 0, j = start; i < size; i++) {
            cir[j % cir.length] = lin[i];
            j++;
        }
    }

    // Prints from index --> 0 to cir.length-1
    public void printFullLinear() {
        for (int i = 0; i < cir.length; i++) {
            if (i == 0)
                System.out.print(cir[i]);
            else
                System.out.print(", " + cir[i]);
        }

        System.out.println(".");
    }

    // Starts Printing from index start. Prints a total of size elements
    public void printForward() {
        for (int i = 0, j = start; i < size; i++) {
            if (j == start)
                System.out.print(cir[j % cir.length]);
            else
                System.out.print(", " + cir[j % cir.length]);

            j++;
        }

        System.out.println(".");
    }

    public void printBackward() {
        for (int i = 0, j = start + size - 1; i < size; i++) {
            if (j == start + size - 1)
                System.out.print(cir[j % cir.length]);
            else
                System.out.print(", " + cir[j % cir.length]);

            j--;
            if (j == -1)
                j = cir.length - 1;
        }

        System.out.println(".");
    }

    // With no null cells
    public void linearize() {
        Object[] lin = new Object[size];

        for (int i = 0, j = start; i < size; i++) {
            lin[i] = cir[j % cir.length];
            j++;
        }

        cir = lin;
    }

//    // Do not change the Start index
//    public void resizeStartUnchanged(int newcapacity) {
//        Object[] newCir = new Object[newcapacity];
//
//        for (int i = 0, j = start; i < size; i++) {
//            newCir[j % newCir.length] = cir[j % cir.length];
//            j++;
//        }
//
//        cir = newCir;
//    }

    public void resizeStartUnchanged(int newcapacity, Object fill) {
        Object[] newCir = new Object[newcapacity];

        for (int i = 0, j = start; i < newCir.length; i++) {
            if(i < size)
                newCir[j % newCir.length] = cir[j % cir.length];
            else
                newCir[j % newCir.length] = fill;
            j++;
        }

        cir = newCir;
    }

    public void insertByRightShift(Object elem, int pos) {
        if (pos >= 0 && pos <= size) {
            if (size == cir.length)
                resizeStartUnchanged(cir.length + 3, null);

            int nShifts = size - pos;
            int from = (start + size - 1) % cir.length;
            int to = (from + 1) % cir.length;

            for (int i = 0; i < nShifts; i++) {
                cir[to] = cir[from];
                to = from;

                from--;
                if (from == -1)
                    from = cir.length - 1;
            }

            int offset = (start + pos) % cir.length;
            cir[offset] = elem;

            size++;
        }
    }

    public void removeByLeftShift(int pos) {
        if (pos >= 0 && pos < size) {
            int nShifts = size - pos - 1;
            int from = (start + pos + 1) % cir.length;
            int to = (start + pos) % cir.length;

            for (int i = 0; i < nShifts; i++) {
                cir[to] = cir[from];

                to = from;
                from = (from + 1) % cir.length;
            }

            cir[to] = null;

            size--;
        }
    }

}