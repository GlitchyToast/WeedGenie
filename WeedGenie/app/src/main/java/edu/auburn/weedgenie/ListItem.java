package edu.auburn.weedgenie;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by zachary on 2/5/15.
 * <p/>
 * This is a shell for the information obtained from forecast.io. This will be used in a ListView in MainActivity
 */
public class ListItem implements Serializable {
    private String name;
    private double threshold;
    private double gdd;
    private Date endDate = null;

    public ListItem(String name) {
        this.name = name;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    private double base;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getThreshold() {
        return threshold;
    }

    public void setThreshold(double threshold) {
        this.threshold = threshold;
    }

    public double getGdd() {
        return gdd;
    }

    public void setGdd(double gdd) {
        this.gdd = gdd;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Date getEndDate() {
        return endDate;
    }
}
