
public class CalculateInterest {
	double p, t, r;

	CalculateInterest(double p, double t, double r) {
		this.p = p;
		this.t = t;
		this.r = r;
	}

	public double simpleInterest() {		
		return (p * r * t) / 100;
	}

	public double compoundInterest() {
		return p * (Math.pow(1 + r / 100, t) - 1);
	}

	public double calculateEMI(int months) {
		double monthlyInterestRate = r / 12 / 100;
		return (p * monthlyInterestRate * Math.pow(1 + monthlyInterestRate, months))
				/ (Math.pow(1 + monthlyInterestRate, months) - 1);
	}

}
