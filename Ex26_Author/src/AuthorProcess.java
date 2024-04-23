public class AuthorProcess {
    private static Author[] Authors;
    static {
        Authors = new Author[5];
        Authors[0]= new Author("Reşat Nuri","Güntekin");
        Authors[1]= new Author("Necip Fazıl","Kısakürek");
        Authors[2]= new Author("Yakup Kadri","Karaosmanoğlu");
        Authors[3]= new Author("Halit Ziya","Uşaklıgil");
        Authors[4]= new Author("Yahya Kemal","Beyaztlı");
    }
    public static Author[] getAuthors(){
        return AuthorProcess.Authors;
    }
}
