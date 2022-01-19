class Typecastingsint{
	
	public static void main (String [] args){
		//WIDENING
		//int numbers =120;
		//byte num = numbers;//incompatible types: possible lossy conversion from int to byte


		//int valus =2000;
		//short val = valus;//incompatible types: possible lossy conversion from int to short

		
		int thirty =3005;
		long thirt = thirty;
		
		int fortynum =4045;
		float forty = fortynum;

		int fivepointzero =5550;
		double five = fivepointzero;
		
        //int sixty =60;
	 	//boolean six = sixty;
	  //  System.out.println(six); byte cannot convert to boolean
	   // NARROWING
		 int rupees =100;
		byte indianrupes  =(byte) rupees;
		
	    int dollers =808;
		short usdollers =(short) dollers;
		
	    int crudeoil =10252;
		long   petrol =(long) crudeoil;
		
		 int indian =9925;
		float  cloths =(float)indian;
		
		 int bags =12525;
		double   backpacks =(double) bags;
		
		int names =200;
		char name =(char) names;
		System.out.print(thirt+"\t"+forty+"\t"+five+"\t"+name+"\t"+indianrupes+"\t"+usdollers+"\t"+petrol+"\t"+cloths+"\t"+backpacks);
	}
}