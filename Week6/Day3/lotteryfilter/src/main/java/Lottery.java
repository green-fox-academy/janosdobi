import joptsimple.*;

public class Lottery {

    public static void main(String[] args) {
        LotteryFilter lottery = new LotteryFilter();
        OptionParser parser = new OptionParser();
        parser.accepts("y").withRequiredArg();
        parser.accepts("f").withRequiredArg();
        parser.accepts("o").withRequiredArg();
        OptionSet options = parser.parse(args);

        if (options.has("y")) {
            lottery.readFile();
            lottery.writeFile(Integer.parseInt(options.valueOf("y").toString()));
        }

        if (options.has("f")) {

        }

        if (options.has("o")) {

        }
    }
}