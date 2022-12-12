package pojo;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)

public class ResponsePojo {
    private String title;
    private String description;
    private LinksPojo [] links;


    public ResponsePojo(String title, String description, LinksPojo [] links) {
        this.title = title;
        this.description = description;
        this.links = links;
    }

    public ResponsePojo() {
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

    public LinksPojo [] getLinks() {
        return links;
    }

    public void setLinks(LinksPojo [] links) {
        this.links = links;
    }
}
