import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.text.*;
import java.util.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List

/**
 * A class that represents a picture.  This class inherits from 
 * SimplePicture and allows the student to add functionality to
 * the Picture class.  
 * 
 * Copyright Georgia Institute of Technology 2004-2005
 * @author Barbara Ericson ericson@cc.gatech.edu
 */
public class Picture extends SimplePicture 
{
  ///////////////////// constructors //////////////////////////////////
  
  /**
   * Constructor that takes no arguments 
   */
  public Picture ()
  {
    /* not needed but use it to show students the implicit call to super()
     * child constructors always call a parent constructor 
     */
    super();  
  }
  
  /**
   * Constructor that takes a file name and creates the picture 
   * @param fileName the name of the file to create the picture from
   */
  public Picture(String fileName)
  {
    // let the parent class handle this fileName
    super(fileName);
  }
  
  /**
   * Constructor that takes the width and height
   * @param width the width of the desired picture
   * @param height the height of the desired picture
   */
  public Picture(int width, int height)
  {
    // let the parent class handle this width and height
    super(width,height);
  }
  
  /**
   * Constructor that takes a picture and creates a 
   * copy of that picture
   */
  public Picture(Picture copyPicture)
  {
    // let the parent class do the copy
    super(copyPicture);
  }
  
  /**
   * Constructor that takes a buffered image
   * @param image the buffered image to use
   */
  public Picture(BufferedImage image)
  {
    super(image);
  }
  
  ////////////////////// methods //////////////////////////////////////
     
  /**
   * Method to return a string with information about this picture.
   * @return a string with information about the picture such as fileName,
   * height and width.
   */
  public String toString()
  {
    String output = "Picture, filename " + getFileName() + 
      " height " + getHeight() 
      + " width " + getWidth();
    return output;
    
  }
  public void zeroBlue()
  {
    Pixel[][] pixels = this.getPixels2D();

    for (Pixel[] rowArray : pixels)
     {
       for (Pixel p: rowArray)
       {
              p.setBlue(0);
       }
    }
  }
  public void keepOnlyBlue()
  {
    Pixel[][] pixels = this.getPixels2D();

    for (Pixel[] rowArray : pixels)
     {
       for (Pixel p: rowArray)
       {
              p.setRed(0);
              p.setGreen(0);
       }
    }
  }
  public void switchColors()
  {
    Pixel[][] pixels = this.getPixels2D();

    for (Pixel[] rowArray : pixels)
     {
       for (Pixel p: rowArray)
       {
              p.setRed(p.getGreen());
              p.setGreen(p.getBlue());
              p.setBlue(p.getRed());
       }
    }
  }
  public void negate(){
    Pixel[][] pixels = this.getPixels2D();

    for (Pixel[] rowArray : pixels)
     {
       for (Pixel p: rowArray)
       {
              p.setBlue(255-p.getBlue());
              p.setRed(255-p.getRed());
              p.setGreen(255-p.getGreen());
       }
    }
  }
  public void grayscale(){
    Pixel[][] pixels = this.getPixels2D();

    for (Pixel[] rowArray : pixels)
     {
       for (Pixel p: rowArray)
       {
              int avg = (p.getGreen() + p.getBlue() + p.getRed())/3;
              p.setBlue(avg);
              p.setRed(avg);
              p.setGreen(avg);
       }
    }
  }
  public void mirrorVertical(){
    Pixel[][] pixels = this.getPixels2D();
    int width = pixels[0].length;
    for (Pixel[] rowArray : pixels)
     {
       for (Pixel p: rowArray)
       {
              Pixel leftPixel = pixels[p.getRow()][p.getCol()];
              Pixel rightPixel = pixels[p.getRow()][width - 1 - p.getCol()];
              rightPixel.setColor(leftPixel.getColor());
       }
    }
  }
  public void mirrorVerticalRightToLeft(){
    Pixel[][] pixels = this.getPixels2D();
    int width = pixels[0].length;
    for (Pixel[] rowArray : pixels)
     {
       for (Pixel p: rowArray)
       {
              Pixel leftPixel = pixels[p.getRow()][p.getCol()];
              Pixel rightPixel = pixels[p.getRow()][width - 1 - p.getCol()];
              leftPixel.setColor(rightPixel.getColor());
       }
    }
  }
  public void mirrorHorizontal(){
    Pixel[][] pixels = this.getPixels2D();
    int height = pixels.length;
    for (Pixel[] rowArray : pixels)
     {
       for (Pixel p: rowArray)
       {
              Pixel topPixel = pixels[p.getRow()][p.getCol()];
              Pixel bottomPixel = pixels[height - 1 - p.getRow()][p.getCol()];
              bottomPixel.setColor(topPixel.getColor());
       }
    }
  }
  public void mirrorHorizontalBotToTop(){
    Pixel[][] pixels = this.getPixels2D();
    int height = pixels.length;
    for (Pixel[] rowArray : pixels)
     {
       for (Pixel p: rowArray)
       {
              Pixel topPixel = pixels[p.getRow()][p.getCol()];
              Pixel bottomPixel = pixels[height - 1 - p.getRow()][p.getCol()];
              topPixel.setColor(bottomPixel.getColor());
       }
    }
  }   
  public void mirrorDiagonal(){
    Pixel[][] pixels = this.getPixels2D();
    int height = pixels.length;
    for (Pixel[] rowArray : pixels)
     {
       for (Pixel p: rowArray)
       {
              if(p.getRow() >= pixels[0].length){
                break;
              }
              Pixel topPixel = pixels[p.getRow()][p.getCol()];
              Pixel bottomPixel = pixels[p.getCol()][p.getRow()];
              topPixel.setColor(bottomPixel.getColor());
              
       }
    }
  } 
 
} // this } is the end of class Picture, put all new methods before this
 