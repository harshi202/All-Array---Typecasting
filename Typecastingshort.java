class Typecastingshort{
	
	public static void main (String [] args){
		//WIDENING
		//short numbers =10;
		//byte num = numbers;

		short valus =2000;
		int val = valus;
		
		short thirty =3005;
		long thirt = thirty;
		
		short fortynum =4045;
		float forty = fortynum;

		short fivepointzero =5550;
		double five = fivepointzero;
		
        //short sixty =60;
	 	//boolean six = sixty;
	  //  System.out.println(six); byte cannot convert to boolean
	   // NARROWING
		 short rupees =100;
		byte indianrupes  =(byte) rupees;
		
	    short dollers =808;
		int usdollers =(int) dollers;
		
	    short crudeoil =10252;
		long   petrol =(long) crudeoil;
		
		 short indian =9925;
		float  cloths =(float)indian;
		
		 short bags =12525;
		double   backpacks =(double) bags;
		
		short names =200;
		char name =(char) names;
		System.out.print(val+"\t"+thirt+"\t"+forty+"\t"+five+"\t"+name+"\t"+indianrupes+"\t"+usdollers+"\t"+petrol+"\t"+cloths+"\t"+backpacks);
	}
}