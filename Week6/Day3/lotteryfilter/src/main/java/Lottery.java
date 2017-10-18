import joptsimple.*;

public class Lottery {

    public static void main(String[] args) {
        LotteryFilter lottery = new LotteryFilter();
        OptionParser parser = new OptionParser();
        parser.accepts("y").withRequiredArg();
        parser.accepts("f").withRequiredArg();
        parser.accepts("o").withRequiredArg();
        OptionSet options = parser.parse(args);

        if (options.has("y") && !options.has("f") && !options.has("o")) {
            lottery.readFile();
            lottery.writeFile(Integer.parseInt(options.valueOf("y").toString()));
        } else if (options.has("f") && !options.has("y") && !options.has("o")) {
            lottery.readFile(options.valueOf("f").toString());
            lottery.writeFile();
        } else if (options.has("o") && !options.has("y") && !options.has("f")) {
            lottery.readFile();
            lottery.writeFile(options.valueOf("o").toString());
        } else if (options.has("y") && options.has("f") && !options.has("o")) {
            lottery.readFile(options.valueOf("f").toString());
            lottery.writeFile(Integer.parseInt(options.valueOf("y").toString()));
        } else if (options.has("y") && !options.has("f") && options.has("o")) {
            lottery.readFile();
            lottery.writeFile(options.valueOf("o").toString(), Integer.parseInt(options.valueOf("y").toString()));
        } else if (!options.has("y") && options.has("f") && options.has("o")) {
            lottery.readFile(options.valueOf("f").toString());
            lottery.writeFile(options.valueOf("o").toString());
        } else if (options.has("y") && options.has("f") && options.has("o")) {
            lottery.readFile(options.valueOf("f").toString());
            lottery.writeFile(options.valueOf("o").toString(), Integer.parseInt(options.valueOf("y").toString()));
        }
    }
}