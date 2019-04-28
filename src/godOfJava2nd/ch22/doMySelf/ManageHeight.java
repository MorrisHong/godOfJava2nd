package godOfJava2nd.ch22.doMySelf;

import java.util.ArrayList;

public class ManageHeight {
	ArrayList<ArrayList<Integer>> gradeHeights = new ArrayList<>();
	
	public static void main(String[] args) {
		ManageHeight sample = new ManageHeight();
		sample.setData();
		
		for(int i = 0; i < sample.gradeHeights.size(); i++) {
			int classNo = i+1;
//			sample.printHeight(classNo);
			sample.printAverage(classNo);
		}
	}
	public void printHeight(int classNo) {
		System.out.println("Class No. "+classNo);
		
		ArrayList<Integer> tmp = gradeHeights.get(classNo-1);
		for(int num : tmp) {
			System.out.println(num);
		}
	}
	public void printAverage(int classNo) {
		double avg = 0.0;
		int sum = 0;
		ArrayList<Integer> tmp = gradeHeights.get(classNo-1);
		for(int i : tmp) {
			sum += i;
		}
		avg = (double)sum / tmp.size();
		System.out.println("class no. "+classNo);
		System.out.println("평균 : "+avg);
	}
	public void setData() {
		ArrayList<Integer>[] list = new ArrayList[5];
		for(int loop = 0; loop < list.length; loop++) {
			list[loop] = new ArrayList<>();
		}
		list[0].add(170);
		list[0].add(180);
		list[0].add(173);
		list[0].add(175);
		list[0].add(177);
		gradeHeights.add(list[0]);

		
		list[1].add(160);
		list[1].add(165);
		list[1].add(167);
		list[1].add(186);
		gradeHeights.add(list[1]);
		
		
		list[2].add(158);
		list[2].add(177);
		list[2].add(187);
		list[2].add(176);
		gradeHeights.add(list[2]);
		
		list[3].add(173);
		list[3].add(182);
		list[3].add(181);
		gradeHeights.add(list[3]);
		
		list[4].add(170);
		list[4].add(180);
		list[4].add(165);
		list[4].add(177);
		list[4].add(172);
		gradeHeights.add(list[4]);
		
		
	}
}
