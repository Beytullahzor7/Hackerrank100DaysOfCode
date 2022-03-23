package HackerRank;

import java.util.Scanner;

public class SolutionDay13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String title = scanner.nextLine();
        String author = scanner.nextLine();
        int price = scanner.nextInt();
        scanner.close();

        MyBook myBook = new MyBook(title, author, price);
        myBook.display();
    }

    abstract class Book {
        private String title;
        private String author;

        public Book(String title, String author) {
            this.title = title;
            this.author = author;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        abstract void display();
    }

    class MyBook extends Book {
        private int price;

        public MyBook(String title, String author, int price) {
            super(title, author);
            this.price = price;
        }

        public void display(){
            System.out.println(
                    "Title: " + getTitle() + "\nAuthor: " + getAuthor() + "\nPrice: " + price);
        }
    }
}
