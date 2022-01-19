class Typecastinglong{
	public static void main (String [] args){
		//WIDENING
		//long numbers =10;
		//int num = numbers;          possible lossy conversion from long to int


		//long valus =20;
		//short val = valus;          possible lossy conversion from long to short

		
		//long thirty =30;
		//byte thirt = thirty;         possible lossy conversion from long to byte

		
		long fortynum =40;
		float forty = fortynum;

		long fivepointzero =50;
		double five = fivepointzero;
      //byte sixty =60;
	 //	boolean six = sixty;
	  //  System.out.println(six); byte cannot convert to boolean
	   // NARROWING
		long rupees =100;
		short indianrupes  =(short) rupees;
		
	    long dollers =80;
		int usdollers =(int) dollers;
		
	   // long crudeoil =102;
		//byte   petrol =(long) crudeoil;       possible lossy conversion from long to byte

		
		long indian =99;
		float  cloths =(float)indian;
		
		long bags =125;
		double   backpacks =(double) bags;
		
		long names =101;
		char name =(char) names;
		System.out.print(forty+"\t"+five+"\t"+name+"\t"+indianrupes+"\t"+usdollers+"\t"+cloths+"\t"+backpacks);
	}
}