public class Main {
    public static void main(String[] args) {

        Author[] authors = AuthorProcess.getAuthors();
        for (Author author : authors) {
            System.out.println(author);
        }
    }
}