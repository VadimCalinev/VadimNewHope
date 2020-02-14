package getSetHomework;

public class Book implements ThingInteface
{
    private Integer pages;
    private String title;
    private String authorName;
    private Integer publishingYear;
    @Override
    public void setName(String name) {

    }

    @Override
    public String getName() {
        return null;
    }

    public Integer getPages() {
        return pages;
    }

    public void setPages(Integer pages) {
        this.pages = pages;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public Integer getPublishingYear() {
        return publishingYear;
    }

    public void setPublishingYear(Integer publishingYear) {
        this.publishingYear = publishingYear;
    }

    public Book() {
    }

    public Book(Integer pages, String title, String authorName, Integer publishingYear) {
        this.pages = pages;
        this.title = title;
        this.authorName = authorName;
        this.publishingYear = publishingYear;
    }

    @Override
    public String toString() {
        return "Book{" +
                "pages=" + pages +
                ", title='" + title + '\'' +
                ", authorName='" + authorName + '\'' +
                ", publishingYear=" + publishingYear +
                '}';
    }
}
