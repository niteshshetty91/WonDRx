package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ConferenceRoom 
{ 
	public static void main(String[] args) throws Exception
	{ 

		//1.Writing Fast Tests Against Enterprise Rails 60min
		Slot s1 =new Slot();
		s1.setTitle("//1.Writing Fast Tests Against Enterprise Rails 60min");
		s1.setTime(60);

		//2.Overdoing it in Python 45min
		Slot s2 =new Slot();
		s2.setTitle("//2.Overdoing it in Python 45min");
		s2.setTime(45);

		//3.Lua for the Masses 30min
		Slot s3 =new Slot();
		s3.setTitle("//3.Lua for the Masses 30min");
		s3.setTime(30);

		//4.Ruby Errors from Mismatched Gem Versions 45min
		Slot s4 =new Slot();
		s4.setTitle("//4.Ruby Errors from Mismatched Gem Versions 45min");
		s4.setTime(45);

		//5.Common Ruby Errors 45min
		Slot s5 =new Slot();
		s5.setTitle("//5.Common Ruby Errors 45min");
		s5.setTime(45);

		//6.Rails for Python Developers 5min
		Slot s6 =new Slot();
		s6.setTitle("//6.Rails for Python Developers 5min");
		s6.setTime(5);
		//7.Communicating Over Distance 60min
		Slot s7 =new Slot();
		s7.setTitle("//7.Communicating Over Distance 60min");
		s7.setTime(60);
		//8.Accounting-Driven Development 45min
		Slot s8 =new Slot();
		s8.setTitle("//8.Accounting-Driven Development 45min");
		s8.setTime(45);
		//9.Woah 30min
		Slot s9 =new Slot();
		s9.setTitle("//9.Woah 30min");
		s9.setTime(30);
		//10.Sit Down and Write 30min
		Slot s10 =new Slot();
		s10.setTitle("//10.Sit Down and Write 30min");
		s10.setTime(30);
		//11.Pair Programming vs Noise 45min
		Slot s11 =new Slot();
		s11.setTitle("//11.Pair Programming vs Noise 45min");
		s11.setTime(45);
		//12.Rails Magic 60min
		Slot s12 =new Slot();
		s12.setTitle("//12.Rails Magic 60min");
		s12.setTime(60);
		//13.Ruby on Rails: Why We Should Move On 60min
		Slot s13 =new Slot();
		s13.setTitle("//13.Ruby on Rails: Why We Should Move On 60min");
		s13.setTime(60);
		//14.Clojure Ate Scala (on my project) 45min
		Slot s14 =new Slot();
		s14.setTitle("//14.Clojure Ate Scala (on my project) 45min");
		s14.setTime(45);
		//15.Programming in the Boondocks of Seattle 30min
		Slot s15 =new Slot();
		s15.setTitle("//15.Programming in the Boondocks of Seattle 30min");
		s15.setTime(30);
		//16.Ruby vs. Clojure for Back-End Development 30min
		Slot s16 =new Slot();
		s16.setTitle("//16.Ruby vs. Clojure for Back-End Development 30min");
		s16.setTime(30);
		//16.Ruby vs. Clojure for Back-End Development 30min
		Slot s17 =new Slot();
		s17.setTitle("//16.Ruby vs. Clojure for Back-End Development 30min");
		s17.setTime(30);
		//18.A World Without HackerNews 30min
		Slot s18 =new Slot();
		s18.setTitle("//18.A World Without HackerNews 30min");
		s18.setTime(30);
		//19.User Interface CSS in Rails Apps 30min
		Slot s19 =new Slot();
		s19.setTitle("//19.User Interface CSS in Rails Apps 30min");
		s19.setTime(30);



		//String str[] = {"A","B","C"}; 


		



		List<Slot> list = new ArrayList<Slot>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);
		list.add(s6);
		list.add(s7);
		list.add(s8);
		list.add(s9);
		list.add(s10);
		list.add(s11);
		list.add(s12);
		list.add(s13);
		list.add(s14);
		list.add(s15);
		list.add(s16);
		list.add(s17);
		list.add(s18);
		list.add(s19);
	

		ArrayList<Slot> inputList = new ArrayList<Slot>();

		ArrayList<ArrayList<Slot>> outputList = new ArrayList<ArrayList<Slot>>();


		for(int i =0;i<list.size();i++) {


			inputList.add(list.get(i));


			permute(inputList, 0, inputList.size()-1,outputList,180);

		}

		for(List<Slot> sl : outputList) {

			System.out.println();

			for(Slot slot:sl) {

				System.out.print(","+slot.getTime());
			}

		}


		//permute(list, 0, list.size()-1); 
	} 


	public void evauateSLots(ArrayList<ArrayList<Slot>> list,int sum) {

		/*
		String key = "";

		for(Map.Entry<String, ArrayList<Slot>> e :hm.entrySet()) {

			if(e.getValue()==null) {
				key = e.getKey();
			}else {
				continue;
			}


		}*/

		for(ArrayList<Slot> al:list) {

			int total=0;

			ArrayList<Slot> alnew = new ArrayList<Slot>();

			for(Slot slot : al) {



				total = total+slot.getTime();

				 
				if(total == sum) {
					alnew.add(slot);
				}

			}
		}

	}


	/** 
	 * permutation function 
	 * @param str string to calculate permutation for 
	 * @param l starting index 
	 * @param r end index 
	 */
	private static void permute(ArrayList<Slot> inputList, int l, int r,ArrayList<ArrayList<Slot>> outputList,int total) throws Exception	{ 


		if (l == r) {

			ArrayList<Slot> newList = new ArrayList<Slot>();

			int curTotal=0;

			for(Slot slot:inputList) {
				//		System.out.print(slot.getTitle()+",");

				Slot slot2 = (Slot) slot.clone();

				newList.add(slot2);
				curTotal=curTotal+slot.getTime();

				if(total == curTotal) {

					System.out.println("Done");

					outputList.add(newList);
					//
					
					for(List<Slot> sl : outputList) {

						System.out.println();

						for(Slot slot3:sl) {

							System.out.print(","+slot3.getTime());
						}

					}				
					//
					return;
					//break;

				}else if (curTotal > total) {

					return;
					//break;
				}

			}

		} 
		else{ 
			for (int i = l; i <= r; i++) 
			{ 
				inputList = swap(inputList,l,i); 
				permute(inputList, l+1, r,outputList,total); 
				inputList = swap(inputList,l,i); 
			} 
		} 
	} 

	/** 
	 * Swap Characters at position 
	 * @param a string value 
	 * @param i position 1 
	 * @param j position 2 
	 * @return swapped string 
	 */
	public static ArrayList<Slot> swap(ArrayList<Slot> list, int i, int j) 
	{ 

		Slot temp =  list.get(i); 
		list.set(i, list.get(j)); 
		list.set(j, temp);

		return list; 
	} 

} 

// This code is contributed by Mihir Joshi 




