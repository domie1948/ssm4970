package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.ZhunkaojiluEntity;
import com.entity.view.ZhunkaojiluView;

import com.service.ZhunkaojiluService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 准考记录
 * 后端接口
 * @author 
 * @email 
 * @date 2021-04-06 18:21:23
 */
@RestController
@RequestMapping("/zhunkaojilu")
public class ZhunkaojiluController {
    @Autowired
    private ZhunkaojiluService zhunkaojiluService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ZhunkaojiluEntity zhunkaojilu, 
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("xuesheng")) {
			zhunkaojilu.setXuehao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<ZhunkaojiluEntity> ew = new EntityWrapper<ZhunkaojiluEntity>();
    	PageUtils page = zhunkaojiluService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, zhunkaojilu), params), params));
		request.setAttribute("data", page);
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ZhunkaojiluEntity zhunkaojilu, HttpServletRequest request){
        EntityWrapper<ZhunkaojiluEntity> ew = new EntityWrapper<ZhunkaojiluEntity>();
    	PageUtils page = zhunkaojiluService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, zhunkaojilu), params), params));
		request.setAttribute("data", page);
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ZhunkaojiluEntity zhunkaojilu){
       	EntityWrapper<ZhunkaojiluEntity> ew = new EntityWrapper<ZhunkaojiluEntity>();
      	ew.allEq(MPUtil.allEQMapPre( zhunkaojilu, "zhunkaojilu")); 
        return R.ok().put("data", zhunkaojiluService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ZhunkaojiluEntity zhunkaojilu){
        EntityWrapper< ZhunkaojiluEntity> ew = new EntityWrapper< ZhunkaojiluEntity>();
 		ew.allEq(MPUtil.allEQMapPre( zhunkaojilu, "zhunkaojilu")); 
		ZhunkaojiluView zhunkaojiluView =  zhunkaojiluService.selectView(ew);
		return R.ok("查询准考记录成功").put("data", zhunkaojiluView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ZhunkaojiluEntity zhunkaojilu = zhunkaojiluService.selectById(id);
        return R.ok().put("data", zhunkaojilu);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ZhunkaojiluEntity zhunkaojilu = zhunkaojiluService.selectById(id);
        return R.ok().put("data", zhunkaojilu);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ZhunkaojiluEntity zhunkaojilu, HttpServletRequest request){
    	zhunkaojilu.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(zhunkaojilu);

        zhunkaojiluService.insert(zhunkaojilu);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ZhunkaojiluEntity zhunkaojilu, HttpServletRequest request){
    	zhunkaojilu.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(zhunkaojilu);

        zhunkaojiluService.insert(zhunkaojilu);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody ZhunkaojiluEntity zhunkaojilu, HttpServletRequest request){
        //ValidatorUtils.validateEntity(zhunkaojilu);
        zhunkaojiluService.updateById(zhunkaojilu);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        zhunkaojiluService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<ZhunkaojiluEntity> wrapper = new EntityWrapper<ZhunkaojiluEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("xuesheng")) {
			wrapper.eq("xuehao", (String)request.getSession().getAttribute("username"));
		}

		int count = zhunkaojiluService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	
	


}
