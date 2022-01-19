class Typecastingbyte{
	public static void main (String [] args){
		//WIDENING
		byte numbers =10;
		int num = numbers;

		byte valus =20;
		short val = valus;
		
		byte thirty =30;
		long thirt = thirty;
		
		byte fortynum =40;
		float forty = fortynum;

		byte fivepointzero =50;
		double five = fivepointzero;
      //byte sixty =60;
	 //	boolean six = sixty;
	  //  System.out.println(six); byte cannot convert to boolean
	   // NARROWING
		 byte rupees =100;
		short indianrupes  =(short) rupees;
		
	    byte dollers =80;
		int usdollers =(int) dollers;
		
	    byte crudeoil =102;
		long   petrol =(long) crudeoil;
		
		 byte indian =99;
		float  cloths =(float)indian;
		
		 byte bags =125;
		double   backpacks =(double) bags;
		
		byte names =101;
		char name =(char) names;
		System.out.print(num+"\t"+val+"\t"+thirt+"\t"+forty+"\t"+five+"\t"+name+"\t"+indianrupes+"\t"+usdollers+"\t"+petrol+"\t"+cloths+"\t"+backpacks);
	}
}