package com.dzmsoft.sms.base.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dzmsoft.framework.base.web.mvc.controller.BaseController;
import com.dzmsoft.framework.base.web.mvc.dao.MybatisExample;
import com.dzmsoft.framework.base.web.mvc.pojo.EasyUIPage;
import com.dzmsoft.framework.base.web.mvc.view.BaseResponse;
import com.dzmsoft.framework.base.web.mvc.view.Condition;
import com.dzmsoft.sms.base.dto.SmsHouseholdOrderDto;
import com.dzmsoft.sms.base.pojo.SmsHouseholdOrder;
import com.dzmsoft.sms.base.pojo.udf.SmsHouseholdOrderUdfExample;
import com.dzmsoft.sms.base.service.SmsHouseholdOrderService;
import com.github.miemiedev.mybatis.paginator.domain.PageBounds;
import com.github.miemiedev.mybatis.paginator.domain.PageList;

/**
 * Copyright (C), dzmsoft Co., Ltd
 * @author dzmsoft
 * @dzmsoftgenerated 2016-05-21 14:14:45
 *
 * @version 1.0
 */
@Controller
@RequestMapping("smsHouseholdOrder")
public class SmsHouseholdOrderController extends BaseController{
	@Autowired
	private SmsHouseholdOrderService smsHouseholdOrderService;

	/**
	 * 显示主列表页面
	 * @dzmsoftgenerated 2016-05-21 14:14:45
	 * @return
	 */
	@RequiresPermissions("smsHouseholdOrder:find")
	@RequestMapping(value = "show", method = RequestMethod.GET)
	public String show(){
		return "modules/base/smsHouseholdOrderList";
	}
	
	/**
	 * 主列表中查询
	 * @dzmsoftgenerated 2016-05-21 14:14:45
	 * @return
	 */
	@RequiresPermissions("smsHouseholdOrder:find")
	@RequestMapping(value = "find", method = RequestMethod.POST)
	@ResponseBody
	public Map<String,Object> find(HttpServletRequest request){
		List<Condition> conditions = Condition.buildFromHttpRequest(request);
		EasyUIPage easyUIPage = new EasyUIPage(request);
		MybatisExample mybatisExample = MybatisExample.getInstance();
		SmsHouseholdOrderUdfExample example = (SmsHouseholdOrderUdfExample)mybatisExample.buildExampleByCondition(conditions, easyUIPage, SmsHouseholdOrderUdfExample.class.getName());
		PageList<SmsHouseholdOrderDto> smsHouseholdOrders = smsHouseholdOrderService.selectByExample(example, new PageBounds(easyUIPage.getPage(),
                easyUIPage.getRows()));
		return getEasyUIGrid(smsHouseholdOrders);
	}
	
	/**
	 * 跳转到新增页面
	 * @dzmsoftgenerated 2016-05-21 14:14:45
	 * @return
	 */
	@RequiresPermissions("smsHouseholdOrder:add")
	@RequestMapping(value = "add", method = RequestMethod.GET)
	public String addForm(Model model){
		model.addAttribute("smsHouseholdOrder", new SmsHouseholdOrder());
		model.addAttribute("action", "add");
		return "modules/base/smsHouseholdOrderForm";
	}
	
	/**
	 * 新增记录
	 * @dzmsoftgenerated 2016-05-21 14:14:45
	 * @return
	 */
	@RequiresPermissions("smsHouseholdOrder:add")
	@RequestMapping(value = "add", method = RequestMethod.POST)
	@ResponseBody
	public BaseResponse add(SmsHouseholdOrder smsHouseholdOrder){
		int flag = smsHouseholdOrderService.insertSelective(smsHouseholdOrder);
		BaseResponse baseResponse = flag>0?new BaseResponse(true,"新增成功"):new BaseResponse(false, "新增失败");
		return baseResponse;
	}
	
	/**
	 * 跳转到编辑页面
	 * @dzmsoftgenerated 2016-05-21 14:14:45
	 * @return
	 */
	@RequiresPermissions("smsHouseholdOrder:edit")
	@RequestMapping(value = "edit/{id}", method = RequestMethod.GET)
	public String editForm(@PathVariable("id") String id,Model model){
		SmsHouseholdOrder smsHouseholdOrder = smsHouseholdOrderService.selectByPrimaryKey(id);
		model.addAttribute("smsHouseholdOrder", smsHouseholdOrder);
		model.addAttribute("action", "edit");
		return "modules/base/smsHouseholdOrderForm";
	}
	
	/**
	 * 跳转到查看页面
	 * @dzmsoftgenerated 2016-05-21 14:14:45
	 * @return
	 */
	@RequiresPermissions("smsHouseholdOrder:view")
	@RequestMapping(value = "view/{id}", method = RequestMethod.GET)
	public String viewForm(@PathVariable("id") String id,Model model){
		SmsHouseholdOrder smsHouseholdOrder = smsHouseholdOrderService.selectByPrimaryKey(id);
		model.addAttribute("smsHouseholdOrder", smsHouseholdOrder);
		model.addAttribute("action", "view");
		return "modules/base/smsHouseholdOrderForm";
	}
	
	/**
	 * 编辑记录
	 * @dzmsoftgenerated 2016-05-21 14:14:45
	 * @return
	 */
	@RequiresPermissions("smsHouseholdOrder:edit")
	@RequestMapping(value = "edit", method = RequestMethod.POST)
	@ResponseBody
	public BaseResponse edit(SmsHouseholdOrder smsHouseholdOrder){
		int flag = smsHouseholdOrderService.updateByPrimaryKeySelective(smsHouseholdOrder);
		BaseResponse baseResponse = flag>0?new BaseResponse(true,"编辑成功"):new BaseResponse(false, "编辑失败");
		return baseResponse;
	}
	
	/**
	 * 删除记录
	 * @dzmsoftgenerated 2016-05-21 14:14:45
	 * @return
	 */
	@RequiresPermissions("smsHouseholdOrder:remove")
	@RequestMapping(value = "remove/{id}", method = RequestMethod.GET)
	@ResponseBody
	public BaseResponse remove(@PathVariable("id") String id){
		int flag = smsHouseholdOrderService.deleteByPrimaryKey(id);
		BaseResponse baseResponse = flag>=0?new BaseResponse(true,"删除成功"):new BaseResponse(false, "删除失败");
		return baseResponse;
	}
	
	/**
	 * 派单
	 * @param orderId
	 * @param id
	 * @param cleaners
	 * @return
	 */
	@RequiresPermissions("smsHouseholdOrder:send")
    @RequestMapping(value = "send/{orderId}/{id}", method = RequestMethod.POST)
    @ResponseBody
    public BaseResponse send(@PathVariable String orderId, @PathVariable String id, String cleaner){
        int flag = smsHouseholdOrderService.send(orderId, id, cleaner);
        BaseResponse baseResponse = flag>=0?new BaseResponse(true,"派单成功"):new BaseResponse(false, "派单失败");
        return baseResponse;
    }
}
