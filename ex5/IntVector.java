package Lab108.ex5;

public class IntVector implements IntList{

    private int[] listavecs;
    private int idx;
    public static final int DEFAULT_SIZE2 = 20;
    private double ampliar = 2;

    public IntVector() {
        this.listavecs = new int[DEFAULT_SIZE2];
        this.idx = 0;
    }

    @Override
    public void AddIntTo(int value) {

        if (idx == this.listavecs.length-1) {
            this.ampliarArray();
        }
        this.listavecs[idx++] = value;
    }
        /*if (listaints.size() < defaultSize) {
            listaints.add(value);
        } else {
            ampliarArray(listaints, listaints.size(), value);
        }
        this.listaints.add(value);
    }*/

    public void ampliarArray (){
        double amp = this.listavecs.length*ampliar;
        int[] newListavecs = new int[(int)amp];
        for (int idx = 0; idx < this.listavecs.length-1; idx++){
            newListavecs[idx] = this.listavecs[idx];
        }
        this.listavecs = newListavecs;


    /*defaultSize = size*ampliar;
        List listaintsmod = new ArrayList<>((int)defaultSize);
        for (int i = 0; i < listaintsmod.size(); i++){
            listaintsmod.set(i,listaints);
        }
        listaintsmod.add(value);
        listaints.clear();
        listaints.addAll(listaintsmod);*/

    }


    @Override
    public int getIntTo(int a) {
        return this.listavecs[a];
    }
}
