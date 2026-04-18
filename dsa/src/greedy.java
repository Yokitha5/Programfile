import java.util.*;
public  class greedy{
    public static void main(String[] args){
        int[] profit={5,10,15,7,8,9,4};
        int[] weight ={1,3,5,4,1,3,2};
        double []ratio=new double[profit.length];
        int pro=0;
        for(int i=0;i<profit.length;i++) {
            double val = (double)profit[i] / weight[i];
            ratio[i] = val;
        }
        for(int i=0;i<ratio.length;i++){
            for(int j=0;j<ratio.length;j++){
                if(ratio[i]>=ratio[j]){
                    double temp =ratio[i];
                    ratio[i]=ratio[j];
                    ratio[j]= temp;
                    int temp2=profit[i];
                    profit[i]= profit[j];
                    profit[j] = temp2;
                    int temp3= weight[i];
                    weight[i]= weight[j];
                    weight[j]=temp3;
                }
            }
        }
        System.out.println(Arrays.toString(ratio));
        System.out.println(Arrays.toString(profit));
        System.out.println(Arrays.toString(weight));
        int storage= 15;
        for(int i=0;i<ratio.length;i++){
            if(weight[i]<=storage) {
                storage -= weight[i];
                pro+=profit[i];
            }
            else {
                pro += profit[i] * ((double) storage / weight[i]);
                break;

            }
        }
        System.out.print(pro);
    }
}