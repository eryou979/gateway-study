package com.example.gateway.filter;

import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import org.springframework.web.server.WebFilter;
import org.springframework.web.server.WebFilterChain;
import reactor.core.publisher.Mono;

/**
 * @author dlz
 * @since 2024/03/11
 */
@Component
public class MyWebFilter2 implements WebFilter, Ordered {
    @Override
    public Mono<Void> filter(ServerWebExchange exchange, WebFilterChain chain) {
        System.out.println("MyWebFilter2 is called");
        return chain.filter(exchange);
    }

    @Override
    public int getOrder() {
        return 20;
    }

}
