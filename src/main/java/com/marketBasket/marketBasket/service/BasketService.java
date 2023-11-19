package com.marketBasket.marketBasket.service;

import java.util.Collection;
import java.util.List;

public interface BasketService {

    String add(int code);

    Collection<Integer> get();
}
