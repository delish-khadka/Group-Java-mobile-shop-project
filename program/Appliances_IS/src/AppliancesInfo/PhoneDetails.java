/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AppliancesInfo;

/**
 *
 * @author Delish Khadka
 */
public class PhoneDetails {
    private String modelNumber,accessoryName,category,recommendation,quality;
    private double price;

    public PhoneDetails(String modelNumber,String accessoryName, String category, String recommendation, String quality, double price) {
        this.modelNumber = modelNumber;
        this.accessoryName = accessoryName;
        this.category = category;
        this.recommendation = recommendation;
        this.quality = quality;
        this.price = price;
        
}

    public String getModelNumber() {
        return modelNumber;
    }
    
    public String getAccessoryName() {
        return accessoryName;
    }

    public String getCategory() {
        return category;
    }

     public String getRecommendation() {
        return recommendation;
    }
    
    public String getQuality() {
        return quality;
    }
 
    public double getPrice() {
        return price;
    }

}
