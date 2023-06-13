object test{
  var easy=8;
  var temp=7;
  
  def runIneasy(distance:Double)={
    distance*easy;
  }
  def runIntemp(distance:Double)={
    distance*temp;
  }

  
  def main(args:Array[String])={
    print(runIneasy(2)+runIntemp(3)+runIneasy(2));
  }
}