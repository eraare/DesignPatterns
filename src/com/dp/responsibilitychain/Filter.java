package com.dp.responsibilitychain;

public interface Filter {
	public void doFilter(Request request, Response response, Filter chain);
}
