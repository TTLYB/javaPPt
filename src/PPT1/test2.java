package PPT1;

public class test2 {
    public static void main(String[] args) {
        int count = 0;
        for(int i = 1; i <= 100; i++){
            if(i%3==0)
            {
                System.out.println(i + " ");
                count++;
            }
            if (count == 25)
            {
                break;
            }
        }
        System.out.println();
        System.out.println(count);
    }
}
