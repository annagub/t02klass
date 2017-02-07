public class grupitoo1{
	double a, b, c;
	public grupitoo1(double kylg1, double kylg2, double kylg3){
		if(kylg1+kylg2<kylg3) {throw new RuntimeException("Sobimatud kyljepikkused");}
		if(kylg1+kylg3<kylg2) {throw new RuntimeException("Sobimatud kyljepikkused");}
		if(kylg2+kylg3<kylg1) {throw new RuntimeException("Sobimatud kyljepikkused");}
		a=kylg1;
		b=kylg2;
	    c=kylg3;
		}
	public double ymberm66t(){
		return a+b+c;
	
	}
	public double pindala(){
		double p=(a+b+c)/2;
		return Math.round(Math.sqrt(p*(p-a)*(p-b)*(p-c)));
	
	}
	public String nurgad(){
		double C=(Math.pow(a, 2) + Math.pow(b, 2) - Math.pow(c, 2))/(2*a*b);
		double A=(Math.pow(c, 2) + Math.pow(b, 2) - Math.pow(a, 2))/(2*c*b);
		double B=(Math.pow(c, 2) + Math.pow(a, 2) - Math.pow(b, 2))/(2*c*a);
		return "Nurk C on "+Math.round(Math.toDegrees(Math.acos(C)))+" kraadi, Nurk A on "+Math.round(Math.toDegrees(Math.acos(A)))+" kraadi, Nurk B on "+Math.round(Math.toDegrees(Math.acos(B)))+" kraadi.";
	
	}
}