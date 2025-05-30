class Solution {
    public String intToRoman(int num) {
        String p="";
        while(num!=0){
            if(num>=1000){
                int rem=num/1000;
                while(rem>0){
                    p+='M';
                    rem--;
                }
                num=num%1000;
            }
            else if(num>=900){
               p+="CM";
                num=num%900;
            }
            else if(num>=500){
                    int rem=num/500;
                while(rem>0){
                    p+='D';
                    rem--;
                }
                num=num%500;
            }
            else if(num>=400){
                    p+="CD";
                num=num%400;
            }
            else if(num>=100){
                    int rem=num/100;
                while(rem>0){
                    p+='C';
                    rem--;
                }
                num=num%100;
            }
            else if(num>=90){
                    p+="XC";
                num=num%90;
            }
            else if(num>=50){
                    int rem=num/50;
                while(rem>0){
                    p+='L';
                    rem--;
                }
                num=num%50;
            }
            else if(num>=40){
                    p+="XL";
                num=num%40;
            }
            else if(num>=10){
                    int rem=num/10;
                while(rem>0){
                    p+='X';
                    rem--;
                }
                num=num%10;
            }
            else if(num==9){
                num=0;
                p+="IX";
            }
            else if(num>=5){
                p+='V';
                num=num%5;
            }
            else if(num==4){
                p+="IV";
                num=0;
            }
            else{
                num--;
                p+='I';
            }
        }
        return p;
    }
}