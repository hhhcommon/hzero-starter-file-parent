package org.hzero.starter.file.service;

import org.springframework.stereotype.Component;

/**
 * description
 *
 * @author shuangfei.zhu@hand-china.com 2019/12/18 19:08
 */
@Component
public class AliyunStoreCreator implements StoreCreator {

    @Override
    public Integer storeType() {
        return 1;
    }

    @Override
    public AbstractFileService getFileService() {
        return new AliyunFileServiceImpl();
    }
}
