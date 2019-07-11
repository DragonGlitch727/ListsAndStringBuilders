import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Application {

	public static void main(String[] args) {
		
		List<String>employeeNames = new ArrayList<String>();
		employeeNames.add("David");
		employeeNames.add("Cherrish");
		employeeNames.add("Rhonda");
		employeeNames.add("Natalya");
		employeeNames.add("Nick");
		
		Set<Integer>ids = new HashSet<Integer>();
		ids.add(10727);
		ids.add(10131);
		ids.add(10521);
		ids.add(10721);
		ids.add(10611);
				
		Map<Integer, String>employeeMap = new HashMap<Integer, String>();

		int i = 0;
		for (Integer id : ids) {
			employeeMap.put(id, employeeNames.get(i++));
		}
		
		for (Integer key : employeeMap.keySet()) {
			System.out.println(key + " " + employeeMap.get(key));
		}
		
		StringBuilder idsBuilder = new StringBuilder();
		
		for (Integer id : ids) {
			idsBuilder.append(id + "-");	
		}
		System.out.println(idsBuilder.toString());
	
		StringBuilder namesBuilder = new StringBuilder();
		
		for (String name : employeeNames) {
			namesBuilder.append(name + " ");
		}
		System.out.println(namesBuilder.toString());
	}

}
