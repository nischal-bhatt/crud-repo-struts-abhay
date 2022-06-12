package action;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class LogoutAction extends ActionSupport{

	 public String execute()
	 {
		 System.out.println("here now");
		 ServletActionContext.getRequest().getSession().invalidate();
		 return "input";
	 }
}
