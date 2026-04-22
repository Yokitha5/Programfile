// 1. Mutiply String
class Solution {
    public String multiply(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0"))
            return "0";
        int n = num1.length(), m = num2.length();
        int[] res = new int[n + m];
        for (int i = n - 1; i >= 0; i--) {
            for (int j = m - 1; j >= 0; j--) {
                int sum = (num1.charAt(i) - '0') *
                          (num2.charAt(j) - '0') +
                          res[i + j + 1];
                res[i + j + 1] = sum % 10;
                res[i + j] += sum / 10;
            }
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < res.length && res[i] == 0) i++;
        for (; i < res.length; i++) sb.append(res[i]);
        return sb.toString();
    }
}

// 2. Best Time to Buy and Sell Stock
class Solution {
    public int maxProfit(int[] prices) {
        int minprice =prices[0];
        int maxprofit=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]<minprice){
                minprice = prices[i];

            }
            else{
                int profit = prices[i]-minprice;
                if(profit>maxprofit){
                    maxprofit=profit;
    
                }
            }
        }
        return maxprofit;
        
    }
}

// 3. Zigzag Conversion
class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1 )
            return s;
        char[][] ch = new char[numRows][s.length()];
        char[] str = s.toCharArray();
        int l = s.length();
        int i=0,j=0,k=0;
        boolean bool = false;
        while(k<l){
            if(bool){
                ch[i][j] = str[k++];
                i-=1;
                j++;
                if(i==-1){
                    i+=2;
                     bool = false;
                }
            }
            else{
                ch[i][j]=str[k++];
               i+=1;
                if(i==numRows){
                    i=numRows-2;
                    j++;
                    bool = true;
                }}
                }
                
                char[] res = new char[s.length()];
        int idx = 0;

        for (int r = 0; r < numRows; r++) {
            for (int c = 0; c <= j; c++) {
                if (ch[r][c] != '\0') {
                    res[idx++] = ch[r][c];
                }
            }
        }

        return new String(res);
    }
}
