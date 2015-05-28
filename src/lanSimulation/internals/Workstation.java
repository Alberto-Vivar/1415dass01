package lanSimulation.internals;

public class Workstation extends Node {

	public Workstation(String string) {
		super(Node.WORKSTATION,string);
	}
	
	public void switchStatement(StringBuffer buf){
		buf.append("Workstation ");
		buf.append(name_);
		buf.append(" [Workstation]");
	}

}
