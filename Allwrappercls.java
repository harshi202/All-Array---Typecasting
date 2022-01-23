class Allwrappercls{
	public static void main (String [] args ){
		
		String number ="50";
		int num = Integer.parseInt(number);
		System.out.println("string to int value "+"\t"+num);
		
		String value = "100";
		byte val = Byte.parseByte(value);
		System.out.println("string to byte value"+"\t"+val);
		
		String Rupees = "400";
		short Rupee = Short.parseShort(Rupees);
		System.out.println("string to short value"+"\t"+Rupee);
		
		String  dollers = "500";
		long  doll = Long.parseLong(dollers);
		System.out.println ("String to long value"+"\t"+doll);
		
		String  percent = "60.256";
		float per = Float.parseFloat(percent);
		System.out.println ("String to float value"+"\t"+per);
		
		String networth = "5.656585";
		double net = Double.parseDouble(networth);
		System.out.println ("String to double value"+"\t"+net);
		
		String gods = "true";
		boolean god =  Boolean.parseBoolean(gods);
		System.out.println ("String to boolean value"+"\t"+god);
		
		//String names = 'H';
		//char name = Character.parseChar(names);
		//System.out.println ("String to character value"+"\t"+name);
		
		
		
		
	}
}