package com.wkh.综合练习;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test1 {
    public static void main(String[] args) throws IOException {
        //定义三个变量记录网址
        String familyNameNet = "https://hanyu.baidu.com/s?wd=%E7%99%BE%E5%AE%B6%E5%A7%93&from=poem";
        String boyNameNet = "http://www.haoming8.cn/baobao/10881.html";
        String girlNameNet = "http://www.haoming8.cn/baobao/7641.html";
        //爬取数据
        String familyName = webCrawler(familyNameNet);
        String boyName = webCrawler(boyNameNet);
        String girlName = webCrawler(girlNameNet);

        //通过正则表达式把符合要求的数据获取出来
        ArrayList<String> familyNameTemList = getData(familyName,"(.{4})(，|。)",1);
        ArrayList<String> boyNameTemList = getData(familyName,"([\\u4E00-\\u9FA5]{2})(、|。)",1);
        ArrayList<String> girlNameTemList = getData(familyName,"([\\u4E00-\\u9FA5]{2})(、|。)",1);
        ArrayList<String> familyNameList = new ArrayList<>();
        for (String str : familyNameTemList) {
            for (int i = 0;i<str.length();i++){
                familyNameList.add(str.charAt(i)+"");
            }
        }
        ArrayList<String> boyNameList = new ArrayList<>();
        for (String str : boyNameTemList) {
            if (!boyNameList.contains(str)){
                boyNameList.add(str);
            }
        }
        ArrayList<String> girlNameList = new ArrayList<>();
        for (String str : girlNameTemList) {
            Collections.addAll(girlNameList,str.split(" "));
        }

        ArrayList<String> info = getInfo(familyNameList, boyNameList, girlNameList, 5, 3);
        System.out.println(info);
        BufferedWriter bw = new BufferedWriter(new FileWriter("myIO\\src\\main\\resources\\name.txt",true));
        for (String str : info) {
            bw.write(str);
            bw.newLine();
        }
        bw.close();


    }

    private static ArrayList<String> getInfo(ArrayList<String> familyNameList, ArrayList<String> boyNameList, ArrayList<String> girlNameList, int boyCount, int girlCount) {
        HashSet<String> boySet = new HashSet<>();
        while (true){
            if (boySet.size() == boyCount){
                break;
            }else{
                Collections.shuffle(familyNameList);
                Collections.shuffle(boyNameList);
                boySet.add(familyNameList.get(0)+boyNameList.get(0));
            }
        }

        HashSet<String> girlSet = new HashSet<>();
        while (true){
            if (girlSet.size() == girlCount){
                break;
            }else{
                Collections.shuffle(familyNameList);
                Collections.shuffle(girlNameList);
                girlSet.add(familyNameList.get(0)+girlNameList.get(0));
            }
        }
        ArrayList<String> list = new ArrayList<>();
        Random r = new Random();
        for (String name : boySet) {
            list.add(name+"-"+"男"+"-"+(r.nextInt(10)+18));
        }
        for (String name : girlSet) {
            list.add(name+"-"+"女"+"-"+(r.nextInt(10)+18));
        }
        return list;
    }

    private static ArrayList<String> getData(String str, String regex, int i) {
        //创建集合存放数据
        ArrayList<String> list = new ArrayList<>();
        //按照正则表达式的规则获取规则对象
        Pattern pattern = Pattern.compile(regex);
        //按照规则到字符串中查找数据
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()){
            String name = matcher.group(i);
            list.add(name);
        }
        //返回
        return list;
    }

    private static String webCrawler(String net) throws IOException {
        //定义StringBuilder拼接数据
        StringBuilder sb = new StringBuilder();
        //创建URL对象
        URL url = new URL(net);
        //连接上这个网址
        URLConnection connection = url.openConnection();
        //读取数据,有中文，用字符流
        InputStreamReader isr = new InputStreamReader(connection.getInputStream());
        int b;
        while ((b = isr.read())!=-1){
            sb.append((char) b);
        }
        isr.close();
        return sb.toString();
    }
}
