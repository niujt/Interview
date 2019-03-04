package com.option;

import com.mysql.entity.User;

import java.util.Optional;

/**
 * Optional 类是一个可以为null的容器对象，可以让我们快速定位NullPointException。
 */
public class OptionCase {
    public static void main(String[] args){
        //1.方法of()用于创建非空对象，该方法要求传入的参数不能为空，否则抛NullPointException，我们直接就可以知道这个对象是空的
       // Optional<User> optional = Optional.of(null);
       // User user = optional.get();
       // System.out.println(user);
        //2.由于传入的参数可能为null，则可以用Optional的ofNullable()方法创建对象，如果参数为null，则创建一个空对象。
        Optional<User> optional2 = Optional.ofNullable(null);

        User employee = optional2.orElseGet(()->new User() );

        System.out.println(employee);
    }

}
