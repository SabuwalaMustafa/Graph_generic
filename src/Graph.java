import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Graph<T extends node> {
	
	HashMap<String, NodeList<T>> adjacencyList;
	
	Graph(){
		adjacencyList= new HashMap<String, NodeList<T>>();
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
	
	public boolean makeConnection(String tag1,String tag2 )
	{	
		
		return	adjacencyList.get(tag1).connect(adjacencyList.get(tag2).identityNode);	
	}
	
	public boolean deleteConnection(String tag1,String tag2)
	{
		return adjacencyList.get(tag1).delete(adjacencyList.get(tag2).identityNode);
	}
	
	public boolean hasConnection(String tag1,String tag2)
	{
		return adjacencyList.get(tag1).isConnected(adjacencyList.get(tag2).identityNode);
	}
	
	
	
	public void printAllConnections()
	{
		Set<String> keyset=adjacencyList.keySet();
		Iterator<String> keyIterator=keyset.iterator();
		
		for(int i=0;i<adjacencyList.size();i++)
		{
		
			adjacencyList.get(keyIterator.next()).printNodeINFO();
			
		}
		
	}
}
