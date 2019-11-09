package app;

public class test {
    public static void main(String[] args) throws Exception {
        beemovie cur = new beemovie(System.getProperty("user.dir")+"\\src\\app\\Bee_movie_script.txt");
        cur.recurse();
    }
}
