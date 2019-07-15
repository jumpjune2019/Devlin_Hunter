
public class Enum {
	
	enum Lights{
		GREEN("Green",5), RED("Red",3), YELLOW("Yellow",2);
		private String color;
		private int time;
		private Lights(String col,int num) {
			this.color=col;
			this.time=num;
		}
		public String getColor() {
			return color;
		}
		public int getTime() {
			return time;
		}
		
	}
}
