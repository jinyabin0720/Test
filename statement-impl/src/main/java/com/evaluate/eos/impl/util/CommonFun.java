/**  
 * <p>Title: commonFun.java</p>
 * <p>Description: </p>
 * <p>Copyright: </p>  
 * <p>Company: </p>  
 * @author sunh
 * @date 2019年9月11日  下午4:24:30
 * @version 1.0  
 */  
package com.evaluate.eos.impl.util;

import com.baomidou.mybatisplus.plugins.Page;

/**  
 * <p>Title: commonFun</p>  
 * <p>Description: 公用方法</p>  
 * @author sunh
 * @date 2019年9月11日  下午4:24:30
 */
public class CommonFun {
	
	/**
	 * <p>Title: getPage</p>
	 * <p> Description: 获取分页组件 </p>
	 * @param <T>
	 * @param page
	 * @param pageSize
	 * @return
	 */
	public static <T> Page<T> getPage(Integer page, Integer pageSize) {

		if (page == null || pageSize == null || page < 1 || pageSize < 1)
			return new Page<T>(0, Integer.MAX_VALUE);

		return new Page<T>(page, pageSize);
	}
	
}
