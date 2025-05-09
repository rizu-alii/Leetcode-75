class BruteForce{
public static  int profit(int[] profit){
int finalProfit = Integer.MIN_VALUE;

for(int i = 0 ; i<profit.length-1 ; i++){
for(int j = i+1 ; j<profit.length ; j++){

int profit1 = profit[j]-profit[i];

  if(profit1>finalProfit ){
finalProfit = profit1;
       }
     }
    }
return finalProfit;
   }

public static void main(String [] args){

int [] profit = {7,1,5,3,6,4};
int finalPRofit = profit(profit);
System.out.println(finalPRofit);

}
}