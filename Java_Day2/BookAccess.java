class BookAccessModifier {
    public int ISBN;
    protected String title;
    private String Author;
    BookAccessModifier(int ISBN, String title, String Author){
        this.ISBN = ISBN;
        this.title = title;
        this.Author = Author;
    }
    public String setName(String Author){
        return Author;
    }
    public void getName(String Author){
        this.Author = Author;
    }
    void displayBookDetails(){
        System.out.println("Enter the ISBN number:" + ISBN);
        System.out.println("Enter the Book name:" + title);
        System.out.println("Enter the Author name:" + Author);
    }
}
    class EBook extends BookAccessModifier{
        boolean digital;
        EBook(int ISBN, String title, String Author, boolean digital){
            super(ISBN, title, Author);
            this.digital = digital;
        }
    
        @Override
        void displayBookDetails(){
            super.displayBookDetails();
            System.out.println("Enter the Book is Digital or not:" + digital);
        }}
class BookAccess{
            public static void main(String[] args){
                BookAccessModifier b1 = new BookAccessModifier(12345, "Harry Pother", "Harry");
                b1.displayBookDetails();
                b1.setName("Pother");
                EBook e1 = new EBook(123, "Alone", "Bharath", true);
                e1.displayBookDetails();
            }
        }

    

