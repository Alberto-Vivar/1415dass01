package lanSimulation.internals;

public class Printer extends Node {

	public Printer(String string) {
		super(Node.PRINTER, string);
	}
	
	public void switchStatement(StringBuffer buf){
		buf.append("Printer ");
		buf.append(name_);
		buf.append(" [Printer]");
	}

}
