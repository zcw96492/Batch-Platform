package com.newcore.batch.platform.utils.enumclass;

import com.newcore.batch.platform.utils.exception.BusinessException;

import java.util.Arrays;
import java.util.Optional;

/**
 * 业务异常错误码统一处理枚举类
 * @author zhouchaowei
 */
public enum BusinessExceptionCodeEnum {

    SUCCESS("00000","success"),
    FAIL("99999","fail"),

    B0001("B0001","创建任务失败"),

    F0322("F0322","文件未找到"),
    F0323("F0323","文件下载出错"),

    L0000("L0000","登录成功"),
    L0001("L0001","登录失败"),
    L0002("L0002","用户名不匹配"),
    L0003("L0003","未找到用户"),
    L0004("L0004","用户名或密码输入错误");

    /** 异常状态码 */
    private final String code;

    /** 异常提示信息 */
    private final String message;

    /**
     * 异常处理构造方法
     * @param code 异常状态码
     * @param message 异常提示信息
     */
    BusinessExceptionCodeEnum(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public String getCode() {
        return code;
    }

    /**
     * 查找对应的Key值
     * @param key 键
     * @return 值
     */
    public static BusinessExceptionCodeEnum valueOfKey(String key) {
        Optional<BusinessExceptionCodeEnum> optionalValue = Arrays.stream(values()).filter((item) -> {
            return item.getCode().equals(key);
        }).findFirst();
        if (optionalValue.isPresent()) {
            return optionalValue.get();
        } else {
            throw new BusinessException("Can't find enum BusinessExceptionCodeEnum for key " + key);
        }
    }
}
