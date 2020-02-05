package cn.e3mall.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.e3mall.common.pojo.EasyUIDataGridResult;
import cn.e3mall.common.utils.E3Result;
import cn.e3mall.content.service.ContentService;
import cn.e3mall.pojo.TbContent;

/**
 * 内容管理Controller
 * @author ZXK
 *
 */
@Controller
public class ContentController {
	@Autowired
	private ContentService contentServcie;
	
	@RequestMapping(value="/content/save",method=RequestMethod.POST)
	@ResponseBody
	public E3Result addContent(TbContent content){
		//调用服务把内容数据保存到数据库
		E3Result e3Result = contentServcie.addContent(content);
		return e3Result;
	}
	
	@RequestMapping(value="/content/query/list")
	@ResponseBody
	public EasyUIDataGridResult getList(long categoryId, int page, int rows){
		EasyUIDataGridResult easyUIDataGridResult = contentServcie.getContentList(categoryId,page,rows);
		return easyUIDataGridResult;
	}
	
	@RequestMapping(value="/rest/content/edit")
	@ResponseBody
	public E3Result editContent(TbContent content){
		E3Result e3Result = contentServcie.editContent(content);
		return e3Result;
	}
	
	@RequestMapping(value="/content/delete")
	@ResponseBody
	public E3Result deleteContent(long[] ids){
		List<Long> idList = new ArrayList<Long>();
		for (long l : ids) {
			idList.add(l);
		}
		E3Result e3Result = contentServcie.deleteContent(idList);
		return e3Result;
	}
	
}
