package com.urielby.actividad7;

public class Product {
    private String name;
    private String description;
    private String imageUrl;
    private String webUrl;

    public Product(String name, String description, String imageUrl, String webUrl) {
        this.name = name;
        this.description = description;
        this.imageUrl = imageUrl;
        this.webUrl = webUrl;
    }

    // Getters
    public String getName() { return name; }
    public String getDescription() { return description; }
    public String getImageUrl() { return imageUrl; }
    public String getWebUrl() { return webUrl; }

    // Setters
    public void setName(String name) { this.name = name; }
    public void setDescription(String description) { this.description = description; }
    public void setImageUrl(String imageUrl) { this.imageUrl = imageUrl; }
    public void setWebUrl(String webUrl) { this.webUrl = webUrl; }
}