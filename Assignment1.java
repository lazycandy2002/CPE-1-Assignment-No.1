
package assignment.pkg1;
import static assignment.pkg1.Assignment1.e;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Assignment1 {
public static String z,a,b,c,d,e,f,g;
public static Scanner input = new Scanner(System.in);
public static int num;

    public static void main(String[] args) throws IOException {
 System.out.println("                   JARED GAMUTIN - CPE 1");
 System.out.println("                     Assingment - 1");
 menu();
 start ();
    }
    
static void menu (){
 System.out.println("----------------------------------------------------------");
 System.out.println("                    =================");
 System.out.println("                     MODE SELECTION");
 System.out.println("                    =================");
 System.out.println("                     1.ODD or EVEN");
 System.out.println("                     2.FACTIORIAL ");
 System.out.println("                     3.TEMP. CONVERSION ");
 System.out.println("                     4.VOLUME-SPHERE");
 System.out.println("                     5.PRINT ODD NUMBERS");
 System.out.println("                     6.EXIT");
 
 System.out.println("ENTER A NUMBER MODE BASE ON THE GIVEN SELECTION");}

 static void start() throws IOException{
a = input.next(); 
        
switch (a) {
            
case "1":
    z = "ODD OR EVEN";
    System.out.println(z+" SELECTED..");
    ODDOREVEN ();
    break;
case "2" :
     z = "FACTIORIAL";
     System.out.println(z+" SELECTED..");
     FACTORIAL ();
     break;
case "3" :
     z = "TEMPERATURE CONVERTER";
     System.out.println(z+" SELECTED..");
     TEMPCONVERTER ();
     break;
case "4":
     z = "CALCULATE THE VOLUME OF A SPHERE";
     System.out.println(z+" SELECTED..");
     volumeofsphere();
     break;
case "5":
     z = "PRINT ODD NUMBERS";
     System.out.println(z+" SELECTED..");
     PRINTODDNUMBER();
     break;
case "6":
     z = "EXIT"; 
     System.out.println(z+" SELECTED..");
     EXIT ();
     break;
default: 
System.out.println("INVALID SELECTION");
System.out.println ("PLEASE TRY AGAIN");
start ();
break;}}
  
static void ODDOREVEN () throws IOException{
System.out.println("----------------------------------------------------------");
System.out.println("                   ODD OR EVEN");
System.out.println("----------------------------------------------------------");
ODDOREVEN1();}

static void ODDOREVEN1() throws IOException{
System.out.println("1.START-----2.BACK TO METHOD SELECTION--------3.EXIT");
Scanner scan = new Scanner(System.in);    
b = scan.next();
switch (b){
case "1":
    System.out.println("Enter an Integer number:");
    num = input.nextInt();
    if ( num % 2 == 0 )
        System.out.println("Entered number is even");
     else
        System.out.println("Entered number is odd");
System.out.println("-------------------ODD-OR-EVEN----------------------------");
    ODDOREVEN1(); break;
case "2":
menu();start();break;
case "3":
EXIT ();break;
default: 
System.out.println("INVALID SELECTION");
System.out.println ("PLEASE TRY AGAIN");
ODDOREVEN1 (); break;}}

static void FACTORIAL () throws IOException{
System.out.println("----------------------------------------------------------");
System.out.println("                     FACTORIAL");
System.out.println("----------------------------------------------------------");
FACTORIAL1();}

static void FACTORIAL1 () throws IOException{
System.out.println("1.START-----2.BACK TO METHOD SELECTION--------3.EXIT");
Scanner scan = new Scanner(System.in);    
c = scan.next();
switch (c){
case "1":
int n, m, fact = 1;
System.out.println("Enter an integer to calculate it's factorial");
Scanner in = new Scanner(System.in);
      n = in.nextInt();
      if ( n < 0 )
System.out.println("Number should be non-negative.");
      else{for ( m = 1 ; m <= n ; m++ )
            fact = fact*m;
System.out.println("Factorial of "+n+" is = "+fact);
System.out.println("----------------------FACTORIAL---------------------------");
FACTORIAL1 ();}break;
case "2":
menu();start();break;
case "3":
EXIT ();break;
default: 
System.out.println("INVALID SELECTION");
System.out.println ("PLEASE TRY AGAIN");
FACTORIAL1 (); break;}}

static void TEMPCONVERTER () throws IOException{
System.out.println("----------------------------------------------------------");
System.out.println("                  TEMPERATURE CONVERTER");
System.out.println("----------------------------------------------------------");
TEMPCONVERTER1();}

static void TEMPCONVERTER1 () throws IOException{
System.out.println("1.START-----2.BACK TO METHOD SELECTION--------3.EXIT");
Scanner scan = new Scanner(System.in);    
d = scan.next();
switch (d){
case "1":
TEMPSTART();break;
case "2":
menu();start();break;
case "3":
EXIT ();break;
default: 
System.out.println("INVALID SELECTION");
System.out.println ("PLEASE TRY AGAIN");
TEMPCONVERTER1(); break;}}

static void TEMPSTART () throws IOException{
System.out.println("ENTER A NUMBER MODE TO START.. ");
System.out.println("1. °C to °F"+ "    2.°F to °C"+ "    3. °C to K");
System.out.println("4.  K to °C"+ "    5.°F to K"+ "     6.  K to °F");
System.out.println("7.BACK TO METHOD SELECION");
Scanner scan = new Scanner(System.in);    
e =scan.next();
switch (e){
    case "1": CTOF ();break;
    case "2": FTOC();break;
    case "3": CTOK();break;
    case "4": KTOC();break;
    case "5": FTOK();break;
    case "6": KTOF();break;
    case "7": menu();start();break;}}

static void CTOF () throws IOException{
BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
System.out.print("Please enter temperature in Celsius : ");
    double celsius = Double.parseDouble(reader.readLine());
    double fahrenheit = (9.0/5.0)*celsius + 32;
System.out.println("Temperature in Fahrenheit is : "+fahrenheit);
System.out.println("-----------------------°C to °F---------------------------");    
System.out.println("1.SOLVE AGAIN?-------2.BACK TO NUMBER MODE----------3.EXIT");
 Scanner scan = new Scanner(System.in);    
f =scan.next();
switch (f){
    case "1":CTOF ();break;
    case "2":TEMPSTART ();break;
    case "3":EXIT ();break;}}

static void FTOC () throws IOException{
System.out.print("Input a degree in Fahrenheit: ");
float fahrenheit = (float) input.nextDouble();
float  celsius =(float) (( 5 *(fahrenheit - 32.0)) / 9.0);
System.out.println(fahrenheit + " degree Fahrenheit is equal to " + celsius + " in Celsius");
System.out.println("-----------------------°F TO °C---------------------------");
System.out.println("1.SOLVE AGAIN?-------2.BACK TO NUMBER MODE----------3.EXIT");
 Scanner scan = new Scanner(System.in);    
g =scan.next();
switch (g){
    case "1":FTOC ();break;
    case "2":TEMPSTART ();break;
    case "3":EXIT ();break;}}

static void CTOK () throws IOException{
BufferedReader br;
System.out.println("Temperature in Degree Celsius:");		
br = new BufferedReader(new InputStreamReader(System.in));
float celsius = Float.parseFloat(br.readLine());
float kelvin = celsius + 273.15F;
System.out.println("Kelvin: "+ kelvin);
System.out.println("-----------------------°C TO K----------------------------");
System.out.println("1.SOLVE AGAIN?-------2.BACK TO NUMBER MODE----------3.EXIT");
 Scanner scan = new Scanner(System.in);    
g =scan.next();
switch (g){
    case "1":CTOK ();break;
    case "2":TEMPSTART ();break;
    case "3":EXIT ();break;}} 

static void KTOC() throws IOException{
double celsius,kelvin;
BufferedReader br = new BufferedReader ( new InputStreamReader (System.in) );
System.out.println ("Enter temperature in Kelvin");
kelvin = Double.parseDouble ( br.readLine() );
celsius = kelvin - 273.0;
System.out.println ("\n" + kelvin + "K = "+ celsius + "C");    
System.out.println("-----------------------K TO °C----------------------------");
System.out.println("1.SOLVE AGAIN?-------2.BACK TO NUMBER MODE----------3.EXIT");
 Scanner scan = new Scanner(System.in);    
g =scan.next();
switch (g){
    case "1":KTOC ();break;
    case "2":TEMPSTART ();break;
    case "3":EXIT ();break;}}

static void FTOK() throws IOException{
System.out.print("Input a degree in Fahrenheit: ");
float fahrenheit = (float) input.nextDouble();
float kelvin =  (float) (5/9 * (fahrenheit - 32) + 273.15);
System.out.println(fahrenheit + " degree Fahrenheit is equal to " + kelvin + " in kelvin");
System.out.println("-----------------------°F TO K----------------------------");
System.out.println("1.SOLVE AGAIN?-------2.BACK TO NUMBER MODE----------3.EXIT");
 Scanner scan = new Scanner(System.in);    
g =scan.next();
switch (g){
    case "1":FTOK ();break;
    case "2":TEMPSTART ();break;
    case "3":EXIT ();break;}}

static void KTOF () throws IOException{
System.out.print("Input a Kelvin to convert Fahrenheit: ");
float kelvin = (float) input.nextDouble();
float fahrenheit =  (float) (9/5 * (kelvin - 273.15) + 32);
System.out.println(kelvin + " Kelvin is equal to " + fahrenheit+ "°F");
System.out.println("-----------------------°F TO K----------------------------");
System.out.println("1.SOLVE AGAIN?-------2.BACK TO NUMBER MODE----------3.EXIT");
 Scanner scan = new Scanner(System.in);    
g =scan.next();
switch (g){
    case "1":KTOF ();break;
    case "2":TEMPSTART ();break;
    case "3":EXIT ();break;}}

static void volumeofsphere () throws IOException{
System.out.println("----------------------------------------------------------");
System.out.println("                   VOLUME OF SPHERE");
System.out.println("----------------------------------------------------------");
volumeofsphere1();}

static void volumeofsphere1() throws IOException {
System.out.println("1.START-----2.BACK TO METHOD SELECTION--------3.EXIT");
Scanner scan = new Scanner(System.in);    
b = scan.next();
switch (b){
case "1":
Scanner s= new Scanner(System.in);
System.out.println("Enter the radius of sphere:");
double r=s.nextDouble();
double  volume= (4*22*r*r*r)/(3*7);
System.out.println("Volume is:" +volume);
System.out.println("-------------------VOLUME OF SPHERE-----------------------");
volumeofsphere1 ();break;
case "2":
menu();start();break;
case "3":
EXIT ();break;
default: 
System.out.println("INVALID SELECTION");
System.out.println ("PLEASE TRY AGAIN");
volumeofsphere1 (); break;}}

static void PRINTODDNUMBER () throws IOException{
System.out.println("----------------------------------------------------------");
System.out.println("                    LIST OF N ODD NUMBERS");
System.out.println("----------------------------------------------------------");
PRINTODDNUMBER1();}

static void PRINTODDNUMBER1 () throws IOException{
System.out.println("1.START-----2.BACK TO METHOD SELECTION--------3.EXIT");
Scanner scan = new Scanner(System.in);    
c = scan.next();
switch (c){
case "1":
int r,i;
System.out.print("Enter the first number for the starting range: ");
int num1=scan.nextInt();
System.out.print("Enter the second number for end range: ");
int num2=scan.nextInt();
System.out.println("Display the odd numbers between "+num1+" and "+num2+" are :");
for(i=num1; i<=num2; i++){ 
r=i%2; 
if(r==1) 
System.out.println(i);}
System.out.println("-------------------N ODD NUMBERS---------------------------");
PRINTODDNUMBER1();break;

case "2":
menu();start();break;
case "3":
EXIT ();break;
default: 
System.out.println("INVALID SELECTION");
System.out.println ("PLEASE TRY AGAIN");
PRINTODDNUMBER1 (); break;}}

static void EXIT (){
System.out.println("----------------------------------------------------------");
System.out.println ("------------------THANK YOU - GOOD BYE-------------------");
System.out.println("----------------------------------------------------------");
}}
    