import scala.math.Pi
object test{
  def Volume(radius:Double)={
    4/3*Pi*radius*radius*radius;
  }
  def main(args:Array[String])={
    print(Volume(5.0));
  }
}