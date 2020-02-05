package cn.e3mall.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.e3mall.common.pojo.EasyUIDataGridResult;
import cn.e3mall.common.utils.E3Result;
import cn.e3mall.pojo.TbItem;
import cn.e3mall.pojo.TbItemDesc;
import cn.e3mall.pojo.TbItemDescExample;
import cn.e3mall.service.ItemDescService;
import cn.e3mall.service.ItemService;

/**
 * 商品管理Controller
 * <p>Title: ItemController</p>
 * <p>Description: </p>
 * <p>Company: www.itcast.cn</p> 
 * @version 1.0
 */
@Controller
public class ItemController {

	@Autowired
	private ItemService itemService;
	@Autowired
	private ItemDescService itemDescService;
	
	@RequestMapping("/item/{itemId}")
	@ResponseBody
	public TbItem getItemById(@PathVariable Long itemId) {
		TbItem tbItem = itemService.getItemById(itemId);
		return tbItem;
	}
	
	@RequestMapping("/item/list")
	@ResponseBody
	public EasyUIDataGridResult getItemList(Integer page,Integer rows){
		//调查服务查询商品列表
		EasyUIDataGridResult result = itemService.getItemList(page, rows);
		return result;
	}
	//新增
	@RequestMapping(value = "/item/save",method = RequestMethod.POST)
	@ResponseBody
	public E3Result addItem(TbItem item,String desc){
		E3Result result = itemService.addItem(item, desc);
		return result;
	}
	//更新
	@RequestMapping(value = "/rest/item/update",method = RequestMethod.POST)
	@ResponseBody
	public E3Result updateItem(TbItem item,String desc){
		E3Result result = itemService.updateItem(item, desc);
		return result;
	}
	
	//删除
	@RequestMapping(value = "/rest/item/delete",method = RequestMethod.POST)
	@ResponseBody
	public E3Result deleteItem(long[] ids){
		List<Long> idList = new ArrayList<Long>();
		for (long l : ids) {
			idList.add(l);
		}
		E3Result result = itemService.deleteItemById(idList);
		return result;
	}
	//下架
	@RequestMapping(value = "/rest/item/instock",method = RequestMethod.POST)
	@ResponseBody
	public E3Result instockItem(long[] ids){
		List<Long> idList = new ArrayList<Long>();
		for (long l : ids) {
			idList.add(l);
		}
		E3Result result = itemService.instockItemById(idList);
		return result;
	}
	//上架
	@RequestMapping(value = "/rest/item/reshelf",method = RequestMethod.POST)
	@ResponseBody
	public E3Result reshelfItem(long[] ids){
		List<Long> idList = new ArrayList<Long>();
		for (long l : ids) {
			idList.add(l);
		}
		E3Result result = itemService.reshelfItemById(idList);
		return result;
	}
		
	@RequestMapping(value = "/rest/item/query/item/desc/{itemId}")
	@ResponseBody
	public E3Result getDesc(@PathVariable long itemId){
		TbItemDesc desc = itemDescService.getItemDescByItemId(itemId);
		return E3Result.ok(desc);
	}
	
	@RequestMapping(value = "/rest/item/param/item/query/{itemId}")
	@ResponseBody
	public E3Result getparam(@PathVariable long itemId){
		return null;
	}
}
