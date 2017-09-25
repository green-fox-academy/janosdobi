/*
- Create a `BlogPost` class that has
  - an `authorName`
  - a `title`
  - a `text`
  - a `publicationDate`
- Create a few blog post objects:
  - "Lorem Ipsum" titled by John Doe posted at "2000.05.04."
    - Lorem ipsum dolor sit amet.
  - "Wait but why" titled by Tim Urban posted at "2010.10.10."
    - A popular long-form, stick-figure-illustrated blog about almost everything.
  - "One Engineer Is Trying to Get IBM to Reckon With Trump" titled by William Turton at "2017.03.28."
    - Daniel Hanley, a cybersecurity engineer at IBM, doesn�t want to be the center of attention. When I asked to take his picture outside one of IBM�s New York City offices, he told me that he wasn�t really into the whole organizer profile thing.
*/

import java.util.ArrayList;
import java.util.List;

public class BlogPost {

    String authorname;
    String title;
    String text;
    String publicationDate;
}

class Blog {

    List<BlogPost> blogPosts = new ArrayList<>();

    public void add (BlogPost b) {
        blogPosts.add(b);
    }

    public void delete(int i) {
        blogPosts.remove(i);
    }

    public void update(int i, BlogPost b) {
        blogPosts.add(i, blogPosts.get(i));
    }

}

class Main {
    public static void main(String[] args) {

        BlogPost firstPost = new BlogPost();
        firstPost.title = "Lorem Ipsum";
        firstPost.authorname = "John Doe";
        firstPost.publicationDate = "2000.05.04";
        firstPost.text = "Lorem ipsum dolor sit amet.";
        System.out.println(firstPost.title);

        BlogPost secondPost = new BlogPost();
        secondPost.title = "Wait but why";
        secondPost.authorname = "Tim Urban";
        secondPost.publicationDate = "2010.10.10";
        secondPost.text = "A popular long-form, stick-figure-illustrated blog about almost everything.";
        System.out.println(secondPost.authorname);

        BlogPost thirdPost = new BlogPost();
        thirdPost.title = "One Engineer Is Trying to Get IBM to Reckon With Trump";
        thirdPost.authorname = "William Turton";
        thirdPost.publicationDate = "2017.03.28";
        thirdPost.text = "Daniel Hanley, a cybersecurity engineer at IBM, doesn’t want to be the center of attention. When I asked to take his picture outside one of IBM’s New York City offices, he told me that he wasn’t really into the whole organizer profile thing.";
        System.out.println(thirdPost.text);
    }
}

