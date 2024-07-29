
public class Bike {
	
	String bikename =  "KTM";
	int bikemodel = 390;
	double bikeprice = 310666;
	 
	void bikeInfo()
         	{
			System.out.println("bike name is: " + bikename);
			System.out.println("bike model is: " + bikemodel);
			System.out.println("bike price is: " + bikeprice);

 
}
 		public static void main(String[] args){
			Bike b = new Bike();
			b.bikeInfo();
			
}
   	

}
