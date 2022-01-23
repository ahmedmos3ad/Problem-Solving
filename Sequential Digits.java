class Solution {
    //https://leetcode.com/problems/sequential-digits/
	public List<Integer> sequentialDigits(int low, int high) {
        ArrayList<Integer> list=new ArrayList<Integer>();
        Integer number;
        
        for (int i=0;i<10;i++)
        {
            number= i+1;
            for (int j=number+1;j<10;j++)
            {
                number=number*10+j;
                if (number<=high && number>=low)
                    list.add(number);
            }
        }
        Collections.sort(list);
       return list; 
    }
}