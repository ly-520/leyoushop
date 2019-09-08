package com.leyoushop.item.service;

import com.leyoushop.item.mapper.BrandMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class BrandService {

    @Autowired
    BrandMapper brandMapper;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str;
        String[] str2;
        String a;
        int b;
        List<Map<String, Integer>> mylist=null;
        while (true) {
            str = sc.nextLine();
            str2 = str.split(" ");
            b = Integer.valueOf(str2[1]);
            if(mylist.size()>n){
                Map<String, Integer> map2=mylist.get(1);
                mylist.remove(1);
                Map<String, Integer> map = new HashMap<>();
                map.put(str2[1], Integer.valueOf(str2[1]));
                mylist.add(map);
                System.out.println(map2);
            }else{
                Map<String, Integer> map = new HashMap<>();
                map.put(str2[1], Integer.valueOf(str2[1]));
                mylist.add(map);
            }
        }
    }


}
