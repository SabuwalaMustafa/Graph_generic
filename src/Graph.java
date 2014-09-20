import java.util.HashMap;

public class Graph<T extends node> {
	
	HashMap<String, NodeList<T>> adjacencyList;
	
	Graph(){
		
	}
	
	public boolean addNode(T N)
	{
	if(!adjacencyList.containsKey(N.tag))	
	{
	NodeList<T> temp=new NodeList<T>();
	temp.identityNode=N;
	adjacencyList.put(N.tag,temp);
	return true;
	}
	else
	return false;	
	}
	
	public void makeConnection()
	{
		
		
	}

}
