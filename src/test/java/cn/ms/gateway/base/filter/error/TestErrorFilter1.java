package cn.ms.gateway.base.filter.error;

import cn.ms.gateway.base.annotation.Filter;
import cn.ms.gateway.base.annotation.FilterEnable;
import cn.ms.gateway.base.filter.IFilter;
import cn.ms.gateway.base.type.FilterType;

@FilterEnable
@Filter(value=FilterType.ERROR, order=10)
public class TestErrorFilter1 implements IFilter<String, String> {

	@Override
	public boolean check(String req, String res, Object...args) {
		System.out.println(this.getClass().getName()+" ---> check");
		return true;
	}

	@Override
	public String run(String req, String res, Object...args) {
		System.out.println(this.getClass().getName()+" ---> run");
		return this.getClass().getName();
	}

}
