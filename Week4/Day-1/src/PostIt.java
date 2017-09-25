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
        secondPostIt.backgroundColor = "Pink";
        secondPostIt.text = "Awesome";
        secondPostIt.textColor = "Black";
        System.out.println(secondPostIt.backgroundColor);

        PostIt thirdPostIt = new PostIt();
        thirdPostIt.backgroundColor = "Yellow";
        thirdPostIt.text = "Superb!";
        thirdPostIt.textColor = "Green";
        System.out.println(thirdPostIt.textColor);
    }
}
