/**
118. Pascal's Triangle
Given a non-negative integer numRows, generate the first numRows of Pascal's triangle.
*/


class Pascal {
    public List<List<Integer>> generate(int numRows) {
		List<List<Integer>> pas = new ArrayList<List<Integer>>();
	
		for(int i = 0; i< numRows; i++) {
			List<Integer> list = new ArrayList<Integer>();
			for(int j = 0; j<= i; j++) {
				if(j == 0 || j == i) {
					list.add(1);
				}else {
					int num1 = pas.get(i-1).get(j-1);
					int num2 = pas.get(i-1).get(j);
					int val =  num1 + num2;
					list.add(val);
				}
			}
			pas.add(list);
		}
		return pas;
    }
}