package Lab108.ex4;

public abstract class Video {

    private String title;
    private int duracion;
    private String categoria;
    private int year;

    public Video(String title, int duracion, String categoria, int year) {
        setTitle(title);
        setDuracion(duracion);
        setCategoria(categoria);
        setYear(year);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
