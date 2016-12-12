package com.dp.responsibilitychain;

public class SensitiveFilter implements Filter {

	@Override
	public void doFilter(Request request, Response response, Filter chain) {
		// TODO Auto-generated method stub
		request.text = request.text.replace("<", "/");
		request.text = request.text.replace(">", "\\");
		chain.doFilter(request, response, chain);
		response.text += "<Html Filter>";
	}

}
