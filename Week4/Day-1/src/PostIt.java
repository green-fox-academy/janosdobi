public class PostIt {
    String backgroundColor;
    String text;
    String textColor;
}


class myProgram {
    public static void main(String[] args) {

        PostIt firstPostIt = new PostIt();
        firstPostIt.backgroundColor = "Orange";
        firstPostIt.text = "Idea 1";
        firstPostIt.textColor = "Blue";
        System.out.println(firstPostIt.text);

        PostIt secondPostIt = new PostIt();
        firstPostIt.backgroundColor = "Pink";
        firstPostIt.text = "Awesome";
        firstPostIt.textColor = "Black";
        System.out.println(firstPostIt.backgroundColor);

        PostIt thirdPostIt = new PostIt();
        firstPostIt.backgroundColor = "Yellow";
        firstPostIt.text = "Superb!";
        firstPostIt.textColor = "Green";
        System.out.println(firstPostIt.textColor);

    }

}
