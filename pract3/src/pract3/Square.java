package pract3; 

public class Square extends Rectangle{ 

Square() 
{ 
this.color="white"; 
this.filled=true; 

this.width=1; 
this.length=1; 
} 

Square(double side) 
{ 
this.color="white"; 
this.filled=true; 

this.width=side; 
this.length=side; 
} 

Square(double side, String color, boolean filled) 
{ 
this.color=color; 
this.filled=filled; 

this.width=side; 
this.length=side; 
} 

public double getSide() 
{ 
return this.length; 
} 

public void setSide(double side) 
{ 
this.length=side; 
this.width=side; 
} 

@Override 
public void setWidth(double side) 
{ 
this.width=side; 
} 

@Override 
public void setLength(double side) 
{ 
this.length=side; 
} 

@Override 
public String toString() 
{ 
return "Color = "+this.color+", filled - "+this.filled+", side = "+this.length; 
} 
}