
public class MasterNode {

	public String nodeTag = "Master Node test for branch one more";
	
	public void nodeInfo() {		
		System.out.println("Node num = " + nodeTag);
	}
	
	public static void main(String[] args) {
		SlaverNode sn = new SlaverNode();
		System.out.println("Node info = " + sn.nodeTag);
	}

}
