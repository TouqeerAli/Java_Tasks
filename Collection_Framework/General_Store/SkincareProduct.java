
public class SkincareProduct extends Product {
	private String skinType;
	private String targetConcerns;
	private Boolean fragranceFree;

	public SkincareProduct() {
		super();
		this.skinType = null;
		this.targetConcerns = null;
		this.fragranceFree = false;
	}

	public SkincareProduct(String skinType, String targetConcerns, Boolean fragranceFree,
			String name, String brand, Float price, String type, Boolean eco_friendly) {
		super(name,  brand,  price,  type,  eco_friendly);
		this.skinType = skinType;
		this.targetConcerns = targetConcerns;
		this.fragranceFree = fragranceFree;
	}

	public String getSkinType() {
		return skinType;
	}

	public void setSkinType(String skinType) {
		this.skinType = skinType;
	}

	public String getTargetConcerns() {
		return targetConcerns;
	}

	public void setTargetConcerns(String targetConcerns) {
		this.targetConcerns = targetConcerns;
	}

	public Boolean getFragranceFree() {
		return fragranceFree;
	}

	public void setFragranceFree(Boolean fragranceFree) {
		this.fragranceFree = fragranceFree;
	}

	@Override
	public void print_info() {
		System.out.println("Name : "+super.getName());
		System.out.println("Brand : "+super.getBrand());
		System.out.println("Price : "+super.getPrice());
		System.out.println("Type : "+super.getType());
		System.out.println("Eco-friendly : "+super.getEco_friendly());
		System.out.println("Skin Type : " + this.skinType);
		System.out.println("Target Concerns : " + this.targetConcerns);
		System.out.println("Fragrance Free : " + this.fragranceFree);
	}
}
