import java.util.HashMap;

public class IDPass {

    HashMap<String, String> loginInfo = new HashMap<>();

    IDPass() {
        loginInfo.put("admin","admin");
    }

    protected HashMap getLoginInfo() {
        return loginInfo;
    }
}
