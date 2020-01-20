package com.company;

public class car {
    private String model;


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        String validModel = model.toLowerCase();
        if(validModel.equals("porshe") || validModel.equals("commodore")) {
            this.model = model;
        }else {
            this.model = "Unknown";
        }
    }


}
