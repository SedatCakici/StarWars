package deHsMannheimSS17Tpe;

public class R2D2 extends Robot {

	public R2D2(String name) {
		super(name);
		this.id = (int) ((Math.random() * 100000) - 1);
	}

	@Override
	public String speak(int[] zahlen) throws IllegalStateException, MachineException {
		String s = "";
		for (int i = 0; i < zahlen.length; i++) {
			if (zahlen[i] == 42) {
				throw new RobotMacigValueException(name);
			}
			s = s + zahlen[i] + ", ";
		}
		return s;
	}

	@Override
	public String think(int[] zahlen) throws IllegalStateException, MachineException {
		if (status == false) {
			return "";
		}
		String s = "";
		checked(zahlen);
		for (int i = 1; i < zahlen.length; i++) {
			for (int j = 0; j < zahlen.length - i; j++) {
				if (zahlen[j] > zahlen[j + 1]) {
					int temp = zahlen[j];
					zahlen[j] = zahlen[j + 1];
					zahlen[j + 1] = temp;
				}
			}
		}
		for (int i1 = 0; i1 < zahlen.length; i1++) {
			s = s + zahlen[i1] + ", ";
		}
		return s;
	}

	public void checked(int zahlen[]) throws RobotMacigValueException {
		for (int i = 0; i < zahlen.length; i++) {
			if (zahlen[i] == 42) {
				throw new RobotMacigValueException(name);
			}
		}
	}

}
