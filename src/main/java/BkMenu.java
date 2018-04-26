
import javax.persistence.Entity;

@Entity
public class BkMenu {

    private String apCode;
    private String apName;
    private String apOrder;
    private String parentCode;
    private String kind;
    private String flag;
    private String cmt;
    private String createUser;
    private String createDate;
    private String updateUser;
    private String updateDate;
    
    
	public String getApCode() {
		return apCode;
	}
	public void setApCode(String apCode) {
		this.apCode = apCode;
	}
	public String getApName() {
		return apName;
	}
	public void setApName(String apName) {
		this.apName = apName;
	}
	public String getApOrder() {
		return apOrder;
	}
	public void setApOrder(String apOrder) {
		this.apOrder = apOrder;
	}
	public String getParentCode() {
		return parentCode;
	}
	public void setParentCode(String parentCode) {
		this.parentCode = parentCode;
	}
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public String getFlag() {
		return flag;
	}
	public void setFlag(String flag) {
		this.flag = flag;
	}
	public String getCmt() {
		return cmt;
	}
	public void setCmt(String cmt) {
		this.cmt = cmt;
	}
	public String getCreateUser() {
		return createUser;
	}
	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}
	public String getCreateDate() {
		return createDate;
	}
	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}
	public String getUpdateUser() {
		return updateUser;
	}
	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}
	public String getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(String updateDate) {
		this.updateDate = updateDate;
	}
	@Override
	public String toString() {
		return "BkMenu [apCode=" + apCode + ", apName=" + apName + ", apOrder=" + apOrder + ", parentCode=" + parentCode
				+ ", kind=" + kind + ", flag=" + flag + ", cmt=" + cmt + ", createUser=" + createUser + ", createDate="
				+ createDate + ", updateUser=" + updateUser + ", updateDate=" + updateDate + "]";
	}
    

}