package restAssuredAPI;

import java.util.ArrayList;
import java.util.List;

import files.Payload;
import io.restassured.path.json.JsonPath;

public class ComplexJsonParse {
	
public static void main(String[] args) {
	
	JsonPath js = new JsonPath(Payload.CourseResponse());
	
	int count = js.getInt("courses.size()");
	System.out.println(count);
	int TotalAmount = js.getInt("dashboard.purchaseAmount");
	System.out.println(TotalAmount);
	String FirstCourse = js.get("courses[0].title");
	System.out.println(FirstCourse);
	
	//List<String> AllCourses = new ArrayList<String>();
	for(int i=0;i<count;i++) {
		
		String str = js.get("courses["+i+"].title");
		System.out.println(str);
		int prices = js.getInt("courses["+i+"].price");
		System.out.println(prices);
	}
}

	
	

}
