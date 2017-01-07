import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class GoogleBillboard extends PApplet {

public final static String e = "2.71828182845904523536028747135266249775724709369995957496696762772407663035354759457138217852516642742746639193200305992181741359662904357290033429526059563073813232862794349076323382988075319525101901";
public void setup()  
{            
    String tendigits = e.substring(2, 12);
    double num = Double.parseDouble(tendigits);
    System.out.println(num);
    noLoop();
}  
public void draw()  
{   
	//not needed for this assignment
	for(int i = 2; i< e.length()-10; i++)
	{

		if(isPrime(Double.parseDouble(e.substring(i,i+10))) == true)
		{
			System.out.println("The first prime is " + e.substring(i,i+10));
      break;
		}
	}
  int number = 0;
  for(int i = 2; i< e.length()-10; i++)
  {
    if(sum49(e.substring(i,i+10)) == true)
    {
      number+=1;
      System.out.println("f(" + number + ") = " + e.substring(i,i+10));

      if(number == 5)
      {
        break;
      }
    }
  }
}  
public boolean isPrime(double dNum)  
{   
    //to be finished later
    if(dNum < 2)
  {
    return false;
  }
  for(int i =2; i<= Math.sqrt(dNum); i++)
  {
    if(dNum % i == 0)
      return false;
  }
  return true;
} 

public boolean sum49(String sNum)
{
  double digit1=Double.parseDouble(sNum.substring(0,1));
  double digit2=Double.parseDouble(sNum.substring(1,2));
  double digit3=Double.parseDouble(sNum.substring(2,3));
  double digit4=Double.parseDouble(sNum.substring(3,4));
  double digit5=Double.parseDouble(sNum.substring(4,5));
  double digit6=Double.parseDouble(sNum.substring(5,6));
  double digit7=Double.parseDouble(sNum.substring(6,7));
  double digit8=Double.parseDouble(sNum.substring(7,8));
  double digit9=Double.parseDouble(sNum.substring(8,9));
  double digit10=Double.parseDouble(sNum.substring(9,10));
  if(digit10 + digit9 + digit8 + digit7 + digit6 + digit5 + digit4 + digit3 + digit2 + digit1 == 49)
    return true;
  return false;
}

  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "GoogleBillboard" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
