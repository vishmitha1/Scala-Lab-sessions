object test{
  def ConvertTemp(cel : Float)={
     cel*1.8000 + 32.00;
  }
  def main(args:Array[String])={
    print(ConvertTemp(6));
  }
}