class Author{
    private String name;
    private String email;
    private char gender;
    public Author(String name,String email,char gender){
        this.name=name;
        this.email=email;
        this.gender=gender;
    }
        public String getName(){
            return name;
        }
        public String getEmail(){
            return email;
        }
        public char getGender(){
            return gender;
        }
    
    public String toString(){
        return name+"("+gender+") at"+email;
    }
    }
    class Book{
        private String name;
        private String Author;
        private double price;
        private int qty;
        public Book(String name,String Author,double price,int qty){
            this.name=name;
            this.Author=Author;
            this.price=price;
            this.qty=qty;
        }
        public String getName(){
            return name;
        }
        public String getAuthor(){
            return Author;
        }
        public String getPrice(){
            return price;
        }
        public void setPrice(double price){
            this.price=price;
        }
        public int getQty(){
            return qty;
        }
        public void setQty(){
            this.qty=qty;
        }
        public String toString(){
            return "'"+name+"' by "+Author.toString();
        }




    }
    public class Book{
        public static void main(String args[]){
            Author ahTech=new Author("Tan Ah Tech","ahTech@somewhere.com","m");
            System.out.println(ahTech);
            Book dummyBook=new Book("java for dummies ",ahTech,9.99,99);
            System.out.println(dummyBook);
            dummyBook.setPrice(8.88);
            dummyBook.setQty(88);
            System.out.println("name is "+dummyBook.getName());
            System.out.println("price is"+dummyBook.getPrice());
            System.out.println("qty is "+dummyBook.getQty());
            System.out.println("author is"+dummyBook.getAuthor());
            System.out.println("author's name is"+dummyBook.getAuthor().getName());
            System.out.println("author's email is"+dummyBook.getAuthor().getEmail());
            System.out.println("author's gender is"+dummyBook.getAuthor(),getGender());
            Book b=new Book("java for dummies ",
            new Author ("peter lee","peter@nowhere.com","m "),19.99,8);
            System.out.println(b);
                    }
    }