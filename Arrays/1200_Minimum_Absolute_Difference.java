class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> arrlist = new ArrayList<>();
        Arrays.sort(arr);
        int arrDiff[] = new int[arr.length-1];
        for(int i=0;i<arr.length-1;i++){
            arrDiff[i] = arr[i+1]-arr[i];
        }
        int min=arrDiff[0];
        for(int i=1;i<arrDiff.length;i++){
            if(arrDiff[i]<min)
                min = arrDiff[i];
        }
        for(int i=0;i<arr.length-1;i++){
            if(arrDiff[i]==min){
                List<Integer> arrlistMinDiff = new ArrayList<Integer>();
                arrlistMinDiff.add(arr[i]);
                arrlistMinDiff.add(arr[i+1]);
                arrlist.add(arrlistMinDiff);
            }
        }
        return arrlist;
    }
}