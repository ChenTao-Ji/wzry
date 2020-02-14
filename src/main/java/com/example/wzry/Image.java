package com.example.wzry;

import com.alibaba.fastjson.JSONArray;
import com.example.util.HttpClient;
import com.example.util.RequestMethod;

import java.util.List;

public class Image {

    public static void main(String[] args) {
        String herolist = HttpClient.doGet("https://pvp.qq.com/web201605/js/herolist.json", RequestMethod.GET);
        System.out.println(herolist);
        List<Hero> heroes = JSONArray.parseArray(herolist, Hero.class);
        System.out.println(heroes.size());
        for (Hero hero : heroes) {
            //英雄名称
            String hero_name = hero.getCname();
            //英雄编号
            Integer hero_num = hero.getEname();
            //获取皮肤列表
            String[] skin_name = null;
            try {
                skin_name = hero.getSkin_name().split("\\|");
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println(hero_name + "出现异常");
            }
            //统计皮肤数量
            int skin_count = skin_name.length;
            //打印英雄的皮肤数量
            System.out.println("英雄名称：" + hero_name + ", 皮肤数量：" + skin_count);
            for (int i = 1; i <= skin_count; i++) {
                // https://game.gtimg.cn/images/yxzj/img201606/skin/hero-info/  140/140-bigskin-4.jpg
                String url = "https://game.gtimg.cn/images/yxzj/img201606/skin/hero-info/";
                String url_pic = url + hero_num + "/" + hero_num + "-bigskin-" + i + ".jpg";
                String filePath = "F:\\王者荣耀\\" + hero_name + "\\" + hero_name + "_" + skin_name[i - 1] + ".jpg";
                boolean image = HttpClient.httpDownload(url_pic, filePath);
                while (!image) {
                    image = HttpClient.httpDownload(url_pic, filePath);
                }
            }
        }
    }
}
