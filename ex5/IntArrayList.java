package Lab108.ex5;

public class IntArrayList implements IntList{

    private int[] listaints;
    private int idx;
    public static final int DEFAULT_SIZE = 10;
    private double ampliar = 1.5;

    public IntArrayList() {
        this.listaints = new int[DEFAULT_SIZE];
        this.idx = 0;
    }

    @Override
    public void AddIntTo(int value) {

        if (idx == this.listaints.length-1) {
            this.ampliarArray();
        }
        this.listaints[idx++] = value;
    }

    public void ampliarArray () {
        double amp = this.listaints.length * ampliar;
        int[] newListaints = new int[(int) amp];
        for (int idx = 0; idx < this.listaints.length - 1; idx++) {
            newListaints[idx] = this.listaints[idx];
        }
        this.listaints = newListaints;
    }

    @Override
    public int getIntTo(int a) {
        return this.listaints[a];
    }




}
