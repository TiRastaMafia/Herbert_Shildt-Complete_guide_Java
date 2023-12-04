class ForEach3 {
    public static void main(String[] args){
        int sum = 0;
        int [][] nums = new int[3][3];
        for(int i = 0; i < 3; i++)
            for(int j = 0; j < 3; j++)
                nums[i][j] = (i+1)*(j+2);
        for(int[] x : nums){
            for(int y : x) {
                System.out.println("Значение: " + y);
                sum += y;
            }
        }
        System.out.println("Сумма: " + sum);
    }
}
