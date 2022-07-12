package com.newcore.batch.platform.utils.enumclass;

import com.newcore.batch.platform.utils.exception.BusinessException;

import java.util.Arrays;
import java.util.Optional;

/**
 * 任务状态枚举类
 * @author zhouchaowei
 * @date 2022-07-09
 */
public enum TASK_STATUS {

    NO_START(0,"任务流未开启"),
    PROCESSING(1,"正常运行"),
    OFFLINE(2,"停用下线");

    private final Integer code;

    private final String description;

    TASK_STATUS(Integer code, String description) {
        this.code = code;
        this.description = description;
    }

    public Integer getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }

    public static TASK_STATUS valueOfKey(Integer key) {
        Optional<TASK_STATUS> optionalValue = Arrays.stream(values()).filter((item) -> {
            return item.getCode().equals(key);
        }).findFirst();
        if (optionalValue.isPresent()) {
            return optionalValue.get();
        } else {
            throw new BusinessException("Can't find enum TASK_STATUS for key " + key);
        }
    }
}
