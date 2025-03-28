package com.example.demo;

import java.util.ArrayList;
import java.util.List;

class SingletonEx {

    private static SingletonEx singletonExample;

    private SingletonEx() {
        System.out.println("Private Constructor");
    }

    public static SingletonEx getInstance() {
        if (singletonExample == null) {
            singletonExample = new SingletonEx();
        }

        return singletonExample;
    }
}

interface i {
    void wish(String name);
}

public class SingletonExample {
    public static void main(String[] args) {
        List<String> strList = new ArrayList<String>();
        SingletonEx instance1 = SingletonEx.getInstance();
        SingletonEx instance2 = SingletonEx.getInstance();
    }

}


