package com.dp.responsibilitychain;

public class HtmlFilter implements Filter {

	@Override
	public void doFilter(Request request, Response response, Filter chain) {
		// TODO Auto-generated method stub
		request.text = request.text.replace("Fuck", "*");
		chain.doFilter(request, response, chain);
		response.text += "<Sensitive Filter>";
	}

}
