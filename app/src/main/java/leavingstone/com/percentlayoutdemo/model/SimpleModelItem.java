package leavingstone.com.percentlayoutdemo.model;

/**
 * Created by Jemo on 3/4/16.
 */
public class SimpleModelItem {
    private String name;
    private int resId;

    public SimpleModelItem(String name, int resId) {
        this.name = name;
        this.resId = resId;
    }

    public String getName() {
        return name;
    }

    public int getResId() {
        return resId;
    }
}
