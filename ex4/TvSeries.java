package Lab108.ex4;

import java.util.Scanner;

public class TvSeries extends Video{

    private boolean saga;
    private String nextEpisode;
    private int episode;

    private int maxEpisode;
    private String summary;

    public TvSeries(String title, int duracion, String categoria, int year, boolean saga, String nextEpisode, int episode) {
        super(title, duracion, categoria, year);
        setSaga(saga);
        setNextEpisode(nextEpisode);
        setEpisode(episode);
    }

    public int getEpisode() {
        return episode;
    }

    public void setEpisode(int episode) {
        this.episode = episode;
    }

    public boolean isSaga() {
        return saga;
    }

    public void setSaga(boolean saga) {
        this.saga = saga;
    }

    public String getNextEpisode() {
        return nextEpisode;
    }

    public void setNextEpisode(String nextEpisode) {
        if (isSaga()) {
            this.nextEpisode = nextEpisode;
        } else {
            this.nextEpisode = null;
        }
    }




    @Override
    void addSummary() {
        Scanner scan = new Scanner(System.in);
        summary = scan.toString();
    }
}
