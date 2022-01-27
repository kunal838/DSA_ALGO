class countinginversion{
    static int a[] = {0,3,6,3,5};
    static void getIntCount(int n){
        int count =0;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(a[i]>=a[j]){
                    count++;
                }
                

            }
            
        }
        System.out.println("number of inversion are "+count);

    } 
    public static void main(String[] args){

        getIntCount(a.length);

    }
}