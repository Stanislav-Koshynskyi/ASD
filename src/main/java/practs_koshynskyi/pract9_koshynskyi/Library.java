package practs_koshynskyi.pract9_koshynskyi;

public class Library {
    private String name;
    public class Book{
        private final String title;
        private final String author;
        public Book(String title, String author){
            this.title = title;
            this.author = author;
        }
        private String bookLabel(){
            return title + author + ". In "+ name ;
        }
    }
}
