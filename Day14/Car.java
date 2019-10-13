package Collections;

public class Car {

		String carid;
		String carName;
		public String getCarid() {
			return carid;
		}
		public void setcarid(String carid) {
		this.carid = carid;
		}
		public String getcarName() {
		return carName;
		}
		public void setCarName(String carName) {
		this.carName = carName;
		}
		public Car(String carid, String carName) {
		this.carid = carid;
		this.carName = carName;
		}

		@Override
		public String toString() {

		return getCarid()+" "+getcarName();
		}

		}
