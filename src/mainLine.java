
public class mainLine {
	
	public static void main(String args[]){
		
		Graph<node> g= new Graph<node>();
		node n[]=new node[10];
		
		for(int i=0;i<10;i++)
		{
			n[i]=new node();
			char temp=(char)(i+65);
			n[i].tag=""+temp;
			
			g.addNode(n[i]);
		}
		
		
		g.makeConnection("A","B");
		g.makeConnection("B","C");
		g.makeConnection("C","B");
		
		g.printAllConnections();
		
		
	}

}
