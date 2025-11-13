package project1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, List<String>> map = new HashMap<>();

        map.put("Chubb", new ArrayList<>(Arrays.asList("saiteja", "john", "Kiran")));
        map.put("Infosys", new ArrayList<>(Arrays.asList("Amit", "Neha", "Priya")));
        map.put("TCS", new ArrayList<>(Arrays.asList("John", "Arjun", "Sara")));
        map.put("Accenture", new ArrayList<>(Arrays.asList("Manish", "Anita", "Rohit")));
        map.put("Wipro", new ArrayList<>(Arrays.asList("Pooja", "Raj", "Deepak")));

        System.out.println("Existing Company Data:");
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        System.out.println();
        System.out.print("Enter the name of the Company: ");
        String company = sc.next();

        if (!map.containsKey(company)) {
            System.out.println(company + " not found. Adding it to the Map");
            map.put(company, new ArrayList<>());
        }

        List<String> empList = map.get(company);

        System.out.println("\nDo you want to add employees to " + company + "? (yes/no)");
        String choice = sc.next().trim().toLowerCase();

        while (choice.equals("yes")) {
            System.out.print("Enter employee name: ");
            String empName = sc.next();
            empList.add(empName);
            System.out.print("Add another employee? (yes/no): ");
            choice = sc.next().trim().toLowerCase();
        }

        System.out.print("\nEnter the name of the Employee to search: ");
        String searchEmp = sc.next();

        if (empList.contains(searchEmp)) {
            System.out.println(searchEmp + " is working in " + company);
        } else {
            System.out.println(searchEmp + " not found in " + company);
        }

        System.out.println("\nUpdated Company Map:");
        for (String c : map.keySet()) {
            System.out.println(c + " -> " + map.get(c));
        }

        sc.close();
    }
}
