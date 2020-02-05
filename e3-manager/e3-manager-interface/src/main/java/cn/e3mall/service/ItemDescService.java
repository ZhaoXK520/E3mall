package cn.e3mall.service;

import cn.e3mall.pojo.TbItemDesc;

public interface ItemDescService {
	TbItemDesc getItemDescByItemId(long ItemId);
	int deleteItemById(long itemId);
}
