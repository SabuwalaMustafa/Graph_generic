import java.util.ArrayList;


public class NodeList<T extends node> {
	
	T identityNode;
	ArrayList<T> adjacent;
	NodeList()
	{
		adjacent=new ArrayList<T>();
	}
	
	public boolean connect(T n)
	{
		if(adjacent.contains(n))
		return false;
		
		adjacent.add(n);
		return true;
	}
	
	public boolean delete(T n)
	{
		if(adjacent.contains(n))
		{	
			adjacent.remove(n);
			return true;
		}
		
		return false;
	}
	
	
	public boolean isConnected(T n)
	{
		 return adjacent.contains(n);
	}
	
	
	public void printNodeINFO()
	{
		System.out.print("Node "+identityNode.tag+" connections:");
		for(int i=0;i<adjacent.size();i++)
		{
			System.out.print(" "+adjacent.get(0).tag);
		}
		System.out.println();
	}
	

}
