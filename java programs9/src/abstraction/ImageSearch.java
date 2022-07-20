package abstraction;

public class ImageSearch extends Google {

	@Override
	public void search() {
		System.out.println("Image search results");

	}

	public static void main(String[] args) {
		ImageSearch objImage=new ImageSearch();
				objImage.search();

	}

	@Override
	public int print(int num1, int num2) {
		
		return 0;
	}

}
