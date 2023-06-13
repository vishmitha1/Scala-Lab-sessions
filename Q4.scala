object test{
  def discount(bookcount : Int)={
    bookcount*24.95*60/100;
  }
  def shipping(bookcount : Int)={
    if(bookcount >50){
      3 + .75*(bookcount-50);
    }
    else{
      3;
    }
  }


  def total(bookcount : Int)={
    print(discount(bookcount)+shipping(bookcount));
  }
  def main(args:Array[String])={
    total(60);
  }
}