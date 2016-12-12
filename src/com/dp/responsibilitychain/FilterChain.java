package com.dp.responsibilitychain;

import java.util.ArrayList;
import java.util.List;

public class FilterChain implements Filter {
	private List<Filter> filters;
	private int index;

	public FilterChain() {
		// TODO Auto-generated constructor stub
		filters = new ArrayList<>();
		index = 0;
	}

	public FilterChain addFilter(Filter filter) {
		this.filters.add(filter);
		return this;
	}

	public void removeFilter(Filter filter) {
		this.filters.remove(filter);
	}

	@Override
	public void doFilter(Request request, Response response, Filter chain) {
		// TODO Auto-generated method stub
		if (index == filters.size()) {
			return;
		} else {
			Filter filter = filters.get(index++);
			filter.doFilter(request, response, chain);
		}
	}

}
