package splitwise;

public class ExpenseMetadata {

    private String name;
    private String description;
    private String imageUrl;
    private String notes;

    public ExpenseMetadata(String name, String description, String imageUrl, String notes) {
        this.name = name;
        this.description = description;
        this.imageUrl = imageUrl;
        this.notes = notes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
}
