class Main {
    public static void main(String[] args) {
        int costPrice = 129;
        int sellingPrice = 191;
        int profit = sellingPrice - costPrice;
        double profitPercentage = ((double) profit / costPrice) * 100;
        System.out.println("The Cost Price is :" + costPrice + "INR and Selling Price is  :" + sellingPrice + "INR");
        System.out.println("The Profit is :" + profit + "INR and the Profit Percentage is :" + profitPercentage);
    }
}