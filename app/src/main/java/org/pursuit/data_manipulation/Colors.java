package org.pursuit.data_manipulation;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class Colors {

    public Colors (){}

    private String color;
    private String category;
    private String type;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    public static class code {

        public int[] rgba = new int[4];
        public String hex;

    }
}
