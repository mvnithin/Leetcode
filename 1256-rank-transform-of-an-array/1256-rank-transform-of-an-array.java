class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] arr1=Arrays.copyOf(arr,arr.length);
        Arrays.sort(arr1);//10 20 30 40
        int v=1;
        HashMap<Integer,Integer>ls=new HashMap<>();
        System.out.print(Arrays.toString(arr1));
        for(int i=0;i<arr1.length;i++){
            boolean va1=ls.containsKey(arr1[i]);
            System.out.println(va1+" "+arr1[i]);
            System.out.println(ls);
            if(va1){
                continue;
            }
            else{
                ls.put(arr1[i],v);//10-1 20-2 30-3 40-4
                v++;
            }
        }
        System.out.print(ls);
        int[] res=new int[arr.length];
        for(int i=0;i<arr.length;i++){
           int value=ls.get(arr[i]);
            res[i]=value;
        }
        return res;
    }
}