package pract3; 

public class Circle extends Shape{ 

protected double radius; 

Circle() 
{ 
this.color="white"; 
this.filled=true; 

this.radius=1; 
} 

Circle(double radius) 
{ 
this.color="white"; 
this.filled=true; 

this.radius=radius; 
} 

Circle(double radius, String color, boolean filled) 
{ 
this.color=color; 
this.filled=filled; 

this.radius=radius; 
} 

public double getRadius() 
{ 
return this.radius; 
} 

public void setRadius(double radius) 
{ 
this.radius=radius; 
} 

@Override 
public double getArea() 
{ 
return 3.14*radius*radius; 
} 

@Override 
public double getPerimeter() 
{ 
return 6.28*radius; 
} 

@Override 
public String toString() 
{ 
return "Color = "+this.color+", filled - "+this.filled+", radius = "+this.radius; 
} 


}