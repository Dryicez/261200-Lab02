String title;
    String author;
    double price;
    double newPrice;
    double discount;

    public Book() {
        this.title ="unknown";
        this.author ="unknown";
        this.price =0.0;
    }

    Book(String title){
        this( "unknown title","unknown author",0.0);

    }

    Book(String title,String author,double price){
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void displayDetails(){
        System.out.println("Title : " + this.title);
        System.out.println("Authur :" + this.author);
        System.out.println("Price :" + this.price);
    }

    public void updatePrice(double newPrice){
        if(newPrice >= 0){
            this.price = newPrice;
        }
        else{
            System.out.println("Invalid Price");
        }
    }

    void applyDiscount(double discount){
        discount = discount/100;
        if (price > 0 && discount > 0 && discount <= 100) {
            this.newPrice = this.price - (this.price * discount);
            updatePrice(this.newPrice);
            System.out.println("New Price After discount is :"+ this.newPrice);
        }
        else{
            System.out.println("Invalid Discount");
        }

    }


}
