package cn.e3mall.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.e3mall.mapper.TbItemDescMapper;
import cn.e3mall.pojo.TbItemDesc;
import cn.e3mall.pojo.TbItemDescExample;
import cn.e3mall.pojo.TbItemDescExample.Criteria;
import cn.e3mall.service.ItemDescService;

@Service
public class ItemDescServiceImpl implements ItemDescService {

	@Autowired
	private TbItemDescMapper itemDescMapper;
	@Override
	public TbItemDesc getItemDescByItemId(long itemId) {
		//根据主键查询
		TbItemDescExample example = new TbItemDescExample();
		Criteria criteria = example.createCriteria();
		//设置查询条件
		criteria.andItemIdEqualTo(itemId);
		//执行查询
		List<TbItemDesc> list = itemDescMapper.selectByExampleWithBLOBs(example);
		if (list != null && list.size() > 0) {
			return list.get(0);
		}
		return null;
	}
	@Override
	public int deleteItemById(long itemId) {
		TbItemDescExample example = new TbItemDescExample();
		Criteria criteria = example.createCriteria();
		criteria.andItemIdEqualTo(itemId);
		return 0;
	}

}
