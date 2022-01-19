class Typecastingfloat{
	public static void main (String [] args){
		//WIDENING
		//float numbers =10;
		//int num = numbers;    possible lossy conversion from float to int
		
		//float valus =20;
		//short val = valus;     possible lossy conversion from float to short

		//float thirty =30;      possible lossy conversion from float to long
		//long thirt = thirty;    
		
		//float fortynum =40;       possible lossy conversion from float to byte
		//byte forty = fortynum;

		float fivepointzero =500;
		double five = fivepointzero;
		 
        //byte sixty =60;
	 	//boolean six = sixty;
	  //  System.out.println(six); byte cannot convert to boolean
	   // NARROWING
		 float rupees =1000;
		short indianrupes  =(short) rupees;
		
	    float dollers =850;
		int usdollers =(int) dollers;
		
	    float crudeoil =1002;
		long   petrol =(long) crudeoil;
		
		float indian =99;
		byte  cloths =(byte)indian;
		
		float bags =1255;
		double   backpacks =(double) bags;
		
		float names =1501;
		char name =(char) names;
		System.out.print(five+"\t"+name+"\t"+indianrupes+"\t"+usdollers+"\t"+petrol+"\t"+cloths+"\t"+backpacks);
	}
}