class Main {
    public static void main(String[] args) {
        int fees = 125000;
        int discountPercent = 10;
        double discount = (fees / discountPercent);
        double finalFee = fees - discount;
        System.out.println("The discount amount is INR :" + discount + "and final discounted fee is INR" + finalFee);
    }
}