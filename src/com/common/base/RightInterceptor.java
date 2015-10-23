package com.common.base;

import java.util.Map;

import com.common.bean.User;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

/**
 * @author 贺挺
 * @deprecated 权限拦截器
 */

@SuppressWarnings("serial")
public class RightInterceptor extends AbstractInterceptor {

	@Override
	public String intercept(ActionInvocation ai) throws Exception {
		
		Map<String, Object> session = ai.getInvocationContext().getSession();
		Object obj=session.get("user");
		IBaseObject bb=(IBaseObject)ai.getAction();
		if(obj!=null)
		{
			bb.setUser((User)obj);
			return ai.invoke();
		}else
		{
			bb.setMsg("登录超时，请成功登录系统！");
			return "error";
		}
		
		
		
		
		
	}

}
