/**
 * Created on 2018/8/11.
 */
package jetcache.samples;

import java.io.Serializable;

/**
 * @author <a href="mailto:areyouok@gmail.com">huangli</a>
 */
public class User implements Serializable {
    private static final long serialVersionUID = -5157877924507849953L;
    private long userId;
    private String userName;
    private String no;

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
