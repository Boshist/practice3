package pract3; 

public class Shape { 

protected String color; 
protected boolean filled; 

Shape() 
{ 
this.color="white"; 
this.filled=true; 
} 

Shape(String color, boolean filled) 
{ 
this.color=color; 
this.filled=filled; 
} 

public String getColor() 
{ 
return this.color; 
} 

public void setColor(String color) 
{ 
this.color=color; 
} 

public boolean isFilled() 
{ 
return this.filled; 
} 

public void setFilled(boolean filled) 
{ 
this.filled=filled; 
} 

public double getArea() 
{ 
return -1; 
} 

public double getPerimeter() 
{ 
return -1; 
} 

public String toString() 
{ 
return "Color = "+this.color+", filled - "+this.filled; 
} 
}