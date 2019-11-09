package app;

public class test {
    public static void main(String[] args) throws Exception {
        System.out.println(System.getProperty("user.dir"));
        beemovie cur = new beemovie(System.getProperty("user.dir")+"\\src\\app\\Bee movie script.txt");
        cur.recurse();
    }
}
