package pojo;


import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class LinksPojo {
    private String href;
    private String rel;
    private String type;
    private String title;
    private String description;

    public LinksPojo(String href, String rel, String type, String title, String description) {
        this.href = href;
        this.rel = rel;
        this.type = type;
        this.title = title;
        this.description = description;
    }

    public LinksPojo() {
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public String getRel() {
        return rel;
    }

    public void setRel(String rel) {
        this.rel = rel;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
