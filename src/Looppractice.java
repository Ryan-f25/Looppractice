public class Looppractice {
    public static void main(String[] args) {
        Looppractice stripes = new Looppractice ();
    }

    public Looppractice (){
        pattern();

    }
    public void pattern(){
        for(int row = 0; row<5; row++) {
           for(int col=5;col>row;col--){
                System.out.print("*");
            }
           System.out.println();
        }
    }
}

