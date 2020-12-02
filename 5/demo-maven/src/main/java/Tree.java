public class Tree {
    int n;                      //  Количество циклов роста
    int height= 1;              //  высота дерева (высаживается высотой 1 метр)
    int growthSpring = 2;       //  Рост дерева весной  (удваивается)
    int growthSummer= 1;        //  Рост дерева летом (прибавляет 1 метр)

    public int getTreeHeight(int n) {
        for (int i = 0; i<n;i++){
            if ((i%2)==0){
                height *= growthSpring;
            }
            else{
                height += growthSummer;
            }
        }
        return height;
    }


}
