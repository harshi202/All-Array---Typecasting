class Typecastingdouble{
	public static void main (String [] args){
		//WIDENING
		//double numbers =10;
		//int num = numbers;

		//double valus =20;
		//short val = valus;
		
		//double thirty =30;
		//long thirt = thirty;
		
		//double fortynum =40;
		//float forty = fortynum;

		//double fivepointzero =50;
		//byte five = fivepointzero;
      //double sixty =60;
	 //	boolean six = sixty;
	  //  System.out.println(six); byte cannot convert to boolean
	   // NARROWING
		 double rupees =10250;
		short indianrupes  =(short) rupees;
		
	    double dollers =8025;
		int usdollers =(int) dollers;
		
	    double crudeoil =10562;
		long   petrol =(long) crudeoil;
		
		double indian =9449;
		float  cloths =(float)indian;
		
		double bags =125;
		byte   backpacks =(byte) bags;
		
		double names =1256;
		char name =(char) names;
		System.out.print(name+"\t"+indianrupes+"\t"+usdollers+"\t"+petrol+"\t"+cloths+"\t"+backpacks);
	}
}