package VegeTable;

public class Main {

	public static void main(String[] args) {
		Vegetable tomato=new Vegetable("tomato",50,2);
		Vegetable patato=new Vegetable("patato",55,4);
		Vegetable ladyfinger=new Vegetable("ladyFinger",70,8);
	    Employee clerk=new Employee("Minkal");
	    
	    tomato.setDiscount(true);
	    ladyfinger.setDiscount(true);
	    VegeTableBill bill=new VegeTableBill(clerk);
	    bill.add(patato);
	    bill.add(tomato);
        bill.add(ladyfinger);
        System.out.println(bill.getTotal());
        bill.printReceipt();
        DiscountBill Dbill=new DiscountBill(clerk,true);
        Dbill.prepareDiscountBillOfVegetableBill(bill.getItems());
        System.out.println(Dbill.items);
        System.out.println("DiscountPercentage : "+Dbill.getDiscountPercent());
        System.out.println(Dbill.getDiscountCount());
        System.out.println(Dbill.getDiscountAmount());
        
	}

}
