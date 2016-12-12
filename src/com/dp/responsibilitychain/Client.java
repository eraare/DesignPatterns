package com.dp.responsibilitychain;

/**
 * 责任链模式：对象保持对下一个对象的引用而连接成链，请求在此链上进行传递，直到某个对象决定处理此请求。对于客户端而言，其并不知道哪个对象处理了请求。可以在不影响客户端的情况下动态的重新组织和分配任务职责。
 * @author HHH
 *
 */
public class Client {
	public static void main(String[] args) {
		FilterChain chain = new FilterChain();
		chain.addFilter(new HtmlFilter());
		chain.addFilter(new SensitiveFilter());
		Request request = new Request("<h1>Fuck the word</h1>");
		Response response = new Response();
		chain.doFilter(request, response, chain);
		System.out.println(response.text);
		System.out.println(request.text);
	}
}
