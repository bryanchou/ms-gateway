package cn.ms.gateway.base.filter.post;

import cn.ms.gateway.base.annotation.Filter;
import cn.ms.gateway.base.annotation.FilterEnable;
import cn.ms.gateway.base.filter.IFilter;
import cn.ms.gateway.base.type.FilterType;

@FilterEnable(value=false)
@Filter(value=FilterType.POST, order=20)
public class TestPostFilter2 implements IFilter<String, String> {

	@Override
	public boolean check(String req, String res, Object...args) {
		System.out.println(this.getClass().getName()+" ---> check");
		return true;
	}

	@Override
	public String run(String req, String res, Object...args) {
		System.out.println(this.getClass().getName()+" ---> run");
		return null;
	}

}
