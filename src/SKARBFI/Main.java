package SKARBFI;

import java.util.*;
import java.lang.*;

public class Main {

    public static void main(String[] args) {
        int dataSetsNum, guidesNum, direction, step;
        Scanner scanner = new Scanner(System.in);
        dataSetsNum = scanner.nextInt();
        List<String> result = new ArrayList<String>();
       
           	for (int i = 0; i < dataSetsNum; i++) {
        		guidesNum = scanner.nextInt();
        		int vertical = 0, horizontal = 0;
        		        		
        			for (int j = 0; j < guidesNum; j++) {            	
        				direction = scanner.nextInt();
        				step = scanner.nextInt();
        				switch (direction) {
        				case 0:
        					vertical += step;
        					break;
        				case 1:
        					vertical -= step;
        					break;
        				case 2:
        					horizontal -= step;
        					break;
        				case 3:
        					horizontal += step;
        					break;
        				}
        			}             	
        		
        		
        		if (vertical == 0 && horizontal == 0) {
                result.add("studnia");
        		}
        		if (vertical != 0) {
        			result.add(vertical > 0 ? "0 " + vertical : "1 " + Math.abs(vertical));
        		}
        		if (horizontal != 0) {
        			result.add(horizontal > 0 ? "3 " + horizontal : "2 " + Math.abs(horizontal));
        		}
        	} 
        
        	for (int i=0; i < result.size(); i++) {
            System.out.println(result.get(i));
        	}
     }
}

