package io.yadnyesh.udemy.funcreactmodern.dsfunctional;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ListDemo {
    public static void main(String[] args) {
        ListFun<Integer> integerList = ListFun.list(2,4,6,8,10);
        integerList.forEach(e -> log.info(e.toString()));
    }
}
