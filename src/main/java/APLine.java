public class APLine
{
  /* your code here */
  int a, b, c;
  public APLine(int a1, b1, c1){
    a = a1;
    b = b1;
    c = c1;
  }
  public double getSlope(){
    return a/b;
  }
  public boolean isOnLine(int x, int y){
    return a*x + b*y + c;
  }
}
