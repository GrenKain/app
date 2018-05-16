package info.fandroid.example.augmentedreality;

// здесь просто набор переменных: имя и координаты, а также геттеры для них.
public class Pikachu {
	private String mName;
	private double mLatitude;
	private double mLongitude;
	
	public Pikachu(String newName,
				   double newLatitude, double newLongitude) {
		this.mName = newName;
        this.mLatitude = newLatitude;
        this.mLongitude = newLongitude;
	}
	

	public String getPoiName() {
		return mName;
	}
	public double getPoiLatitude() {
		return mLatitude;
	}
	public double getPoiLongitude() {
		return mLongitude;
	}
}
