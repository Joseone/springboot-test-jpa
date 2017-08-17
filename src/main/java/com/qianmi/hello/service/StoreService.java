package com.qianmi.hello.service;

import com.qianmi.hello.domain.StoreInfo;
import com.qianmi.hello.domain.StoreJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * description
 * <p>
 * <p>FileName: com.qianmi.hello.service.StoreService</p>
 * <p>Date: 2017-08-17 09:50.</p>
 *
 * @author <a href="mailto:lilonglong@qianmi.com">of2639-李龙龙</a>
 */
@Service
@Transactional
public class StoreService {

    @Autowired
    private StoreJpaRepository storeJpaRepository;

    public void getMyName(String id){
        StoreInfo store = storeJpaRepository.getOne(id);
        System.out.println(store.getAdminId());
        System.out.println("1111111111111111");
    }
}
