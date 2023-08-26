public class MyName {
    public static void main(String[] args) {
        for(int i = 0; i <=8; i++) {  
            System.out.printf("*");  
            for(int j = 0; j <=8; j++) {  
                if((i == 0 || i == 4) && j < (8- 2)) {  
                    System.out.printf("*");  
                }else if(j == (8 - 2) && !(i == 0 || i == 4)){  
                    System.out.printf("*");  
                }else {  
                    System.out.printf(" ");  
                }  
            }  
            System.out.printf("\n");  
        }
        int width=8;
        int height =8;
        int n = width / 2, i, j;
        for (i = 0; i < height; i++) 
        {
            for (j = 0; j <= width; j++)
            {
                if (j == n || j == (width - n)
                    || (i == height / 2 && j > n
                        && j < (width - n)))
                    System.out.printf("*");
                else
                    System.out.printf(" ");
            }
            System.out.printf("\n");
            n--;
        }
        int count = 0;  
        for(int m = 0; m <=8; m++) {  
            System.out.printf("*");  
            for(int k = 0; k <=8; k++) {  
                if(k == 8) {  
                    System.out.printf("*");  
                }else if(k == count || k == (8 - count - 1)){  
                    System.out.printf("*");  
                }else {  
                    System.out.printf(" ");  
                }  
            }  
            if(count == 8 / 2) {  
                count = -99999;  
            }else {  
                count = count + 1;  
            }  
            System.out.printf("\n");  
        }        
    }
}
