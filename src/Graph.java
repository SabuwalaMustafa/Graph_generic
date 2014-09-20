import java.util.ArrayList;
import java.util.HashMap;


public class Graph<T> {
	
	HashMap<String, ArrayList<node>> adjacencyList;
	
	Graph(){
		
	}
	
	public boolean addNode(node N)
	{
	ArrayList<node> temp=new ArrayList<node>();
	
	adjacencyList.put(N.tag,temp);
		
	}

}
