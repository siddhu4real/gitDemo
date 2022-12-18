public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        System.out.println("Let's see how this goes...!");

        NewFile01 book1 = new NewFile01();
        book1.fileName = "Harry Potter and the Sorcerer Stone.";
        book1.indexNum = 23;
        book1.utility = true;

        NewFile01 book3 = new NewFile01("Harry Potter and the prisoner of Azkaban", 45, true);

        System.out.println(book1.fileName);

    }
}
