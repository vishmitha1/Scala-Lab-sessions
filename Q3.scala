import scala.math.Pi
object test{
  def Volume(radius:Double)={
    Pi*radius*radius*radius*4/3;
  }
  def main(args:Array[String])={
    print(Volume(5.0));
  }
}