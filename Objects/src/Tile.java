public class Tile {
	char letter;
	int value;
	public Tile(char letter, int value){
		this.letter=letter;
		this.value=value;
	}
	public static void printTile(Tile t){
		System.out.println("the tile of "+ t.letter+ " score is " + t.value);
	}
	public static void testTile(){
		Tile test= new Tile('z',10);
		printTile(test);
	}
	public static void main(String args[]){
		testTile();
	}
}
