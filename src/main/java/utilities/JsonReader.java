package utilities;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import java.io.FileReader;
import java.io.IOException;
public class JsonReader
{
 public static Object[][] getJSONData(String filePath , String jsonData , int jsonAttributes) throws IOException , ParseException
 {
     Object object = new JSONParser().parse(new FileReader(filePath));
     JSONObject jsonObject = (JSONObject) object;
     JSONArray jsonArray = (JSONArray) jsonObject.get(jsonData);
     Object [][]arr = new String[jsonArray.size()][jsonAttributes];
     for (int i=0 ; i<jsonArray.size() ; i++)
     {
         JSONObject obj1 = (JSONObject) jsonArray.get(i);
         arr[i][0] = String.valueOf(obj1.get("TaskName"));
         arr[i][1] = String.valueOf(obj1.get("TaskDescription"));
     }
     return arr;
 }


}
