public class Card 
{
  private int quantity;
  private int color;
  private int shading;
  private int shape;
  // Create the rest of this class yourself
  public Card(int q, int c, int s, int sh)
  {
    quantity = fixValue(q);
    color = fixValue(c);
    shading = fixValue(s);
    shape = fixValue(sh);
  }
  public int getQuantity()
  {
    return quantity;
  }
   
  public int getColor()
  {
    return color;
  }
  
  public int getShading()
  {
    return shading;
  }
  
  public int getShape()
  {
    return shape;
  }
  
  public boolean isSet(Card c, Card d)
  {
    if((c.getQuantity() + d.getQuantity() + quantity) % 3 == 0 && 
       (c.getColor() + d.getColor() +color) % 3 == 0 &&
       (c.getShading() + d.getShading() + shading) % 3 == 0 &&
       (c.getShape() + d.getShape() + shape) % 3 == 0)
    {
      return true;
    }
    else
    {
      return false;
    }
  }
  
  public String toString()
  {
    String str = "";
    str += quantity;
    if(color == 1)
    {
      str += "R";
    }
    if(color == 2)
    {
      str += "G";
    }
    if(color == 3)
    {
      str += "P";
    }
    if(shading == 1)
    {
      str += "O";
    }
    if(shading == 2)
    {
      str += "T";
    }
    if(shading == 3)
    {
      str += "S";
    }
    if(shape == 1)
    {
      str += "V";
    }
    if(shape == 2)
    {
      str += "D";
    }
    if(shape == 3)
    {
      str += "Q";
    }
    
    return str;
  }
  
  private int fixValue(int valueToFix)
  {
    if(valueToFix < 1 || valueToFix > 3)
    {
      return(((valueToFix % 3) + 3) % 3) + 1;
    }
    else
    {
      return valueToFix;
    }
  }
  
  public boolean equals(Object obj) 
  {
    Card that = (Card)obj;
    
    return quantity == that.getQuantity() &&
      color == that.getColor() &&
      shading == that.getShading() &&
      shape == that.getShape();
  }
  
 
}
