package pattern.prototype;

/**
 * Created by zion437 on 2015. 10. 18..
 */
public class main {
    public static void main(String[] args) throws Exception {
        Users originUsers = new Users();
        originUsers.loadData();

        Users cloneUsers = (Users)originUsers.clone();
    }
}
