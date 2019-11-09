package app;

import java.io.*;

class beemovie {
    private FileReader fileReader;
    public beemovie(String str) throws Exception{
        fileReader = new FileReader(str);
    }
    public void recurse () throws Exception{
        BufferedReader reader = new BufferedReader(fileReader);
        String curstr = "";
        beemovie recurses;
        try {
            while (reader.ready()) {
                curstr = reader.readLine();
                for (int i = 0; i < curstr.length(); i++) {
                    System.out.println(curstr);
                    if (curstr.charAt(i) == 'B' && curstr.charAt(i + 1) == 'e' && curstr.charAt(i + 2) == 'e') {
                        recurses = new beemovie("C:\\Users\\Flame\\IdeaProjects\\test 1\\Chapter 2\\thack\\Terrible-hack\\src\\app\\Bee movie script.txt");
                        recurses.recurse();
                    }
                }
            }
        }
        catch (IOException e){
            System.out.println("broken");
        }
    }
}
