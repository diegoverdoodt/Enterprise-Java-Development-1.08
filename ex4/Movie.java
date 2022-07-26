package Lab108.ex4;

public class Movie {

    String name;
    int length;
    String director;
    String protagonista;

    public Movie(String name, int length, String director, String protagonista) {
        setName(name);
        setLength(length);
        setDirector(director);
        setProtagonista(protagonista);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getProtagonista() {
        return protagonista;
    }

    public void setProtagonista(String protagonista) {
        this.protagonista = protagonista;
    }
}
