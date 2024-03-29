package techo.apps.isi.uca.com.android_aps.models;

import io.realm.RealmObject;

/**
 * Created by macyarin on 10/4/18.
 */

public class CETypeModel extends RealmObject {
    private int id;
    private String name;
    private boolean approved;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isApproved() {
        return approved;
    }

    public void setApproved(boolean approved) {
        this.approved = approved;
    }
}
