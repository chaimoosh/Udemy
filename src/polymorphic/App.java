package polymorphic;

public class App {
	public static void main(String[] args) {
		Plant plant1 = new Plant();
		Tree tree1 = new Tree();
		
		Plant plant2 = tree1;
		
		plant2.grow();
		tree1.shedLeaves();
	}
}
