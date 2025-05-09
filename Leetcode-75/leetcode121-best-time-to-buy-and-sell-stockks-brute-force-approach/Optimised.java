class Optimised{

public static int calculateProfit(int [ ] prices){
int min = prices[0];
int profit = 0;

for (int i = 0 ; i<prices.length ; i++){
if(prices[i] <min){
min = prices[i];
}
if((prices[i] -min) > profit){
profit = prices[i] -min;
}

}
return profit;
}
public static void main(String [] args){
int [] prices = {7,1,5,3,6,4};
int profit = calculateProfit(prices);
System.out.println(profit);
}
}