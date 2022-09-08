package lec27_03_java_enumeration;

public class Macys {
	Size chart;
	public Macys() {
		
	}

	public Macys(Size chart) {
		super();
		this.chart = chart;
	}

	public void findMyShirt() {
		switch (chart) {

		case XS:
			System.out.println("Yes, We have your Extra Small Size Shirt");
			break;

		case Small:
			System.out.println("Yes, We have your Small Size Shirt");
			break;

		case Medium:
			System.out.println("Yes, We have your Mediun Size Shirt");
			break;

		case Large:
			System.out.println("Yes, We have your Large Size Shirt");
			break;

		case XL:
			System.out.println("Yes, We have your Extra Large Size Shirt");
			break;

		case XXL:
			System.out.println("Yes, We have your 2 Extra Large Size Shirt");
			break;

		default:
			System.out.println("Sorry! We don't have your Shirt");
			break;
		}
	}
}
