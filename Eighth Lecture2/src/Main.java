//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
    class PyramidPattern {
    public static void main(String[] args) {
        int rows= 10;
        for(int i=1; i<=rows; i++){
            for(int j=i; j<rows; j++) {
                System.out.print(" ");
            }
                for(int k=1; k<=(2*i-1); k++){
                    System.out.print("*");

            }
            System.out.println();
        }

    }
}