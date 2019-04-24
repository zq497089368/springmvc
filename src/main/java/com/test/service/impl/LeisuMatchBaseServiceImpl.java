package com.test.service.impl;

import com.test.dao.LeisuMatchBaseDao;
import com.test.entity.LeisuMatchBasePO;
import com.test.service.LeisuMatchBaseService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;
import java.util.concurrent.Future;

@Service
@Transactional
//@Configuration
@EnableAsync
public class LeisuMatchBaseServiceImpl implements LeisuMatchBaseService {
    private Logger logger = LoggerFactory.getLogger(LeisuMatchBaseServiceImpl.class);

    @Autowired
    LeisuMatchBaseDao leisuMatchBaseDao;

    public LeisuMatchBasePO findById(Long id) {
        logger.info("查询雷速比赛的Id为{}", id);
        return leisuMatchBaseDao.findById(id);
    }

    public static void main(String[] args) {
        Set<Integer> sum = new TreeSet<>();
        Map<Integer, Set<String>> map = new TreeMap<>();

        int[] aa = new int[]{28,56,70,56,28,8,1};

        for(int i=0 ; i< aa.length; i++){
            Integer preSum = aa[i];
            sum.add(preSum);
            Set<String> list = map.get(preSum);
            if(list == null){
                list = new HashSet<>();
            }
            list.add("" + i);
            map.put(preSum, list);
        }
        for(int i=0 ; i< aa.length; i++){
            for(int j = i+1; j< aa.length; j++){
                Integer preSum = aa[i] + aa[j];
                sum.add(preSum);
                Set<String> list = map.get(preSum);
                if(list == null){
                    list = new HashSet<>();
                }
                list.add("" + i+j);
                map.put(preSum, list);
            }
        }
        for(int i=0 ; i< aa.length; i++){
            for(int j = i+1; j< aa.length; j++){
                for(int k = j+1; k< aa.length; k++){
                    Integer preSum = aa[i] + aa[j]+aa[k];
                    sum.add(preSum);
                    Set<String> list = map.get(preSum);
                    if(list == null){
                        list = new HashSet<>();
                    }
                    list.add("" + i+j+k);
                    map.put(preSum, list);
                }
            }
        }
        for(int i=0 ; i< aa.length; i++){
            for(int j = i+1; j< aa.length; j++){
                for(int k = j+1; k< aa.length; k++){
                    for(int l = k+1; l< aa.length; l++) {
                        Integer preSum = aa[i] + aa[j] + aa[k] + aa[l];
                        sum.add(preSum);
                        Set<String> list = map.get(preSum);
                        if (list == null) {
                            list = new HashSet<>();
                        }
                        list.add("" + i + j + k + l);
                        map.put(preSum, list);
                    }
                }
            }
        }
        for(int i=0 ; i< aa.length; i++){
            for(int j = i+1; j< aa.length; j++){
                for(int k = j+1; k< aa.length; k++){
                    for(int m = k+1; m< aa.length; m++) {
                        for (int l = m + 1; l < aa.length; l++) {
                            Integer preSum = aa[i] + aa[j] + aa[k] + aa[l]+aa[m];
                            sum.add(preSum);
                            Set<String> list = map.get(preSum);
                            if (list == null) {
                                list = new HashSet<>();
                            }
                            list.add("" + i + j + k + l+m);
                            map.put(preSum, list);
                        }
                    }
                }
            }
        }
        for(int i=0 ; i< aa.length; i++){
            for(int j = i+1; j< aa.length; j++){
                for(int k = j+1; k< aa.length; k++){
                    for(int m = k+1; m< aa.length; m++) {
                        for (int l = m + 1; l < aa.length; l++) {
                            for (int n = l + 1; n < aa.length; n++) {
                                Integer preSum = aa[i] + aa[j] + aa[k] + aa[l] + aa[m]+aa[n];
                                sum.add(preSum);
                                Set<String> list = map.get(preSum);
                                if (list == null) {
                                    list = new HashSet<>();
                                }
                                list.add("" + i + j + k + l + m+n);
                                map.put(preSum, list);
                            }
                        }
                    }
                }
            }
        }
        for(int i=0 ; i< aa.length; i++){
            for(int j = i+1; j< aa.length; j++){
                for(int k = j+1; k< aa.length; k++){
                    for(int m = k+1; m< aa.length; m++) {
                        for (int l = m + 1; l < aa.length; l++) {
                            for (int n = l + 1; n < aa.length; n++) {
                                for (int o = n + 1; o < aa.length; o++) {
                                    Integer preSum = aa[i] + aa[j] + aa[k] + aa[l] + aa[m] + aa[n] + aa[o];
                                    sum.add(preSum);
                                    Set<String> list = map.get(preSum);
                                    if (list == null) {
                                        list = new HashSet<>();
                                    }
                                    list.add("" + i + j + k + l + m + n + o);
                                    map.put(preSum, list);
                                }
                            }
                        }
                    }
                }
            }
        }

        for(Integer key : map.keySet()){
            Set<String> list = map.get(key);
            for(String s : list){
                System.out.println(key + ":-----" +s );
            }
        }

        System.out.println(aa);
    }


//    public static void main(String[] args) {
//        Set<Integer> sum = new TreeSet<>();
//        Map<Integer, Set<String>> map = new TreeMap<>();
//
//        int[] aa = new int[]{21,35,35,21,7,1};
//        for(int i=0 ; i< aa.length; i++){
//            for(int j = i+1; j< aa.length; j++){
//                for(int k = j+1; k< aa.length; k++){
//                    Integer preSum = aa[i] + aa[j]+aa[k];
//                    sum.add(preSum);
//                    Set<String> list = map.get(preSum);
//                    if(list == null){
//                        list = new HashSet<>();
//                    }
//                    list.add("" + i+j+k);
//                    map.put(preSum, list);
//                }
//            }
//        }
//        for(int i=0 ; i< aa.length; i++){
//            for(int j = i+1; j< aa.length; j++){
//                for(int k = j+1; k< aa.length; k++){
//                    for(int l = k+1; l< aa.length; l++) {
//                        Integer preSum = aa[i] + aa[j] + aa[k] + aa[l];
//                        sum.add(preSum);
//                        Set<String> list = map.get(preSum);
//                        if (list == null) {
//                            list = new HashSet<>();
//                        }
//                        list.add("" + i + j + k + l);
//                        map.put(preSum, list);
//                    }
//                }
//            }
//        }
//        for(int i=0 ; i< aa.length; i++){
//            for(int j = i+1; j< aa.length; j++){
//                for(int k = j+1; k< aa.length; k++){
//                    for(int m = k+1; m< aa.length; m++) {
//                        for (int l = m + 1; l < aa.length; l++) {
//                            Integer preSum = aa[i] + aa[j] + aa[k] + aa[l]+aa[m];
//                            sum.add(preSum);
//                            Set<String> list = map.get(preSum);
//                            if (list == null) {
//                                list = new HashSet<>();
//                            }
//                            list.add("" + i + j + k + l+m);
//                            map.put(preSum, list);
//                        }
//                    }
//                }
//            }
//        }
//        for(Integer key : map.keySet()){
//            if(key >= 85){
//                Set<String> list = map.get(key);
//                for(String s : list){
//                    System.out.println(key + ":-----" +s );
//                }
//            }
//        }
//
//        System.out.println(aa);
//    }

    @Async
    @Override
    public void test(){
        try {
            Thread.sleep(5000);
            System.out.println("aaaaaaaaaaa");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Async
    @Override
    public Future<String> test2(){
        try {
            Thread.sleep(5000);
        }catch (Exception e){

        }
        System.out.println("bb");
        return new AsyncResult<>("have return value");
    }

    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public void updateById(long id) {
        LeisuMatchBasePO po = leisuMatchBaseDao.findById(id);
        po.setHomeTeamName("aa");
    }
}
