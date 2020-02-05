package cn.e3mall.service;

import java.util.List;

import cn.e3mall.common.pojo.EasyUIDataGridResult;
import cn.e3mall.common.utils.E3Result;
import cn.e3mall.pojo.TbItem;
import cn.e3mall.pojo.TbItemDesc;

public interface ItemService {

	TbItem getItemById(long itemId);
	EasyUIDataGridResult getItemList(int page,int rows);
	E3Result addItem(TbItem item,String desc);
	E3Result updateItem(TbItem item,String desc);
	E3Result deleteItemById(List ids);
	//下架
	E3Result instockItemById(List ids);
	E3Result reshelfItemById(List ids);
	TbItemDesc getItemDescById(long itemId);
}
