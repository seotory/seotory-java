package pattern.prototype;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zion437 on 2015. 10. 18..
 */
public class Users implements Cloneable {
    private List<String> userList;

    public Users() {
        userList = new ArrayList<String>();
    }

    public Users(List<String> list) {
        this.userList = list;
    }

    public void loadData () {
        userList.add("ssw");
        userList.add("bjh");
        userList.add("ysm");
        userList.add("hoj");
    }

    public List<String> getUserList() {
        return userList;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        List<String> temp = new ArrayList<String>();
        for (String s : this.getUserList()) {
            temp.add(s);
        }
        return new Users(temp);
    }
}
