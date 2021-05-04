
public class Instructor extends User{
	
	String UzmanlikAlani;
	String profilePhotoUrl;
	
	
	public Instructor() {
		
	}
	
	public Instructor(String uzmanlikAlani, String profilePhotoUrl) {
		super();
		UzmanlikAlani = uzmanlikAlani;
		this.profilePhotoUrl = profilePhotoUrl;
	}
}
